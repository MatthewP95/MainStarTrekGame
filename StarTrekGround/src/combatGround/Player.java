package combatGround;

import java.util.Random;
import java.util.Scanner;

import CombatSpace.FederationFleet;
import CombatSpace.KlingonFleet;
import CombatSpace.RomulanFleet;


public class Player implements Commands {

  public Object player;
  private Scanner input;
  private int punch;
  private int crit;

  public void playerChoose(Object ship) {
    
    input = new Scanner(System.in);
    
    if (ship.equals(FederationFleet.a) || ship.equals(FederationFleet.b) || ship.equals(FederationFleet.c)) {

      System.out.println("Choose which officer to take charge:");
      
      System.out.println("1. Federation Tactician.");
      System.out.println("\tHealth: " + FederationGround.FEDERATIONTACTICIAN.getHealth());
      System.out.println("\tStamina: " + FederationGround.FEDERATIONTACTICIAN.getStamina());
      System.out.println("\tAttack: " + FederationGround.FEDERATIONTACTICIAN.getAttack());
      System.out.println("\tDefence: " + FederationGround.FEDERATIONTACTICIAN.getDefence());

      System.out.println("2. Federation Engineer");
      System.out.println("\tHealth: " + FederationGround.FEDERATIONENGINEER.getHealth());
      System.out.println("\tStamina: " + FederationGround.FEDERATIONENGINEER.getStamina());
      System.out.println("\tAttack: " + FederationGround.FEDERATIONENGINEER.getAttack());
      System.out.println("\tDefence: " + FederationGround.FEDERATIONENGINEER.getDefence());

      System.out.println("3. Federation Scientist");
      System.out.println("\tHealth: " + FederationGround.FEDERATIONSCIENTIST.getHealth());
      System.out.println("\tStamina: " + FederationGround.FEDERATIONSCIENTIST.getStamina());
      System.out.println("\tAttack: " + FederationGround.FEDERATIONSCIENTIST.getAttack());
      System.out.println("\tDefence: " + FederationGround.FEDERATIONSCIENTIST.getDefence());

      int choice = input.nextInt();

      switch (choice) {
        
        case 1:

          System.out.println("You chose the Tactician Officer.");
          
          player = FederationGround.FEDERATIONTACTICIAN;

          break;

        case 2:

          System.out.println("You chose the Engineering Officer");
          
          player = FederationGround.FEDERATIONENGINEER;

          break;

        case 3:

          System.out.println("You chose the Science Officer");
          
          player = FederationGround.FEDERATIONSCIENTIST;

          break;
          
      }
      
    }

    if (ship.equals(KlingonFleet.a) || ship.equals(KlingonFleet.b) || ship.equals(KlingonFleet.c)) {

      System.out.println("Choose which officer to take charge:");

      System.out.println("1. Klingon Tactician.");
      System.out.println("\tHealth: " + KlingonGround.KLINGONTACTICIAN.getHealth());
      System.out.println("\tStamina: " + KlingonGround.KLINGONTACTICIAN.getStamina());
      System.out.println("\tAttack: " + KlingonGround.KLINGONTACTICIAN.getAttack());
      System.out.println("\tDefence: " + KlingonGround.KLINGONTACTICIAN.getDefence());

      System.out.println("2. Klingon Engineer");
      System.out.println("\tHealth: " + KlingonGround.KLINGONENGINEER.getHealth());
      System.out.println("\tStamina: " + KlingonGround.KLINGONENGINEER.getStamina());
      System.out.println("\tAttack: " + KlingonGround.KLINGONENGINEER.getAttack());
      System.out.println("\tDefence: " + KlingonGround.KLINGONENGINEER.getDefence());

      System.out.println("3. Klingon Scientist");
      System.out.println("\tHealth: " + KlingonGround.KLINGONSCIENTIST.getHealth());
      System.out.println("\tStamina: " + KlingonGround.KLINGONSCIENTIST.getStamina());
      System.out.println("\tAttack: " + KlingonGround.KLINGONSCIENTIST.getAttack());
      System.out.println("\tDefence: " + KlingonGround.KLINGONSCIENTIST.getDefence());

      int choice = input.nextInt();

      switch (choice) {
        case 1:

          System.out.println("You chose the Tactician Officer.");
          
          player = KlingonGround.KLINGONTACTICIAN;

          break;

        case 2:

          System.out.println("You chose the Engineering Officer");
          
          player = KlingonGround.KLINGONENGINEER;

          break;

        case 3:

          System.out.println("You chose the Science Officer");
          
          player = KlingonGround.KLINGONSCIENTIST;

          break;

      }
      
    }

    if (ship.equals(RomulanFleet.a) || ship.equals(RomulanFleet.b) || ship.equals(RomulanFleet.c)) {

      System.out.println("Choose which officer to take charge:");

      System.out.println("1. Romulan Tactician.");
      System.out.println("\tHealth: " + RomulanGround.ROMULANTACTICIAN.getHealth());
      System.out.println("\tStamina: " + RomulanGround.ROMULANTACTICIAN.getStamina());
      System.out.println("\tAttack: " + RomulanGround.ROMULANTACTICIAN.getAttack());
      System.out.println("\tDefence: " + RomulanGround.ROMULANTACTICIAN.getDefence());

      System.out.println("2. Romulan Engineer");
      System.out.println("\tHealth: " + RomulanGround.ROMULANENGINEER.getHealth());
      System.out.println("\tStamina: " + RomulanGround.ROMULANENGINEER.getStamina());
      System.out.println("\tAttack: " + RomulanGround.ROMULANENGINEER.getAttack());
      System.out.println("\tDefence: " + RomulanGround.ROMULANENGINEER.getDefence());

      System.out.println("3. Romulan Scientist");
      System.out.println("\tHealth: " + RomulanGround.ROMULANSCIENTIST.getHealth());
      System.out.println("\tStamina: " + RomulanGround.ROMULANSCIENTIST.getStamina());
      System.out.println("\tAttack: " + RomulanGround.ROMULANSCIENTIST.getAttack());
      System.out.println("\tDefence: " + RomulanGround.ROMULANSCIENTIST.getDefence());

      int choice = input.nextInt();

      switch (choice) {
        case 1:

          System.out.println("You chose the Tactician Officer.");
          
          player = RomulanGround.ROMULANTACTICIAN;

          break;

        case 2:

          System.out.println("You chose the Engineering Officer");
          
          player = RomulanGround.ROMULANENGINEER;

          break;

        case 3:

          System.out.println("You chose the Science Officer");
          
          player = RomulanGround.ROMULANSCIENTIST;

          break;
 
      }
      
    }
    
  }

