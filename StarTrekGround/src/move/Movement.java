package move;

import java.util.Random;
import java.util.Scanner;

import enemy.RandomEnemy;

public class Movement {

	RandomEnemy re = new RandomEnemy();

	int moveSpace = 0;
	int moving = 0;

	public void moveCharacter() {
		while (true) {
			moving();
			Random rand = new Random();
			int chance = rand.nextInt(2) + 1;

			if (moveSpace == 0) {
				System.out.println(whereIs());
				break;
			}

			if (chance == 1) {
				re.spawnEnemy();

			}
			if (moveSpace == 1 && chance != 1)
				moveSpace = 1;
			System.out.println("You are standing " + whereIs());
		}
	}

	String whereIs() {
		String here = null;

		if (moveSpace == 0) {
			here = "You have beamed back up to your ship.";
		}
		if (moveSpace == 1) {
			here = "in front of a village.";
		}
		if (moveSpace == 2) {
			here = "the middle of the village.";
		}
		if (moveSpace == 3) {
			here = "near what appears to be a home";
		}
		if (moveSpace == 4) {
			here = "";
		}

		return here;
	}

	//acts as movement
	int moving() {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Where do you go?");
		System.out.println("1. Forward.");
		System.out.println("2. Back.");
		System.out.println("3. Beam me up.");

		moving = input.nextInt();

		switch (moving) {
		case 1:
			moveSpace++;
			break;
		case 2:
			moveSpace--;
			break;
		case 3:
			moveSpace = 0;
			break;

		}

		return moving;

	}
}
