package location;

import java.util.Random;

import move.GroundMove;
import move.SpaceMove;

public class Locations {

  public final int X_AXIS = 11;
  public final int Y_AXIS = 11;
  public final int GXAXIS = 11;
  public final int GYAXIS = 11;
  String enemy = "E";
  String planet = "P";
  String space = "*";
  String building = "B";
  String ground = "~";
  SpaceMove sm = new SpaceMove();
  GroundMove gm = new GroundMove(); 

  public String[][] eventMap = new String[X_AXIS][Y_AXIS];
  public String[][] groundEventMap = new String[GXAXIS][GYAXIS];

  public void createGroundMap(String[][] groundMap) {
    Random rand = new Random();

    for (int i = 1; i < groundMap.length; i++) {
      for (int j = 1; j < groundMap[i].length; j++) {

        int random = rand.nextInt(10) + 1;
        if (random == 3 & groundMap[i][j] != groundMap[GroundMove.getX()][GroundMove.getY()]) {
          int placeBuilding = rand.nextInt(10) + 1;
          if (placeBuilding % 2 == 0) {
            groundMap[i][j] = building;
          } else
            groundMap[i][j] = enemy;
        } else if (i == GroundMove.getX() & j == GroundMove.getY())
          groundMap[i][j] = gm.getCrew();
        else
          groundMap[i][j] = ground;
      }
    }

    this.groundEventMap = groundMap;
  }

  public void printGroundMap(String[][] groundMap) {

    boolean DEBUG = false;

    for (int i = 1; i < groundMap.length; i++) {

      for (int j = 1; j < groundMap[i].length; j++) {

        // checks where createMap placed planets/enemies
        if (DEBUG) {
          if (enemy.equals(groundMap[i][j]))
            System.out.print(enemy);
          else if (GroundMove.getX() == i & GroundMove.getY() == j)
            System.out.print(gm.getCrew());
          else
            System.out.print(ground);
        } else if (GroundMove.getX() == i & GroundMove.getY() == j)
          System.out.print(gm.getCrew());
        else if (building.equals(groundMap[i][j]))
          System.out.print(building);
        else
          System.out.print(ground);

        System.out.print("\t");
      }

      System.out.println();
      System.out.println();

    }
  }

  public void createMap(String[][] starMap) {

    Random rand = new Random();
    int numOfPlanets = 0;
    int numOfEnemies = 0;

    for (int i = 1; i < starMap.length; i++) {
      for (int j = 1; j < starMap[i].length; j++) {
        /*
         * place enemy, planet, or empty space based on random number generator lines 19 - 27 "*"
         * empty space, "E" enemy, "P" planet.
         */
        int random = rand.nextInt(10) + 1;
        if (random == 3 & starMap[i][j] != starMap[SpaceMove.getX()][SpaceMove.getY()]) {
          int placePlanet = rand.nextInt(3) + 1;
          if (numOfPlanets < 5 & placePlanet == 1) {
            starMap[i][j] = planet;
            numOfPlanets++;
          }
        } else if (numOfEnemies < 8 & starMap[i][j] != starMap[SpaceMove.getX()][SpaceMove.getY()]) {
          starMap[i][j] = enemy;
          numOfEnemies++;

        } else if (i == SpaceMove.getX() & j == SpaceMove.getY())
          starMap[i][j] = sm.getShip();
        else
          starMap[i][j] = space;
      }
    }

    this.eventMap = starMap;
  }

  public void printMap(String[][] starMap) {

    boolean DEBUG = false;

    for (int i = 1; i < starMap.length; i++) {

      for (int j = 1; j < starMap[i].length; j++) {

        // checks where createMap placed planets/enemies
        if (DEBUG) {
          if (enemy.equals(starMap[i][j]))
            System.out.print(enemy);
          else if (SpaceMove.getX() == i & SpaceMove.getY() == j)
            System.out.print(sm.getShip());
          else
            System.out.print(space);
        } else if (SpaceMove.getX() == i & SpaceMove.getY() == j)
          System.out.print(sm.getShip());
        else if (planet.equals(starMap[i][j]))
          System.out.print(planet);
        else
          System.out.print(space);

        System.out.print("\t");
      }

      System.out.println();
      System.out.println();

    }
  }

  public void moveShip() {

    for (int i = 1; i < eventMap.length; i++) {
      for (int j = 1; j < eventMap[i].length; j++) {
        if (sm.getShip().equals(eventMap[i][j])) {
          eventMap[i][j] = space;
          eventMap[SpaceMove.getX()][SpaceMove.getY()] = sm.getShip();
        }
      }
    }
  }

  public void moveCrew() {

    for (int i = 1; i < groundEventMap.length; i++) {
      for (int j = 1; j < groundEventMap[i].length; j++) {
        if (gm.getCrew().equals(groundEventMap[i][j])) {
          groundEventMap[i][j] = ground;
          groundEventMap[GroundMove.getX()][GroundMove.getY()] = gm.getCrew();
        }
      }
    }
  }
}
