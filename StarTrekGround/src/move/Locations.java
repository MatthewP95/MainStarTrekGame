package move;

import java.util.Random;

public class Locations {

  public String[][] eventMap = new String[21][21];
  public String[][] groundEventMap = new String[11][11];
  String enemy = "E";
  String planet = "P";
  String space = "*";
  String building = "B";
  String crew = "C";
  String ground = "~";
  String ship = SpaceMove.ship;
  SpaceMove sm = new SpaceMove();

  public void createGroundMap(String[][] groundMap) {
    Random rand = new Random();

    for (int i = 1; i < 11; i++) {
      for (int j = 1; j < 11; j++) {

        int random = rand.nextInt(10) + 1;
        if (random == 3 && groundMap[i][j] != groundMap[GroundMove.getX()][GroundMove.getY()]) {
          int placeBuilding = rand.nextInt(10) + 1;
          if (placeBuilding % 2 == 0) {
            groundMap[i][j] = building;
          } else
            groundMap[i][j] = enemy;
        } else if (i == GroundMove.getX() && j == GroundMove.getY())
          groundMap[i][j] = crew;
        else
          groundMap[i][j] = ground;
      }
    }

    this.groundEventMap = groundMap;
  }

  public void printGroundMap(String[][] groundMap) {

    boolean DEBUG = false;

    for (int i = 1; i < 11; i++) {

      for (int j = 1; j < 11; j++) {

        // checks where createMap placed planets/enemies
        if (DEBUG) {
          if (groundMap[i][j] == enemy)
            System.out.print(enemy);
          else if (GroundMove.getX() == i && GroundMove.getY() == j)
            System.out.print(crew);
          else
            System.out.print(ground);
        } else if (GroundMove.getX() == i && GroundMove.getY() == j)
          System.out.print(crew);
        else if (groundMap[i][j] == building)
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

    for (int i = 1; i < 21; i++) {
      for (int j = 1; j < 21; j++) {
        /*
         * place enemy, planet, or empty space based on random number generator lines 19 - 27 "*"
         * empty space, "E" enemy, "P" planet.
         */
        int random = rand.nextInt(10) + 1;
        if (random == 3 && starMap[i][j] != starMap[SpaceMove.getX()][SpaceMove.getY()]) {
          int placePlanet = rand.nextInt(5) + 1;
          if (placePlanet == 4 && numOfPlanets < 10) {
            starMap[i][j] = planet;
            numOfPlanets++;
          } else if (numOfEnemies < 20) {
            starMap[i][j] = enemy;
            numOfEnemies++;
          }
        } else if (i == SpaceMove.getX() && j == SpaceMove.getY())
          starMap[i][j] = ship;
        else
          starMap[i][j] = space;
      }
    }

    this.eventMap = starMap;
  }

  public void printMap(String[][] starMap) {

    boolean DEBUG = false;

    for (int i = 1; i < 21; i++) {

      for (int j = 1; j < 21; j++) {

        // checks where createMap placed planets/enemies
        if (DEBUG) {
          if (starMap[i][j] == enemy)
            System.out.print(enemy);
          else if (SpaceMove.getX() == i && SpaceMove.getY() == j)
            System.out.print(ship);
          else
            System.out.print(space);
        } else if (SpaceMove.getX() == i && SpaceMove.getY() == j)
          System.out.print(ship);
        else if (starMap[i][j] == planet)
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

    for (int i = 1; i < 20; i++) {
      for (int j = 1; j < 20; j++) {
        if (eventMap[i][j] == ship) {
          eventMap[i][j] = space;
          eventMap[SpaceMove.getX()][SpaceMove.getY()] = ship;
        }
      }
    }
  }

  public void moveCrew() {
    
    for(int i = 1; i < 20; i++) {
      for(int j = 1; j < 20; j++) {
        if(groundEventMap[i][j] == crew) {
          groundEventMap[i][j] = ground;
          groundEventMap[GroundMove.getX()][GroundMove.getY()] = crew;
        }
      }
    }
  }
}
