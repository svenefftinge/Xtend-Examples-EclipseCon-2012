package hello.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * SWT Hello World
 */
@SuppressWarnings("all")
public class HelloWorld {
  public static void main(final String[] args) {
    Display _display = new Display();
    final Display display = _display;
    Shell _shell = new Shell(display);
    final Shell myShell = _shell;
    FillLayout _fillLayout = new FillLayout();
    myShell.setLayout(_fillLayout);
    myShell.setSize(300, 300);
    Text _text = new Text(myShell, SWT.MULTI);
    final Text text = _text;
    final Procedure1<Event> _function = new Procedure1<Event>() {
        public void apply(final Event it) {
          text.setText("Hello World!");
        }
      };
    text.addListener(SWT.MouseEnter, new Listener() {
        public void handleEvent(Event arg0) {
          _function.apply(arg0);
        }
    });
    final Procedure1<Event> _function_1 = new Procedure1<Event>() {
        public void apply(final Event it) {
          String _text = text.getText();
          String _plus = (_text + "\n ... waiting ");
          text.setText(_plus);
        }
      };
    text.addListener(SWT.MouseHover, new Listener() {
        public void handleEvent(Event arg0) {
          _function_1.apply(arg0);
        }
    });
    final Procedure1<Event> _function_2 = new Procedure1<Event>() {
        public void apply(final Event it) {
          text.setText("Goodbye!");
        }
      };
    text.addListener(SWT.MouseExit, new Listener() {
        public void handleEvent(Event arg0) {
          _function_2.apply(arg0);
        }
    });
    myShell.open();
    boolean _isDisposed = myShell.isDisposed();
    boolean _not = (!_isDisposed);
    boolean _while = _not;
    while (_while) {
      boolean _readAndDispatch = display.readAndDispatch();
      boolean _not_1 = (!_readAndDispatch);
      if (_not_1) {
        display.sleep();
      }
      boolean _isDisposed_1 = myShell.isDisposed();
      boolean _not_2 = (!_isDisposed_1);
      _while = _not_2;
    }
    display.dispose();
  }
}
