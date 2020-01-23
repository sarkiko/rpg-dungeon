public class QuestFactory {

    public Quest takeQuest(int a) {
        //перше це тіп даних сложний або простий
        //друге: після "тіпа" іде назва перемоної (люба назва з маленької букви, переменна може включати в себе ІНТ СТРІНГ і другі методи)
        // Тіп і перменна пишется тільки як аргументи метода (например: public static void town(Hero hero){})
        // при визові метода пишется тільки назва переменної, без типу (прімер: town(hero);)
        Quest quest = null;
        if (a == 1) {
            quest = createQuest1();
        } else if (a == 2) {
            quest = createQuest2();
        }
        return quest;
    }

    public Quest createQuest1() {
        Quest quest = new Quest();
        quest.name = "Убийство скелетов\n ";
        quest.description = "В последнее вермя участились вылазки скелетов, у нас все больше пострадавших. \n" +
                "Нужно что бы  ты немого уменьшил их популяцыю, 5 штук будет достаточно, в качестве доказательств принеси их черепа";
        quest.reward = 200;
        return quest;
    }

    public Quest createQuest2() {
        Quest quest = new Quest();
        quest.name = "Сбор грибов\n ";
        quest.description = "В последнее вермя участились вылазки грибов, у нас все больше пострадавших. \n" +
                "Нужно что бы  ты немого уменьшил их популяцыю, 5 штук будет достаточно, в качестве доказательств принеси их шапочки";
        quest.reward = 300;
        return quest;
    }
}
