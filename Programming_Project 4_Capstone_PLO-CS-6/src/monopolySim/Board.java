package monopolySim;

import java.util.ArrayList;

/**
 * Creates and maintains the monopoly board.
 */
public class Board {

	private ArrayList<Space> spaces;
	private int[] visitsPerSpace;
	private int totalVisits;
	
	
	public Board() {
		spaces = new ArrayList<Space>();
		visitsPerSpace = new int[40];
	    totalVisits = 0;
	}


	public ArrayList<Space> getSpaces() {
		return spaces;
	}


	public int[] getVisitsPerSpace() {
		return visitsPerSpace;
	}


	public int getTotalVisits() {
		return totalVisits;
	}
	
	
	
	
}
