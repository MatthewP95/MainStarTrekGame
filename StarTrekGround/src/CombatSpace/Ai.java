package CombatSpace;

import java.util.Random;

public class Ai {

  Object kling;
  Object fed;
  Object rom;
  public String kName;
  public String fName;
  public String rName;

  public void aiAttack1(Object Ship1, Object Ship2) {
    Random damage = new Random();
    int energy = 0;

    if (FederationFleet.a == Ship2 | FederationFleet.b == Ship2 | FederationFleet.c == Ship2) {
      if (FederationFleet.a == Ship2) { // Well-Rounded Damage
        energy = 15 + damage.nextInt(10);
      }
      if (FederationFleet.b == Ship2) { // Offensive Damage
        energy = 20 + damage.nextInt(10);
      }
      if (FederationFleet.c == Ship2) { // Defensive damage
        energy = 10 + damage.nextInt(10);
      }
      if (KlingonFleet.a == Ship1 | KlingonFleet.b == Ship1 | KlingonFleet.c == Ship1) {
        System.out.println("The USS " + ChooseShips.getfName() + " is firing phasers!\n");
        ((KlingonFleet) Ship1).setShieldStrength(((KlingonFleet) Ship1).getShieldStrength() - energy); // damage
                                                                                                       // shields
        System.out.println("The USS " + ChooseShips.getfName() + " dealt " + energy + " damage.");
        if (((KlingonFleet) Ship1).getShieldStrength() <= 0) {
          int x = Math.abs(((KlingonFleet) Ship1).getShieldStrength());
          ((KlingonFleet) Ship1).sethullStrength(((KlingonFleet) Ship1).gethullStrength() - x); // remaining
                                                                                                // damage
                                                                                                // to
                                                                                                // hull
          ((KlingonFleet) Ship1).setShieldStrength(0); // set shields to 0
        } else if (((KlingonFleet) Ship1).getShieldStrength() == 0) {
          ((KlingonFleet) Ship1).sethullStrength(((KlingonFleet) Ship1).gethullStrength() - energy); // damage
                                                                                                     // hull
        }
      } else if (RomulanFleet.a == Ship1 | RomulanFleet.b == Ship1 | RomulanFleet.c == Ship1) {
        System.out.println("The USS " + ChooseShips.getfName() + " is firing phasers!\n");
        ((RomulanFleet) Ship1).setShieldStrength(((RomulanFleet) Ship1).getShieldStrength() - energy); // damage
                                                                                                       // shields
        System.out.println("The USS " + ChooseShips.getfName() + " dealt " + energy + " damage.");
        if (((RomulanFleet) Ship1).getShieldStrength() <= 0) {
          int x = Math.abs(((RomulanFleet) Ship1).getShieldStrength());
          ((RomulanFleet) Ship1).sethullStrength(((RomulanFleet) Ship1).gethullStrength() - x); // remaining
                                                                                                // damage
                                                                                                // to
                                                                                                // hull
          ((RomulanFleet) Ship1).setShieldStrength(0); // set shields to 0
        } else if (((RomulanFleet) Ship1).getShieldStrength() == 0) {
          ((RomulanFleet) Ship1).sethullStrength(((RomulanFleet) Ship1).gethullStrength() - energy); // damage
                                                                                                     // hull
        }
      }
    } else if (KlingonFleet.a == Ship2 | KlingonFleet.b == Ship2 | KlingonFleet.c == Ship2) {
      if (KlingonFleet.a == Ship2) { // Well-Rounded Damage
        energy = 15 + damage.nextInt(10);
      }
      if (KlingonFleet.b == Ship2) { // Offensive Damage
        energy = 20 + damage.nextInt(10);
      }
      if (KlingonFleet.c == Ship2) { // Defensive Damage
        energy = 10 + damage.nextInt(10);
      }
      if (FederationFleet.a == Ship1 | FederationFleet.b == Ship1 | FederationFleet.c == Ship1) {
        System.out.println("The KDF " + ChooseShips.getkName() + " is firing disruptors!\n");
        ((FederationFleet) Ship1).setShieldStrength(((FederationFleet) Ship1).getShieldStrength() - energy); // damage
                                                                                                             // shields
        System.out.println("The KDF " + ChooseShips.getkName() + " dealt " + energy + " damage.");
        if (((FederationFleet) Ship1).getShieldStrength() <= 0) {
          int x = Math.abs(((FederationFleet) Ship1).getShieldStrength());
          ((FederationFleet) Ship1).sethullStrength(((FederationFleet) Ship1).gethullStrength() - x); // remaining
                                                                                                      // damage
                                                                                                      // to
                                                                                                      // hull
          ((FederationFleet) Ship1).setShieldStrength(0); // set shields to 0
        } else if (((FederationFleet) Ship1).getShieldStrength() == 0) {
          ((FederationFleet) Ship1).sethullStrength(((FederationFleet) Ship1).gethullStrength() - energy); // damage
                                                                                                           // hull
        }
      } else if (RomulanFleet.a == Ship1 | RomulanFleet.b == Ship1 | RomulanFleet.c == Ship1) {
        System.out.println("The KDF " + ChooseShips.getkName() + " is firing disruptors!\n");
        ((RomulanFleet) Ship1).setShieldStrength(((RomulanFleet) Ship1).getShieldStrength() - energy); // damage
                                                                                                       // shields
        System.out.println("The KDF " + ChooseShips.getkName() + " dealt " + energy + " damage.");
        if (((RomulanFleet) Ship1).getShieldStrength() <= 0) {
          int x = Math.abs(((RomulanFleet) Ship1).getShieldStrength());
          ((RomulanFleet) Ship1).sethullStrength(((RomulanFleet) Ship1).gethullStrength() - x); // remaining
                                                                                                // damage
                                                                                                // to
                                                                                                // hull
          ((RomulanFleet) Ship1).setShieldStrength(0); // set shields to 0
        } else if (((RomulanFleet) Ship1).getShieldStrength() == 0) {
          ((RomulanFleet) Ship1).sethullStrength(((RomulanFleet) Ship1).gethullStrength() - energy); // damage
                                                                                                     // hull
        }
      }
    } else if (RomulanFleet.a == Ship2 | RomulanFleet.b == Ship2 | RomulanFleet.c == Ship2) {
      if (RomulanFleet.a == Ship2) { // Well-Rounded Damage
        energy = 15 + damage.nextInt(10);
      }
      if (RomulanFleet.b == Ship2) { // Offensive Damage
        energy = 20 + damage.nextInt(10);
      }
      if (RomulanFleet.c == Ship2) { // Defensive damage
        energy = 10 + damage.nextInt(10);
      }
      if (KlingonFleet.a == Ship1 | KlingonFleet.b == Ship1 | KlingonFleet.c == Ship1) {
        System.out.println("The RSE " + ChooseShips.getrName() + " is firing phasers!\n");
        ((KlingonFleet) Ship1).setShieldStrength(((KlingonFleet) Ship1).getShieldStrength() - energy); // damage
                                                                                                       // shields
        System.out.println("The RSE " + ChooseShips.getrName() + " dealt " + energy + " damage.");
        if (((KlingonFleet) Ship1).getShieldStrength() <= 0) {
          int x = Math.abs(((KlingonFleet) Ship1).getShieldStrength());
          ((KlingonFleet) Ship1).sethullStrength(((KlingonFleet) Ship1).gethullStrength() - x); // remaining
                                                                                                // damage
                                                                                                // to
                                                                                                // hull
          ((KlingonFleet) Ship1).setShieldStrength(0); // set shields to 0
        } else if (((KlingonFleet) Ship1).getShieldStrength() == 0) {
          ((KlingonFleet) Ship1).sethullStrength(((KlingonFleet) Ship1).gethullStrength() - energy); // damage
                                                                                                     // hull
        }
      } else if (FederationFleet.a == Ship1 | FederationFleet.b == Ship1 | FederationFleet.c == Ship1) {
        System.out.println("The RSE " + ChooseShips.getrName() + " is firing phasers!\n");
        ((FederationFleet) Ship1).setShieldStrength(((FederationFleet) Ship1).getShieldStrength() - energy); // damage
        // shields
        System.out.println("The RSE " + ChooseShips.getrName() + " dealt " + energy + " damage.");
        if (((FederationFleet) Ship1).getShieldStrength() <= 0) {
          int x = Math.abs(((FederationFleet) Ship1).getShieldStrength());
          ((FederationFleet) Ship1).sethullStrength(((FederationFleet) Ship1).gethullStrength() - x); // remaining
          // damage
          // to
          // hull
          ((FederationFleet) Ship1).setShieldStrength(0); // set shields to 0
        } else if (((FederationFleet) Ship1).getShieldStrength() == 0) {
          ((FederationFleet) Ship1).sethullStrength(((FederationFleet) Ship1).gethullStrength() - energy); // damage
          // hull
        }
      }
    }
  }

