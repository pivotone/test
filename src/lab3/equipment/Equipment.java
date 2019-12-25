package lab3.equipment;

public class Equipment {
    private int attack, defense, HP, Per;
    private String name;

    public Equipment(int attack, int defense, int HP, int Per, String name) {
        this.attack = attack;
        this.defense = defense;
        this.HP = HP;
        this.Per = Per;
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getHP() {
        return HP;
    }

    public int getPer() {
        return Per;
    }

    public String getName() {
        return name;
    }
}
