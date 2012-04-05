package hello.html.dom;

import hello.html.dom.ContentNode;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class H2 extends ContentNode {
  public H2() {
  }
  
  public H2(final Procedure1<H2> initializer) {
    initializer.apply(this);
  }
  
  public String toString() {
    StringBuilder result = new StringBuilder("\nH2 {");
    result.append("\n}");
    return result.toString();
    
  }
}