  public void aiAttack2(Object Ship1, Object Ship2) {
    Random damage = new Random();
    int torpedo = 0;
    // federation Ai
    if (FederationFleet.a == Ship2 | FederationFleet.b == Ship2 | FederationFleet.c == Ship2) {
      if (FederationFleet.a == Ship2) { // Well Rounded Damage
        torpedo = 30 + damage.nextInt(10);
      }
      if (FederationFleet.b == Ship2) { // Offensive damage
        torpedo = 40 + damage.nextInt(10);
      }
      if (FederationFleet.c == Ship2) { // Defensive Damage
        torpedo = 20 + damage.nextInt(20);
      }
      if (KlingonFleet.a == Ship1 | KlingonFleet.b == Ship1 | KlingonFleet.c == Ship1) {
        if (((FederationFleet) Ship2).gettNum() >= 1) {
          System.out.println("The USS " + ChooseShips.getfName() + " fired a spread of photon torpedos!\n");
          ((KlingonFleet) Ship1).setShieldStrength(((KlingonFleet) Ship1).getShieldStrength() - torpedo); // damage
                                                                                                          // shields
          System.out.println("The USS " + ChooseShips.getfName() + " dealt " + torpedo + " damage.");
          if (((KlingonFleet) Ship1).getShieldStrength() <= 0) {
            int x = Math.abs(((KlingonFleet) Ship1).getShieldStrength());
            ((KlingonFleet) Ship1).sethullStrength(((KlingonFleet) Ship1).gethullStrength() - x); // remaining
                                                                                                  // damage
                                                                                                  // to
                                                                                                  // hull
            ((KlingonFleet) Ship1).setShieldStrength(0); // set shields to 0
          } else if (((KlingonFleet) Ship1).getShieldStrength() == 0) {
            ((KlingonFleet) Ship1).sethullStrength(((KlingonFleet) Ship1).gethullStrength() - torpedo); // damage
                                                                                                        // hull
          }
          ((FederationFleet) Ship2).settNum(((FederationFleet) Ship2).gettNum() - 1);
        } else if (((FederationFleet) Ship2).gettNum() <= 0) {
          ((FederationFleet) Ship2).settNum(0);
        }
      } else if (RomulanFleet.a == Ship1 | RomulanFleet.b == Ship1 | RomulanFleet.c == Ship1) {
        if (((FederationFleet) Ship2).gettNum() >= 1) {
          System.out.println("The USS " + ChooseShips.getfName() + " fired a spread of photon torpedos!\n");
          ((RomulanFleet) Ship1).setShieldStrength(((RomulanFleet) Ship1).getShieldStrength() - torpedo); // damage
                                                                                                          // shields
          System.out.println("The USS " + ChooseShips.getfName() + " dealt " + torpedo + " damage.");
          if (((RomulanFleet) Ship1).getShieldStrength() <= 0) {
            int x = Math.abs(((RomulanFleet) Ship1).getShieldStrength());
            ((RomulanFleet) Ship1).sethullStrength(((RomulanFleet) Ship1).gethullStrength() - x); // remaining
                                                                                                  // damage
                                                                                                  // to
                                                                                                  // hull
            ((RomulanFleet) Ship1).setShieldStrength(0); // set shields to 0
          } else if (((RomulanFleet) Ship1).getShieldStrength() == 0) {
            ((RomulanFleet) Ship1).sethullStrength(((RomulanFleet) Ship1).gethullStrength() - torpedo); // damage
                                                                                                        // hull
          }
          ((FederationFleet) Ship2).settNum(((FederationFleet) Ship2).gettNum() - 1);
        } else if (((FederationFleet) Ship2).gettNum() <= 0) {
          ((FederationFleet) Ship2).settNum(0);
        }
      }
      // Klingon AI
    } else if (KlingonFleet.a == Ship2 | KlingonFleet.b == Ship2 | KlingonFleet.c == Ship2) {
      if (KlingonFleet.a == Ship2) { // Well-Rounded Damage
        torpedo = 30 + damage.nextInt(10);
      }
      if (KlingonFleet.b == Ship2) { // Offensive Damage
        torpedo = 40 + damage.nextInt(10);
      }
      if (KlingonFleet.c == Ship2) { // Defensives Damage
        torpedo = 20 + damage.nextInt(20);
      }
      if (FederationFleet.a == Ship1 | FederationFleet.b == Ship1 | FederationFleet.c == Ship1) {
        if (((KlingonFleet) Ship2).gettNum() >= 1) {
          System.out.println("The KDF " + ChooseShips.getkName() + " fired a spread of photon torpedos!\n");
          ((FederationFleet) Ship1).setShieldStrength(((FederationFleet) Ship1).getShieldStrength() - torpedo); // damage
                                                                                                                // shields
          System.out.println("The KDF " + ChooseShips.getkName() + " dealt " + torpedo + " damage.");
          if (((FederationFleet) Ship1).getShieldStrength() <= 0) {
            int x = Math.abs(((FederationFleet) Ship1).getShieldStrength());
            ((FederationFleet) Ship1).sethullStrength(((FederationFleet) Ship1).gethullStrength() - x); // remaining
                                                                                                        // damage
                                                                                                        // to
                                                                                                        // hull
            ((FederationFleet) Ship1).setShieldStrength(0); // set shields to 0
          } else if (((FederationFleet) Ship1).getShieldStrength() == 0) {
            ((FederationFleet) Ship1).sethullStrength(((FederationFleet) Ship1).gethullStrength() - torpedo); // damage
                                                                                                              // hull
          }
          ((KlingonFleet) Ship2).settNum(((KlingonFleet) Ship2).gettNum() - 1);
        } else if (((KlingonFleet) Ship2).gettNum() <= 0) {
          ((KlingonFleet) Ship2).settNum(0);
        }
      } else if (RomulanFleet.a == Ship1 | RomulanFleet.b == Ship1 | RomulanFleet.c == Ship1) {
        if (((KlingonFleet) Ship2).gettNum() >= 1) {
          System.out.println("The KDF " + ChooseShips.getkName() + " fired a spread of photon torpedos!\n");
          ((RomulanFleet) Ship1).setShieldStrength(((RomulanFleet) Ship1).getShieldStrength() - torpedo); // damage
                                                                                                          // shields
          System.out.println("The KDF " + ChooseShips.getkName() + " dealt " + torpedo + " damage.");
          if (((RomulanFleet) Ship1).getShieldStrength() <= 0) {
            int x = Math.abs(((RomulanFleet) Ship1).getShieldStrength());
            ((RomulanFleet) Ship1).sethullStrength(((RomulanFleet) Ship1).gethullStrength() - x); // remaining
                                                                                                  // damage
                                                                                                  // to
                                                                                                  // hull
            ((RomulanFleet) Ship1).setShieldStrength(0); // set shields to 0
          } else if (((RomulanFleet) Ship1).getShieldStrength() == 0) {
            ((RomulanFleet) Ship1).sethullStrength(((RomulanFleet) Ship1).gethullStrength() - torpedo); // damage
                                                                                                        // hull
          }
          ((KlingonFleet) Ship2).settNum(((KlingonFleet) Ship2).gettNum() - 1);
        } else if (((KlingonFleet) Ship2).gettNum() <= 0) {
          ((KlingonFleet) Ship2).settNum(0);
        }
      }
      // Romulan AI
    } else if (RomulanFleet.a == Ship2 | RomulanFleet.b == Ship2 | RomulanFleet.c == Ship2) {
      if (RomulanFleet.a == Ship2) { // Well-Rounded Damage
        torpedo = 30 + damage.nextInt(10);
      }
      if (RomulanFleet.b == Ship2) { // Offensive Damage
        torpedo = 40 + damage.nextInt(10);
      }
      if (RomulanFleet.c == Ship2) { // Defensives Damage
        torpedo = 20 + damage.nextInt(20);
      }
      if (FederationFleet.a == Ship1 | FederationFleet.b == Ship1 | FederationFleet.c == Ship1) {
        if (((RomulanFleet) Ship2).gettNum() >= 1) {
          System.out.println("The RSE " + ChooseShips.getrName() + " fired a spread of photon torpedos!\n");
          ((FederationFleet) Ship1).setShieldStrength(((FederationFleet) Ship1).getShieldStrength() - torpedo); // damage
                                                                                                                // shields
          System.out.println("The RSE " + ChooseShips.getrName() + " dealt " + torpedo + " damage.");
          if (((FederationFleet) Ship1).getShieldStrength() <= 0) {
            int x = Math.abs(((FederationFleet) Ship1).getShieldStrength());
            ((FederationFleet) Ship1).sethullStrength(((FederationFleet) Ship1).gethullStrength() - x); // remaining
                                                                                                        // damage
                                                                                                        // to
                                                                                                        // hull
            ((FederationFleet) Ship1).setShieldStrength(0); // set shields to 0
          } else if (((FederationFleet) Ship1).getShieldStrength() == 0) {
            ((FederationFleet) Ship1).sethullStrength(((FederationFleet) Ship1).gethullStrength() - torpedo); // damage
                                                                                                              // hull
          }
          ((RomulanFleet) Ship2).settNum(((RomulanFleet) Ship2).gettNum() - 1);
        } else if (((RomulanFleet) Ship2).gettNum() <= 0) {
          ((RomulanFleet) Ship2).settNum(0);
        }
      } else if (KlingonFleet.a == Ship1 | KlingonFleet.b == Ship1 | KlingonFleet.c == Ship1) {
        if (((RomulanFleet) Ship2).gettNum() >= 1) {
          System.out.println("The RSE " + ChooseShips.getrName() + " fired a spread of photon torpedos!\n");
          ((KlingonFleet) Ship1).setShieldStrength(((KlingonFleet) Ship1).getShieldStrength() - torpedo); // damage
                                                                                                          // shields
          System.out.println("The RSE " + ChooseShips.getrName() + " dealt " + torpedo + " damage.");
          if (((KlingonFleet) Ship1).getShieldStrength() <= 0) {
            int x = Math.abs(((KlingonFleet) Ship1).getShieldStrength());
            ((KlingonFleet) Ship1).sethullStrength(((KlingonFleet) Ship1).gethullStrength() - x); // remaining
                                                                                                  // damage
                                                                                                  // to
                                                                                                  // hull
            ((KlingonFleet) Ship1).setShieldStrength(0); // set shields to 0
          } else if (((KlingonFleet) Ship1).getShieldStrength() == 0) {
            ((KlingonFleet) Ship1).sethullStrength(((KlingonFleet) Ship1).gethullStrength() - torpedo); // damage
                                                                                                        // hull
          }
          ((RomulanFleet) Ship2).settNum(((RomulanFleet) Ship2).gettNum() - 1);
        } else if (((RomulanFleet) Ship2).gettNum() <= 0) {
          ((RomulanFleet) Ship2).settNum(0);
        }
      }
    }
  }

