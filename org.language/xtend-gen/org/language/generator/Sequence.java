package org.language.generator;

@SuppressWarnings("all")
public class Sequence {
  public boolean hasValue = false;
  
  public String actor1 = null;
  
  public String actor2 = "";
  
  public String action = null;
  
  public String parameter = null;
  
  public int value = 0;
  
  public String condition = "";
  
  public Sequence(final String a1, final String a2, final String a, final String p, final int v, final String c) {
    this.hasValue = true;
    this.actor1 = a1;
    this.actor2 = a2;
    this.action = a;
    this.parameter = p;
    this.value = v;
    this.condition = c;
  }
  
  public Sequence(final String a1, final String a2, final String a, final int v, final String c) {
    this.hasValue = true;
    this.actor1 = a1;
    this.actor2 = a2;
    this.action = a;
    this.value = v;
    this.condition = c;
  }
  
  public Sequence(final String a1, final String a2, final String a, final String p, final String c) {
    this.actor1 = a1;
    this.actor2 = a2;
    this.action = a;
    this.parameter = p;
    this.condition = c;
  }
  
  public Sequence(final String a1, final String a2, final String a, final String c) {
    this.actor1 = a1;
    this.actor2 = a2;
    this.action = a;
    this.condition = c;
  }
  
  public Sequence(final String a1, final String a2, final String a) {
    this.actor1 = a1;
    this.actor2 = a2;
    this.action = a;
  }
  
  public Sequence(final String a1, final String a) {
    this.actor1 = a1;
    this.action = a;
  }
}
