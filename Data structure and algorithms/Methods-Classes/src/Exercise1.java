import java.util.ArrayList;
public class Exercise1
{
    public static void main(String [] args)
    {
        Monster monster = new Monster ();
        Hero hero = new Hero ();
        // The method dropSpear is called from monster
        // and the return value stored in item
        Item item = monster.dropSpear ();
        // The method addItem adds the spear to the hero ’s array list items
        hero.addItem(item);

    }

}

class Hero

{
    private int health;
    private int goldcoins;
    private ArrayList <Item > items;
    public Hero ()
    {
        this.health = 20;
        this.goldcoins = 50;
        this.items = new ArrayList <Item >();

    }
    public void addItem(Item item)
    {
        this.items.add(item);
    }
}

class Item
{
    private String name;
    private int attack;
    private int defense;
    public Item(String name , int attack , int defense)
    {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
    }
}
class Monster
{
    public Item dropSpear ()
    {
        Item item = new Item("spear", 10, 3);
        return item;

    }
}
