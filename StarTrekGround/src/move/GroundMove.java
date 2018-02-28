package move;

import java.util.Scanner;

import enemy.RandomEnemy;

public class GroundMove {

  public static String crew = "C";
  private boolean battle;
  private boolean beam;
  private static int x = 1;
  private static int y = 1;
  //private int scan = 10;

  public static int getX() {
    return x;
  }

  public static void setX(int x) {
    GroundMove.x = x;
  }

  public static int getY() {
    return y;
  }

  public static void setY(int y) {
    GroundMove.y = y;
  }

  public boolean isBattle() {
    return battle;
  }

  public void setBattle(boolean battle) {
    this.battle = battle;
  }

  public boolean isBeam() {
    return beam;
  }

  public void setBeam(boolean beam) {
    this.beam = beam;
  }

  public void beamUp() {
    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);
    // Locations loc = new Locations();
    int choice;

    do {
      System.out.println("Shall we beam back up to the ship, Captain?");
      System.out.println("1. Beam us out, now.");
      System.out.println("2. No, let's just move on.");
      choice = input.nextInt();

    } while (choice < 1 | choice > 2);

    switch (choice) {
      case 1:
        setBeam(true);
        break;
      case 2:
        setBeam(false);
        // System.out.println("placeholderactivity");
        break;
    }
  }

  public void crewMove(String[][] eventMap, String[][] groundMap) throws InterruptedException {

    RandomEnemy re = new RandomEnemy();
    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);
    int choice;

    do {

      System.out.println("Captain, where should we go?");
      System.out.println("1. North");
      System.out.println("2. South");
      System.out.println("3. East");
      System.out.println("4. West");
      System.out.println("5. Scan");
      choice = input.nextInt();

    } while (choice < 1 | choice > 5);

    switch (choice) {
      case 1:
        x--;
        if (eventMap[x][y] == "E") {
          re.spawnGroundEnemy();
          setBattle(true);

          break;
        }
        if (eventMap[x][y] == "P") {
          beamUp();
          break;
        }
        if (x < 1) {
          System.out.println("Going out of bounds, input new destination");
          x++;

          crewMove(eventMap, groundMap);
        }

        break;
      case 2:
        y++;
        if (eventMap[x][y] == "E") {
          re.spawnGroundEnemy();
          setBattle(true);

          break;
        }
        if (y < 20)
          ;
    }
  }

}
