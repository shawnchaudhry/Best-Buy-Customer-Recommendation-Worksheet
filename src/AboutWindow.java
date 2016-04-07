import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;

public class AboutWindow extends Dialog {

	protected Object result;
	protected Shell shell;

	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 */
	public AboutWindow(Shell parent, int style) {
		super(parent, style);
		setText("About Me");
	}

	/**
	 * Open the dialog.
	 * @return the result
	 */
	public Object open() {
		createContents();
		shell.open();
		shell.layout();
		Display display = getParent().getDisplay();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		return result;
	}

	/**
	 * Create contents of the dialog.
	 */
	private void createContents() {
		shell = new Shell(getParent(), getStyle());
		shell.setSize(370, 130);
		shell.setText(getText());
		
		Label lblThisProgramWas = new Label(shell, SWT.NONE);
		lblThisProgramWas.setBounds(10, 10, 424, 245);
		lblThisProgramWas.setText("This program was designed by a Best Buy Employee:\r\n\r\nShawn Chaudhry\r\nEmployee ID: a326025");

	}

}
