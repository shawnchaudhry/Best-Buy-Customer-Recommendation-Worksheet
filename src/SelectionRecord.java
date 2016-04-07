import java.util.ArrayList;

public class SelectionRecord {
	
	boolean selection;
	ArrayList<String> selectedObjects;
	
	public SelectionRecord()
	{
		selection = false;
		selectedObjects = new ArrayList<String>();
	}
	
	public void setSelection(String var)
	{
		selectedObjects.add(var);
	}
	
	public ArrayList<String> getSelection()
	{
		return selectedObjects;
	}
	
	public void setSelected()
	{
		selection = true;
	}
	public boolean getSelected()
	{
		return selection;
	}
}
