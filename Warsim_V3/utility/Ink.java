package utility;

import warrior.Warrior;

public class Ink {

  public Ink() {
    // Constructor
  }

  // Welcome Message
  public void welcomeMessage() {
    System.out.println("Welcome to Warsim! Prepare for battle!");
  }

  // Warrior Menu
  public void printWarriorMenu() {
    System.out.println("Select your warrior:");
    System.out.println("1) Human");
    System.out.println("2) Elf");
    System.out.println("3) Orc");
    System.out.print("Enter your choice: ");
  }

  // Weapon Menu
  public void printWeaponMenu() {
    System.out.println("Choose your weapon:");
    System.out.println("1) Dagger");
    System.out.println("2) Sword");
    System.out.println("3) Axe");
    System.out.print("Enter your choice: ");
  }
  
  // Armour Menu
  public void printArmourMenu() {
    System.out.println("Choose your armour:");
    System.out.println("1) Leather");
    System.out.println("2) Chainmail");
    System.out.println("3) Platemail");
    System.out.print("Enter your choice: ");
  }

  // Attack Menu
  public void printAttackMenu() {
    System.out.println("Select attack type:");
    System.out.println("1) Normal Attack");
    System.out.println("2) Heavy Attack");
    System.out.print("Enter your choice: ");
  }

  // Print Stats
  public void printStats(Warrior player, Warrior enemy) {
    System.out.println("Player Stats:");
    System.out.println("Health: " + player.getHealth());
    System.out.println("Strength: " + player.getStrength());
    System.out.println("Dexterity: " + player.getDexterity());
    System.out.println("------------------");
    System.out.println("Enemy Stats:");
    System.out.println("Health: " + enemy.getHealth());
    System.out.println("Strength: " + enemy.getStrength());
    System.out.println("Dexterity: " + enemy.getDexterity());
    System.out.println("------------------");
  }

  // Game Over Message
  public void printGameOver(String winner) {
    System.out.println("Game Over!");
    System.out.println("Winner: " + winner);
  }

}
