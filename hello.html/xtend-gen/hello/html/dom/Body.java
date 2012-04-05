package hello.html.dom;

import hello.html.dom.ContentNode;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class Body extends ContentNode {
  public Body() {
  }
  
  public Body(final Procedure1<Body> initializer) {
    initializer.apply(this);
  }
  
  public String toString() {
    StringBuilder result = new StringBuilder("\nBody {");
    result.append("\n}");
    return result.toString();
    
  }
}
