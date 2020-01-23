import java.util.Scanner;

public class Dungeon1 {
    int rooms = 5; // TODO потом зробити з ним шось
    int clearRooms = 0;
    EnemySkeleton enemy;
    Hero hero;
    EnemyFactory factory = new EnemyFactory();

    //цей метод сохранає інфо про класс НЕРО внутрі другого класу (цього)
    public void createDungeon(Hero a) {
        hero = a;
    }


    public void enterDungeon() {
        position();
        System.out.println("[    ]--[ ☠ ]--[ ☠ ]--[ ✉ ]--[BOSS]--[EXIT]");
        System.out.println(" ");
        System.out.println("1.Move forward    2.Escape from dungeon");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a == 1) {
            clearRooms = clearRooms + 1;
            createEnemy();
            encounter();
        } else {
            clearRooms = 0;
            enemy.currentHp = (enemy.maxHp);
            App.town();
        }
    }

    public void createEnemy() {
        if (clearRooms == 4) {
            enemy = factory.createEnemy(1);
        } else {
            enemy = factory.createEnemy(0);
        }
    }

    public void position() {
        if (clearRooms == 0) {
            System.out.println("  YOU");
            System.out.println("   ↓");
        } else if (clearRooms == 1) {
            System.out.println("         YOU");
            System.out.println("          ↓");
        } else if (clearRooms == 2) {
            System.out.println("                YOU");
            System.out.println("                 ↓");
        } else if (clearRooms == 3) {
            System.out.println("                         YOU");
            System.out.println("                          ↓");
        } else if (clearRooms == 4) {
            System.out.println("                                   YOU");
            System.out.println("                                    ↓");
        } else {
            System.out.println("====CONGRATULATIONS====");
            System.out.println("== dungeon  complete ==");
        }
    }

    public void encounter() {
        if (clearRooms == 1) {
            System.out.println("Enemy ahead");
            checkBeforeBattle();
        } else if (clearRooms == 2) {
            System.out.println("Enemy ahead");
            enemy.currentHp = enemy.maxHp;
            checkBeforeBattle();
        } else if (clearRooms == 3) {
            System.out.println("You find chest");
            hero.money = (hero.money + 13);
            hero.potions = (hero.potions + 2);
            System.out.println(" ");
            System.out.println("you take 13 gold and 2 Healing potion");
            enterDungeon();
        } else if (clearRooms == 4) {
            System.out.println("dangerous enemy ahead");
            enemy.currentHp = enemy.maxHp;
            checkBeforeBattle();
        } else {
            System.out.println("====CONGRATULATIONS====");
            System.out.println("== dungeon  complete ==");
            App.town();
        }


    }
    public void checkBeforeBattle(){
        if (enemy.currentHp > 0) {
            enemy.info();
            battle();
        } else {
            enterDungeon();
        }
    }


    public void battle() {
        System.out.println("          Your HP " + hero.currentHP + " / " + hero.manHP);
        System.out.println("1. Attack " + enemy.name + "     2.Use item      3.Escape");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a == 1) {
            attackHero();
        } else if (a == 2) {
            useItems();

        } else {
            System.out.println("You escape from dungeon");
            clearRooms = 0;
            enemy.currentHp = (enemy.maxHp);
            App.town();
        }

    }

    public void useItems() {
        System.out.println("           Choose item");
        System.out.println("          Your HP " + hero.currentHP + " / " + hero.manHP);
        System.out.println("1. Healing potions: " + hero.potions + "   2. Black bombs: " + hero.bomb + "   3. Attack potions: " + hero.attackPotion + "   4. Armor potion: " + hero.armorPotion);
        System.out.println("5. Cancel");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a == 1) {
            if (hero.potions <= 0) {
                System.out.println("No item");
                battle();
            } else {
                hero.potions = (hero.potions - 1);
                System.out.println("You drink Healing potion and restore 15 HP");
                if ((hero.currentHP + 15) <= hero.manHP) {
                    hero.currentHP = (hero.currentHP + 15);
                } else {
                    hero.currentHP = hero.manHP;
                }
            }
            battle();
        } else if (a == 2) {
            if (hero.bomb <= 0) {
                System.out.println("No item");
                battle();
            } else {
                hero.bomb = (hero.bomb - 1);
                System.out.println("You throw bomb and deal 13 DMG");
                enemy.currentHp = (enemy.currentHp - 13);

                if (enemy.currentHp >= 0) {
                    enemy.info();
                    battle();
                } else {
                    System.out.println("Enemy defeated");
                    hero.money = (hero.money + enemy.reward);
                    System.out.println("You earned " + enemy.reward + " gold");
                    enterDungeon();
                }
            }
        } else {
            battle();
        }
    }

    public void attackHero() {
        int attack = 0;
        if (enemy.attack <= hero.armor) {
            attack = 1;
        } else {
            attack = (enemy.attack);
        }

        System.out.println("You hit enemy " + enemy.name + " and deal " + hero.attack + " damage");
        System.out.println(" ");
        if (enemy.armor >= hero.attack) {
            enemy.currentHp = (enemy.currentHp - 1);
        } else {
            enemy.currentHp = (enemy.currentHp - hero.attack);
        }
        enemy.currentHp = (enemy.currentHp - hero.attack);
        if (enemy.currentHp <= 0) {
            System.out.println("Enemy defeated");
            hero.money = (hero.money + enemy.reward);
            hero.quest1=(hero.quest1+enemy.questItem);
            System.out.println("You earned " + enemy.reward + " gold");
            enterDungeon();
        } else {
            System.out.println(enemy.name + " hit you for " + attack + " damage");
            System.out.println(" ");
            if (hero.armor >= enemy.attack) {
                hero.currentHP = (hero.currentHP - 1);
            } else {
                hero.currentHP = (hero.currentHP - (enemy.attack - hero.armor));
            }
            if (hero.currentHP <= 0) {
                System.out.println("YOU DEFEATED");
                hero.currentHP = 20;
                App.town();
            } else {
                enemy.info();

                battle();
            }
        }

    }
}
