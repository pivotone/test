package lab3.actor;

import lab3.equipment.Equipment;
import lab3.observer.PutOnObserver;
import lab3.observer.TakeOffObserver;
import lab3.observer.UsePerObserver;

import java.util.Vector;

//基础角色
public class SimpleActor {
    //基础角色的基础属性
    private static final int BASE_ATTACK = 100;
    private static final int BASE_DEFENSE = 46;
    private static final int BASE_HP = 600;
    private static final int BASE_PER = 0;
    private Equipment equipment;
    //脱下装备观察者
    private Vector<TakeOffObserver> takeOff;
    //穿上装备观察者
    private Vector<PutOnObserver> putOn;
    // 使用经验药水观察者
    private Vector<UsePerObserver> usePer;
    //总属性
    private int attack, defense, HP, Per; //攻击力，防御力，体力，经验值
    public SimpleActor(){
        equipment = null;
        attack = BASE_ATTACK;
        defense = BASE_DEFENSE;
        HP = BASE_HP;
        Per = BASE_PER;
        takeOff = new Vector<TakeOffObserver>();
        putOn = new Vector<PutOnObserver>();
        usePer = new Vector<UsePerObserver>();
    };

    //添加脱下装备观察者
    public void addTakeOffObserver(TakeOffObserver observer){
        takeOff.add(observer);
    }

    //移除脱下装备观察者
    public void removeTakeOffObserver(TakeOffObserver observer){
        takeOff.remove(observer);
    }

    //添加穿戴装备观察者
    public void addPutOnObserver(PutOnObserver observer){
        putOn.add(observer);
    }

    //移除穿戴装备观察者
    public void removePutOnObserver(PutOnObserver observer){
        putOn.remove(observer);
    }

    // 添加经验药水观察者
    public void addUsePerObserver(UsePerObserver observer){
        usePer.add(observer);
    }

    //移除经验药水观察者
    public void removeUsePerObserver(UsePerObserver observer){
        usePer.remove(observer);
    }

    //脱下装备
    public void takeOffEquipment(){
        if(equipment == null){
            return;
        }
        System.out.println("脱下装备，通知脱下装备-观察者");
        for(TakeOffObserver observer : takeOff){
            observer.equimentChange(this, this.equipment);
        }
    }

    //穿戴装备
    public void putOnEquipment(Equipment equipment){
        if(this.equipment != null){
            this.takeOffEquipment();
        }
        System.out.println("穿戴装备，通知穿戴装备-观察者");
        for(PutOnObserver observer : putOn){
            observer.equimentChange(this, equipment);
        }
    }

    //使用经验药水
    public void usePer(Equipment equipment){
        if(this.equipment != null){
            this.takeOffEquipment();
        }
        System.out.println("使用经验药水，通知经验药水-观察者");
        for(UsePerObserver observer : usePer){
            observer.equimentChange(this, equipment);
        }
    }

    //输出属性
    public void showAttr(){
        System.out.println("------------------\n惊雷剑圣：" +
                "\n\t攻击力：" + attack +
                "\n\t防御力：" + defense +
                "\n\t体力：" + HP +
                "\n\t经验：" + Per +
                "\n------------------");
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setPer(int Per) {
        this.Per = Per;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
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

    public Equipment getEquipment() {
        return equipment;
    }

}
