package CombatSpace;

import java.io.IOException;

import spaceFaction.FederationFleet;
import spaceFaction.KlingonFleet;
import spaceFaction.RomulanFleet;

public class SpaceCombat {

  static boolean fed;
  static boolean kling;
  static boolean rom;
  private static boolean lose;
  
  public static boolean isLose() {
    return lose;
  }


  public static void setLose(boolean lose) {
    SpaceCombat.lose = lose;
  }

  public static boolean isBattleEnd() {
    return battleEnd;
  }


  public static void setBattleEnd(boolean battleEnd) {
    SpaceCombat.battleEnd = battleEnd;
  }

  private static boolean battleEnd;
 

  public void spaceBattle(Object Ship1, Object Ship2) throws IOException, InterruptedException {
    Ai classAi = new Ai();
    boolean gameEnded = false;

    Ship1 = ChooseShips.x;
    Ship2 = ChooseShips.y;
    setBattleEnd(false);
    
    if (ChooseShips.fed == true) {
      while (!gameEnded) { // while game isnt ended

        if (Ship2.equals(KlingonFleet.a) | Ship2.equals(KlingonFleet.b)  | Ship2.equals(KlingonFleet.c)) {
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
            setLose(true);
            
            
            break;
          }
        } else if (Ship2.equals(RomulanFleet.a)| Ship2.equals(RomulanFleet.b) | Ship2.equals(RomulanFleet.c)) {
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
            setLose(true);
            break;
          }
        }
      }
    }

    if (ChooseShips.rom == true) {
      while (!gameEnded) {

        if (Ship2.equals(FederationFleet.a)| Ship2.equals(FederationFleet.b)| Ship2.equals(FederationFleet.c)) {
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
            setLose(true);
            break;
          }
        } else if (Ship2.equals(KlingonFleet.a) | Ship2.equals(KlingonFleet.b)  | Ship2.equals(KlingonFleet.c)) {

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
            setLose(true);
            break;

          }
        }
      }
    }

    if (ChooseShips.kling == true) {
      while (!gameEnded) {

        if (Ship2.equals(FederationFleet.a)| Ship2.equals(FederationFleet.b)| Ship2.equals(FederationFleet.c)) {
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
            setLose(true);
            break;
          }
        } else if (Ship2.equals(RomulanFleet.a)| Ship2.equals(RomulanFleet.b) | Ship2.equals(RomulanFleet.c)) {

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
            setLose(true);
            break;
          }
        }
      }
    }
  }
}
