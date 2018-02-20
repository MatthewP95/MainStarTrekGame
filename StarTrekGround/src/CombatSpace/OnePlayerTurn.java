package CombatSpace;

import java.io.IOException;

import move.SpaceMove;

public class OnePlayerTurn {

  static boolean fed;
  static boolean kling;
  static boolean rom;
 

  public void onePlayerTurn(Object Ship1, Object Ship2) throws IOException, InterruptedException {
    Ai classAi = new Ai();
    boolean gameEnded = false;

    Ship1 = ChooseShips.x;
    Ship2 = ChooseShips.y;

    if (ChooseShips.fed == true) {
      while (!gameEnded) { // while game isnt ended

        if (KlingonFleet.a == Ship2 | KlingonFleet.b == Ship2 | KlingonFleet.c == Ship2) {
          fed = true;
          ((FederationFleet) Ship1).choose(Ship1, Ship2);
          if (((KlingonFleet) Ship2).gethullStrength() <= 0) {
            System.out.println("The USS " + ChooseShips.getfName() + " was victorious!");
            SpaceMove.setBattle(false);
            break;
            // if the Klingon ship goes to 0 hull, break out of loop
          }
          fed = false;

          ((KlingonFleet) Ship2).attackMenu(Ship2);
          classAi.aiChoiceKling(Ship1, Ship2);

          if (((FederationFleet) Ship1).gethullStrength() <= 0) {
            System.out.println("The KDF " + ChooseShips.getkName() + " was victorious!");
            
            break;
          }
        } else if (RomulanFleet.a == Ship2 | RomulanFleet.b == Ship2 | RomulanFleet.c == Ship2) {
          fed = true;
          ((FederationFleet) Ship1).choose(Ship1, Ship2);
          if (((RomulanFleet) Ship2).gethullStrength() <= 0) {
            System.out.println("The USS " + ChooseShips.getfName() + " was victorious!");
            SpaceMove.setBattle(false);
            break;
            // if the Klingon ship goes to 0 hull, break out of loop
          }
          fed = false;

          ((RomulanFleet) Ship2).attackMenu(Ship2);
          classAi.aiChoiceRom(Ship1, Ship2);

          if (((FederationFleet) Ship1).gethullStrength() <= 0) {
            System.out.println("The KDF " + ChooseShips.getkName() + " was victorious!");
            SpaceMove.setBattle(false);
            break;
          }
        }
      }
    }

    if (ChooseShips.rom == true) {
      while (!gameEnded) {

        if (FederationFleet.a == Ship2 | FederationFleet.b == Ship2 | FederationFleet.c == Ship2) {
          rom = true;
          ((RomulanFleet) Ship1).choose(Ship1, Ship2);

          if (((FederationFleet) Ship2).gethullStrength() <= 0) {
            System.out.println("The RSE " + ChooseShips.getrName() + " was victorious!");
            SpaceMove.setBattle(false);
            break;
          }

          rom = false;
          ((FederationFleet) Ship2).attackMenu(Ship2);
          classAi.aiChoiceFed(Ship1, Ship2);

          if (((RomulanFleet) Ship1).gethullStrength() <= 0) {
            System.out.println("The USS " + ChooseShips.getfName() + " was victorious!");
            SpaceMove.setBattle(false);
            break;
          }
        } else if (KlingonFleet.a == Ship2 | KlingonFleet.b == Ship2 | KlingonFleet.c == Ship2) {

          rom = true;
          ((RomulanFleet) Ship1).choose(Ship1, Ship2);
          if (((KlingonFleet) Ship2).gethullStrength() <= 0) {
            System.out.println("The RSE " + ChooseShips.getrName() + " was victorious!");
            SpaceMove.setBattle(false);
            break;
            // if the Klingon ship goes to 0 hull, break out of loop
          }
          rom = false;

          ((KlingonFleet) Ship2).attackMenu(Ship2);
          classAi.aiChoiceKling(Ship1, Ship2);

          if (((RomulanFleet) Ship1).gethullStrength() <= 0) {
            System.out.println("The KDF " + ChooseShips.getkName() + " was victorious!");
            SpaceMove.setBattle(false);
            break;

          }
        }
      }
    }

    if (ChooseShips.kling == true) {
      while (!gameEnded) {

        if (FederationFleet.a == Ship2 | FederationFleet.b == Ship2 | FederationFleet.c == Ship2) {
          kling = true;
          ((KlingonFleet) Ship1).choose(Ship1, Ship2);

          if (((FederationFleet) Ship2).gethullStrength() <= 0) {
            System.out.println("The KDF " + ChooseShips.getkName() + " was victorious!");
            SpaceMove.setBattle(false);
            break;
            // if the Klingon ship goes to 0 hull, break out of loop
          }

          kling = false;
          ((FederationFleet) Ship2).attackMenu(Ship2);
          classAi.aiChoiceFed(Ship1, Ship2);

          if (((KlingonFleet) Ship1).gethullStrength() <= 0) {
            System.out.println("The USS " + ChooseShips.getfName() + " was victorious!");
            SpaceMove.setBattle(false);
            break;
          }
        } else if (RomulanFleet.a == Ship2 | RomulanFleet.b == Ship2 | RomulanFleet.c == Ship2) {

          kling = true;
          ((KlingonFleet) Ship1).choose(Ship1, Ship2);

          if (((RomulanFleet) Ship2).gethullStrength() <= 0) {
            System.out.println("The KDF " + ChooseShips.getkName() + " was victorious!");
            SpaceMove.setBattle(false);
            break;
            // if the Klingon ship goes to 0 hull, break out of loop
          }

          kling = false;
          ((RomulanFleet) Ship2).attackMenu(Ship2);
          classAi.aiChoiceRom(Ship1, Ship2);

          if (((KlingonFleet) Ship1).gethullStrength() <= 0) {
            System.out.println("The USS " + ChooseShips.getfName() + " was victorious!");
            SpaceMove.setBattle(false);
            break;
          }
        }
      }
    }
  }
}