  public void aiDefence1(Object Ship) {
    Random repair = new Random();
    int shield = 30 + repair.nextInt(10);

    if (FederationFleet.a == Ship | FederationFleet.b == Ship | FederationFleet.c == Ship) {
      if (((FederationFleet) Ship).getrNum() >= 1) {
        System.out.println("The USS " + ChooseShips.getfName() + " repaired shields by " + shield + "%");
        ((FederationFleet) Ship).setShieldStrength(((FederationFleet) Ship).getShieldStrength() + shield);
        ((FederationFleet) Ship).setrNum(((FederationFleet) Ship).getrNum() - 1);

        if (((FederationFleet) Ship).getShieldStrength() > 100) {
          ((FederationFleet) Ship).setShieldStrength(100);
        }

        System.out.println("Shields are at " + ((FederationFleet) Ship).getShieldStrength() + "%");
      } else if (((FederationFleet) Ship).getrNum() <= 0) {
        ((FederationFleet) Ship).setrNum(0);
      }
    } else if (KlingonFleet.a == Ship | KlingonFleet.b == Ship | KlingonFleet.c == Ship) {
      if (((KlingonFleet) Ship).getrNum() >= 1) {
        System.out.println("The KDF " + ChooseShips.getkName() + " repaired shields by " + shield + "%");
        ((KlingonFleet) Ship).setShieldStrength(((KlingonFleet) Ship).getShieldStrength() + shield);
        ((KlingonFleet) Ship).setrNum(((KlingonFleet) Ship).getrNum() - 1);

        if (((KlingonFleet) Ship).getShieldStrength() > 100) {
          ((KlingonFleet) Ship).setShieldStrength(100);
        }
        System.out.println("Shields are at " + ((KlingonFleet) Ship).getShieldStrength() + "%");
      } else if (((KlingonFleet) Ship).gethNum() <= 0) {
        ((KlingonFleet) Ship).setrNum(0);
      }
    } else if (RomulanFleet.a == Ship | RomulanFleet.b == Ship | RomulanFleet.c == Ship) {
      if (((RomulanFleet) Ship).getrNum() >= 1) {
        System.out.println("The RSE " + ChooseShips.getrName() + " repaired shields by " + shield + "%");
        ((RomulanFleet) Ship).setShieldStrength(((RomulanFleet) Ship).getShieldStrength() + shield);
        ((RomulanFleet) Ship).setrNum(((RomulanFleet) Ship).getrNum() - 1);

        if (((RomulanFleet) Ship).getShieldStrength() > 100) {
          ((RomulanFleet) Ship).setShieldStrength(100);
        }
        System.out.println("Shields are at " + ((RomulanFleet) Ship).getShieldStrength() + "%");
      } else if (((RomulanFleet) Ship).gethNum() <= 0) {
        ((RomulanFleet) Ship).setrNum(0);
      }
    }
  }

