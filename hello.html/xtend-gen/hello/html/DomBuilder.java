package hello.html;

import com.google.common.base.Objects;
import hello.html.dom.A;
import hello.html.dom.Body;
import hello.html.dom.Contents;
import hello.html.dom.H1;
import hello.html.dom.H2;
import hello.html.dom.Head;
import hello.html.dom.Html;
import hello.html.dom.Node;
import hello.html.dom.P;
import hello.html.dom.Title;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class DomBuilder {
  public void $(final Node it, final CharSequence contents) {
    Contents _contents = new Contents();
    final Procedure1<Contents> _function = new Procedure1<Contents>() {
        public void apply(final Contents it) {
          it.setText(contents);
        }
      };
    this.<Contents>addAndApply(it, _contents, _function);
  }
  
  public void head(final Html it, final Procedure1<? super Head> init) {
    Head _head = new Head();
    this.<Head>addAndApply(it, _head, init);
  }
  
  public void title(final Head it, final Procedure1<? super Title> init) {
    Title _title = new Title();
    this.<Title>addAndApply(it, _title, init);
  }
  
  public void body(final Html it, final Procedure1<? super Body> init) {
    Body _body = new Body();
    this.<Body>addAndApply(it, _body, init);
  }
  
  public void p(final Node it, final Procedure1<? super P> init) {
    P _p = new P();
    this.<P>addAndApply(it, _p, init);
  }
  
  public void a(final Node it, final String href, final Procedure1<? super A> init) {
    A _a = new A();
    final A a = _a;
    a.setHref(href);
    this.<A>addAndApply(it, a, init);
  }
  
  public void b(final Node it, final Procedure1<? super A> init) {
    A _a = new A();
    this.<A>addAndApply(it, _a, init);
  }
  
  public void h1(final Node it, final Procedure1<? super H1> init) {
    H1 _h1 = new H1();
    this.<H1>addAndApply(it, _h1, init);
  }
  
  public void h2(final Node it, final Procedure1<? super H2> init) {
    H2 _h2 = new H2();
    this.<H2>addAndApply(it, _h2, init);
  }
  
  private <T extends Node> void addAndApply(final Node parent, final T t, final Procedure1<? super T> init) {
    List<Node> _contents = parent.getContents();
    boolean _equals = Objects.equal(_contents, null);
    if (_equals) {
      ArrayList<Node> _newArrayList = CollectionLiterals.<Node>newArrayList();
      parent.setContents(_newArrayList);
    }
    List<Node> _contents_1 = parent.getContents();
    _contents_1.add(t);
    init.apply(t);
  }
}
