package enemy;

import java.util.Random;

import CombatSpace.ChooseShips;

public class RandomEnemy {

  Object Enemy;
  Random random = new Random();
  private int choice = random.nextInt(4) + 1;

  public void spawnSpaceEnemy() throws InterruptedException {
    ChooseShips cs = new ChooseShips();
    Random rand = new Random();

    int choose = rand.nextInt(3) + 1;

    switch (choose) {
      case 1:
        cs.aiChoiceF();
        break;
      case 2:
        cs.aiChoiceK();
        break;
      case 3:
        cs.aiChoiceR();
        break;
    }
  }

  public void spawnGroundEnemy() {
    Random rand = new Random();

    int chooseName = rand.nextInt(4) + 1;

    switch (choice) {
      case 1:

        switch (chooseName) {
          case 1:
            Enemies.Klingon.setName("Klingon Warrior");
            break;
          case 2:
            Enemies.Klingon.setName("Klingon Engineer");
            break;
          case 3:
            Enemies.Klingon.setName("Klingon Captain");
            break;
          case 4:
            Enemies.Klingon.setName("Klingon Pilot");
            break;

        }

        System.out.println(Enemies.Klingon.getName());
        System.out.println(Enemies.Klingon.getHealth());
        System.out.println(Enemies.Klingon.getStamina());
        System.out.println();
        Enemy = Enemies.Klingon;
        break;

      case 2:

        switch (chooseName) {
          case 1:
            Enemies.Romulan.setName("Romulan Warrior");
            break;
          case 2:
            Enemies.Romulan.setName("Romulan Engineer");
            break;
          case 3:
            Enemies.Romulan.setName("Romulan Captain");
            break;
          case 4:
            Enemies.Romulan.setName("Romulan Pilot");
            break;
        }

        System.out.println(Enemies.Romulan.getName());
        System.out.println(Enemies.Romulan.getHealth());
        System.out.println(Enemies.Romulan.getStamina());
        System.out.println();

        Enemy = Enemies.Romulan;
        break;

      case 3:

        switch (chooseName) {
          case 1:
            Enemies.Gorn.setName("Gorn Warrior");
            break;
          case 2:
            Enemies.Gorn.setName("Gorn Engineer");
            break;
          case 3:
            Enemies.Gorn.setName("Gorn Captain");
            break;
          case 4:
            Enemies.Gorn.setName("Romulan Pilot");
            break;
        }

        System.out.println(Enemies.Gorn.getName());
        System.out.println(Enemies.Gorn.getHealth());
        System.out.println(Enemies.Gorn.getStamina());
        System.out.println();

        Enemy = Enemies.Gorn;
        break;

      case 4:
        switch (chooseName) {
          case 1:
            Enemies.GeneticEngineered.setName("Genetically Engineered Warrior");
            break;
          case 2:
            Enemies.GeneticEngineered.setName("Genetically Engineered Engineer");
            break;
          case 3:
            Enemies.GeneticEngineered.setName("Genetically Engineered Captain");
            break;
          case 4:
            Enemies.GeneticEngineered.setName("Genetically Engineered Pilot");
            break;
        }

        System.out.println(Enemies.GeneticEngineered.getName());
        System.out.println(Enemies.GeneticEngineered.getHealth());
        System.out.println(Enemies.GeneticEngineered.getStamina());
        System.out.println();

        Enemy = Enemies.GeneticEngineered;
        break;
    }
  }

}
