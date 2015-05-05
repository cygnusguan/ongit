package swingx;

import org.jdesktop.swingx.treetable.DefaultTreeTableModel;
import org.jdesktop.swingx.treetable.TreeTableNode;

public class FamilyTreeTableModel extends DefaultTreeTableModel {

	public FamilyTreeTableModel(People p) {
		super((TreeTableNode) p);
	}

	public int getColumnCount() {
		return 2;
	}

	public String getColumnName(int column) {
		return (column == 0 ? "Name" : "Age");
	}

	public boolean isCellEditable(Object node, int column) {
		return true;
	}

	public Object getValueAt(Object node, int column) {

		People p = (People) node;

		String value = p.getName();

		if (column == 1)
			value = p.getAge() + "";

		return value;
	}

}