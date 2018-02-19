package groundGame;

import move.*;


public class Game {

	public static void main(String[] args) {
		
		Locations loc = new Locations();
		SpaceMove sm = new SpaceMove();
		
		String[][] starMap = new String[20][20];
		
		loc.createMap(starMap);
		
		while(true) {
		String[][] map = loc.eventMap;
		loc.printMap(starMap);
		sm.shipMove(map,starMap);
		loc.moveShip();
		}		
	}
}
