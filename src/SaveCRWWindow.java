import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;

public class SaveCRWWindow extends Dialog {

	protected Object result;
	protected Shell shell;
	private Text text;
	private Text text_1;

	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 */
	public SaveCRWWindow(Shell parent, int style) {
		super(parent, style);
		setText("Save CRW");
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
		shell.setSize(450, 150);
		shell.setText("Save CRW");
		
		Label lblCustomerName = new Label(shell, SWT.NONE);
		lblCustomerName.setBounds(10, 10, 115, 20);
		lblCustomerName.setText("Customer Name:");
		
		Label lblCustomerEmailAddress = new Label(shell, SWT.NONE);
		lblCustomerEmailAddress.setBounds(10, 45, 252, 20);
		lblCustomerEmailAddress.setText("Customer Email Address (optional):");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(131, 10, 303, 26);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(268, 42, 166, 26);
		
		Button btnSubmit = new Button(shell, SWT.NONE);
		btnSubmit.setBounds(172, 71, 90, 30);
		btnSubmit.setText("Submit");

	}
}
