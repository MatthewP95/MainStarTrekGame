package game;

import move.*;

import java.io.IOException;

import CombatSpace.OnePlayerTurn;
import CombatSpace.ChooseShips;

public class Game {

  public static void main(String[] args) throws IOException, InterruptedException {

    Locations loc = new Locations();
    SpaceMove sm = new SpaceMove();
    ChooseShips choose = new ChooseShips();
    OnePlayerTurn opt = new OnePlayerTurn();
    Object Ship1 = ChooseShips.x;
    Object Ship2 = ChooseShips.y;

    String[][] starMap = new String[20][20];

    choose.chooseShips();
    loc.createMap(starMap);

    while (true) {
        
        if(SpaceMove.getBattle()) {
          opt.onePlayerTurn(Ship1, Ship2);
        }
        String[][] map = loc.eventMap;
        loc.printMap(starMap);
        sm.shipMove(map, starMap);
        loc.moveShip();
       
    }
  }
}
