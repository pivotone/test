package lab3.observer;

import lab3.actor.SimpleActor;
import lab3.equipment.Equipment;

public class PutOnObserver implements EquipmentObserver{
    @Override
    public void equimentChange(SimpleActor actor, Equipment equipment) {
        System.out.println("穿戴装备-观察者执行操作");
        //穿戴上装备
        actor.setEquipment(equipment);
        //重新计算攻击力 防御力 HP
        actor.setAttack(actor.getAttack() + equipment.getAttack());
        actor.setDefense(actor.getDefense() + equipment.getAttack());
        actor.setHP(actor.getHP() + equipment.getAttack());
    }
}
