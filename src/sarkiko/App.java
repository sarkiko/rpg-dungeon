package sarkiko;

import sarkiko.engine.dungeon.Dungeon1;
import sarkiko.engine.player.Hero;
import sarkiko.engine.town.Shopping;
import sarkiko.engine.town.Tavern;

import java.util.Scanner;

public class App {
    static Hero hero = new Hero();
    static Tavern tavern = new Tavern(hero);
    static Dungeon1 dungeon = new Dungeon1(hero);
    static Shopping shopping = new Shopping(hero);

    public static void main(String[] args) {
        System.out.println("              DUNGEON");
        System.out.println(" ");
        System.out.println(
                "──────────────────────────────────────\n" +
                        "──────────────────────────────────────\n" +
                        "──────────────────────────────────────\n" +
                        "──────────────────────────────────────\n" +
                        "─▓▓▓▓▓▓────────────────────▓▓▓▓───────\n" +
                        "▓▓▓▓▓▓▓▓▓────────────────▓▓▓▓▓▓▓▓─────\n" +
                        "▓▓▓▓▓▓▓▓▓▓▓───────────▓▓▓▓▓▓▓▓▓▓▓▓▓▓─\n" +
                        "▓▓▓▓▓▓▓▓▓▓▓▓▓───────▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                        "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓────▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                        "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓─▓▓▓▓──▓▓──▓▓──▓▓▓▓▓▓▓▓▓▓\n" +
                        "▓▓▓▓▓▓▓▓▓▓▓▓▓─────▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                        "▓▓▓▓▓▓▓▓─▓─▓▓─────▓▓▓▓▓───▓▓▓▓▓▓▓─▓─▓▓▓\n" +
                        "▓▓───▓▓▓▓▓▓▓▓────▓▓▓▓▓▓───▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                        "▓▓───▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                        "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n");


        characterCreator(hero);
        hero.heroInfo();
        System.out.println(" \n \n \n ");

        infinity();
    }

    public static void town() {
        System.out.println();
        System.out.println();
        System.out.println(" ==== VILLAGE ====");
        System.out.println();
        System.out.println("1. Shop\n2. Blacksmith\n3. Tavern");
        System.out.println(" \n ");
        System.out.println("4. Inventory");
        System.out.println();
        System.out.println("5. Leave village");
        Scanner in = new Scanner(System.in);
        int vibor = in.nextInt();
        if (vibor == 1) {
            shopping.shop(hero);
        } else if (vibor == 2) {
            shopping.blacksmith(hero);
        } else if (vibor == 3) {
            tavern.enterTavern();
        } else if (vibor == 4) {
            hero.info();
        } else if (vibor == 5) {
            System.out.println("===You enter the darkness===");
            dungeon.enterDungeon();
        }
    }

    public static void characterCreator(Hero hero) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.nextLine();
        hero.name = name;
    }

    public static void infinity() {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println();
            System.out.println("Press any key to continue...");
            in.nextLine();
            town();
        }

    }

}
