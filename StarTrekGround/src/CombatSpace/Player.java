package CombatSpace;

import java.util.Random;

public class Player implements Commands {

  public void attack1(Object Ship1, Object Ship2) {
    Random damage = new Random();
    int energy = 0;

    if (OnePlayerTurn.fed) {
      if (FederationFleet.a == Ship1) { // Well-Rounded Damage
        energy = 15 + damage.nextInt(10);
      }
      if (FederationFleet.b == Ship1) { // Offensive Damage
        energy = 20 + damage.nextInt(10);
      }
      if (FederationFleet.c == Ship1) { // Defensive damage
        energy = 10 + damage.nextInt(10);
      }

      if (KlingonFleet.a == Ship2 | KlingonFleet.b == Ship2 | KlingonFleet.c == Ship2) {
        System.out.println("The USS " + ChooseShips.getfName() + " is firing phasers!\n");
        ((KlingonFleet) Ship2).setShieldStrength(((KlingonFleet) Ship2).getShieldStrength() - energy); // damage
                                                                                                       // shields
        System.out.println("The USS " + ChooseShips.getfName() + " dealt " + energy + " damage.");
        if (((KlingonFleet) Ship2).getShieldStrength() <= 0) {
          int x = Math.abs(((KlingonFleet) Ship2).getShieldStrength());
          ((KlingonFleet) Ship2).sethullStrength(((KlingonFleet) Ship2).gethullStrength() - x); // remaining
                                                                                                // damage
                                                                                                // to
                                                                                                // hull
          ((KlingonFleet) Ship2).setShieldStrength(0); // set shields to 0
        } else if (((KlingonFleet) Ship2).getShieldStrength() == 0) {
          ((KlingonFleet) Ship2).sethullStrength(((KlingonFleet) Ship2).gethullStrength() - energy); // damage
        }                                                                                            // hull
      } else if (RomulanFleet.a == Ship2 | RomulanFleet.b == Ship2 | RomulanFleet.c == Ship2) {
        System.out.println("The USS " + ChooseShips.getfName() + " is firing phasers!\n");
        ((RomulanFleet) Ship2).setShieldStrength(((RomulanFleet) Ship2).getShieldStrength() - energy); // damage
                                                                                                       // shields
        System.out.println("The USS " + ChooseShips.getfName() + " dealt " + energy + " damage.");
        if (((RomulanFleet) Ship2).getShieldStrength() <= 0) {
          int x = Math.abs(((RomulanFleet) Ship2).getShieldStrength());
          ((RomulanFleet) Ship2).sethullStrength(((RomulanFleet) Ship2).gethullStrength() - x); // remaining
                                                                                                // damage
                                                                                                // to
                                                                                                // hull
          ((RomulanFleet) Ship2).setShieldStrength(0); // set shields to 0
        } else if (((RomulanFleet) Ship2).getShieldStrength() == 0) {
          ((RomulanFleet) Ship2).sethullStrength(((RomulanFleet) Ship2).gethullStrength() - energy); // damage
        }                                                                                          // hull
        }
      } else if (OnePlayerTurn.kling) {
        if (KlingonFleet.a == Ship1) { // Well-Rounded Damage
          energy = 15 + damage.nextInt(10);
        }
        if (KlingonFleet.b == Ship1) { // Offensive Damage
          energy = 20 + damage.nextInt(10);
        }
        if (KlingonFleet.c == Ship1) { // Defensive Damage
          energy = 10 + damage.nextInt(10);
        }

        if (FederationFleet.a == Ship2 | FederationFleet.b == Ship2 | FederationFleet.c == Ship2) {
          System.out.println("The KDF " + ChooseShips.getkName() + " is firing disruptors!\n");
          ((FederationFleet) Ship2).setShieldStrength(((FederationFleet) Ship2).getShieldStrength() - energy); // damage
                                                                                                               // shields
          System.out.println("The KDF " + ChooseShips.getkName() + " dealt " + energy + " damage.");
          if (((FederationFleet) Ship2).getShieldStrength() <= 0) {
            int x = Math.abs(((FederationFleet) Ship2).getShieldStrength());
            ((FederationFleet) Ship2).sethullStrength(((FederationFleet) Ship2).gethullStrength() - x); // remaining
                                                                                                        // damage
                                                                                                        // to
                                                                                                        // hull
            ((FederationFleet) Ship2).setShieldStrength(0); // set shields to 0
          } else if (((FederationFleet) Ship2).getShieldStrength() == 0) {
            ((FederationFleet) Ship2).sethullStrength(((FederationFleet) Ship2).gethullStrength() - energy); // damage
                                                                                                             // hull
          }
        } else if (RomulanFleet.a == Ship2 | RomulanFleet.b == Ship2 | RomulanFleet.c == Ship2) {
          System.out.println("The KDF " + ChooseShips.getkName() + " is firing disruptors!\n");
          ((RomulanFleet) Ship2).setShieldStrength(((RomulanFleet) Ship2).getShieldStrength() - energy); // damage
                                                                                                         // shields
          System.out.println("The KDF " + ChooseShips.getkName() + " dealt " + energy + " damage.");
          if (((RomulanFleet) Ship2).getShieldStrength() <= 0) {
            int x = Math.abs(((RomulanFleet) Ship2).getShieldStrength());
            ((RomulanFleet) Ship2).sethullStrength(((RomulanFleet) Ship2).gethullStrength() - x); // remaining
                                                                                                  // damage
                                                                                                  // to
                                                                                                  // hull
            ((RomulanFleet) Ship2).setShieldStrength(0); // set shields to 0
          } else if (((RomulanFleet) Ship2).getShieldStrength() == 0) {
            ((RomulanFleet) Ship2).sethullStrength(((RomulanFleet) Ship2).gethullStrength() - energy); // damage
          } // hull
        
        }

      } else {
        if (RomulanFleet.a == Ship1) { // Well-Rounded Damage
          energy = 15 + damage.nextInt(10);
        }
        if (RomulanFleet.b == Ship1) { // Offensive Damage
          energy = 20 + damage.nextInt(10);
        }
        if (RomulanFleet.c == Ship1) { // Defensive Damage
          energy = 10 + damage.nextInt(10);
        }

        if (FederationFleet.a == Ship2 | FederationFleet.b == Ship2 | FederationFleet.c == Ship2) {
          System.out.println("The RSE " + ChooseShips.getrName() + " is firing disruptors!\n");
          ((FederationFleet) Ship2).setShieldStrength(((FederationFleet) Ship2).getShieldStrength() - energy); // damage
                                                                                                               // shields
          System.out.println("The RSE " + ChooseShips.getrName() + " dealt " + energy + " damage.");
          if (((FederationFleet) Ship2).getShieldStrength() <= 0) {
            int x = Math.abs(((FederationFleet) Ship2).getShieldStrength());
            ((FederationFleet) Ship2).sethullStrength(((FederationFleet) Ship2).gethullStrength() - x); // remaining
                                                                                                        // damage
                                                                                                        // to
                                                                                                        // hull
            ((FederationFleet) Ship2).setShieldStrength(0); // set shields to 0
          } else if (((FederationFleet) Ship2).getShieldStrength() == 0) {
            ((FederationFleet) Ship2).sethullStrength(((FederationFleet) Ship2).gethullStrength() - energy); // damage
          } // hull
        } else if (KlingonFleet.a == Ship2 | KlingonFleet.b == Ship2 | KlingonFleet.c == Ship2) {

          System.out.println("The RSE " + ChooseShips.getrName() + " is firing disruptors!\n");
          ((KlingonFleet) Ship2).setShieldStrength(((KlingonFleet) Ship2).getShieldStrength() - energy); // damage
                                                                                                         // shields
          System.out.println("The RSE " + ChooseShips.getrName() + " dealt " + energy + " damage.");
          if (((KlingonFleet) Ship2).getShieldStrength() <= 0) {
            int x = Math.abs(((KlingonFleet) Ship2).getShieldStrength());
            ((KlingonFleet) Ship2).sethullStrength(((KlingonFleet) Ship2).gethullStrength() - x); // remaining
                                                                                                  // damage
                                                                                                  // to
                                                                                                  // hull
            ((KlingonFleet) Ship2).setShieldStrength(0); // set shields to 0
          } else if (((KlingonFleet) Ship2).getShieldStrength() == 0) {
            ((KlingonFleet) Ship2).sethullStrength(((KlingonFleet) Ship2).gethullStrength() - energy); // damage
            // hull
          }
        }
      }
    }

