package hello.html;

import hello.html.DomBuilder;
import hello.html.DomSerializer;
import hello.html.dom.A;
import hello.html.dom.Body;
import hello.html.dom.H1;
import hello.html.dom.Head;
import hello.html.dom.Html;
import hello.html.dom.P;
import hello.html.dom.Title;
import java.io.Serializable;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Test;

@SuppressWarnings("all")
public class DomExample implements Serializable {
  private DomBuilder db = new Function0<DomBuilder>() {
    public DomBuilder apply() {
      DomBuilder _domBuilder = new DomBuilder();
      return _domBuilder;
    }
  }.apply();
  
  private DomSerializer ds = new Function0<DomSerializer>() {
    public DomSerializer apply() {
      DomSerializer _domSerializer = new DomSerializer();
      return _domSerializer;
    }
  }.apply();
  
  @Test
  public void processDom() {
    final Html x = this.buildDom();
    CharSequence _serialize = this.ds.serialize(x);
    InputOutput.<CharSequence>println(_serialize);
  }
  
  public Html buildDom() {
    final Procedure1<Html> _function = new Procedure1<Html>() {
        public void apply(final Html it) {
          final Procedure1<Head> _function = new Procedure1<Head>() {
              public void apply(final Head it) {
                final Procedure1<Title> _function = new Procedure1<Title>() {
                    public void apply(final Title it) {
                      DomExample.this.db.$(it, "XML encoding with Xtend");
                    }
                  };
                DomExample.this.db.title(it, _function);
              }
            };
          DomExample.this.db.head(it, _function);
          final Procedure1<Body> _function_1 = new Procedure1<Body>() {
              public void apply(final Body it) {
                final Procedure1<H1> _function = new Procedure1<H1>() {
                    public void apply(final H1 it) {
                      DomExample.this.db.$(it, "XML encoding with Xtend");
                    }
                  };
                DomExample.this.db.h1(it, _function);
                final Procedure1<P> _function_1 = new Procedure1<P>() {
                    public void apply(final P it) {
                      DomExample.this.db.$(it, "this format can be used as an alternative to XML.");
                    }
                  };
                DomExample.this.db.p(it, _function_1);
                final Procedure1<A> _function_2 = new Procedure1<A>() {
                    public void apply(final A it) {
                      DomExample.this.db.$(it, "Xtend");
                    }
                  };
                DomExample.this.db.a(it, "http://www.xtend-lang.org", _function_2);
                final Procedure1<P> _function_3 = new Procedure1<P>() {
                    public void apply(final P it) {
                      DomExample.this.db.$(it, "This is some ");
                      final Procedure1<A> _function = new Procedure1<A>() {
                          public void apply(final A it) {
                            DomExample.this.db.$(it, "mixed");
                          }
                        };
                      DomExample.this.db.b(it, _function);
                      DomExample.this.db.$(it, " text. For more see the ");
                      final Procedure1<A> _function_1 = new Procedure1<A>() {
                          public void apply(final A it) {
                            DomExample.this.db.$(it, "Xtext");
                          }
                        };
                      DomExample.this.db.a(it, "http://www.xtext.org", _function_1);
                      DomExample.this.db.$(it, " project");
                    }
                  };
                DomExample.this.db.p(it, _function_3);
                final Procedure1<P> _function_4 = new Procedure1<P>() {
                    public void apply(final P it) {
                      DomExample.this.db.$(it, "More text.");
                    }
                  };
                DomExample.this.db.p(it, _function_4);
              }
            };
          DomExample.this.db.body(it, _function_1);
        }
      };
    Html _html = new Html(_function);
    return _html;
  }
}
