package CombatSpace;

import java.io.IOException;

public enum FederationFleet {

  a("The USS " + ChooseShips.getfName(), 100, 100, 2, 3, 2), b("The USS " + ChooseShips.getfName(), 100, 100, 3, 2, 1), c("The USS " + ChooseShips.getfName(), 100, 100, 2, 4, 3);

  private int shieldStrength; // Shields
  private int hullStrength; // hull
  private int tNum; // torpedo ammo
  private int rNum; // repair shields amount
  private int hNum; // hull repair amount

  FederationFleet(String name, int shieldStrength, int hullStrength, int tNum, int rNum, int hNum) {

    this.setShieldStrength(Commands.shieldStrength);
    this.sethullStrength(Commands.hullStrength);
    this.settNum(tNum);
    this.setrNum(rNum);
    this.sethNum(hNum);
  }

  // lines 26 - 64 getters and setters for variables
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

  public void attackMenu(Object ff) {

    System.out.println("+++++++++++++++++++++++++++++++++++");
    System.out.println("Federation Captain's Turn");
    System.out.println("The USS " + ChooseShips.getfName() + ": \n");
    System.out.println("Sheilds are at: " + ((FederationFleet) ff).getShieldStrength() + "%");
    System.out.println("Hull is at: " + ((FederationFleet) ff).gethullStrength() + "%\n");
    System.out.println("Captain, give an order: ");
    System.out.println("  1. Phasers");
    System.out.println("  2. Torpedo | " + "you have " + ((FederationFleet) ff).gettNum() + " left");
    if (getShieldStrength() < 100) {
      System.out.println("  3. Repair Shields | " + "you have " + ((FederationFleet) ff).getrNum() + " left");
    }
    if (gethullStrength() < 100) {
      System.out.println("  4. Hull Repair | " + "you have " + ((FederationFleet) ff).gethNum() + " left");
    }
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

      if ((choice == '2' && gettNum() == 0) | (choice == '3' && getrNum() == 0) | (choice == '4' && gethNum() == 0))
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
        player.defence1(Ship1);
        break;
      case '4':
        player.defence2(Ship1);
        break;
    }
  }
}