  @Override
  public void punch(Object ai) {
    
    Random damage = new Random();
   
    punch = damage.nextInt(FederationGround.FEDERATIONENGINEER.getAttack() + 2) + 7;
    
    crit = damage.nextInt(10) + 1;
    
    if(punch >= 10 && crit <= 3) {
    
      System.out.print(punch + " ");
      
      punch = punch + 5;
      
      System.out.print("CRIT! ");
    
    }
    
    System.out.println(punch);
    
    if (FederationGround.FEDERATIONTACTICIAN.equals(player) || KlingonGround.KLINGONTACTICIAN.equals(player) || RomulanGround.ROMULANTACTICIAN.equals(player)) {
    
      if (FederationGround.FEDERATIONTACTICIAN.equals(player)) {
      
        punch = damage.nextInt(FederationGround.FEDERATIONTACTICIAN.getAttack() + 3) + 10;
        
        crit = damage.nextInt(10) + 1;
        
        if(punch >= 15 && crit <= 3 ) {
        
          System.out.print(punch + " ");
          
          punch = punch + 5;
          
          System.out.print("CRIT! ");
        
        }
        
        System.out.println(FederationGround.FEDERATIONTACTICIAN.getName() + "dealt " + punch + " damage.");
      
      }
      
      if(KlingonGround.KLINGONTACTICIAN.equals(player)) {
      
        punch = damage.nextInt(KlingonGround.KLINGONTACTICIAN.getAttack() + 3) + 10;
      
        crit = damage.nextInt(10) + 1;
        
        if(punch >= 15 && crit <= 3) {
        
          System.out.print(punch + " ");
          
          punch = punch + 5;
          
          System.out.print("CRIT! ");
        
        }
        
        System.out.println(KlingonGround.KLINGONTACTICIAN.getName() + "dealt " + punch + " damage.");
      
      }
      
      if(RomulanGround.ROMULANTACTICIAN.equals(player)) {
      
        punch = damage.nextInt(RomulanGround.ROMULANTACTICIAN.getAttack() + 3) + 10;
        
        crit = damage.nextInt(10) + 1;
        
        if(punch >= 15 && crit <= 3) {
        
          System.out.print(punch + " ");
          
          punch = punch + 5;
          
          System.out.print("CRIT! ");
        
        }
        
        System.out.println(RomulanGround.ROMULANTACTICIAN.getName() + "dealt " + punch + " damage.");
        
      }
      
    }

    if (FederationGround.FEDERATIONENGINEER.equals(player) || KlingonGround.KLINGONENGINEER.equals(player) || RomulanGround.ROMULANENGINEER.equals(player)) {
      
      if (FederationGround.FEDERATIONENGINEER.equals(player)) {
      
        punch = damage.nextInt(FederationGround.FEDERATIONENGINEER.getAttack() + 2) + 7;
        
        crit = damage.nextInt(10) + 1;
        
        if(punch >= 10 && crit <= 3) {
        
          System.out.print(punch + " ");
          
          punch = punch + 5;
          
          System.out.print("CRIT! ");
        
        }
        
        System.out.println(punch); 
      
      }
      
      if (KlingonGround.KLINGONENGINEER.equals(player)) {
      
        punch = damage.nextInt(KlingonGround.KLINGONENGINEER.getAttack() + 2) + 7;
        
        crit = damage.nextInt(10) + 1;
        
        if(punch >= 10 && crit <= 3) {
        
          System.out.print(punch + " ");
          
          punch = punch + 5;
          
          System.out.print("CRIT! ");
        
        }
        
        System.out.println(punch);
      
      }
      
      if(RomulanGround.ROMULANENGINEER.equals(player)) {
      
        punch = damage.nextInt(RomulanGround.ROMULANENGINEER.getAttack() + 2) + 7;
        
        crit = damage.nextInt(10) + 1;
        
        if(punch >= 10 && crit <= 3) {
        
          System.out.print(punch + " ");
          
          punch = punch + 5;
          
          System.out.print("CRIT! ");
        
        }
        
        System.out.println(punch);
      
      }
      
    }

    if (FederationGround.FEDERATIONSCIENTIST.equals(player) || KlingonGround.KLINGONSCIENTIST.equals(player) ||RomulanGround.ROMULANSCIENTIST.equals(player)) {
     
      if(FederationGround.FEDERATIONSCIENTIST.equals(player)) {
      
        punch = damage.nextInt(FederationGround.FEDERATIONSCIENTIST.getAttack());
        
        crit = damage.nextInt(10) + 1;
        
        if(punch >= 10 && crit <= 3) {
        
          System.out.print(punch + " ");
          
          punch = punch + 5;
          
          System.out.print("CRIT! ");
        
        }
        
        System.out.println(punch);
      
      }
    
    }
  
  }

