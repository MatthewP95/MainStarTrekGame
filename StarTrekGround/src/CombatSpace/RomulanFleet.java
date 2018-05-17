package CombatSpace;

import java.io.IOException;

public enum RomulanFleet {

  a("The RSE " + ChooseShips.getrName(), 100, 100, 2, 3, 2), b("The RSE " + ChooseShips.getrName(), 100, 100, 3, 2, 1), c("The RSE " + ChooseShips.getrName(), 100, 100, 2, 4, 3);

  private int shieldStrength; // Shields
  private int hullStrength; // hull
  private int tNum; // torpedo ammo
  private int rNum; // repair shields amount
  private int hNum; // hull repair amount

  RomulanFleet(String name, int shieldStrength, int hullStrength, int tNum, int rNum, int hNum) {

    this.setShieldStrength(Commands.shieldStrength);
    this.sethullStrength(Commands.hullStrength);
    this.settNum(tNum);
    this.setrNum(rNum);
    this.sethNum(hNum);
  }

  // lines 23 - 60 getters and setters for variables
  public int getShieldStrength() {
    return shieldStrength;
  }

  public void setShieldStrength(int shieldStrength) {
    this.shieldStrength = shieldStrength;
  }

  public int gethullStrength() {
    return hullStrength;
  }

  public void sethullStrength(int hullStrength) {
    this.hullStrength = hullStrength;
  }

  public int gettNum() {
    return tNum;
  }

  public void settNum(int tNum) {
    this.tNum = tNum;
  }

  public int getrNum() {
    return rNum;
  }

  public void setrNum(int rNum) {
    this.rNum = rNum;
  }

  public int gethNum() {
    return hNum;
  }

  public void sethNum(int hNum) {
    this.hNum = hNum;
  }

  public void attackMenu(Object rf) {

    System.out.println("+++++++++++++++++++++++++++++++++++");
    System.out.println("Romulan Captain's Turn");
    System.out.println("The RSE " + ChooseShips.getrName() + ": \n");
    System.out.println("Sheilds are at: " + ((RomulanFleet) rf).getShieldStrength() + "%");
    System.out.println("Hull is at: " + ((RomulanFleet) rf).gethullStrength() + "%\n");
    System.out.println("Captain, give an order: ");
    System.out.println("  1. Phasers");
    System.out.println("  2. Torpedo | " + "you have " + ((RomulanFleet) rf).gettNum() + " left");
    System.out.println("  3. Repair Shields | " + "you have " + ((RomulanFleet) rf).getrNum() + " left");
    System.out.println("  4. Hull Repair | " + "you have " + ((RomulanFleet) rf).gethNum() + " left"); 
    System.out.println("+++++++++++++++++++++++++++++++++++");
  }

  public void choose(Object Ship1, Object Ship2) throws IOException {
    // Menu and turn choices
    Player player = new Player();
    char choice, ignore;
    boolean proceed = false;

    do {
      proceed = false;

      attackMenu(Ship1);
      choice = (char) System.in.read();

      if ((choice == '2' & gettNum() == 0) || (choice == '3' & getrNum() == 0) || (choice == '4' & gethNum() == 0))
        System.out.println("choose again");
      else
        proceed = true;

      do {
        ignore = (char) System.in.read();
      } while (ignore != '\n');
    } while ((choice < '1' | choice > '4') || (proceed == false));

    switch (choice) {
      case '1':
        player.attack1(Ship1, Ship2);
        break;
      case '2':
        player.attack2(Ship1, Ship2);
        break;
      case '3':
        if(((RomulanFleet)Ship1).getShieldStrength() == 100) {
          System.out.println("Cannot repair shields.");
          choose(Ship1, Ship2);
        }
        player.defence1(Ship1);
        break;
      case '4':
        if(((RomulanFleet)Ship1).gethullStrength() == 100) {
          System.out.println("Cannot repair hull.");
          choose(Ship1, Ship2);
        }
        player.defence2(Ship1);
        break;
    }
  }
}
