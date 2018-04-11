package CombatSpace;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import spaceFaction.FederationFleet;
import spaceFaction.KlingonFleet;
import spaceFaction.RomulanFleet;

public class ChooseShips {

  public static Object x;
  public static Object y;

  private static String fName;
  private static String kName;
  private static String rName;

  static boolean fed = false;
  static boolean kling = false;
  static boolean rom = false;

  private Scanner in = new Scanner(System.in);

  public static String getfName() {
    return fName;
  }

  public void setfName(String fName) {
    ChooseShips.fName = fName;
  }

  public static String getkName() {
    return kName;
  }

  public void setkName(String kName) {
    ChooseShips.kName = kName;
  }

  public static String getrName() {
    return rName;
  }

  public void setrName(String rName) {
    ChooseShips.rName = rName;
  }

  public String enterNameF() {
    // gives Federation ship a name
    System.out.println("Federation Captain, enter a name for your ship: ");
    String name = in.nextLine().trim();
    return fName = name;
  }

  public String enterNameK() {
    // gives Klingon Ship a name
    System.out.println("Klingon Captain, enter a name for your ship: ");
    String name = in.nextLine().trim();
    return kName = name;
  }

  public String enterNameR() {
    // give Romulan ship a name
    System.out.println("Romulan Captain, enter a name for your ship: ");
    String name = in.nextLine().trim();
    return rName = name;
  }

  public String aiKName() {
    // use SpaceAi Klingon Name

    return kName = classAi.kName; // set predetermined name
  }

  public String aiFName() {
    // use SpaceAi Federation Name

    return fName = classAi.fName; // set predetermined name
  }

  private String aiRName() {
    // use SpaceAi Romulan Name
    return rName = classAi.rName;
  }

  SpaceAi classAi = new SpaceAi();

  public void fedShip() { // Choice Display for Federation
    System.out.println("Federation Captain select a ship type: ");
    System.out.println(" 1. Offensive ");
    System.out.println("	Shields: " + FederationFleet.b.getShieldStrength());
    System.out.println("	Hull: " + FederationFleet.b.gethullStrength());
    System.out.println("	Torpedoes: " + FederationFleet.b.gettNum() + " | Damage: 40 - 50");
    System.out.println("	Shield Repairs: " + FederationFleet.b.getrNum() + " | Repairs: 20 - 30");
    System.out.println("	Hull Repairs: " + FederationFleet.b.gethNum() + " | Repairs: 30 - 35");
    System.out.println("	Phaser Damage: 20 - 30");
    System.out.println(" 2. Well-Rounded ");
    System.out.println("	Shields: " + FederationFleet.a.getShieldStrength());
    System.out.println("	Hull: " + FederationFleet.a.gethullStrength());
    System.out.println("	Torpedoes: " + FederationFleet.a.gettNum() + " | Damage: 30 - 40");
    System.out.println("	Shield Repairs: " + FederationFleet.a.getrNum() + " | Repairs: 20 - 30");
    System.out.println("	Hull Repairs: " + FederationFleet.a.gethNum() + " | Repairs: 30 - 40");
    System.out.println("	Phaser Damage: 10 - 25");
    System.out.println(" 3. Defensive ");
    System.out.println("	Shields: " + FederationFleet.c.getShieldStrength());
    System.out.println("	Hull: " + FederationFleet.c.gethullStrength());
    System.out.println("	Torpedoes: " + FederationFleet.c.gettNum() + " | Damage: 20 - 40");
    System.out.println("	Shield Repairs: " + FederationFleet.c.getrNum() + " | Repairs: 20 - 30");
    System.out.println("	Hull Repairs: " + FederationFleet.c.gethNum() + " | Repairs: 35 - 50");
    System.out.println("	Phaser Damage: 10 - 20");
  }

  public void klingShip() { // Choice Display for Klingons
    System.out.println("Klingon Captain, select a ship type: ");
    System.out.println(" 1. Offensive ");
    System.out.println("	Shields: " + KlingonFleet.b.getShieldStrength());
    System.out.println("	Hull: " + KlingonFleet.b.gethullStrength());
    System.out.println("	Torpedoes: " + KlingonFleet.b.gettNum() + " | Damage: 40 - 50");
    System.out.println("	Shield Repairs: " + KlingonFleet.b.getrNum() + " | Repairs: 20 - 30");
    System.out.println("	Hull Repairs: " + KlingonFleet.b.gethNum() + " | Repairs: 30 - 35");
    System.out.println("	Disruptor Damage: 20 - 30");
    System.out.println(" 2. Well-Rounded ");
    System.out.println("	Shields: " + KlingonFleet.a.getShieldStrength());
    System.out.println("	Hull: " + KlingonFleet.a.gethullStrength());
    System.out.println("	Torpedoes: " + KlingonFleet.a.gettNum() + " | Damage: 30 - 40");
    System.out.println("	Shield Repairs: " + KlingonFleet.a.getrNum() + " | Repairs: 20 - 30");
    System.out.println("	Hull Repairs: " + KlingonFleet.a.gethNum() + " | Repairs: 30 - 40");
    System.out.println("	Disruptor Damage: 15 - 25");
    System.out.println(" 3. Defensive ");
    System.out.println("	Shields: " + KlingonFleet.c.getShieldStrength());
    System.out.println("	Hull: " + KlingonFleet.c.gethullStrength());
    System.out.println("	Torpedoes: " + KlingonFleet.c.gettNum() + " | Damage: 20 - 40");
    System.out.println("	Shield Repairs: " + KlingonFleet.c.getrNum() + " | Repairs: 20 - 30");
    System.out.println("	Hull Repairs: " + KlingonFleet.c.gethNum() + " | Repairs: 35 - 50");
    System.out.println("	Disruptor Damage: 10 - 20");
  }

