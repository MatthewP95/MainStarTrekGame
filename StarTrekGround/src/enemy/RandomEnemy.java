package enemy;

import java.util.Random;

import CombatSpace.ChooseShips;
import CombatSpace.FederationFleet;
import CombatSpace.KlingonFleet;
import CombatSpace.RomulanFleet;
import combatGround.FederationGround;
import combatGround.KlingonGround;
import combatGround.RomulanGround;

public class RandomEnemy {

  public Object Enemy;
  Random random = new Random();

  public void spawnSpaceEnemy() throws InterruptedException {
    ChooseShips cs = new ChooseShips();
    Random rand = new Random();

    int choose = rand.nextInt(2) + 1;
    if (ChooseShips.x.equals(FederationFleet.a) || ChooseShips.x.equals(FederationFleet.b) || ChooseShips.x.equals(FederationFleet.c)) {
      switch (choose) {
        case 1:
          cs.aiChoiceK();
          break;
        case 2:
          cs.aiChoiceR();
          break;
      }
    }
    if (ChooseShips.x.equals(KlingonFleet.a) || ChooseShips.x.equals(KlingonFleet.b) || ChooseShips.x.equals(KlingonFleet.c)) {
      switch (choose) {
        case 1:
          cs.aiChoiceF();
          break;
        case 2:
          cs.aiChoiceR();
          break;
      }
    }
    if (ChooseShips.x.equals(RomulanFleet.a) || ChooseShips.x.equals(RomulanFleet.b) || ChooseShips.x.equals(RomulanFleet.c)) {
      switch (choose) {
        case 1:
          cs.aiChoiceF();
          break;
        case 2:
          cs.aiChoiceR();
          break;
      }
    }
  }

