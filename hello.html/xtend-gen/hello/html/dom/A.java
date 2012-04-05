package hello.html.dom;

import hello.html.dom.ContentNode;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class A extends ContentNode {
  public A() {
  }
  
  public A(final Procedure1<A> initializer) {
    initializer.apply(this);
  }
  
  private String href;
  
  public String getHref() {
    return this.href;
  }
  
  public void setHref(final String href) {
    this.href = href;
  }
  
  public String toString() {
    StringBuilder result = new StringBuilder("\nA {");
    result.append("\n  href = ").append(String.valueOf(href).replace("\n","\n  "));
    result.append("\n}");
    return result.toString();
    
  }
}
