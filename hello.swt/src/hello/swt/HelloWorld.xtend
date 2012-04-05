package hello.swt

import org.eclipse.swt.layout.FillLayout
import org.eclipse.swt.widgets.Display
import org.eclipse.swt.widgets.Shell
import org.eclipse.swt.widgets.Text

import static org.eclipse.swt.SWT.*
import org.eclipse.swt.widgets.Event

/**
 * SWT Hello World
 */
class HelloWorld {
	
	def static void main(String[] args) {
		val display = new Display
		val myShell = new Shell(display)
		myShell.layout = new FillLayout 
		myShell.setSize (300, 300)
		
		val text = new Text(myShell, MULTI)
		
		text.addListener(MouseEnter) [
			text.text = "Hello World!" 
		]
		text.addListener(MouseHover) [
			text.text = text.text + "\n ... waiting "
		]
		text.addListener(MouseExit) [
			text.text = "Goodbye!"
		]
		
		myShell.open
		while (!myShell.disposed) {
			if (!display.readAndDispatch) 
				display.sleep
		}
		display.dispose
	}
	
}







/*
		text.addListener(MouseEnter, new Listener() {
		
			public void handleEvent(Event event) {
				text.setText("Hello World!");
			}
		
		}
 */