  public void spawnGroundEnemy() {
    Random rand = new Random();

    int choice = random.nextInt(2) + 1;
    int chooseRole = rand.nextInt(3) + 1;

    if (ChooseShips.x.equals(FederationFleet.a) || ChooseShips.x.equals(FederationFleet.b) || ChooseShips.x.equals(FederationFleet.c)) {

      switch (choice) {

        case 1:

          switch (chooseRole) {

            case 1:

              System.out.println(KlingonGround.KLINGONTACTICIAN.getName());
              System.out.println(KlingonGround.KLINGONTACTICIAN.getHealth());
              System.out.println(KlingonGround.KLINGONTACTICIAN.getStamina());
              System.out.println(KlingonGround.KLINGONTACTICIAN.getAttack());
              System.out.println(KlingonGround.KLINGONTACTICIAN.getDefence());

              Enemy = KlingonGround.KLINGONTACTICIAN;

              break;

            case 2:

              System.out.println(KlingonGround.KLINGONENGINEER.getName());
              System.out.println(KlingonGround.KLINGONENGINEER.getHealth());
              System.out.println(KlingonGround.KLINGONENGINEER.getStamina());
              System.out.println(KlingonGround.KLINGONENGINEER.getAttack());
              System.out.println(KlingonGround.KLINGONENGINEER.getDefence());

              Enemy = KlingonGround.KLINGONENGINEER;

              break;

            case 3:

              System.out.println(KlingonGround.KLINGONSCIENTIST.getName());
              System.out.println(KlingonGround.KLINGONSCIENTIST.getHealth());
              System.out.println(KlingonGround.KLINGONSCIENTIST.getStamina());
              System.out.println(KlingonGround.KLINGONSCIENTIST.getAttack());
              System.out.println(KlingonGround.KLINGONSCIENTIST.getDefence());

              Enemy = KlingonGround.KLINGONSCIENTIST;

              break;

          }

          break;

        case 2:

          switch (chooseRole) {

            case 1:

              System.out.println(RomulanGround.ROMULANTACTICIAN.getName());
              System.out.println(RomulanGround.ROMULANTACTICIAN.getHealth());
              System.out.println(RomulanGround.ROMULANTACTICIAN.getStamina());
              System.out.println(RomulanGround.ROMULANTACTICIAN.getAttack());
              System.out.println(RomulanGround.ROMULANTACTICIAN.getDefence());

              Enemy = RomulanGround.ROMULANTACTICIAN;

              break;

            case 2:

              System.out.println(RomulanGround.ROMULANENGINEER.getName());
              System.out.println(RomulanGround.ROMULANENGINEER.getHealth());
              System.out.println(RomulanGround.ROMULANENGINEER.getStamina());
              System.out.println(RomulanGround.ROMULANENGINEER.getAttack());
              System.out.println(RomulanGround.ROMULANENGINEER.getDefence());

              Enemy = RomulanGround.ROMULANENGINEER;

              break;

            case 3:

              System.out.println(RomulanGround.ROMULANSCIENTIST.getName());
              System.out.println(RomulanGround.ROMULANSCIENTIST.getHealth());
              System.out.println(RomulanGround.ROMULANSCIENTIST.getStamina());
              System.out.println(RomulanGround.ROMULANSCIENTIST.getAttack());
              System.out.println(RomulanGround.ROMULANSCIENTIST.getDefence());

              Enemy = RomulanGround.ROMULANSCIENTIST;

              break;

          }

          break;

      }
    }

    if (ChooseShips.x.equals(KlingonFleet.a) || ChooseShips.x.equals(KlingonFleet.b) || ChooseShips.x.equals(KlingonFleet.c)) {

      switch (choice) {

        case 1:

          switch (chooseRole) {

            case 1:

              System.out.println(RomulanGround.ROMULANTACTICIAN.getName());
              System.out.println(RomulanGround.ROMULANTACTICIAN.getHealth());
              System.out.println(RomulanGround.ROMULANTACTICIAN.getStamina());
              System.out.println(RomulanGround.ROMULANTACTICIAN.getAttack());
              System.out.println(RomulanGround.ROMULANTACTICIAN.getDefence());

              Enemy = RomulanGround.ROMULANTACTICIAN;

              break;

            case 2:

              System.out.println(RomulanGround.ROMULANENGINEER.getName());
              System.out.println(RomulanGround.ROMULANENGINEER.getHealth());
              System.out.println(RomulanGround.ROMULANENGINEER.getStamina());
              System.out.println(RomulanGround.ROMULANENGINEER.getAttack());
              System.out.println(RomulanGround.ROMULANENGINEER.getDefence());

              Enemy = RomulanGround.ROMULANENGINEER;

              break;

            case 3:

              System.out.println(RomulanGround.ROMULANSCIENTIST.getName());
              System.out.println(RomulanGround.ROMULANSCIENTIST.getHealth());
              System.out.println(RomulanGround.ROMULANSCIENTIST.getStamina());
              System.out.println(RomulanGround.ROMULANSCIENTIST.getAttack());
              System.out.println(RomulanGround.ROMULANSCIENTIST.getDefence());

              Enemy = RomulanGround.ROMULANSCIENTIST;

              break;

          }

          break;

        case 2:

          switch (chooseRole) {

            case 1:

              System.out.println(FederationGround.FEDERATIONTACTICIAN.getName());
              System.out.println(FederationGround.FEDERATIONTACTICIAN.getHealth());
              System.out.println(FederationGround.FEDERATIONTACTICIAN.getStamina());
              System.out.println(FederationGround.FEDERATIONTACTICIAN.getAttack());
              System.out.println(FederationGround.FEDERATIONTACTICIAN.getDefence());

              Enemy = FederationGround.FEDERATIONTACTICIAN;

              break;

            case 2:

              System.out.println(FederationGround.FEDERATIONENGINEER.getName());
              System.out.println(FederationGround.FEDERATIONENGINEER.getHealth());
              System.out.println(FederationGround.FEDERATIONENGINEER.getStamina());
              System.out.println(FederationGround.FEDERATIONENGINEER.getAttack());
              System.out.println(FederationGround.FEDERATIONENGINEER.getDefence());

              Enemy = FederationGround.FEDERATIONENGINEER;

              break;

            case 3:

              System.out.println(FederationGround.FEDERATIONSCIENTIST.getName());
              System.out.println(FederationGround.FEDERATIONSCIENTIST.getHealth());
              System.out.println(FederationGround.FEDERATIONSCIENTIST.getStamina());
              System.out.println(FederationGround.FEDERATIONSCIENTIST.getAttack());
              System.out.println(FederationGround.FEDERATIONSCIENTIST.getDefence());

              Enemy = FederationGround.FEDERATIONSCIENTIST;

              break;

          }

          break;

      }
    }

    if (ChooseShips.x.equals(RomulanFleet.a) || ChooseShips.x.equals(RomulanFleet.b) || ChooseShips.x.equals(RomulanFleet.c)) {

      switch (choice) {

        case 1:

          switch (chooseRole) {

            case 1:

              System.out.println(FederationGround.FEDERATIONTACTICIAN.getName());
              System.out.println(FederationGround.FEDERATIONTACTICIAN.getHealth());
              System.out.println(FederationGround.FEDERATIONTACTICIAN.getStamina());
              System.out.println(FederationGround.FEDERATIONTACTICIAN.getAttack());
              System.out.println(FederationGround.FEDERATIONTACTICIAN.getDefence());

              Enemy = FederationGround.FEDERATIONTACTICIAN;

              break;

            case 2:

              System.out.println(FederationGround.FEDERATIONENGINEER.getName());
              System.out.println(FederationGround.FEDERATIONENGINEER.getHealth());
              System.out.println(FederationGround.FEDERATIONENGINEER.getStamina());
              System.out.println(FederationGround.FEDERATIONENGINEER.getAttack());
              System.out.println(FederationGround.FEDERATIONENGINEER.getDefence());

              Enemy = FederationGround.FEDERATIONENGINEER;

              break;

            case 3:

              System.out.println(FederationGround.FEDERATIONSCIENTIST.getName());
              System.out.println(FederationGround.FEDERATIONSCIENTIST.getHealth());
              System.out.println(FederationGround.FEDERATIONSCIENTIST.getStamina());
              System.out.println(FederationGround.FEDERATIONSCIENTIST.getAttack());
              System.out.println(FederationGround.FEDERATIONSCIENTIST.getDefence());

              Enemy = FederationGround.FEDERATIONSCIENTIST;

              break;

          }

          break;

        case 2:

          switch (chooseRole) {

            case 1:

              System.out.println(KlingonGround.KLINGONTACTICIAN.getName());
              System.out.println(KlingonGround.KLINGONTACTICIAN.getHealth());
              System.out.println(KlingonGround.KLINGONTACTICIAN.getStamina());
              System.out.println(KlingonGround.KLINGONTACTICIAN.getAttack());
              System.out.println(KlingonGround.KLINGONTACTICIAN.getDefence());

              Enemy = KlingonGround.KLINGONTACTICIAN;

              break;

            case 2:

              System.out.println(KlingonGround.KLINGONENGINEER.getName());
              System.out.println(KlingonGround.KLINGONENGINEER.getHealth());
              System.out.println(KlingonGround.KLINGONENGINEER.getStamina());
              System.out.println(KlingonGround.KLINGONENGINEER.getAttack());
              System.out.println(KlingonGround.KLINGONENGINEER.getDefence());

              Enemy = KlingonGround.KLINGONENGINEER;

              break;

            case 3:

              System.out.println(KlingonGround.KLINGONSCIENTIST.getName());
              System.out.println(KlingonGround.KLINGONSCIENTIST.getHealth());
              System.out.println(KlingonGround.KLINGONSCIENTIST.getStamina());
              System.out.println(KlingonGround.KLINGONSCIENTIST.getAttack());
              System.out.println(KlingonGround.KLINGONSCIENTIST.getDefence());

              Enemy = KlingonGround.KLINGONSCIENTIST;

              break;

          }

          break;

      }
    }
  }
 }
