package sarkiko.engine.player;


import sarkiko.engine.quest.Quest;

public class Hero {
    public String name;
    public int manHP = 80;
    public int currentHP = 40;
    public int potionPower = 30;
    public int armor = 1;
    public int attack = 23;

    //inventory
    //TODO винести в отдельний класс
    public int attackPotion = 0;
    public int potions = 0;
    public int armorPotion = 0;
    public int bomb = 4;


    public Quest activeQuest;


    public int money = 212;

    public void hpCheck() {
        if (currentHP > manHP) {
            currentHP = manHP;
        }
    }

    public void info() {
        System.out.println("  Gold = " + money + "       HP " + currentHP + "/" + manHP);
        System.out.println("Healing potion = " + potions + "   Attack potions = " + attackPotion + "   Armor potion = " + armorPotion + "   Bombs = " + bomb);
    }

    public void heroInfo() {
        System.out.println(name);
        System.out.println("HP " + currentHP + " / " + manHP);
        System.out.println("Attack " + attack);
        System.out.println("Money: " + money);
    }
}
