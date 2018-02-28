package CombatSpace;

import java.io.IOException;

public class OnePlayerTurn {

  static boolean fed;
  static boolean kling;
  static boolean rom;
  public static boolean lose;
  private static boolean battleEnd;
 

  public void spaceBattle(Object Ship1, Object Ship2) throws IOException, InterruptedException {
    Ai classAi = new Ai();
    boolean gameEnded = false;

    Ship1 = ChooseShips.x;
    Ship2 = ChooseShips.y;
    setBattleEnd(false);
    
    if (ChooseShips.fed == true) {
      while (!gameEnded) { // while game isnt ended

        if (KlingonFleet.a == Ship2 | KlingonFleet.b == Ship2 | KlingonFleet.c == Ship2) {
          fed = true;
          ((FederationFleet) Ship1).choose(Ship1, Ship2);
          if (((KlingonFleet) Ship2).gethullStrength() <= 0) {
            System.out.println("The USS " + ChooseShips.getfName() + " was victorious!");
            setBattleEnd(true);
            break;
            // if the Klingon ship goes to 0 hull, break out of loop
          }
          fed = false;

          ((KlingonFleet) Ship2).attackMenu(Ship2);
          classAi.aiChoiceKling(Ship1, Ship2);

          if (((FederationFleet) Ship1).gethullStrength() <= 0) {
            System.out.println("The KDF " + ChooseShips.getkName() + " was victorious!");
            lose = true;
            
            
            break;
          }
        } else if (RomulanFleet.a == Ship2 | RomulanFleet.b == Ship2 | RomulanFleet.c == Ship2) {
          fed = true;
          ((FederationFleet) Ship1).choose(Ship1, Ship2);
          if (((RomulanFleet) Ship2).gethullStrength() <= 0) {
            System.out.println("The USS " + ChooseShips.getfName() + " was victorious!");
            setBattleEnd(true);
            break;
            // if the Klingon ship goes to 0 hull, break out of loop
          }
          fed = false;

          ((RomulanFleet) Ship2).attackMenu(Ship2);
          classAi.aiChoiceRom(Ship1, Ship2);

          if (((FederationFleet) Ship1).gethullStrength() <= 0) {
            System.out.println("The RSE " + ChooseShips.getrName() + " was victorious!");
            lose = true;
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
            setBattleEnd(true);
            break;
          }

          rom = false;
          ((FederationFleet) Ship2).attackMenu(Ship2);
          classAi.aiChoiceFed(Ship1, Ship2);

          if (((RomulanFleet) Ship1).gethullStrength() <= 0) {
            System.out.println("The USS " + ChooseShips.getfName() + " was victorious!");
            lose = true;
            break;
          }
        } else if (KlingonFleet.a == Ship2 | KlingonFleet.b == Ship2 | KlingonFleet.c == Ship2) {

          rom = true;
          ((RomulanFleet) Ship1).choose(Ship1, Ship2);
          if (((KlingonFleet) Ship2).gethullStrength() <= 0) {
            System.out.println("The RSE " + ChooseShips.getrName() + " was victorious!");
            setBattleEnd(true);
            break;
            // if the Klingon ship goes to 0 hull, break out of loop
          }
          rom = false;

          ((KlingonFleet) Ship2).attackMenu(Ship2);
          classAi.aiChoiceKling(Ship1, Ship2);

          if (((RomulanFleet) Ship1).gethullStrength() <= 0) {
            System.out.println("The KDF " + ChooseShips.getkName() + " was victorious!");
            lose = true;
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
            setBattleEnd(true);
            break;
            // if the Klingon ship goes to 0 hull, break out of loop
          }

          kling = false;
          ((FederationFleet) Ship2).attackMenu(Ship2);
          classAi.aiChoiceFed(Ship1, Ship2);

          if (((KlingonFleet) Ship1).gethullStrength() <= 0) {
            System.out.println("The USS " + ChooseShips.getfName() + " was victorious!");
            lose = true;
            break;
          }
        } else if (RomulanFleet.a == Ship2 | RomulanFleet.b == Ship2 | RomulanFleet.c == Ship2) {

          kling = true;
          ((KlingonFleet) Ship1).choose(Ship1, Ship2);

          if (((RomulanFleet) Ship2).gethullStrength() <= 0) {
            System.out.println("The KDF " + ChooseShips.getkName() + " was victorious!");
            setBattleEnd(true);
            break;
            // if the Klingon ship goes to 0 hull, break out of loop
          }

          kling = false;
          ((RomulanFleet) Ship2).attackMenu(Ship2);
          classAi.aiChoiceRom(Ship1, Ship2);

          if (((KlingonFleet) Ship1).gethullStrength() <= 0) {
            System.out.println("The RSE " + ChooseShips.getrName() + " was victorious!");
            lose = true;
            break;
          }
        }
      }
    }
  }


  public static boolean isBattleEnd() {
    return battleEnd;
  }


  public static void setBattleEnd(boolean battleEnd) {
    OnePlayerTurn.battleEnd = battleEnd;
  }
}
