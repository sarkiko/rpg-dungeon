import java.util.Scanner;

public class Tavern {
    Hero hero;


    QuestFactory questGenerator = new QuestFactory();

    public void enterTavern(Hero hero1) {
        hero = hero1;

        System.out.println(" ==== TAVERN ====");
        System.out.println(" ");
        System.out.println("1. Rest            =  6 gold\n2. Have dinner     = 10 gold\n3. Take quest");
        System.out.println(" \nYour gold: " + hero.money);
        System.out.println("4. Back");
        System.out.println("HP " + hero.currentHP + "/" + hero.manHP);
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a == 1) {
            buy(5);
        } else if (a == 2) {
            buy(6);
        } else if (a == 3) {
            takeQuest();
        }
        App.town();
    }

    private void takeQuest() {
        System.out.println(" ==== TAVERN ====");
        System.out.println("1. Убийство скелетов");
        System.out.println("2. Найти предателя среди грибов\n ");
        System.out.println("3. Back");
       // questCheck1();
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        Quest quest = null;
        quest = questGenerator.takeQuest(a);
        if (quest == null) {
            App.town();
        } else {
            hero.activeQuest = quest;
            System.out.println(quest.name);
            System.out.println(quest.description);
            System.out.println();

        }
    }

    public void questCheck1() {
        if (hero.quest1 >= 7) {
            System.out.println("1. Убийство скелетов [COMPLETE]");
        } else {
            System.out.println("1. Убийство скелетов");
        }
    }


    public void buy(int i) {
        int prise;
        if (i == 5) {
            prise = 6;
            if ((hero.money - prise) >= 0) {
                hero.money = (hero.money - prise);
                hero.currentHP = (hero.currentHP + 25);
                hero.hpCheck();
                System.out.println("You rested\nYour HP " + hero.currentHP + "/" + hero.manHP);
            } else {
                System.out.println("Not enough gold ");
            }
        } else if (i == 6) {
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
    }
}
