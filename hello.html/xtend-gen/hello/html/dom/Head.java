package hello.html.dom;

import hello.html.dom.Node;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class Head extends Node {
  public Head() {
  }
  
  public Head(final Procedure1<Head> initializer) {
    initializer.apply(this);
  }
  
  public String toString() {
    StringBuilder result = new StringBuilder("\nHead {");
    result.append("\n}");
    return result.toString();
    
  }
}
