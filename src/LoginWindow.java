import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;

public class LoginWindow extends Dialog {

	protected Object result;
	protected Shell shlLogin;
	private Text text;

	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 */
	public LoginWindow(Shell parent, int style) {
		super(parent, style);
		setText("Login Window");
	}

	/**
	 * Open the dialog.
	 * @return the result
	 */
	public Object open() {
		createContents();
		shlLogin.open();
		shlLogin.layout();
		Display display = getParent().getDisplay();
		while (!shlLogin.isDisposed()) {
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
		shlLogin = new Shell(getParent(), SWT.CLOSE | SWT.TITLE);
		shlLogin.setSize(355, 128);
		shlLogin.setText("Login");
		
		Label lblPleaseTypeYour = new Label(shlLogin, SWT.NONE);
		lblPleaseTypeYour.setBounds(0, 0, 349, 20);
		lblPleaseTypeYour.setText("Please Type Your Employee Number and Hit Submit");
		
		text = new Text(shlLogin, SWT.BORDER);
		text.setBounds(66, 26, 196, 26);
		
		Button btnSubmit = new Button(shlLogin, SWT.NONE);
		btnSubmit.setBounds(127, 58, 90, 30);
		btnSubmit.setText("Submit");

	}
}
