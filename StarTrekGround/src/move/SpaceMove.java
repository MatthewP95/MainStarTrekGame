package move;

import java.util.Scanner;

import enemy.RandomEnemy;

public class SpaceMove {

	public static String ship = "S";
	private static int x = 0;
	private static int y = 0;
	private int warp = 5;

	public static int getX() {
		return x;
	}

	public static int getY() {
		return y;
	}

	public void checkCoord(String[][] eventMap, String[][] starMap) {

	}

	public void shipMove(String[][] eventMap, String[][] starMap) {
		Locations loc = new Locations();
		RandomEnemy re = new RandomEnemy();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int choice;
		

		do {

			System.out.println("Where do you want to move?");
			System.out.println("1. North");
			System.out.println("2. East");
			System.out.println("3. South");
			System.out.println("4. West");
			System.out.println("5. Warp " + "(" + warp + ")");

			choice = input.nextInt();

		} while (choice < 1 || choice > 5);

		switch (choice) {
		case 1:

		  
			x--;

			if (x < 0) {
				System.out.println("Going out of bounds, input new destination");
				x++;
				
				shipMove(eventMap, starMap);
			}
			
			break;

		case 2:

			y++;
			if(eventMap[x][y].equals("E")) {
			  re.spawnEnemy();
			}
			if (y > 19) {
				System.out.println("Going out of bounds, input new destination");
				y--;
				
				shipMove(eventMap, starMap);
			}

			break;

		case 3:

			x++;

			if (x > 19) {
				System.out.println("Going out of bounds, input new destination");
				x--;
				shipMove(eventMap, starMap);
			}
			break;

		case 4:

			y--;
			if (y < 0) {
				System.out.println("Going out of bounds, input new destination");
				y++;
				shipMove(eventMap, starMap);
			}
			break;

		case 5:
			if(warp > 0) {
			System.out.println("Please plot a course:");
			System.out.println("Input x coordinate:");
			x = input.nextInt();
			System.out.println("Input y coordinate:");
			y = input.nextInt();
			if(x < 0 || y < 0 & x < 19 || y > 19 ) {
				System.out.println("Going out of bounds, input new destination");
				shipMove(eventMap, starMap);
			}
			warp--;
			} else {
				System.out.println("Out of Warp Plasma");
				shipMove(eventMap, starMap);
			}
			break;
		}
	}
}
