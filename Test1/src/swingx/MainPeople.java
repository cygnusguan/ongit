package swingx;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;

import org.jdesktop.swingx.JXTreeTable;

public class MainPeople {

	public static void main(String[] args) {
		People alex = new People("Alex", 23);

		People alex2 = new People("Alex 2 ", 3);
		People alex3 = new People("Alex 4 ", 5);

		alex2.add(alex3);
		alex.add(alex2);

		createGUI(alex);
	}

	private static void createGUI(People p) {

		JFrame frame = new JFrame("Test JXTableTree by Alex");

		frame.setSize(350, 200);

		frame.setLocationRelativeTo(null);

		frame.setLayout(new BorderLayout());

		JXTreeTable treeTable = treeTable(p);
		JTree tree2 = convetionalTree(p);

		JScrollPane s1 = new JScrollPane(treeTable);
		JScrollPane s2 = new JScrollPane(tree2);

		s1.setPreferredSize(new Dimension(150, 100));
		s2.setPreferredSize(new Dimension(150, 100));

		frame.add(s1, BorderLayout.EAST);
		frame.add(s2, BorderLayout.WEST);

		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private static JXTreeTable treeTable(People p) {
		JXTreeTable tree = new JXTreeTable(new FamilyTreeTableModel(p));
		return tree;
	}

	private static JTree convetionalTree(People p) {
		JTree tree = new JTree(new DefaultTreeModel(p));
		return tree;
	}

}