  public void aiDefence2(Object Ship) {
    Random repair = new Random();
    int hull = 0;
    int y;
    int x;

    if (FederationFleet.a == Ship | FederationFleet.b == Ship | FederationFleet.c == Ship) {

      int h = ((FederationFleet) Ship).gethullStrength();
      if (FederationFleet.a == Ship) { // Well-Rounded repair
        hull = 30 + repair.nextInt(10);
      }
      if (FederationFleet.b == Ship) { // Offensive Repair
        hull = 30 + repair.nextInt(5);
      }
      if (FederationFleet.c == Ship) { // Defensive Repair
        hull = 35 + repair.nextInt(15);
      }
      if (((FederationFleet) Ship).gethNum() >= 1) {
        if (((FederationFleet) Ship).gethullStrength() < 100) {
          System.out.println("The USS " + ChooseShips.getfName() + " repaired hull by " + hull + "%");

          ((FederationFleet) Ship).sethullStrength(((FederationFleet) Ship).gethullStrength() + hull);
          ((FederationFleet) Ship).sethNum(((FederationFleet) Ship).gethNum() - 1);

          if (((FederationFleet) Ship).gethullStrength() >= 100) {
            ((FederationFleet) Ship).sethullStrength(100);

          }

          System.out.println("Hull is at " + ((FederationFleet) Ship).gethullStrength() + "%\n");

          if ((h + hull) >= 100) {
            y = (h + hull) - ((FederationFleet) Ship).gethullStrength();
            x = y / 2;
            ((FederationFleet) Ship).setShieldStrength(((FederationFleet) Ship).getShieldStrength() + x);
            System.out.println("Excess repairs went to Shields");
            System.out.println("Shields repaired by: " + x + "%\n");
            // dissipate leftover to shields
          }
        }
      } else if (((FederationFleet) Ship).gethNum() <= 0) {
        ((FederationFleet) Ship).sethNum(0);
      }

    } else if (KlingonFleet.a == Ship | KlingonFleet.b == Ship | KlingonFleet.c == Ship) {

      int h = ((KlingonFleet) Ship).gethullStrength();

      if (KlingonFleet.a == Ship) { // Well-Rounded Repair
        hull = 30 + repair.nextInt(10);
      }
      if (KlingonFleet.b == Ship) { // Offensive Repair
        hull = 30 + repair.nextInt(5);
      }
      if (KlingonFleet.c == Ship) { // Defensive Repair
        hull = 35 + repair.nextInt(15);
      }
      if (((KlingonFleet) Ship).gethNum() >= 1) {
        if (((KlingonFleet) Ship).gethullStrength() < 100) {
          System.out.println("The KDF " + ChooseShips.getkName() + " repaired hull by " + hull + "%");

          ((KlingonFleet) Ship).sethullStrength(((KlingonFleet) Ship).gethullStrength() + hull);
          ((KlingonFleet) Ship).sethNum(((KlingonFleet) Ship).gethNum() - 1);

          if (((KlingonFleet) Ship).gethullStrength() >= 100) {
            ((KlingonFleet) Ship).sethullStrength(100);

          }
          System.out.println("Hull is at " + ((KlingonFleet) Ship).gethullStrength() + "%\n");

          if ((h + hull) >= 100) {
            y = (h + hull) - ((KlingonFleet) Ship).gethullStrength();
            x = y / 2;
            ((KlingonFleet) Ship).setShieldStrength(((KlingonFleet) Ship).getShieldStrength() + x);
            System.out.println("Excess repairs went to Shields");
            System.out.println("Shields repaired by: " + x + "%\n");
            // dissipate leftover to shields
          }
        }
      } else if (((KlingonFleet) Ship).gethNum() <= 0) {
        ((KlingonFleet) Ship).sethNum(0);
      }
    } else if (RomulanFleet.a == Ship | RomulanFleet.b == Ship | RomulanFleet.c == Ship) {

      int h = ((RomulanFleet) Ship).gethullStrength();

      if (RomulanFleet.a == Ship) { // Well-Rounded Repair
        hull = 30 + repair.nextInt(10);
      }
      if (RomulanFleet.b == Ship) { // Offensive Repair
        hull = 30 + repair.nextInt(5);
      }
      if (RomulanFleet.c == Ship) { // Defensive Repair
        hull = 35 + repair.nextInt(15);
      }
      if (((RomulanFleet) Ship).gethNum() >= 1) {
        if (((RomulanFleet) Ship).gethullStrength() < 100) {
          System.out.println("The RSE " + ChooseShips.getrName() + " repaired hull by " + hull + "%");

          ((RomulanFleet) Ship).sethullStrength(((RomulanFleet) Ship).gethullStrength() + hull);
          ((RomulanFleet) Ship).sethNum(((RomulanFleet) Ship).gethNum() - 1);

          if (((RomulanFleet) Ship).gethullStrength() >= 100) {
            ((RomulanFleet) Ship).sethullStrength(100);

          }
          System.out.println("Hull is at " + ((RomulanFleet) Ship).gethullStrength() + "%\n");

          if ((h + hull) >= 100) {
            y = (h + hull) - ((RomulanFleet) Ship).gethullStrength();
            x = y / 2;
            ((RomulanFleet) Ship).setShieldStrength(((RomulanFleet) Ship).getShieldStrength() + x);
            System.out.println("Excess repairs went to Shields");
            System.out.println("Shields repaired by: " + x + "%\n");
            // dissipate leftover to shields
          }
        }
      } else if (((RomulanFleet) Ship).gethNum() <= 0) {
        ((RomulanFleet) Ship).sethNum(0);
      }
    }

  }

