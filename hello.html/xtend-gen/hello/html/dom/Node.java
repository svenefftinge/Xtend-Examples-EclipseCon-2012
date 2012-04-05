package hello.html.dom;

import java.util.List;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * An Html DOM Element
 */
public class Node {
  public Node() {
  }
  
  public Node(final Procedure1<Node> initializer) {
    initializer.apply(this);
  }
  
  private List<Node> contents;
  
  public List<Node> getContents() {
    return this.contents;
  }
  
  public void setContents(final List<Node> contents) {
    this.contents = contents;
  }
  
  public String tagName() {
    Class<? extends Object> _class = this.getClass();
    String _simpleName = _class.getSimpleName();
    String _lowerCase = _simpleName.toLowerCase();
    return _lowerCase;
  }
  
  public String toString() {
    StringBuilder result = new StringBuilder("\nNode {");
    result.append("\n  contents = ").append(String.valueOf(contents).replace("\n","\n  "));
    result.append("\n}");
    return result.toString();
    
  }
}
