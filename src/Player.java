import java.util.*;

//This class is not used.
//Maybe I'll incorporate it in the future.

public class Player
{
  //these are just examples of instance variables
  //you can change these if you want to

  //But you really can't.
  String name;
  int health;
  double gold;
  int monstersDefeated;
  String state;

  public Player(String playerName)
  {
    this.name = playerName;
    this.health = 100;
    this.gold = 15;
    this.state = "Mortal";

  }

  public String getName()
  {
    return name;
  }

  public void changeName(String newName)
  {
    this.name = newName;
  }

  //these are also examples of methods you might
  //create depending on your story/game
  public int getHealth()
  {
    return health;
  }

  public void setHealth(int newHealth)
  {
    // ADD CODE HERE
  }

  public double getGold()
  {
    return gold;
  }

  public String getState() {
    return state;
  }

  public void setGold(double newAmount)
  {
    // ADD CODE HERE
  }

  public int getMonstersDefeated()
  {
    return monstersDefeated;
  }

  public void defeatMonster()
  {
    // ADD CODE HERE
  }
}