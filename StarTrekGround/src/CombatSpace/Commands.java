package CombatSpace;

public interface Commands {

  int shieldStrength = 100; // Shields
  int hullStrength = 100; // hull

  public void attackMenu(Object Ship);

  public void attack1(Object Ship1, Object Ship2);

  public void attack2(Object Ship1, Object Ship2);

  public void defence1(Object Ship);

  public void defence2(Object Ship);
}