  public void aiChooseFed() {

    Random x = new Random();
    int choice = 1 + x.nextInt(3);

    switch (choice) {
      case 1:
        fed = FederationFleet.b;
        fName = "Excelsior";
        System.out.println();
        System.out.println("It is the USS " + fName);
        ChooseShips.y = fed;
        break;
      case 2:
        fed = FederationFleet.a;
        fName = "Mississippi";
        System.out.println();
        System.out.println("It is the USS  " + fName);
        ChooseShips.y = fed;
        break;
      case 3:
        fed = FederationFleet.c;
        fName = "Phoenix";
        System.out.println();
        System.out.println("It is the USS  " + fName);
        ChooseShips.y = fed;
        break;
    }
  }

  public void aiChooseKling() {

    Random x = new Random();
    int choice = 1 + x.nextInt(3);

    switch (choice) {
      case 1:
        kling = KlingonFleet.b;
        kName = "Ke'noq";
        System.out.println();   
        System.out.println("They are coming in for an attack. It is the KDF " + kName);
        ChooseShips.y = kling;
        break;
      // stores selection in y
      case 2:
        kling = KlingonFleet.a;
        kName = "Ye'nak";
        System.out.println();
        System.out.println("They are coming in for an attack. It is the KDF " + kName);
        ChooseShips.y = kling;
        break;
      // stores selection in y
      case 3:
        kling = KlingonFleet.c;
        kName = "Qolen";
        System.out.println();
        System.out.println("They are coming in for an attack. It is the KDF " + kName);
        ChooseShips.y = kling;
        break;
      // stores selection in y
    }
  }

