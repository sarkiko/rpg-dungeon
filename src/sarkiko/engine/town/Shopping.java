package sarkiko.engine.town;

import sarkiko.App;
import sarkiko.engine.player.Hero;

import java.util.Scanner;

public class Shopping {
    public Hero hero;


    public Shopping(Hero hero){
        this.hero=hero;
    }


    public  void shop(Hero hero) {
        this.hero = hero;
        System.out.println(" ==== SHOPE ====");
        System.out.println(" ");
        System.out.println("1. Healing potion =  7 gold\n2. Black bomb     = 12 gold\n3. Armor potion   = 11 gold\n4. Attack potion  = 15 gold");
        System.out.println(" \nYour gold: " + hero.money);
        System.out.println("5. Back");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a == 1) {
            buy(1);
        } else if (a == 2) {
            buy(2);
        } else if (a == 3) {
            buy(3);
        } else if (a == 4) {
            buy(4);
        } else App.town();
    }

    public  void buy( int i) {
        int prise;
        if (i == 1) {
            prise = 7;
            if ((hero.money - prise) >= 0) {
                hero.money = (hero.money - prise);
                hero.potions = (hero.potions + 1);
                System.out.println("You buy 1 healing potion\nCurrent Healing Potion:" + hero.potions);
            } else {
                System.out.println("Not enough gold ");
            }

        } else if (i == 2) {
            prise = 12;
            if ((hero.money - prise) >= 0) {
                hero.money = (hero.money - prise);
                hero.bomb = (hero.bomb + 1);
                System.out.println("You buy 1 Black bomb\nCurrent Bombs:" + hero.bomb);
            } else {
                System.out.println("Not enough gold ");
            }

        } else if (i == 3) {
            prise = 11;
            if ((hero.money - prise) >= 0) {
                hero.money = (hero.money - prise);
                hero.attackPotion = (hero.attackPotion + 1);
                System.out.println("You buy 1 Attack potion\nCurrent Attack potion:" + hero.attackPotion);
            } else {
                System.out.println("Not enough gold ");
            }
        } else if (i == 4) {
            prise = 15;
            if ((hero.money - prise) >= 0) {
                hero.money = (hero.money - prise);
                hero.armorPotion = (hero.armorPotion + 1);
                System.out.println("You buy 1 Armor potion\nCurrent Armor potion:" + hero.armorPotion);
            } else {
                System.out.println("Not enough gold ");
            }
        } else if (i == 7) {
            prise = (10 * hero.attack) / 2 + 4;
            if ((hero.money - prise) >= 0) {
                hero.money = (hero.money - prise);
                hero.attack = (hero.attack + 1);
                System.out.println("blacksmith sharpened your weapons");

            } else {
                System.out.println("Not enough gold ");
            }
        } else if (i == 8) {
            prise = (9 * hero.armor) / 2 + 3;
            if ((hero.money - prise) >= 0) {
                hero.money = (hero.money - prise);
                hero.armor = (hero.armor + 1);
                System.out.println("blacksmith sharpened your armor");
            } else {
                System.out.println("Not enough gold ");
            }

        }
    }


    public  void blacksmith(Hero hero) {
        this.hero = hero;
        System.out.println(" ==== BLACKSMITH ====");
        System.out.println(" ");
        System.out.println("1. Upgrade weapon         = " + ((10 * hero.attack) / 2 + 4) + " gold");
        System.out.println("2. Upgrade armor          = " + ((9 * hero.armor) / 2 + 4) + " gold");
        System.out.println(" \nYour gold: " + hero.money);
        System.out.println("Attack =  " + hero.attack);
        System.out.println("Armor  =  " + hero.armor);
        System.out.println("3. Back");

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a == 1) {
            buy(7);
        } else if (a == 2) {
            buy(8);
        }
        App.town();
    }
}