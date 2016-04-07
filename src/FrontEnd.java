import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;

import java.awt.event.ItemListener;

import javax.swing.event.MouseInputListener;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.ProgressBar;

public class FrontEnd {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;
	private Text text_5;
	private Text text_6;
	private Text text_7;
	private Text text_8;
	private Text text_9;
	private Text text_10;
	private Text text_11;
	private Text text_12;
	private Table table;
	private Text text_13;
	private Text txtNamedomaincom;
	public SelectionRecord sr;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FrontEnd window = new FrontEnd();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		
		shell = new Shell();
		shell.setSize(800, 600);
		shell.setText("Customer Recommendation Worksheet");
		shell.setLayout(new FormLayout());
		
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setLayout(new FillLayout(SWT.HORIZONTAL));
		FormData fd_composite = new FormData();
		fd_composite.top = new FormAttachment(0);
		fd_composite.bottom = new FormAttachment(100, -21);
		fd_composite.right = new FormAttachment(0, 782);
		fd_composite.left = new FormAttachment(0);
		composite.setLayoutData(fd_composite);
		
		ProgressBar progressBar = new ProgressBar(shell, SWT.NONE);
		FormData fd_progressBar = new FormData();
		fd_progressBar.right = new FormAttachment(composite, 0, SWT.RIGHT);
		fd_progressBar.top = new FormAttachment(composite);
		fd_progressBar.left = new FormAttachment(composite, 0, SWT.LEFT);
		progressBar.setLayoutData(fd_progressBar);
		progressBar.setMinimum(0);
		progressBar.setMaximum(20);
		int progress = 0;
		
		SelectionRecord sr = new SelectionRecord();
		
		TabFolder tabFolder = new TabFolder(composite, SWT.NONE);
		
		TabItem tabItem = new TabItem(tabFolder, SWT.NONE);
		tabItem.setText("Customer Information");
		
		Composite composite_1 = new Composite(tabFolder, SWT.NONE);
		tabItem.setControl(composite_1);
		
		Composite composite_3 = new Composite(composite_1, SWT.NONE);
		composite_3.setBounds(0, 87, 330, 52);
		
		SelectionRecord srWhat = new SelectionRecord();

		Label lblDoesTheCustomer = new Label(composite_3, SWT.NONE);
		lblDoesTheCustomer.setBounds(0, 0, 330, 20);
		lblDoesTheCustomer.setText("Does the customer have the Best Buy Credit Card?");
		