  public void aiChooseRom() {

    Random x = new Random();
    int choice = 1 + x.nextInt(3);

    switch (choice) {
      case 1:
        rom = RomulanFleet.b;
        rName = "Deresus";
        System.out.println();
        
        System.out.println("They are decloaking, it's the RSE " + rName);
        ChooseShips.y = rom;
        break;
      // stores selection in z
      case 2:
        rom = RomulanFleet.a;
        rName = "Impavidus";
        System.out.println();
        System.out.println("They are decloaking, it's the RSE " + rName);
        ChooseShips.y = rom;
        break;
      // stores choice in y
      case 3:
        rom = RomulanFleet.c;
        rName = "vas'Deletham";
        System.out.println();
        System.out.println("They are decloaking, it's the RSE " + rName);
        ChooseShips.y = rom;
        break;
    }

  }

  public void aiChoiceKling(Object Ship1, Object Ship2) {
    Random x = new Random();
    int choice = 1 + x.nextInt(4);

    switch (choice) {
      case 1:
        aiAttack1(Ship1, Ship2);
        break;
      case 2:
        if (((KlingonFleet) Ship2).gettNum() > 0) {
          aiAttack2(Ship1, Ship2);
        } else if (((KlingonFleet) Ship2).gettNum() == 0) {
          aiChoiceKling(Ship1, Ship2);
        }
        break;
      case 3:
        if (((KlingonFleet) Ship2).getShieldStrength() == 0) {
          if (((KlingonFleet) Ship2).getrNum() > 0) {
            aiDefence1(Ship2);
          } else
            aiChoiceKling(Ship1, Ship2);
        } else if (((KlingonFleet) Ship2).getShieldStrength() > 0) {
          aiChoiceKling(Ship1, Ship2);
        }
        break;
      case 4:

        if (((KlingonFleet) Ship2).gethNum() < 0 && ((KlingonFleet) Ship2).gethullStrength() <= 20) {

          aiDefence2(Ship2);
        } else if (((KlingonFleet) Ship2).gethullStrength() < 75) {
          if (((KlingonFleet) Ship2).gethNum() > 0) {
            aiDefence2(Ship2);
          } else
            aiChoiceKling(Ship1, Ship2);
        } else if (((KlingonFleet) Ship2).gethullStrength() > 75) {
          aiChoiceKling(Ship1, Ship2);
        }
        break;
    }
  }