  @Override
  public void kick(Object ai) {
    // TODO Auto-generated method stub
    if (FederationGround.FEDERATIONTACTICIAN.equals(player) || KlingonGround.KLINGONTACTICIAN.equals(player) || RomulanGround.ROMULANTACTICIAN.equals(player)) {

    }

    if (FederationGround.FEDERATIONENGINEER.equals(player) || KlingonGround.KLINGONENGINEER.equals(player) || RomulanGround.ROMULANENGINEER.equals(player)) {

    }

    if (FederationGround.FEDERATIONSCIENTIST.equals(player) || KlingonGround.KLINGONSCIENTIST.equals(player) || RomulanGround.ROMULANSCIENTIST.equals(player)) {

    }
  }

  @Override
  public void phaser(Object ai) {
    // TODO Auto-generated method stub
    if (FederationGround.FEDERATIONTACTICIAN.equals(player) || KlingonGround.KLINGONTACTICIAN.equals(player) || RomulanGround.ROMULANTACTICIAN.equals(player)) {

    }

    if (FederationGround.FEDERATIONENGINEER.equals(player) || KlingonGround.KLINGONENGINEER.equals(player) || RomulanGround.ROMULANENGINEER.equals(player)) {

    }

    if (FederationGround.FEDERATIONSCIENTIST.equals(player) || KlingonGround.KLINGONSCIENTIST.equals(player) || RomulanGround.ROMULANSCIENTIST.equals(player)) {

    }
  }

  @Override
  public void heal() {
    // TODO Auto-generated method stub
    if (FederationGround.FEDERATIONTACTICIAN.equals(player) || KlingonGround.KLINGONTACTICIAN.equals(player) || RomulanGround.ROMULANTACTICIAN.equals(player)) {

    }

    if (FederationGround.FEDERATIONENGINEER.equals(player) || KlingonGround.KLINGONENGINEER.equals(player) || RomulanGround.ROMULANENGINEER.equals(player)) {

    }

    if (FederationGround.FEDERATIONSCIENTIST.equals(player) || KlingonGround.KLINGONSCIENTIST.equals(player) || RomulanGround.ROMULANSCIENTIST.equals(player)) {

    }
  }

  @Override
  public void run() {
    // TODO Auto-generated method stub
    if (FederationGround.FEDERATIONTACTICIAN.equals(player) || KlingonGround.KLINGONTACTICIAN.equals(player) || RomulanGround.ROMULANTACTICIAN.equals(player)) {

    }

    if (FederationGround.FEDERATIONENGINEER.equals(player) || KlingonGround.KLINGONENGINEER.equals(player) || RomulanGround.ROMULANENGINEER.equals(player)) {

    }

    if (FederationGround.FEDERATIONSCIENTIST.equals(player) || KlingonGround.KLINGONSCIENTIST.equals(player) || RomulanGround.ROMULANSCIENTIST.equals(player)) {

    }
  }
}
