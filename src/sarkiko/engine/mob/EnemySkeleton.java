package sarkiko.engine.mob;

public class EnemySkeleton {

    public String name;
    public  int maxHp;
    public  int currentHp;
    public  int attack;
    public  int armor;
    public  int reward;
    public int questItem;

    public void info() {

        System.out.println(name);
        System.out.println("HP " + currentHp + " / " + maxHp);
        System.out.println("Attack " + attack);
        System.out.println("Defence " + armor);
    }

}
