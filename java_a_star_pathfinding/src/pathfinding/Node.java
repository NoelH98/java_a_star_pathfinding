package pathfinding;

import java.awt.Color;
import javax.swing.JButton;

public class Node extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Node parent;
	int col, row, gCost, hCost, fCost;
	boolean start,goal,solid,open,checked;
	
	
	public Node (int col, int row) {
		this.col = col;
		this.row = row;
		
		setBackground(Color.white);
		setForeground(Color.white);
	
	}
	
	public void setAsStart() {
		setBackground(Color.pink);
		setForeground(Color.white);
		setText("Start");
		start = true;
	}

	public void setAsGoal() {
		setBackground(Color.pink);
		setForeground(Color.white);
		setText("Goal");
		goal = true;
	}
	
	public void setAsSolid() {
		setBackground(Color.black);
		setForeground(Color.black);
		solid = true;
	}
	
	public void setAsOpen() {
		open = true;
	}
	
	public void setAsChecked() {
		if(start == false && goal == false) {
			setBackground(Color.red);
			setForeground(Color.black);
		}
		checked = true;
	}
	
	public void setAsPath() {
		setBackground(Color.green);
		setForeground(Color.black);
	}
	
	public int getCol() {
		return col;
	}
	
	public int getRow() {
		return row;
	}
	
}
