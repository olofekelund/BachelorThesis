package org.language.generator

import java.util.List
import java.util.ArrayList

class Tree<T> {
	public T data;
    public Tree<T> parent;
    public List<Tree<T>> children;
    public List<StringTuple> attributes;
	public List<StringTuple> functions;
	
	new() {
		data = null
		parent = null
		children = new ArrayList<Tree<T>>
		attributes = new ArrayList<StringTuple>
		functions = new ArrayList<StringTuple>
	}
	
	new(T rootdata) {
		data = rootdata
		parent = null
		children = new ArrayList<Tree<T>>
		attributes = new ArrayList<StringTuple>
		functions = new ArrayList<StringTuple>
	}
	
	new(T rootdata, Tree<T> p) {
		data = rootdata
		parent = p 
		children = new ArrayList<Tree<T>>
		attributes = new ArrayList<StringTuple>
		functions = new ArrayList<StringTuple>
    }
    
    new(T rootdata, T s) {
    	data = rootdata
    	parent = find(s)
    	attributes = new ArrayList<StringTuple>
    	functions = new ArrayList<StringTuple>
    }
    
    def addAttribute(StringTuple attribute) {
    	attributes.add(attribute)
    }
    
    def addFunction(StringTuple function) {
    	functions.add(function)
    }
    
    def int add(T d) {
    	if(parent == null && data == null) {
    		data = d
    	}
    	// Make sure the node doesn't already exist. If it does, return -1.
    	if (find(d) == null) {
    		children.add(new Tree<T>(d))

    		return 1
    	} else {
    		return -1
    	}
    }
    
    def Tree<T> find(T d) {
    	find(d, false)
    }
    
    def Tree<T> find(T d, boolean parentFound) {
    	if (data.equals(d)) return this
    	if(parent != null && !parentFound) {
    		return parent.find(d, false)
    		}
    	else {
    		if (children.size > 0) {
	    		for (Tree<T> t : children) {
	    			if (t.data.equals(d)) {
	    				return t
	    			}
	    			else { 
	    				val Tree<T> temp = t.find(d, true)
	    				if (temp != null) return temp 
    				}
	    		}
    		}
    	}
    	return null
	}
        
    def void print() {
    	print(data)
    	if(children != null) {
    		print(". Children: ")
    		for(Tree<T> t: children) {
    			print(t.data + ", ")
    		}
    		
    		for(Tree<T> t: children) {
    			t.print
    		}
    	}
    }
}
