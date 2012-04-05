package hello.html.dom;

import hello.html.dom.Node;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class Html extends Node {
  public Html() {
  }
  
  public Html(final Procedure1<Html> initializer) {
    initializer.apply(this);
  }
  
  public String toString() {
    StringBuilder result = new StringBuilder("\nHtml {");
    result.append("\n}");
    return result.toString();
    
  }
}