  public void attack2(Object Ship1, Object Ship2) {
    Random damage = new Random();
    int torpedo = 0;
    if (OnePlayerTurn.fed) { // if you are Federation
      if (FederationFleet.a == Ship1) { // Well Rounded Damage
        torpedo = 30 + damage.nextInt(10);
      }
      if (FederationFleet.b == Ship1) { // Offensive damage
        torpedo = 40 + damage.nextInt(10);
      }
      if (FederationFleet.c == Ship1) { // Defensive Damage
        torpedo = 20 + damage.nextInt(20);
      }
      if (KlingonFleet.a == Ship2 | KlingonFleet.b == Ship2 | KlingonFleet.c == Ship2) {
        if (((FederationFleet) Ship1).gettNum() >= 1) {
          System.out.println("The USS " + ChooseShips.getfName() + " fired a spread of photon torpedos!\n");
          ((KlingonFleet) Ship2).setShieldStrength(((KlingonFleet) Ship2).getShieldStrength() - torpedo); // damage
                                                                                                          // shields
          System.out.println("The USS " + ChooseShips.getfName() + " dealt " + torpedo + " damage.");
          if (((KlingonFleet) Ship2).getShieldStrength() <= 0) {
            int x = Math.abs(((KlingonFleet) Ship2).getShieldStrength());
            ((KlingonFleet) Ship2).sethullStrength(((KlingonFleet) Ship2).gethullStrength() - x); // remaining
                                                                                                  // damage
                                                                                                  // to
                                                                                                  // hull
            ((KlingonFleet) Ship2).setShieldStrength(0); // set shields to 0
          } else if (((KlingonFleet) Ship2).getShieldStrength() == 0) {
            ((KlingonFleet) Ship2).sethullStrength(((KlingonFleet) Ship2).gethullStrength() - torpedo); // damage
                                                                                                        // hull
          }
          ((FederationFleet) Ship1).settNum(((FederationFleet) Ship1).gettNum() - 1);
        } else if (((FederationFleet) Ship1).gettNum() <= 0) {
          ((FederationFleet) Ship1).settNum(0);
        }
      } else if (RomulanFleet.a == Ship2 | RomulanFleet.b == Ship2 | RomulanFleet.c == Ship2) {
        if (((FederationFleet) Ship1).gettNum() >= 1) {
          System.out.println("The USS " + ChooseShips.getfName() + " fired a spread of photon torpedos!\n");
          ((RomulanFleet) Ship2).setShieldStrength(((RomulanFleet) Ship2).getShieldStrength() - torpedo); // damage
                                                                                                          // shields
          System.out.println("The USS " + ChooseShips.getfName() + " dealt " + torpedo + " damage.");
          if (((RomulanFleet) Ship2).getShieldStrength() <= 0) {
            int x = Math.abs(((RomulanFleet) Ship2).getShieldStrength());
            ((RomulanFleet) Ship2).sethullStrength(((RomulanFleet) Ship2).gethullStrength() - x); // remaining
                                                                                                  // damage
                                                                                                  // to
                                                                                                  // hull
            ((RomulanFleet) Ship2).setShieldStrength(0); // set shields to 0
          } else if (((RomulanFleet) Ship2).getShieldStrength() == 0) {
            ((RomulanFleet) Ship2).sethullStrength(((RomulanFleet) Ship2).gethullStrength() - torpedo); // damage
                                                                                                        // hull
          }
          ((FederationFleet) Ship1).settNum(((FederationFleet) Ship1).gettNum() - 1);
        } else if (((FederationFleet) Ship1).gettNum() <= 0) {
          ((FederationFleet) Ship1).settNum(0);
        }
      }

    } else if (OnePlayerTurn.kling) { // if you are klingon
      if (KlingonFleet.a == Ship1) { // Well-Rounded Damage
        torpedo = 30 + damage.nextInt(10);
      }
      if (KlingonFleet.b == Ship1) { // Offensive Damage
        torpedo = 40 + damage.nextInt(10);
      }
      if (KlingonFleet.c == Ship1) { // Defensives Damage
        torpedo = 20 + damage.nextInt(20);
      }
      if (FederationFleet.a == Ship2 | FederationFleet.b == Ship2 | FederationFleet.c == Ship2) {
        if (((KlingonFleet) Ship1).gettNum() >= 1) {
          System.out.println("The KDF " + ChooseShips.getkName() + " fired a spread of photon torpedos!\n");
          ((FederationFleet) Ship2).setShieldStrength(((FederationFleet) Ship2).getShieldStrength() - torpedo); // damage
                                                                                                                // shields
          System.out.println("The KDF " + ChooseShips.getkName() + " dealt " + torpedo + " damage.");
          if (((FederationFleet) Ship2).getShieldStrength() <= 0) {
            int x = Math.abs(((FederationFleet) Ship2).getShieldStrength());
            ((FederationFleet) Ship2).sethullStrength(((FederationFleet) Ship2).gethullStrength() - x); // remaining
                                                                                                        // damage
                                                                                                        // to
                                                                                                        // hull
            ((FederationFleet) Ship2).setShieldStrength(0); // set shields to 0
          } else if (((FederationFleet) Ship2).getShieldStrength() == 0) {
            ((FederationFleet) Ship2).sethullStrength(((FederationFleet) Ship2).gethullStrength() - torpedo); // damage
                                                                                                              // hull
          }
          ((KlingonFleet) Ship1).settNum(((KlingonFleet) Ship1).gettNum() - 1);
        } else if (((KlingonFleet) Ship1).gettNum() <= 0) {
          ((KlingonFleet) Ship1).settNum(0);
        }

      } else if (RomulanFleet.a == Ship2 | RomulanFleet.b == Ship2 | RomulanFleet.c == Ship2) {
        if (((KlingonFleet) Ship1).gettNum() >= 1) {
          System.out.println("The KDF " + ChooseShips.getkName() + " fired a spread of photon torpedos!\n");
          ((RomulanFleet) Ship2).setShieldStrength(((RomulanFleet) Ship2).getShieldStrength() - torpedo); // damage
                                                                                                          // shields
          System.out.println("The KDF " + ChooseShips.getkName() + " dealt " + torpedo + " damage.");
          if (((RomulanFleet) Ship2).getShieldStrength() <= 0) {
            int x = Math.abs(((RomulanFleet) Ship2).getShieldStrength());
            ((RomulanFleet) Ship2).sethullStrength(((RomulanFleet) Ship2).gethullStrength() - x); // remaining
                                                                                                  // damage
                                                                                                  // to
                                                                                                  // hull
            ((RomulanFleet) Ship2).setShieldStrength(0); // set shields to 0
          } else if (((RomulanFleet) Ship2).getShieldStrength() == 0) {
            ((RomulanFleet) Ship2).sethullStrength(((RomulanFleet) Ship2).gethullStrength() - torpedo); // damage
                                                                                                        // hull
          }
          ((KlingonFleet) Ship1).settNum(((KlingonFleet) Ship1).gettNum() - 1);
        } else if (((KlingonFleet) Ship1).gettNum() <= 0) {
          ((KlingonFleet) Ship1).settNum(0);
        }
      }
    } else if(OnePlayerTurn.rom) {
      if (RomulanFleet.a == Ship1) { // Well-Rounded Damage
        torpedo = 30 + damage.nextInt(10);
      }
      if (RomulanFleet.b == Ship1) { // Offensive Damage
        torpedo = 40 + damage.nextInt(10);
      }
      if (RomulanFleet.c == Ship1) { // Defensives Damage
        torpedo = 20 + damage.nextInt(20);
      }
      if (FederationFleet.a == Ship2 | FederationFleet.b == Ship2 | FederationFleet.c == Ship2) {
        if (((RomulanFleet) Ship1).gettNum() >= 1) {
          System.out.println("The RSE " + ChooseShips.getrName() + " fired a spread of photon torpedos!\n");
          ((FederationFleet) Ship2).setShieldStrength(((FederationFleet) Ship2).getShieldStrength() - torpedo); // damage
                                                                                                                // shields
          System.out.println("The RSE " + ChooseShips.getrName() + " dealt " + torpedo + " damage.");
          if (((FederationFleet) Ship2).getShieldStrength() <= 0) {
            int x = Math.abs(((FederationFleet) Ship2).getShieldStrength());
            ((FederationFleet) Ship2).sethullStrength(((FederationFleet) Ship2).gethullStrength() - x); // remaining
                                                                                                        // damage
                                                                                                        // to
                                                                                                        // hull
            ((FederationFleet) Ship2).setShieldStrength(0); // set shields to 0
          } else if (((FederationFleet) Ship2).getShieldStrength() == 0) {
            ((FederationFleet) Ship2).sethullStrength(((FederationFleet) Ship2).gethullStrength() - torpedo); // damage
                                                                                                              // hull
          }
          ((RomulanFleet) Ship1).settNum(((RomulanFleet) Ship1).gettNum() - 1);
        } else if (((RomulanFleet) Ship1).gettNum() <= 0) {
          ((RomulanFleet) Ship1).settNum(0);
        }
      } else if (KlingonFleet.a == Ship2 | KlingonFleet.b == Ship2 | KlingonFleet.c == Ship2) {
        if (((RomulanFleet) Ship1).gettNum() >= 1) {
          System.out.println("The RSE " + ChooseShips.getrName() + " fired a spread of photon torpedos!\n");
          ((KlingonFleet) Ship2).setShieldStrength(((KlingonFleet) Ship2).getShieldStrength() - torpedo); // damage
                                                                                                          // shields
          System.out.println("The RSE " + ChooseShips.getrName() + " dealt " + torpedo + " damage.");
          if (((KlingonFleet) Ship2).getShieldStrength() <= 0) {
            int x = Math.abs(((KlingonFleet) Ship2).getShieldStrength());
            ((KlingonFleet) Ship2).sethullStrength(((KlingonFleet) Ship2).gethullStrength() - x); // remaining
                                                                                                  // damage
                                                                                                  // to
                                                                                                  // hull
            ((KlingonFleet) Ship2).setShieldStrength(0); // set shields to 0
          } else if (((KlingonFleet) Ship2).getShieldStrength() == 0) {
            ((KlingonFleet) Ship2).sethullStrength(((KlingonFleet) Ship2).gethullStrength() - torpedo); // damage
                                                                                                        // hull
          }
          ((RomulanFleet) Ship1).settNum(((RomulanFleet) Ship1).gettNum() - 1);
        } else if (((RomulanFleet) Ship1).gettNum() <= 0) {
          ((RomulanFleet) Ship1).settNum(0);
        }
      }
    }
  }

  public void defence1(Object Ship) {
    Random repair = new Random();
    int shield = 30 + repair.nextInt(10);

    if (OnePlayerTurn.fed) {
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

    } else if (OnePlayerTurn.kling) {
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

    } else if (OnePlayerTurn.rom) {
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

  public void defence2(Object Ship) {
    Random repair = new Random();
    int hull = 0;
    int y;
    int x;

    if (OnePlayerTurn.fed) {

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

    } else if (OnePlayerTurn.kling) {

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

    } else if (OnePlayerTurn.rom) {
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

  @Override
  public void attackMenu(Object Ship) {

  }
}
