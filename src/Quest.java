public class Quest {
    String name;
    String description;
    int reward;
    boolean isCompleted = false;
    QuestStatistic statistic;

    public void addProgress() {
        statistic.progress = statistic.progress + 1;
        checkQuest();
    }

    public void checkQuest() {
        if (statistic.progress == statistic.complete) {
            isCompleted = true;
        }

    }

}
