package hello.html.dom;

import hello.html.dom.Node;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class Title extends Node {
  public Title() {
  }
  
  public Title(final Procedure1<Title> initializer) {
    initializer.apply(this);
  }
  
  public String toString() {
    StringBuilder result = new StringBuilder("\nTitle {");
    result.append("\n}");
    return result.toString();
    
  }
}
