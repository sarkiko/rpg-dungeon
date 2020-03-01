package sarkiko.engine.quest;

public class Quest {
    public String name;
    public String description;
    public int reward;
    public int questID;
    public boolean isCompleted = false;
    public QuestStatistic statistic;

    public void addProgress() {
        statistic.progress = statistic.progress + 1;
        System.out.print(name + " : ");
        System.out.println( statistic.progress+" / "+statistic.toComplete);
        checkQuest();
    }

    public void checkQuest() {
        if (statistic.progress == statistic.toComplete) {
            isCompleted = true;
            System.out.println("===QUEST COMPLETE===");
        }

    }


}
