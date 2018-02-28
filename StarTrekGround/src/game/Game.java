package game;

import move.*;

import java.io.IOException;

import CombatSpace.OnePlayerTurn;
import enemy.RandomEnemy;
import CombatSpace.ChooseShips;

public class Game {

  public void game() throws IOException, InterruptedException {

    Locations loc = new Locations();
    SpaceMove sm = new SpaceMove();
    RandomEnemy re = new RandomEnemy();
    ChooseShips choose = new ChooseShips();
    OnePlayerTurn opt = new OnePlayerTurn();
    Object Ship1 = ChooseShips.x;
    Object Ship2 = ChooseShips.y;
    String[][] starMap = new String[21][21];
    boolean ground = true;
    
    choose.chooseShips();
    loc.createMap(starMap);
    while(!OnePlayerTurn.lose) {
      if (sm.getBeam()) {
        boolean TEST = true;
        while (ground) {
          String[][] groundMap = new String[11][11];
          loc.createGroundMap(groundMap);
          loc.printGroundMap(groundMap);
          ground = false;
        }
        if(TEST)
          break;
      }
      if (SpaceMove.getBattle() && !OnePlayerTurn.isBattleEnd()) {
        re.spawnSpaceEnemy();
        opt.spaceBattle(Ship1, Ship2);
        OnePlayerTurn.setBattleEnd(false);
        sm.setBattle(false);
      }
      String[][] map = loc.eventMap;
      loc.printMap(starMap);
      sm.shipMove(map, starMap);
      loc.moveShip();
    }
    if(OnePlayerTurn.lose) {
      System.out.println("Your Ship was destroyed, you lost.");
    }
  }
}
