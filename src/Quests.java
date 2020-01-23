import java.util.Scanner;

public class Quests {
    //Quest 1 "Убийство скелетов" (kill 5 skeleton) 0/5 (с скелетов собрать черепа?)
    //Quest 2 "Убить предателя" (в глубине где-то на 3м уровне подземелий спрятался предатель, убей)
    // а: убить +1атак +1армор б: не убивать и передать посылку бате в таверну, цены на отдых и исцеление -20% и +100 золота)
    public void quest1(Hero hero, Dungeon1 dungeon) {
        if (hero.quest1 <= 5&& hero.quest1>=1) {
            System.out.println("Нет, это недостаточно, приниси мне не меньше 5ти черепов!");
           // App.tavern(hero, dungeon);
        } else if(hero.quest1>=6){
            System.out.println("===QUEST COMPLETE===");
            System.out.println("Олично, думаю теперь я могу деть тебе немного наших припасов в качестве награды");
            System.out.println("Вы получили 100 золота, 2 Бомбы, 3 Баночки лечения");
            hero.quest1=(hero.quest1+1);
            hero.money=(hero.money+100);
            hero.potions=(hero.potions+3);
            hero.bomb=(hero.bomb+2);
            //App.tavern(hero, dungeon);

        } else if(hero.quest1 ==0) {
            System.out.println("Убийство скелетов\n ");
            System.out.println("В последнее вермя участились вылазки скелетов, у нас все больше пострадавших. " +
                    "Нужно что бы  ты немого уменьшил их популяцыю, 5 штук будет достаточно, в качестве доказательств принеси их черепа");
            System.out.println(" \n1. Принять задание         2. Назад");
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            if (a == 1) {
                hero.quest1 = 1;
                System.out.println("===КВЕСТ ПРИНЯТ===\nОтправляйся в и принеси мне 5 черепов");
                //App.tavern(hero, dungeon);
            } else {
                //App.tavern(hero, dungeon);
            }


        }else if(hero.quest1 >=7){
            System.out.println("Это задание уже пройдено");
            //App.tavern(hero, dungeon);
        }
    }

    public void quest2() {

    }
}