  public void aiChoiceFed(Object Ship1, Object Ship2) {
    Random x = new Random();
    int choice = 1 + x.nextInt(4);

    switch (choice) {
      case 1:
        aiAttack1(Ship1, Ship2);
        break;
      case 2:
        if (((FederationFleet) Ship2).gettNum() > 0) {
          aiAttack2(Ship1, Ship2);
        } else if (((FederationFleet) Ship2).gettNum() == 0) {
          aiChoiceFed(Ship1, Ship2);
        }
        break;
      case 3:
        if (((FederationFleet) Ship2).getShieldStrength() == 0) {
          if (((FederationFleet) Ship2).getrNum() > 0) {
            aiDefence1(Ship2);
          } else
            aiChoiceFed(Ship1, Ship2);
        } else if (((FederationFleet) Ship2).getShieldStrength() > 0) {
          aiChoiceFed(Ship1, Ship2);
        }
        break;
      case 4:
        if (((FederationFleet) Ship2).gethNum() < 0 && ((FederationFleet) Ship2).gethullStrength() <= 20) {

          aiDefence2(Ship2);
        }
        if (((FederationFleet) Ship2).gethullStrength() < 50) {
          if (((FederationFleet) Ship2).gethNum() > 0) {
            aiDefence2(Ship2);
          } else
            aiChoiceFed(Ship1, Ship2);
        } else if (((FederationFleet) Ship2).gethullStrength() > 50) {
          aiChoiceFed(Ship1, Ship2);
        }
        break;
    }
  }

