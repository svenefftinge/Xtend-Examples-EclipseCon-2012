package hello.html.dom;

import hello.html.dom.ContentNode;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class H1 extends ContentNode {
  public H1() {
  }
  
  public H1(final Procedure1<H1> initializer) {
    initializer.apply(this);
  }
  
  public String toString() {
    StringBuilder result = new StringBuilder("\nH1 {");
    result.append("\n}");
    return result.toString();
    
  }
}
