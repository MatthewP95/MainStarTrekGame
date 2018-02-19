package move;

import java.util.Random;
import enemy.RandomEnemy;

public class Locations {

  public String[][] eventMap = new String[20][20];
  String enemy = "E";
  String planet = "P";
  String space = "*";
  String ship = SpaceMove.ship;
  RandomEnemy re = new RandomEnemy();

  public void createMap(String[][] starMap) {

    Random rand = new Random();

    for (int i = 0; i < starMap.length; i++) {
      for (int j = 0; j < starMap[i].length; j++) {
        /*
         * place enemy, planet, or empty space based on random number generator lines 19 - 27 "*"
         * empty space, "E" enemy, "P" planet.
         */
        int random = rand.nextInt(10) + 1;
        if (random == 3 && starMap[i][j] != starMap[0][0]) {
          int placePlanet = rand.nextInt(5) + 1;
          if (placePlanet == 4) {
            starMap[i][j] = planet;
          } else
            starMap[i][j] = enemy;
        } else if (i == 0 && j == 0)
          starMap[i][j] = ship;
        else
          starMap[i][j] = space;
      }
    }

    this.eventMap = starMap;
  }

  public void moveShip() {

    for (int i = 0; i < 19; i++) {
      for (int j = 0; j < 19; j++) {
        if (eventMap[i][j] == ship) {
          eventMap[i][j] = space;
          eventMap[SpaceMove.getX()][SpaceMove.getY()] = ship;
        }
      }
    }
    System.out.println("Ship is at: " + SpaceMove.getX() + ", " + SpaceMove.getY());
  }

  public void printMap(String[][] starMap) {

    boolean DEBUG = true;

    for (int i = 0; i < starMap.length; i++) {

      for (int j = 0; j < starMap[i].length; j++) {

        // checks where createMap placed planets/enemies
        if (DEBUG) {
          if (starMap[i][j] == planet)
            System.out.print(planet);
          if (starMap[i][j] == enemy)
            System.out.print(enemy);
          else if (SpaceMove.getX() == i && SpaceMove.getY() == j)
            System.out.print(ship);
          else
            System.out.print(space);
        } else if (SpaceMove.getX() == i && SpaceMove.getY() == j)
          System.out.print(ship);
        else
          System.out.print(space);

        System.out.print("\t");
      }

      System.out.println();
      System.out.println();

    }
  }
}