  public void aiChoiceRom(Object Ship1, Object Ship2) {
    Random x = new Random();
    int choice = 1 + x.nextInt(4);

    switch (choice) {
      case 1:
        aiAttack1(Ship1, Ship2);
        break;
      case 2:
        if (((RomulanFleet) Ship2).gettNum() > 0) {
          aiAttack2(Ship1, Ship2);
        } else if (((RomulanFleet) Ship2).gettNum() == 0) {
          aiChoiceRom(Ship1, Ship2);
        }
        break;
      case 3:
        if (((RomulanFleet) Ship2).getShieldStrength() == 0) {
          if (((RomulanFleet) Ship2).getrNum() > 0) {
            aiDefence1(Ship2);
          } else
            aiChoiceRom(Ship1, Ship2);
        } else if (((RomulanFleet) Ship2).getShieldStrength() > 0) {
          aiChoiceRom(Ship1, Ship2);
        }
        break;
      case 4:
        if (((RomulanFleet) Ship2).gethNum() < 0 && ((RomulanFleet) Ship2).gethullStrength() <= 20) {

          aiDefence2(Ship2);
        }
        if (((RomulanFleet) Ship2).gethullStrength() < 50) {
          if (((RomulanFleet) Ship2).gethNum() > 0) {
            aiDefence2(Ship2);
          } else
            aiChoiceRom(Ship1, Ship2);
        } else if (((RomulanFleet) Ship2).gethullStrength() > 50) {
          aiChoiceRom(Ship1, Ship2);
        }
        break;
    }
  }
}
