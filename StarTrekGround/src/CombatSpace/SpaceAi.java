package CombatSpace;

import java.util.Random;

public class SpaceAi {

  Object kling;
  Object fed;
  Object rom;
  public String kName;
  public String fName;
  public String rName;

  public void aiAttack1(Object Ship1, Object Ship2) {
    Random damage = new Random();
    int energy = 0;

    if ( Ship2.equals(FederationFleet.a) || Ship2.equals(FederationFleet.c) || Ship2.equals(FederationFleet.c)) {

      if (Ship2.equals(FederationFleet.a)) { // Well-Rounded Damage
        
        energy = 15 + damage.nextInt(10);
        
      } else if (Ship2.equals(FederationFleet.c)) { // Offensive Damage
        
        energy = 20 + damage.nextInt(10);
        
      } else // Defensive damage
        
        energy = 10 + damage.nextInt(10);

      if (Ship1.equals(KlingonFleet.a) || Ship1.equals(KlingonFleet.b) || Ship1.equals(KlingonFleet.c)) {
        
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
      } else if (Ship1.equals(RomulanFleet.a) || Ship1.equals(RomulanFleet.b) || Ship1.equals(RomulanFleet.c)) {
        
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
    } else if (Ship2.equals(KlingonFleet.a) || Ship2.equals(KlingonFleet.b) || Ship2.equals(KlingonFleet.c)) {
      
      if (Ship2.equals(KlingonFleet.a)) { // Well-Rounded Damage
        
        energy = 15 + damage.nextInt(10);
        
      } else if (Ship2.equals(KlingonFleet.b)) { // Offensive Damage
        
        energy = 20 + damage.nextInt(10);
        
      } else // Defensive Damage
        
        energy = 10 + damage.nextInt(10);

      if (Ship1.equals(FederationFleet.a) || Ship1.equals(FederationFleet.b) || Ship1.equals(FederationFleet.c)) {
        
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
      } else if (Ship1.equals(RomulanFleet.a) || Ship1.equals(RomulanFleet.b) || Ship1.equals(RomulanFleet.c)) {
        
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
      
    } else if (Ship2.equals(RomulanFleet.a) || Ship2.equals(RomulanFleet.b) || Ship2.equals(RomulanFleet.c)) {
      
      if (Ship2.equals(RomulanFleet.a)) // Well-Rounded Damage
        
        energy = 15 + damage.nextInt(10);
      
      else if (Ship2.equals(RomulanFleet.b)) // Offensive Damage
        
        energy = 20 + damage.nextInt(10);
      
      else // Defensive damage
        
        energy = 10 + damage.nextInt(10);

      if (Ship1.equals(KlingonFleet.a) || Ship1.equals(KlingonFleet.b) || Ship1.equals(KlingonFleet.c)) {
        
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
      } else if (Ship1.equals(FederationFleet.a) || Ship1.equals(FederationFleet.b) || Ship1.equals(FederationFleet.c)) {
        
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
    // federation SpaceAi
    if (Ship2.equals(FederationFleet.a) || Ship2.equals(FederationFleet.c) || Ship2.equals(FederationFleet.c)) {
      
      if (Ship2.equals(FederationFleet.a)) // Well Rounded Damage
        
        torpedo = 30 + damage.nextInt(10);

      else if (Ship2.equals(FederationFleet.c)) // Offensive damage
        
        torpedo = 40 + damage.nextInt(10);

      else // Defensive Damage
        
        torpedo = 20 + damage.nextInt(20);

      if (Ship1.equals(KlingonFleet.a) || Ship1.equals(KlingonFleet.b) || Ship1.equals(KlingonFleet.c)) {
        
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
        
      } else if (Ship1.equals(RomulanFleet.a) || Ship1.equals(RomulanFleet.b) || Ship1.equals(RomulanFleet.c)) {
        
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
      // Klingon SpaceAi
    } else if (Ship2.equals(KlingonFleet.a) || Ship2.equals(KlingonFleet.b) || Ship2.equals(KlingonFleet.c)) {
      
      if (Ship2.equals(KlingonFleet.a)) { // Well-Rounded Damage
        
        torpedo = 30 + damage.nextInt(10);
        
      }
      
      if (Ship2.equals(KlingonFleet.b)) { // Offensive Damage
        
        torpedo = 40 + damage.nextInt(10);
        
      }
      
      if (Ship2.equals(KlingonFleet.c)) { // Defensives Damage
        
        torpedo = 20 + damage.nextInt(20);
        
      }
      
      if (Ship1.equals(FederationFleet.a) || Ship1.equals(FederationFleet.b) || Ship1.equals(FederationFleet.c)) {
        
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
        
      } else if (Ship1.equals(RomulanFleet.a) || Ship1.equals(RomulanFleet.b) || Ship1.equals(RomulanFleet.c)) {
        
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
      // Romulan SpaceAi
    } else if (Ship2.equals(RomulanFleet.a) || Ship2.equals(RomulanFleet.b) || Ship2.equals(RomulanFleet.c)) {
      
      if (Ship2.equals(RomulanFleet.a)) { // Well-Rounded Damage
        
        torpedo = 30 + damage.nextInt(10);
        
      }
      
      if (Ship2.equals(RomulanFleet.b)) { // Offensive Damage
        
        torpedo = 40 + damage.nextInt(10);
        
      }
      
      if (Ship2.equals(RomulanFleet.c)) { // Defensives Damage
        
        torpedo = 20 + damage.nextInt(20);
        
      }
      
      if (Ship1.equals(FederationFleet.a) || Ship1.equals(FederationFleet.b) || Ship1.equals(FederationFleet.c)) {
        
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
        
      } else if (Ship1.equals(KlingonFleet.a) || Ship1.equals(KlingonFleet.b) || Ship1.equals(KlingonFleet.c)) {
        
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

    if (Ship.equals(FederationFleet.a) || Ship.equals(FederationFleet.b) || Ship.equals(FederationFleet.c)) {
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
    } else if (Ship.equals(KlingonFleet.a) || Ship.equals(KlingonFleet.b) || Ship.equals(KlingonFleet.c)) {
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
    } else if (Ship.equals(RomulanFleet.a) || Ship.equals(RomulanFleet.b) || Ship.equals(RomulanFleet.c)) {
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

    if (Ship.equals(FederationFleet.a) || Ship.equals(FederationFleet.b) || Ship.equals(FederationFleet.c)) {

      int h = ((FederationFleet) Ship).gethullStrength();
      if (Ship.equals(FederationFleet.a)) { // Well-Rounded repair
        hull = 30 + repair.nextInt(10);
      }
      if (Ship.equals(FederationFleet.b)) { // Offensive Repair
        hull = 30 + repair.nextInt(5);
      }
      if (Ship.equals(FederationFleet.c)) { // Defensive Repair
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

    } else if (Ship.equals(KlingonFleet.a) || Ship.equals(KlingonFleet.b) || Ship.equals(KlingonFleet.c)) {

      int h = ((KlingonFleet) Ship).gethullStrength();

      if (Ship.equals(KlingonFleet.a)) { // Well-Rounded Repair
        hull = 30 + repair.nextInt(10);
      }
      if (Ship.equals(KlingonFleet.b)) { // Offensive Repair
        hull = 30 + repair.nextInt(5);
      }
      if (Ship.equals(KlingonFleet.c)) { // Defensive Repair
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
    } else if (Ship.equals(RomulanFleet.a) || Ship.equals(RomulanFleet.b) || Ship.equals(RomulanFleet.c)) {

      int h = ((RomulanFleet) Ship).gethullStrength();

      if (Ship.equals(RomulanFleet.a)) { // Well-Rounded Repair
        hull = 30 + repair.nextInt(10);
      }
      if (Ship.equals(RomulanFleet.b)) { // Offensive Repair
        hull = 30 + repair.nextInt(5);
      }
      if (Ship.equals(RomulanFleet.c)) { // Defensive Repair
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