		Button btnRadioButton = new Button(composite_3, SWT.RADIO);
		btnRadioButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srWhat.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srWhat.setSelected();
				sr.setSelection("btnRadioButton");
				}
			}
		});
		btnRadioButton.setBounds(0, 32, 111, 20);
		btnRadioButton.setText("Yes");
		
		Button btnRadioButton_1 = new Button(composite_3, SWT.RADIO);
		btnRadioButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srWhat.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srWhat.setSelected();
				sr.setSelection("btnRadioButton_1");
				}
			}
		});
		btnRadioButton_1.setBounds(219, 32, 111, 20);
		btnRadioButton_1.setText("No");
		
		Composite composite_4 = new Composite(composite_1, SWT.NONE);
		composite_4.setBounds(0, 0, 330, 81);
		
		Label lblWhatBringsThem = new Label(composite_4, SWT.NONE);
		lblWhatBringsThem.setBounds(0, 0, 330, 20);
		lblWhatBringsThem.setText("What brings them in today?");
		
		SelectionRecord srWhat2 = new SelectionRecord();

		/* */
		text = new Text(composite_4, SWT.BORDER);
		text.setBounds(0, 22, 330, 59);
		text.addModifyListener(new ModifyListener()
				{

					@Override
					public void modifyText(ModifyEvent arg0) {
						// TODO Auto-generated method stub
						if(!srWhat2.getSelected()){
							progressBar.setSelection(progressBar.getSelection() + 1);
							srWhat2.setSelected();
							}
					}
			
				});
				
		Label lblWhatIsImportant = new Label(composite_1, SWT.NONE);
		lblWhatIsImportant.setBounds(0, 141, 330, 20);
		lblWhatIsImportant.setText("What is important to the customer?");
		
		Button btnSpeed = new Button(composite_1, SWT.CHECK);
		btnSpeed.setBounds(0, 191, 70, 20);
		
		SelectionRecord srWhat3 = new SelectionRecord();

		btnSpeed.setText("Speed");
		btnSpeed.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srWhat3.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srWhat3.setSelected();
				sr.setSelection("btnSpeed");
				}
			}
		});
		
		Label lblLaptops = new Label(composite_1, SWT.NONE);
		lblLaptops.setBounds(0, 165, 70, 20);
		lblLaptops.setText("Laptops:");
		
		Button btnBatteryLife = new Button(composite_1, SWT.CHECK);
		btnBatteryLife.setBounds(77, 191, 99, 20);
		btnBatteryLife.setText("Battery Life");
		
		btnBatteryLife.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srWhat3.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srWhat3.setSelected();
				sr.setSelection("btnBatteryLife");
				}
			}
		});
		
		
		Button btnHardDriveSpace = new Button(composite_1, SWT.CHECK);
		btnHardDriveSpace.setBounds(182, 191, 142, 20);
		btnHardDriveSpace.setText("Hard Drive Space");
		btnHardDriveSpace.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srWhat3.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srWhat3.setSelected();
				sr.setSelection("btnHardDriveSpace");
				}
			}
		});
		
		Button btnManufacturerWarranty = new Button(composite_1, SWT.CHECK);
		btnManufacturerWarranty.setBounds(0, 217, 175, 20);
		btnManufacturerWarranty.setText("Manufacturer Warranty");
		btnManufacturerWarranty.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srWhat3.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srWhat3.setSelected();
				sr.setSelection("btnManufacturerWarranty");
				}
			}
		});
		
		
		Button btnOther = new Button(composite_1, SWT.CHECK);
		btnOther.setBounds(0, 243, 70, 20);
		btnOther.setText("Other");
		btnOther.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srWhat3.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srWhat3.setSelected();
				sr.setSelection("btnOther");
				}
			}
		});
		text_1 = new Text(composite_1, SWT.BORDER);
		text_1.setEditable(false);
		text_1.setBounds(0, 269, 330, 62);
		
		/*
		 * This is the handler for the button selection to activate the 
		 * dialog box.
		 */
		
		/* 
		btnOther.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				if(text_1.getEditable())
				{
					text_1.setEditable(false);
					text_1.setText("");
				}
				else
				{
					text_1.setEditable(true);
				}
			}
		});
		*/
		
		btnOther.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				if(text_1.getEditable())
				{
					text_1.setEditable(false);
					text_1.setText("");
				}
				else
				{
					text_1.setEditable(true);
				}
				sr.setSelection(text_1.toString());
			}
		});
		
		Label lblTablets = new Label(composite_1, SWT.NONE);
		lblTablets.setBounds(0, 337, 70, 20);
		lblTablets.setText("Tablets:");
		
		Button btnOswindowsandroidios = new Button(composite_1, SWT.CHECK);
		btnOswindowsandroidios.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srWhat3.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srWhat3.setSelected();
				sr.setSelection("btnOswindowsandroidios");
				}
			}
		});
		btnOswindowsandroidios.setBounds(0, 363, 207, 20);
		btnOswindowsandroidios.setText("OS (Windows/Android/iOS)");
		
		Button btnBatteryLife_1 = new Button(composite_1, SWT.CHECK);
		btnBatteryLife_1.setBounds(213, 363, 111, 20);
		btnBatteryLife_1.setText("Battery Life");
		btnBatteryLife_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srWhat3.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srWhat3.setSelected();
				sr.setSelection("btnBatteryLife_1");
				}
			}
		});
		Button btnMemory = new Button(composite_1, SWT.CHECK);
		btnMemory.setBounds(0, 389, 79, 20);
		btnMemory.setText("Memory");
		btnMemory.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srWhat3.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srWhat3.setSelected();
				sr.setSelection("btnMemory");
				}
			}
		});
		Button btnScreenSizeAnd = new Button(composite_1, SWT.CHECK);
		btnScreenSizeAnd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srWhat3.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srWhat3.setSelected();
				sr.setSelection("btnScreenSizeAnd");
				}
			}
		});
		btnScreenSizeAnd.setBounds(91, 389, 163, 20);
		btnScreenSizeAnd.setText("Screen Size and Type");
		
		Button btnManufacturerWarranty_1 = new Button(composite_1, SWT.CHECK);
		btnManufacturerWarranty_1.setBounds(0, 415, 175, 20);
		btnManufacturerWarranty_1.setText("Manufacturer Warranty");
		btnManufacturerWarranty_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srWhat3.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srWhat3.setSelected();
				sr.setSelection("btnManufacturerWarranty_1");
				}
			}
		});
		Button btnOther_1 = new Button(composite_1, SWT.CHECK);
		btnOther_1.setBounds(0, 441, 61, 20);
		btnOther_1.setText("Other");
		btnOther_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srWhat3.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srWhat3.setSelected();
				sr.setSelection("btnOther_1");
				}
			}
		});
		text_2 = new Text(composite_1, SWT.BORDER);
		text_2.setEditable(false);
		text_2.setBounds(71, 441, 259, 26);
		
		btnOther_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				if(text_2.getEditable())
				{
					text_2.setEditable(false);
					text_2.setText("");
				}
				else
				{
					text_2.setEditable(true);
				}
			}
		});
		
		/* This will verify the checked boxes and complete progress. */
		
		SelectionRecord srWhat4 = new SelectionRecord();

		Label lblWhatProgramsDo = new Label(composite_1, SWT.NONE);
		lblWhatProgramsDo.setBounds(336, 0, 247, 20);
		lblWhatProgramsDo.setText("What programs do you currently use?");
		
		text_3 = new Text(composite_1, SWT.BORDER);
		text_3.setBounds(336, 26, 428, 123);
		text_3.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(!srWhat4.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srWhat4.setSelected();
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		SelectionRecord srWhat5 = new SelectionRecord();

		
		Label lblWhoWillBe = new Label(composite_1, SWT.NONE);
		lblWhoWillBe.setBounds(336, 155, 207, 20);
		lblWhoWillBe.setText("Who will Be Using The Device?");
		
		text_4 = new Text(composite_1, SWT.BORDER);
		text_4.setBounds(334, 175, 209, 26);
		text_4.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(!srWhat5.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srWhat5.setSelected();
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		SelectionRecord srWhat6 = new SelectionRecord();

		Label lblWhere = new Label(composite_1, SWT.NONE);
		lblWhere.setBounds(549, 155, 70, 20);
		lblWhere.setText("Where?");
		
		text_5 = new Text(composite_1, SWT.BORDER);
		text_5.setBounds(549, 175, 215, 26);
		text_5.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(!srWhat6.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srWhat6.setSelected();
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		SelectionRecord srWhat7 = new SelectionRecord();

		Label lblDeviceRecommendation = new Label(composite_1, SWT.NONE);
		lblDeviceRecommendation.setBounds(336, 210, 175, 20);
		lblDeviceRecommendation.setText("Device Recommendation");
		
		text_6 = new Text(composite_1, SWT.BORDER);
		text_6.setBounds(336, 230, 207, 26);
		text_6.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(!srWhat7.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srWhat7.setSelected();
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		SelectionRecord srWhat8 = new SelectionRecord();

		Label lblAccessoriessoftwareThatAre = new Label(composite_1, SWT.NONE);
		lblAccessoriessoftwareThatAre.setBounds(336, 261, 428, 20);
		lblAccessoriessoftwareThatAre.setText("Accessories/Software that are included with the device?");
		
		text_7 = new Text(composite_1, SWT.BORDER);
		text_7.setBounds(336, 287, 428, 62);
		text_7.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(!srWhat8.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srWhat8.setSelected();
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		SelectionRecord srWhat9 = new SelectionRecord();
		
		Label lblRecommendedItemsThat = new Label(composite_1, SWT.NONE);
		lblRecommendedItemsThat.setBounds(336, 355, 428, 20);
		lblRecommendedItemsThat.setText("Recommended items that don't come with the device?");
		
		text_8 = new Text(composite_1, SWT.BORDER);
		text_8.setBounds(336, 381, 428, 87);
		text_8.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(!srWhat9.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srWhat9.setSelected();
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		TabItem tabItem_1 = new TabItem(tabFolder, SWT.NONE);
		tabItem_1.setText("Customer Needs");
		
		Composite composite_2 = new Composite(tabFolder, SWT.NONE);
		composite_2.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.NORMAL));
		tabItem_1.setControl(composite_2);
		
		Label lblYourTechnologyMap = new Label(composite_2, SWT.NONE);
		lblYourTechnologyMap.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblYourTechnologyMap.setBounds(10, 10, 198, 34);
		lblYourTechnologyMap.setText("Your Technology Map");
		
		Label lblHowOldIs = new Label(composite_2, SWT.NONE);
		lblHowOldIs.setBounds(10, 50, 165, 20);
		lblHowOldIs.setText("How old is your router?");

		Button btnMonths = new Button(composite_2, SWT.RADIO);
		btnMonths.setBounds(85, 79, 72, 20);
		btnMonths.setText("Months");
		sr.setSelection("btnMonths");
		
		Button btnYears = new Button(composite_2, SWT.RADIO);
		btnYears.setBounds(163, 79, 58, 20);
		btnYears.setText("Years");
		sr.setSelection("btnYears");
		
		SelectionRecord srNeed = new SelectionRecord();
		
		text_9 = new Text(composite_2, SWT.BORDER);
		text_9.setBounds(10, 76, 52, 26);
		text_9.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(!srNeed.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srNeed.setSelected();
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		Label lblInternetServiceProvider = new Label(composite_2, SWT.NONE);
		lblInternetServiceProvider.setBounds(10, 103, 198, 20);
		lblInternetServiceProvider.setText("Internet Service Provider?");
		
		SelectionRecord srNeed2 = new SelectionRecord();

		
		text_10 = new Text(composite_2, SWT.BORDER);
		text_10.setBounds(10, 126, 198, 26);
		text_10.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(!srNeed2.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srNeed2.setSelected();
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		Label lblCurrentInternetSpeed = new Label(composite_2, SWT.NONE);
		lblCurrentInternetSpeed.setBounds(10, 160, 165, 20);
		lblCurrentInternetSpeed.setText("Current Internet Speed");
		
		SelectionRecord srNeed3 = new SelectionRecord();
		
		text_11 = new Text(composite_2, SWT.BORDER);
		text_11.setBounds(10, 186, 198, 26);
		text_11.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(!srNeed3.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srNeed3.setSelected();
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		Label lblExistingDeviceOn = new Label(composite_2, SWT.NONE);
		lblExistingDeviceOn.setBounds(10, 235, 219, 20);
		lblExistingDeviceOn.setText("Existing Devices On The Network");
		
		SelectionRecord srExisting = new SelectionRecord();
		
		Button btnTablets = new Button(composite_2, SWT.CHECK);
		btnTablets.setBounds(10, 261, 98, 20);
		btnTablets.setText("Tablets");
		btnTablets.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srExisting.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srExisting.setSelected();
				sr.setSelection("btnTablets");
				}
			}
		});
		
		Button btnNotebooks = new Button(composite_2, SWT.CHECK);
		btnNotebooks.setBounds(10, 287, 111, 20);
		btnNotebooks.setText("Notebooks");
		btnNotebooks.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srExisting.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srExisting.setSelected();
				sr.setSelection("btnNotebooks");
				}
			}
		});
		
		Button btnDesktops = new Button(composite_2, SWT.CHECK);
		btnDesktops.setBounds(10, 313, 111, 20);
		btnDesktops.setText("Desktops");
		btnDesktops.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srExisting.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srExisting.setSelected();
				sr.setSelection("btnDesktops");
				}
			}
		});
		
		Button btnSmartphones = new Button(composite_2, SWT.CHECK);
		btnSmartphones.setBounds(10, 339, 111, 20);
		btnSmartphones.setText("Smartphones");
		btnSmartphones.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srExisting.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srExisting.setSelected();
				sr.setSelection("btnSmartPhones");
				}
			}
		});
		
		Button btnPrinters = new Button(composite_2, SWT.CHECK);
		btnPrinters.setBounds(10, 365, 111, 20);
		btnPrinters.setText("Printers");
		btnPrinters.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srExisting.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srExisting.setSelected();
				sr.setSelection("btnPrinters");
				}
			}
		});
		
		Button btnBlurayPlayers = new Button(composite_2, SWT.CHECK);
		btnBlurayPlayers.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srExisting.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srExisting.setSelected();
				sr.setSelection("btnBlurayPlayers");
				}
			}
		});
		btnBlurayPlayers.setBounds(10, 391, 111, 20);
		btnBlurayPlayers.setText("Blu-Ray");
		
		Button btnCablesatelliteBoxes = new Button(composite_2, SWT.CHECK);
		btnCablesatelliteBoxes.setBounds(127, 261, 165, 20);
		btnCablesatelliteBoxes.setText("Cable/Satellite Boxes");
		btnCablesatelliteBoxes.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srExisting.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srExisting.setSelected();
				sr.setSelection("btnCablesatelliteBoxes");
				}
			}
		});
		
		Button btnGamingSystems = new Button(composite_2, SWT.CHECK);
		btnGamingSystems.setBounds(127, 287, 165, 20);
		btnGamingSystems.setText("Gaming Systems");
		btnGamingSystems.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srExisting.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srExisting.setSelected();
				sr.setSelection("btnGamingSystems");
				}
			}
		});
		
		Button btnSmartTvs = new Button(composite_2, SWT.CHECK);
		btnSmartTvs.setBounds(127, 313, 111, 20);
		btnSmartTvs.setText("Smart TV's");
		btnSmartTvs.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srExisting.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srExisting.setSelected();
				sr.setSelection("btnSmartTvs");
				}
			}
		});
		
		Button btnStreamingDevices = new Button(composite_2, SWT.CHECK);
		btnStreamingDevices.setBounds(127, 339, 165, 20);
		btnStreamingDevices.setText("Streaming Devices");
		btnStreamingDevices.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srExisting.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srExisting.setSelected();
				sr.setSelection("btnStreamingDevices");
				}
			}
		});
		
		Button btnHomeAutomationProducts = new Button(composite_2, SWT.CHECK);
		btnHomeAutomationProducts.setBounds(127, 365, 209, 20);
		btnHomeAutomationProducts.setText("Home Automation Products");
		btnHomeAutomationProducts.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srExisting.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srExisting.setSelected();
				sr.setSelection("btnHomeUatomationProducts");
				}
			}
		});
		
		Button btnHomeSecurity = new Button(composite_2, SWT.CHECK);
		btnHomeSecurity.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srExisting.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srExisting.setSelected();
				sr.setSelection("btnHomeSecurity");
				}
			}
		});
		btnHomeSecurity.setBounds(127, 391, 209, 20);
		btnHomeSecurity.setText("Home Security");
		
		Button btnThermostat = new Button(composite_2, SWT.CHECK);
		btnThermostat.setBounds(10, 417, 111, 20);
		btnThermostat.setText("Thermostat");
		btnThermostat.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srExisting.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srExisting.setSelected();
				sr.setSelection("btnThermostat");
				}
			}
		});
		
		Button btnLighting = new Button(composite_2, SWT.CHECK);
		btnLighting.setBounds(127, 417, 111, 20);
		btnLighting.setText("Lighting");
		btnLighting.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srExisting.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srExisting.setSelected();
				sr.setSelection("btnLighting");
				}
			}
		});
		
		SelectionRecord srSuggestions = new SelectionRecord();
		Button btnPremiumRouter = new Button(composite_2, SWT.CHECK);
		btnPremiumRouter.setBounds(360, 53, 165, 20);
		btnPremiumRouter.setText("Premium Router");
		btnPremiumRouter.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srSuggestions.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srSuggestions.setSelected();
				sr.setSelection("btnPremiumRouter");
				}
			}
		});
		Label lblSuggestedEnhancements = new Label(composite_2, SWT.NONE);
		lblSuggestedEnhancements.setBounds(360, 17, 183, 34);
		lblSuggestedEnhancements.setText("Suggested Enhancements");
		
		Button btnUpgradePhone = new Button(composite_2, SWT.CHECK);
		btnUpgradePhone.setBounds(360, 79, 183, 20);
		btnUpgradePhone.setText("Upgrade Phone");
		btnUpgradePhone.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srSuggestions.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srSuggestions.setSelected();
				sr.setSelection("btnUpgradePhone");
				}
			}
		});
		Button btnUpgradeInternetSpeed = new Button(composite_2, SWT.CHECK);
		btnUpgradeInternetSpeed.setBounds(360, 103, 183, 20);
		btnUpgradeInternetSpeed.setText("Upgrade Internet Speed");
		btnUpgradeInternetSpeed.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srSuggestions.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srSuggestions.setSelected();
				sr.setSelection("btnUpgradeInternetSpeed");
				}
			}
		});
		Button btnHomeAutomation = new Button(composite_2, SWT.CHECK);
		btnHomeAutomation.setBounds(360, 129, 183, 20);
		btnHomeAutomation.setText("Home Automation");
		btnHomeAutomation.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srSuggestions.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srSuggestions.setSelected();
				sr.setSelection("btnHomeAutomation");
				}
			}
		});
		Button btnWirelessExtender = new Button(composite_2, SWT.CHECK);
		btnWirelessExtender.setBounds(360, 155, 183, 20);
		btnWirelessExtender.setText("Wireless extender");
		btnWirelessExtender.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srSuggestions.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srSuggestions.setSelected();
				sr.setSelection("btnWirelessExtender");
				}
			}
		});
		Button btnStreamingDevices_1 = new Button(composite_2, SWT.CHECK);
		btnStreamingDevices_1.setBounds(360, 181, 183, 20);
		btnStreamingDevices_1.setText("Streaming Devices");
		btnStreamingDevices_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srSuggestions.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srSuggestions.setSelected();
				sr.setSelection("btnStreamingDevices_1");
				}
			}
		});
		Button btnOther_2 = new Button(composite_2, SWT.CHECK);
		btnOther_2.setBounds(360, 207, 58, 20);
		btnOther_2.setText("Other");
		btnOther_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srSuggestions.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srSuggestions.setSelected();
				sr.setSelection("btnOther_2");
				}
			}
		});
		text_13 = new Text(composite_2, SWT.BORDER);
		text_13.setEditable(false);
		text_13.setBounds(422, 204, 156, 26);
		
		btnOther_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				if(text_13.getEditable())
				{
					text_13.setEditable(false);
					text_13.setText("");
				}
				else
				{
					text_13.setEditable(true);
				}
			}
		});
		
		SelectionRecord srSuggAcc = new SelectionRecord();
		Label lblSuggestedAccessories = new Label(composite_2, SWT.NONE);
		lblSuggestedAccessories.setBounds(360, 235, 235, 20);
		lblSuggestedAccessories.setText("Suggested Accessories");
		
		Button btnPrinter = new Button(composite_2, SWT.CHECK);
		btnPrinter.setBounds(360, 261, 111, 20);
		btnPrinter.setText("Printer");
		btnPrinter.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srSuggAcc.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srSuggAcc.setSelected();
				sr.setSelection("btnPrinter");
				}
			}
		});
		Button btnBatteryBackup = new Button(composite_2, SWT.CHECK);
		btnBatteryBackup.setBounds(360, 287, 135, 20);
		btnBatteryBackup.setText("Battery Backup");
		btnBatteryBackup.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srSuggAcc.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srSuggAcc.setSelected();
				sr.setSelection("btnBatteryBackup");
				}
			}
		});
		
		Button btnSpeakers = new Button(composite_2, SWT.CHECK);
		btnSpeakers.setBounds(360, 313, 111, 20);
		btnSpeakers.setText("Speakers");
		btnSpeakers.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srSuggAcc.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srSuggAcc.setSelected();
				sr.setSelection("btnSpeakers");
				}
			}
		});
		
		Button btnExternalHardDrive = new Button(composite_2, SWT.CHECK);
		btnExternalHardDrive.setBounds(360, 339, 183, 20);
		btnExternalHardDrive.setText("External Hard Drive");
		btnExternalHardDrive.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srSuggAcc.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srSuggAcc.setSelected();
				sr.setSelection("btnExternalHardDrive");
				}
			}
		});
		
		Button btnOther_3 = new Button(composite_2, SWT.CHECK);
		btnOther_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srSuggAcc.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srSuggAcc.setSelected();
				sr.setSelection("btnOther_3");
				}
			}
		});
		btnOther_3.setBounds(360, 365, 72, 20);
		btnOther_3.setText("Other");
		
		text_12 = new Text(composite_2, SWT.BORDER);
		text_12.setEditable(false);
		text_12.setBounds(360, 391, 235, 83);
		
		btnOther_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				if(text_12.getEditable())
				{
					text_12.setEditable(false);
					text_12.setText("");
				}
				else
				{
					text_12.setEditable(true);
				}
			}
		});
		
		TabItem tbtmGeekSquad = new TabItem(tabFolder, SWT.NONE);
		tbtmGeekSquad.setText("Geek Squad");
		
		Composite composite_5 = new Composite(tabFolder, SWT.NONE);
		tbtmGeekSquad.setControl(composite_5);
		
		table = new Table(composite_5, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(0, 25, 764, 142);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnGeekSquadProtect = new TableColumn(table, SWT.NONE);
		tblclmnGeekSquadProtect.setWidth(288);
		tblclmnGeekSquadProtect.setText("Geek Squad Protect and Support");
		
		TableColumn tblclmnGeekSquadProtect_1 = new TableColumn(table, SWT.NONE);
		tblclmnGeekSquadProtect_1.setWidth(374);
		tblclmnGeekSquadProtect_1.setText("Geek Squad Protect and Support Plus");
		
		Label lblIAcknowledgeCustomer = new Label(composite_5, SWT.NONE);
		lblIAcknowledgeCustomer.setBounds(10, 208, 500, 75);
		lblIAcknowledgeCustomer.setText("I acknowledge customer needs, wants, and desires have been met and this \r\nis the best presented solution for this customer available with my \r\nprofessional knowledge.");
		
		SelectionRecord srEmail = new SelectionRecord();
		txtNamedomaincom = new Text(composite_5, SWT.BORDER);
		txtNamedomaincom.setText("name@domain.com");
		txtNamedomaincom.setBounds(10, 320, 148, 26);
		txtNamedomaincom.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(!srEmail.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srEmail.setSelected();
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		Label lblCustomerEmailAddress = new Label(composite_5, SWT.NONE);
		lblCustomerEmailAddress.setBounds(10, 294, 169, 20);
		lblCustomerEmailAddress.setText("Customer Email Address");
		
		Button btnSubmit = new Button(composite_5, SWT.NONE);
		btnSubmit.setBounds(10, 351, 90, 30);
		btnSubmit.setText("Submit");
		
		SelectionRecord srGs = new SelectionRecord();
		
		Button btnThisCustomerOpted = new Button(composite_5, SWT.CHECK);
		btnThisCustomerOpted.setBounds(10, 173, 423, 20);
		btnThisCustomerOpted.setText("This customer opted out of Geek Squad Protect and Support");
		btnThisCustomerOpted.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!srGs.getSelected()){
				progressBar.setSelection(progressBar.getSelection() + 1);
				srGs.setSelected();
				sr.setSelection("btnThisCustomerOpted");
				}
			}
		});
		
		Menu menu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menu);
		
		MenuItem mntmFile = new MenuItem(menu, SWT.CASCADE);
		mntmFile.setText("File");
		
		Menu menu_1 = new Menu(mntmFile);
		mntmFile.setMenu(menu_1);
		
		SelectionRecord srLogin = new SelectionRecord();
		MenuItem mntmLogin = new MenuItem(menu_1, SWT.NONE);
		mntmLogin.setText("Login");
		mntmLogin.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void widgetSelected(SelectionEvent arg0) 
			{
				// TODO Auto-generated method stub
				if(!srLogin.getSelected())
				{
					srLogin.setSelected();
					progressBar.setSelection(progressBar.getSelection() + 1);
				}
				LoginWindow lw = new LoginWindow(shell, SWT.CLOSE | SWT.TITLE);
				lw.open();
			}
		});
		
		MenuItem mntmSave = new MenuItem(menu_1, SWT.NONE);
		mntmSave.setText("Save...");
		mntmSave.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				SaveCRWWindow lw = new SaveCRWWindow(shell, SWT.CLOSE | SWT.TITLE);
				lw.open();
			}
			
		});
		
		MenuItem mntmSavedCrw = new MenuItem(menu_1, SWT.NONE);
		mntmSavedCrw.setText("Saved CRWs");
		mntmSavedCrw.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				SavedCRWsWindow lw = new SavedCRWsWindow(shell, SWT.CLOSE | SWT.TITLE);
				lw.open();
			}
		});
		
		MenuItem mntmAbout = new MenuItem(menu, SWT.NONE);
		mntmAbout.setText("About");
		
		mntmAbout.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				AboutWindow lw = new AboutWindow(shell, SWT.CLOSE | SWT.TITLE);
				lw.open();
			}
		});
	}
}
