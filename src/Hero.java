public class Hero {
    String name;
    int manHP = 80;
    int currentHP = 40;
    int potionPower = 30;
    int armor = 1;
    int attack = 3;

    //inventory
    int attackPotion = 0;
    int potions = 0;
    int armorPotion = 0;
    int bomb = 4;

    //Quests
    int quest1 =0;
    int quest2 = 0;
    Quest activeQuest;


    int money = 212;

    public  void hpCheck() {
        if (currentHP > manHP) {
            currentHP = manHP;
        }
    }

    public void info() {
        System.out.println("  Gold = "+money+"       HP "+currentHP+"/"+manHP);
        System.out.println("Healing potion = " + potions+"   Attack potions = "+attackPotion+"   Armor potion = "+armorPotion+"   Bombs = "+bomb);
    }
}
