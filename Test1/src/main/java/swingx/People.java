package swingx;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

import org.jdesktop.swingx.treetable.DefaultMutableTreeTableNode;
import org.jdesktop.swingx.treetable.TreeTableNode;

public class People extends DefaultMutableTreeTableNode {

	private static final long serialVersionUID = 1L;

	People parent = null;
	List<TreeTableNode> childs = new ArrayList<TreeTableNode>();

	private int age;
	private String name;

	public People(String nome, int idade) {
		setName(nome);
		setAge(idade);
	}

	public void setParent(People p) {
		this.parent = p;
	}

	public List getChilds() {
		return childs;
	}

	public void setChilds(List filhos) {
		this.childs = filhos;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int idade) {
		this.age = idade;
	}

	public String getName() {
		return name;
	}

	public void setName(String nome) {
		this.name = nome;
	}

	public void add(People p) {
		childs.add(p);
		p.setParent(this);
	}

	public TreeTableNode getChildAt(int childIndex) {
		return childs.get(childIndex);
	}

	public int getChildCount() {
		return childs.size();
	}

	public TreeTableNode getParent() {
		return parent;
	}

	public int getIndex(TreeNode node) {
		return childs.indexOf(node);
	}

	public boolean equals(Object p) {

		if (p == null || !(p instanceof People))
			return false;

		People p2 = (People) p;

		if (p2.getName().equalsIgnoreCase(this.getName()))
			return true;

		return false;
	}

	public String toString() {
		return getName();
	}

}

