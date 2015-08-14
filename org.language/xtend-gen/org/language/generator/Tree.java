package org.language.generator;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.language.generator.StringTuple;

@SuppressWarnings("all")
public class Tree<T extends Object> {
  public T data;
  
  public Tree<T> parent;
  
  public List<Tree<T>> children;
  
  public List<StringTuple> attributes;
  
  public List<StringTuple> functions;
  
  public Tree() {
    this.data = null;
    this.parent = null;
    ArrayList<Tree<T>> _arrayList = new ArrayList<Tree<T>>();
    this.children = _arrayList;
    ArrayList<StringTuple> _arrayList_1 = new ArrayList<StringTuple>();
    this.attributes = _arrayList_1;
    ArrayList<StringTuple> _arrayList_2 = new ArrayList<StringTuple>();
    this.functions = _arrayList_2;
  }
  
  public Tree(final T rootdata) {
    this.data = rootdata;
    this.parent = null;
    ArrayList<Tree<T>> _arrayList = new ArrayList<Tree<T>>();
    this.children = _arrayList;
    ArrayList<StringTuple> _arrayList_1 = new ArrayList<StringTuple>();
    this.attributes = _arrayList_1;
    ArrayList<StringTuple> _arrayList_2 = new ArrayList<StringTuple>();
    this.functions = _arrayList_2;
  }
  
  public Tree(final T rootdata, final Tree<T> p) {
    this.data = rootdata;
    this.parent = p;
    ArrayList<Tree<T>> _arrayList = new ArrayList<Tree<T>>();
    this.children = _arrayList;
    ArrayList<StringTuple> _arrayList_1 = new ArrayList<StringTuple>();
    this.attributes = _arrayList_1;
    ArrayList<StringTuple> _arrayList_2 = new ArrayList<StringTuple>();
    this.functions = _arrayList_2;
  }
  
  public Tree(final T rootdata, final T s) {
    this.data = rootdata;
    Tree<T> _find = this.find(s);
    this.parent = _find;
    ArrayList<StringTuple> _arrayList = new ArrayList<StringTuple>();
    this.attributes = _arrayList;
    ArrayList<StringTuple> _arrayList_1 = new ArrayList<StringTuple>();
    this.functions = _arrayList_1;
  }
  
  public boolean addAttribute(final StringTuple attribute) {
    return this.attributes.add(attribute);
  }
  
  public boolean addFunction(final StringTuple function) {
    return this.functions.add(function);
  }
  
  public int add(final T d) {
    boolean _and = false;
    boolean _equals = Objects.equal(this.parent, null);
    if (!_equals) {
      _and = false;
    } else {
      boolean _equals_1 = Objects.equal(this.data, null);
      _and = _equals_1;
    }
    if (_and) {
      this.data = d;
    }
    Tree<T> _find = this.find(d);
    boolean _equals_2 = Objects.equal(_find, null);
    if (_equals_2) {
      Tree<T> _tree = new Tree<T>(d);
      this.children.add(_tree);
      return 1;
    } else {
      return (-1);
    }
  }
  
  public Tree<T> find(final T d) {
    return this.find(d, false);
  }
  
  public Tree<T> find(final T d, final boolean parentFound) {
    boolean _equals = this.data.equals(d);
    if (_equals) {
      return this;
    }
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(this.parent, null));
    if (!_notEquals) {
      _and = false;
    } else {
      _and = (!parentFound);
    }
    if (_and) {
      return this.parent.find(d, false);
    } else {
      int _size = this.children.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        for (final Tree<T> t : this.children) {
          boolean _equals_1 = t.data.equals(d);
          if (_equals_1) {
            return t;
          } else {
            final Tree<T> temp = t.find(d, true);
            boolean _notEquals_1 = (!Objects.equal(temp, null));
            if (_notEquals_1) {
              return temp;
            }
          }
        }
      }
    }
    return null;
  }
  
  public void print() {
    InputOutput.<T>print(this.data);
    boolean _notEquals = (!Objects.equal(this.children, null));
    if (_notEquals) {
      InputOutput.<String>print(". Children: ");
      for (final Tree<T> t : this.children) {
        String _plus = (t.data + ", ");
        InputOutput.<String>print(_plus);
      }
      for (final Tree<T> t_1 : this.children) {
        t_1.print();
      }
    }
  }
}
