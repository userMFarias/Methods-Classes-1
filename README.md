# Methods-Classes-1
 Suppose that you are tasked with programming a little game in which the player
travels a fantastic world defeating monsters and collecting items. You are provided with a class
Item, a class Monster, and a class Hero. The classes Monster and Hero are incomplete, and so is
the main method. You need to complete the following tasks
1. Create a method for the class monster called dropSpear that creates a new object of class
Item, with name “Spear”, offense 10, and defense 3. After the item is created, dropSpear
should return the item.
2. Create a method addItem to the class Hero, that takes as input an object of class Item and
adds it to the array list items present in the class Hero (remember you can add elements to
an array list by using the method add(element E)).
3. In the main method, construct an object of class Monster called monster, an object of class
Hero called hero, call the method dropSpear from the class monster, store the return value in
a variable item of class Item, and call the method addItem with item as a parameter.

import java.util.ArrayList;
public class Exercise1
{
  public static void main(String[] args)
  {
    // (part 3) your code goes here
  }
}

class Item
{
    private String name; // name of the item
    private int attack; // attack value of the item
    private int defense; //defense value of the item

    // constructor taking name, attack value and defense value of the item

  public Item(String name, int attack, int defense)
  {
      this.name = name;
      this.attack = attack;
      this.defense = defense;
  }
}

class Monster
{
    // (part 1) your code goes here
}

class Hero
{
    private int health;
    private int goldcoins;
    private ArrayList<Item> items;

  public Hero()
  {
      this.health = 20;
      this.goldcoins = 50;
      this.items = new ArrayList<Item>();
  }

    // (part 2) your code goes here
}
