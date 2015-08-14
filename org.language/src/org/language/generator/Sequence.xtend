package org.language.generator

class Sequence {
	public boolean hasValue = false
	public String actor1 = null
	public String actor2 = ""
	public String action = null
	public String parameter = null
	public int value = 0
	public String condition = ""
	
	new(String a1, String a2, String a, String p, int v, String c) {
		hasValue = true
		actor1 = a1
		actor2 = a2
		action = a
		parameter = p
		value = v
		condition = c
	}
	
	new(String a1, String a2, String a, int v, String c) {
		hasValue = true
		actor1 = a1
		actor2 = a2
		action = a
		value = v
		condition = c
	}
	
	new(String a1, String a2, String a, String p, String c) {
		actor1 = a1
		actor2 = a2
		action = a
		parameter = p
		condition = c
	}
	
	new(String a1, String a2, String a, String c) {
		actor1 = a1
		actor2 = a2
		action = a
		condition = c
	}
	
	new(String a1, String a2, String a) {
		actor1 = a1
		actor2 = a2
		action = a
	}
	
	new(String a1, String a) {
		actor1 = a1
		action = a
	}
}