  public void romShip() {
    System.out.println("Romulan Captain, select a ship type: ");
    System.out.println(" 1. Offensive ");
    System.out.println("	Shields: " + RomulanFleet.b.getShieldStrength());
    System.out.println("	Hull: " + RomulanFleet.b.gethullStrength());
    System.out.println("	Torpedoes: " + RomulanFleet.b.gettNum() + " | Damage: 40 - 50");
    System.out.println("	Shield Repairs: " + RomulanFleet.b.getrNum() + " | Repairs: 20 - 30");
    System.out.println("	Hull Repairs: " + RomulanFleet.b.gethNum() + " | Repairs: 30 - 35");
    System.out.println("	Disruptor Damage: 20 - 30");
    System.out.println(" 2. Well-Rounded ");
    System.out.println("	Shields: " + RomulanFleet.a.getShieldStrength());
    System.out.println("	Hull: " + RomulanFleet.a.gethullStrength());
    System.out.println("	Torpedoes: " + RomulanFleet.a.gettNum() + " | Damage: 30 - 40");
    System.out.println("	Shield Repairs: " + RomulanFleet.a.getrNum() + " | Repairs: 20 - 30");
    System.out.println("	Hull Repairs: " + RomulanFleet.a.gethNum() + " | Repairs: 30 - 40");
    System.out.println("	Disruptor Damage: 15 - 25");
    System.out.println(" 3. Defensive ");
    System.out.println("	Shields: " + RomulanFleet.c.getShieldStrength());
    System.out.println("	Hull: " + RomulanFleet.c.gethullStrength());
    System.out.println("	Torpedoes: " + RomulanFleet.c.gettNum() + " | Damage: 20 - 40");
    System.out.println("	Shield Repairs: " + RomulanFleet.c.getrNum() + " | Repairs: 20 - 30");
    System.out.println("	Hull Repairs: " + RomulanFleet.c.gethNum() + " | Repairs: 35 - 50");
    System.out.println("	Disruptor Damage: 10 - 20");
  }

  public void fleets() {
    System.out.println("Choose your faction");
    System.out.println(" 1. Federation");
    System.out.println(" 2. Klingon");
    System.out.println(" 3. Romulan");
  }

  public void aiChoiceK() throws InterruptedException {
    System.out.println("We are detecting a cloaked vessel in the vicinity.");
    TimeUnit.SECONDS.sleep(2);
    classAi.aiChooseKling();
    aiKName();
    System.out.println();
  }

  public void aiChoiceF() throws InterruptedException {
    System.out.println("There is a Federation Ship near us, sir.");
    TimeUnit.SECONDS.sleep(2);
    classAi.aiChooseFed();
    aiFName();
    System.out.println();
  }

  public void aiChoiceR() throws InterruptedException {
    System.out.println("We're picking up emmisions associated with Romulan warbird's, sir.");
    TimeUnit.SECONDS.sleep(2);
    classAi.aiChooseRom();
    aiRName();
    System.out.println();
  }

  public void chooseShips() throws IOException, InterruptedException {
    char choice, ignore;

    do {
      fleets(); // asks which fleet you wish to play as

      choice = (char) System.in.read();

      do {
        ignore = (char) System.in.read();
      } while (ignore != '\n');
    } while (choice < '1' | choice > '3');

    switch (choice) {
      case '1': // federation is chosen
        fed = true;
        
        do {

          enterNameF(); // input for a name
          fedShip(); // choice of ship

          choice = (char) System.in.read();

          do {
            ignore = (char) System.in.read();
          } while (ignore != '\n');
        } while (choice < '1' | choice > '3');

        switch (choice) {
          case '1': // select Offensive
            x = FederationFleet.b;
            break;
          case '2': // Select Well-Rounded
            x = FederationFleet.a;
            break;
          case '3': // Select Defensive
            x = FederationFleet.c;
            break;
        }

        System.out.println("Player is playing as: The USS " + fName + "\n");
        // stores selection in x

        break;

      case '2': // choose klingon
        kling = true;

        do {

          enterNameK();
          klingShip();

          choice = (char) System.in.read();

          do {
            ignore = (char) System.in.read();
          } while (ignore != '\n');
        } while (choice < '1' | choice > '3');

        switch (choice) {
          case '1':
            x = KlingonFleet.b;
            break;
          case '2':
            x = KlingonFleet.a;
            break;
          case '3':
            x = KlingonFleet.c;
            break;
        }

        System.out.println("Player is playing as: The KDF " + kName + "\n");
        // stores selection in x

        break;

      case '3': // choose romulan
        rom = true;
        
        do {

          enterNameR();
          romShip();

          choice = (char) System.in.read();

          do {
            ignore = (char) System.in.read();
          } while (ignore != '\n');
        } while (choice < '1' | choice > '3');

        switch (choice) {
          case '1':
            x = RomulanFleet.b;
            break;
          case '2':
            x = RomulanFleet.a;
            break;
          case '3':
            x = RomulanFleet.c;
            break;
        }

        System.out.println("Player is playing as: The RSE " + rName + "\n");
        // stores selection in x

        break;

    }
  }
}