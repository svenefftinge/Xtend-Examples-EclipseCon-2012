package hello.html.dom;

import hello.html.dom.Node;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class ContentNode extends Node {
  public ContentNode() {
  }
  
  public ContentNode(final Procedure1<ContentNode> initializer) {
    initializer.apply(this);
  }
  
  public String toString() {
    StringBuilder result = new StringBuilder("\nContentNode {");
    result.append("\n}");
    return result.toString();
    
  }
}
