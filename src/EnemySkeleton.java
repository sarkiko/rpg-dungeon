public class EnemySkeleton {

    String name;
    int maxHp;
    int currentHp;
    int attack;
    int armor;
    int reward;
    int questItem;

    public void info() {

        System.out.println(name);
        System.out.println("HP " + currentHp + " / " + maxHp);
        System.out.println("Attack " + attack);
        System.out.println("Defence " + armor);
    }

}
