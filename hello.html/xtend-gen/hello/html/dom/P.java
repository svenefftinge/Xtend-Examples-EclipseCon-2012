package hello.html.dom;

import hello.html.dom.ContentNode;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class P extends ContentNode {
  public P() {
  }
  
  public P(final Procedure1<P> initializer) {
    initializer.apply(this);
  }
  
  public String toString() {
    StringBuilder result = new StringBuilder("\nP {");
    result.append("\n}");
    return result.toString();
    
  }
}
