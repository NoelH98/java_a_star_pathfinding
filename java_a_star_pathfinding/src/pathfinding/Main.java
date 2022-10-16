package pathfinding;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		boolean keepRunning = true;
	
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		window.setResizable(false);
		window.setTitle("A* Pathfinding");
		window.add(new Panel());
		
		window.pack();
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		
		try {
			
			while(keepRunning) {
				System.out.println("PathFinding...");
				Thread.sleep(500);
				Panel.search();
				
				if(Panel.goalReached == true) keepRunning = false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Finished!!!!");
		
	}

}
