import java.util.Scanner;

public class App {
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

        Hero hero = new Hero();

        Dungeon1 dungeon = new Dungeon1();
        dungeon.createDungeon(hero);
        characterCreaton(hero);
        mainMenu(hero);
        System.out.println(" \n \n \n ");



        infinity(hero,dungeon);

    }

    public static void town(Hero hero,Dungeon1 dungeon) {

        System.out.println(" ==== VILLAGE ====");
        System.out.println(" ");
        System.out.println("1. Shop\n2. Blacksmith\n3. Tavern");
        System.out.println(" \n ");
        System.out.println("4. Inventory");
        System.out.println(" ");
        System.out.println("5. Leave village");
        Scanner in = new Scanner(System.in);
        int vibor = in.nextInt();
        if (vibor == 1) {
            shop(hero,dungeon);
        } else if (vibor == 2) {
           blacksmith(hero,dungeon);
        } else if (vibor == 3) {
            tavern(hero,dungeon);
        } else if (vibor == 4) {
            hero.info();
        } else if (vibor == 5) {
            System.out.println("===You enter the darkness===");
            dungeon.enterDungeon();
//            dungeonChoose();
        }


    }

    public static void shop(Hero hero,Dungeon1 dungeon) {
        System.out.println(" ==== SHOPE ====");
        System.out.println(" ");
        System.out.println("1. Healing potion =  7 gold\n2. Black bomb     = 12 gold\n3. Armor potion   = 11 gold\n4. Attack potion  = 15 gold");
        System.out.println(" \nYour gold: " + hero.money);
        System.out.println("5. Back");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a == 1) {
            buy(hero, 1);
        } else if (a == 2) {
            buy(hero, 2);
        } else if (a == 3) {
            buy(hero, 3);
        } else if (a == 4) {
            buy(hero, 4);
        } else town(hero,dungeon);

    }

    public static void buy(Hero hero, int i) {
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
        } else if (i == 5) {
            prise = 6;
            if ((hero.money - prise) >= 0) {
                hero.money = (hero.money - prise);
                hero.currentHP = (hero.currentHP + 25);
                hpCheck(hero);
                System.out.println("You rested\nYour HP " + hero.currentHP + "/" + hero.manHP);
            } else {
                System.out.println("Not enough gold ");
            }
        }

            else if (i == 6) {
                prise = 10;
                if ((hero.money - prise) >= 0) {
                    hero.money = (hero.money - prise);
                    hero.manHP = (hero.manHP + 8);
                    hero.currentHP = (hero.currentHP + 8);
                    System.out.println("You have dinner\nYour max HP increased " + hero.currentHP + "/" + hero.manHP);

                } else {
                    System.out.println("Not enough gold ");
                }

            }
        else if (i == 7) {
            prise = (10*hero.attack)/2+4;
            if ((hero.money - prise) >= 0) {
                hero.money = (hero.money - prise);
                hero.attack = (hero.attack + 1);
                System.out.println("blacksmith sharpened your weapons");

            } else {
                System.out.println("Not enough gold ");
            }

        }
        else if (i == 8) {
            prise = (9*hero.armor)/2+3;
            if ((hero.money - prise) >= 0) {
                hero.money = (hero.money - prise);
                hero.armor = (hero.armor + 1);
                System.out.println("blacksmith sharpened your armor");

            } else {
                System.out.println("Not enough gold ");
            }

        }
        }


    public static void tavern(Hero hero,Dungeon1 dungeon) {
        System.out.println(" ==== TAVERN ====");
        System.out.println(" ");
        System.out.println("1. Rest            =  6 gold\n2. Have dinner     = 10 gold");
        System.out.println(" \nYour gold: " + hero.money);
        System.out.println("3. Back");
        System.out.println("HP "+hero.currentHP +"/"+ hero.manHP);
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a == 1) {
            buy(hero, 5);
        } else if (a == 2) {
            buy(hero, 6);
        }
        town(hero, dungeon);
    }

    private static void hpCheck(Hero hero) {
        if (hero.currentHP > hero.manHP) {
            hero.currentHP = (hero.manHP);
        }

    }

    public static void blacksmith(Hero hero,Dungeon1 dungeon){
        System.out.println(" ==== BLACKSMITH ====");
        System.out.println(" ");
        System.out.println("1. Upgrade weapon         = "+((10*hero.attack)/2+4)+" gold");
        System.out.println("2. Upgrade armor          = "+((9*hero.armor)/2+4)+" gold");
        System.out.println(" \nYour gold: " + hero.money);
        System.out.println("Attack =  "+hero.attack);
        System.out.println("Armor  =  "+hero.armor);
        System.out.println("3. Back");

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a == 1) {
            buy(hero, 7);
        } else if (a == 2) {
            buy(hero, 8);
        }
        town(hero, dungeon);
    }
    public static void characterCreaton(Hero hero) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.nextLine();

        hero.name = name;

    }

    public static void mainMenu(Hero hero) {
        System.out.println(hero.name);
        System.out.println("HP " + hero.currentHP + " / " + hero.manHP);
        System.out.println("Attack " + hero.attack);
        System.out.println("Money: " + hero.money);

    }

    public static void infinity(Hero hero,Dungeon1 dungeon) {
        while (true) {
            town(hero, dungeon);
        }

    }

}
