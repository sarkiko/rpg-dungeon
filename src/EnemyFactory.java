public class EnemyFactory {
    //з залежності від цифри А, буде вертати опредільонного врага
    public EnemySkeleton createEnemy(int a) {
        EnemySkeleton customEnemy= null;
        if (a == 0) {
            customEnemy=createSkeleton();
        } else if (a == 1) {
           customEnemy= createBossSkeleton();
        } else {
            customEnemy= createSkeleton();
        }
        return customEnemy;
    }

    public EnemySkeleton createSkeleton() {
        EnemySkeleton enemy = new EnemySkeleton();

        enemy.name = "Skeleton";
        enemy.maxHp = 20;
        enemy.currentHp = 20;
        enemy.attack = 2;
        enemy.armor = 0;
        enemy.reward = 4;
        enemy.questItem =0;
        return enemy;

    }

    public EnemySkeleton createBossSkeleton() {
        EnemySkeleton enemyBoss = new EnemySkeleton();

        enemyBoss.name = "Skeleton Lord";
        enemyBoss.maxHp = 200;
        enemyBoss.currentHp = 200;
        enemyBoss.attack = 10;
        enemyBoss.armor = 4;
        enemyBoss.reward = 49;
        return enemyBoss;

    }
}

