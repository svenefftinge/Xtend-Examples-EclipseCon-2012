package hello.html.dom;

import hello.html.dom.ContentNode;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class B extends ContentNode {
  public B() {
  }
  
  public B(final Procedure1<B> initializer) {
    initializer.apply(this);
  }
  
  public String toString() {
    StringBuilder result = new StringBuilder("\nB {");
    result.append("\n}");
    return result.toString();
    
  }
}
