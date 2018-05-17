package move;

import java.util.Random;
import java.util.Scanner;

import combatGround.FederationGround;
import combatGround.KlingonGround;
import combatGround.Player;
import enemy.RandomEnemy;

public class GroundMove {

  private String crew = "C";
  private boolean battle;
  private boolean beam;
  private static int x = 1;
  private static int y = 1;
  // private int scan = 10;

  public String getCrew() {
    return crew;
  }

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
    System.out.println("Beaming us out now, Captain.");
    setBeam(true);

  }

  public void flavorText() {
    
    Random rand = new Random();
    int choose;
    Player p = new Player();

    choose = rand.nextInt(5) + 1;
    switch (choose) {
      case 1:
        if (p.player == FederationGround.FEDERATIONTACTICIAN || p.player == FederationGround.FEDERATIONENGINEER || p.player == FederationGround.FEDERATIONSCIENTIST) {
          System.out.println("\nThere isn't much around you.\nHowever, you do find some indeginous plants.\nYou ask your science officer to observe it.");
          System.out.println();
        } else if (p.player == KlingonGround.KLINGONTACTICIAN || p.player == KlingonGround.KLINGONENGINEER || p.player == KlingonGround.KLINGONSCIENTIST) {
          System.out.println("There isn't much around you.\n");
        }else System.out.println("placeholder\n");
        break;
      case 2:
        if (p.player == FederationGround.FEDERATIONTACTICIAN || p.player == FederationGround.FEDERATIONENGINEER || p.player == FederationGround.FEDERATIONSCIENTIST) {
          System.out.println("\nThere is a strange animal that you encounter.\nAlthough it seems passive, you decide it best not to disturb it.");
          System.out.println();
        } else if (p.player == KlingonGround.KLINGONTACTICIAN || p.player == KlingonGround.KLINGONENGINEER || p.player == KlingonGround.KLINGONSCIENTIST) {
          System.out.println("\nThere is a strange animal that you encounter.\nYou and your crew hunt the beast." 
              + "\nIt's corpse gets transported to the ship.\nYou will have a GLORIOUS feast once back on the ship.");
        }else System.out.println("placeholder\n");
        break;
      case 3:
        System.out.println("\nplaceholder\n");
        break;
      case 4:
        System.out.println("\nplaceholder\n");
        break;
      case 5:
        System.out.println("\nplaceholder\n");
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
      System.out.println("2. East");
      System.out.println("3. South");
      System.out.println("4. West");
      System.out.println("5. Beam Up");
      choice = input.nextInt();

    } while (choice < 1 | choice > 5);

    switch (choice) {
      case 1:

        x--;

        if (x < 1) {
          System.out.println("Going out of the destination's parameter.");
          crewMove(eventMap, groundMap);
          break;
        } else if ("E".equals(eventMap[x][y])) {
          System.out.println("Encountering an opposing force:\n");
          re.spawnGroundEnemy();
          setBattle(true);

          break;
        } else if ("B".equals(eventMap[x][y])) {
          System.out.println("place holder activity.");
          break;
        } else if ("~".equals(eventMap[x][y])) {
          flavorText();
          break;
        }

        break;

      case 2:
        y++;
        if (y > 10) {
          System.out.println("Going out of bounds, input new destination");
          y--;
          crewMove(eventMap, groundMap);
          break;
        } else if ("B".equals(eventMap[x][y])) {
          System.out.println("place holder activity.");
          break;
        } else if ("E".equals(eventMap[x][y])) {
          System.out.println("Encountering an opposing force:\n");
          re.spawnGroundEnemy();
          setBattle(true);
          break;
        } else if ("~".equals(eventMap[x][y])) {
          flavorText();
          break;
        }
        break;

      case 3:
        x++;

        if (x > 10) {
          System.out.println("Going out of bounds, input new destination");
          x--;
          crewMove(eventMap, groundMap);
          break;
        } else if ("E".equals(eventMap[x][y])) {
          System.out.println("Encountering an opposing force:\n");
          re.spawnGroundEnemy();
          setBattle(true);
          break;
        } else if ("B".equals(eventMap[x][y])) {
          System.out.println("place holder activity.");
          break;
        } else if ("~".equals(eventMap[x][y])) {
          flavorText();
          break;
        }

        break;

      case 4:
        y--;
        if (y < 1) {
          System.out.println("Going out of bounds, input new destination");
          y++;
          crewMove(eventMap, groundMap);
          break;
        } else if ("E".equals(eventMap[x][y])) {
          System.out.println("Encountering an opposing force:\n");
          re.spawnGroundEnemy();
          setBattle(true);
          break;
        } else if ("B".equals(eventMap[x][y])) {
          System.out.println("Placeholder activity.");
          break;
        } else if ("~".equals(eventMap[x][y])) {
          flavorText();
          break;
        }

        break;

      case 5:
        beamUp();
    }
  }
}
