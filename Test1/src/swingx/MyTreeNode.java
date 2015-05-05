package swingx;

import java.util.ArrayList;
import java.util.List;

class MyTreeNode

{

	private String name;

	private String description;

	private List children = new ArrayList();

	public MyTreeNode()

	{

	}

	public MyTreeNode(String name, String description)

	{

		this.name = name;

		this.description = description;

	}

	public String getName()

	{

		return name;

	}

	public void setName(String name)

	{

		this.name = name;

	}

	public String getDescription()

	{

		return description;

	}

	public void setDescription(String description)

	{

		this.description = description;

	}

	public List getChildren()

	{

		return children;

	}

	public String toString()

	{

		return "MyTreeNode:" + name + "," + description;

	}
}