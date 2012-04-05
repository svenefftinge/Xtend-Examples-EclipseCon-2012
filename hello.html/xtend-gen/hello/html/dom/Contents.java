package hello.html.dom;

import hello.html.dom.ContentNode;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class Contents extends ContentNode {
  public Contents() {
  }
  
  public Contents(final Procedure1<Contents> initializer) {
    initializer.apply(this);
  }
  
  private CharSequence text;
  
  public CharSequence getText() {
    return this.text;
  }
  
  public void setText(final CharSequence text) {
    this.text = text;
  }
  
  public String toString() {
    StringBuilder result = new StringBuilder("\nContents {");
    result.append("\n  text = ").append(String.valueOf(text).replace("\n","\n  "));
    result.append("\n}");
    return result.toString();
    
  }
}
