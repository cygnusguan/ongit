package swingx;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

import org.jdesktop.swingx.JXTreeTable;

public class RunTreeTable {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		
		JFrame f = new JFrame("Test JTreeTable");
		
		
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		f.setLocationRelativeTo(null);
		f.setSize(800, 600);
		
		
		MyTreeTableModel treeTableModel = new MyTreeTableModel();
		JXTreeTable treeTable = new JXTreeTable( treeTableModel );
		
		f.getContentPane().add(treeTable);
		
		f.setVisible(true);
		
		
		
	}

}
