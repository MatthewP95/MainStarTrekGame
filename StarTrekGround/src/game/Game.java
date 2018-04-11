package game;

import move.*;

import java.io.IOException;

import CombatSpace.SpaceCombat;
import enemy.RandomEnemy;
import location.Locations;
import CombatSpace.ChooseShips;

public class Game {

  public void game() throws IOException, InterruptedException {

    Locations loc = new Locations();
    SpaceMove sm = new SpaceMove();
    GroundMove gm = new GroundMove();
    RandomEnemy re = new RandomEnemy();
    ChooseShips choose = new ChooseShips();
    SpaceCombat sc = new SpaceCombat();
    Object Ship1 = ChooseShips.x;
    Object Ship2 = ChooseShips.y;
    String[][] starMap = new String[loc.X_AXIS][loc.Y_AXIS];

    choose.chooseShips();
    loc.createMap(starMap);

    while (true) {
      if (sm.getBeam() && !gm.isBeam()) {
        String[][] groundMap = new String[loc.GXAXIS][loc.GYAXIS];
        loc.createGroundMap(groundMap);
        while (true) {
          String[][] map = loc.groundEventMap;
          loc.printGroundMap(groundMap);
          gm.crewMove(map, groundMap);
          if (gm.isBeam())
            break;
        }
      } else if (sm.getBattle() & !SpaceCombat.isBattleEnd()) {
        re.spawnSpaceEnemy();
        sc.spaceBattle(Ship1, Ship2);
        SpaceCombat.setBattleEnd(false);
        sm.setBattle(false);
        if (SpaceCombat.isLose()) {
          System.out.println("\nYour Ship was destroyed, you lost.");
          break;
        }
      } else {
        String[][] map = loc.eventMap;
        loc.printMap(starMap);
        sm.shipMove(map, starMap);
        loc.moveShip();
      }
    }
  }
}
