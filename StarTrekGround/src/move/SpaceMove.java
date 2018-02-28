package move;

import java.io.IOException;
import java.util.Scanner;

public class SpaceMove {

  public static String ship = "S";
  private static boolean battle;
  private boolean beam;
  private static int x = 1;
  private static int y = 1;
  private int warp = 5;
  private int scan = 10;

  public static int getX() {
    return x;
  }

  public static int getY() {
    return y;
  }

  public static boolean getBattle() {
    return battle;
  }

  public void setBattle(boolean battle) {
    SpaceMove.battle = battle;
  }

  public boolean getBeam() {
    return beam;
  }

  public void setBeam(boolean beam) {
    this.beam = beam;
  }

  public void beamDown() {
    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);
    // Locations loc = new Locations();
    int choice;

    do {
      System.out.println("Shall we send down a crew, Captain?");
      System.out.println("1. Send a landing party down.");
      System.out.println("2. No, let's just move on.");
      choice = input.nextInt();

    } while (choice < 1 | choice > 2);

    switch (choice) {
      case 1:
        setBeam(true);
        break;
      case 2:
        setBeam(false);
        System.out.println("placeholderactivity");
        break;
    }
  }

  public void checkCoord(String[][] eventMap, int x, int y) {
    int any = 0;

    for (int j = (x - 1); j < (x + 2); j++) {

      for (int k = (y - 1); k < (y + 2); k++) {

        if ("E".equals(eventMap[j][k])) {
          System.out.println("There is a warp trail at " + j + ", " + k);
          any++;
        }
      }
    }
    if (any == 0) {
      System.out.println("Nothing is out there Captain");
    }
  }

  public void shipMove(String[][] eventMap, String[][] starMap) throws InterruptedException, IOException {
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
      System.out.println("6. Sensor Sweep " + "(" + scan + ")");

      choice = input.nextInt();
    } while (choice < 1 || choice > 6);

    switch (choice) {
      case 1:

        x--;
        if (x < 1) {
          System.out.println("Going out of bounds, input new destination");
          x++;

          shipMove(eventMap, starMap);
        }

        if ("E".equals(eventMap[x][y])) {
          setBattle(true);

          break;
        }

        if ("P".equals(eventMap[x][y])) {
          beamDown();
          break;
        }

        break;

      case 2:

        y++;
        if (y > 20) {
          System.out.println("Going out of bounds, input new destination");
          y--;
          shipMove(eventMap, starMap);
        }

        if ("E".equals(eventMap[x][y])) {

          setBattle(true);
          break;
        }

        if ("P".equals(eventMap[x][y])) {
          beamDown();
          break;
        }

        break;

      case 3:

        x++;
        if (x > 20) {
          System.out.println("Going out of bounds, input new destination");
          x--;
          shipMove(eventMap, starMap);
        }

        if ("E".equals(eventMap[x][y])) {

          setBattle(true);
          break;
        }

        if ("P".equals(eventMap[x][y])) {
          beamDown();
          break;
        }

        break;

      case 4:

        y--;
        if (y < 1) {
          System.out.println("Going out of bounds, input new destination");
          y++;
          shipMove(eventMap, starMap);
        }

        if ("E".equals(eventMap[x][y])) {

          setBattle(true);
          break;
        }

        if ("P".equals(eventMap[x][y])) {
          beamDown();
          break;
        }

        break;

      case 5:
        if (warp > 0) {
          System.out.println("Please plot a course:");
          System.out.println("Input Y coordinate(1-20):");
          x = input.nextInt();
          System.out.println("Input X coordinate(1-20):");
          y = input.nextInt();
          if ("E".equals(eventMap[x][y])) {

            setBattle(true);
            break;
          }
          if ("P".equals(eventMap[x][y])) {
            beamDown();
            break;
          }
          if (x < 1 || y < 0 & x < 20 || y > 20) {
            System.out.println("Going out of bounds, input new destination");
            shipMove(eventMap, starMap);
          }
          warp--;
        } else {
          System.out.println("Out of Warp Plasma");
          shipMove(eventMap, starMap);
        }
        break;

      case 6:

        int scanX = 0;
        int scanY = 0;

        try {
          do {
            System.out.println("Select area to scan: ");

            System.out.println("Please input Y coordinate(2-19)");
            scanX = input.nextInt();

            System.out.println("Please input X coordinate(2-19)");
            scanY = input.nextInt();
          } while (scanX < 2 | scanX > 19 && scanY < 2 | scanY > 19);

        } catch (Exception e) {
          System.out.println("Invalid input, please try again");
          shipMove(eventMap, starMap);
        }
        checkCoord(eventMap, scanX, scanY);
        break;
    }
  }
}