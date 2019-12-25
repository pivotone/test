package lab3.observer;

import lab3.actor.SimpleActor;
import lab3.equipment.Equipment;

public class TakeOffObserver implements EquipmentObserver{
    @Override
    public void equimentChange(SimpleActor actor, Equipment equipment) {
        System.out.println("脱下装备-观察者执行操作");
        //重新计算攻击力 防御力 HP MP
        actor.setAttack(actor.getAttack() - actor.getEquipment().getAttack());
        actor.setDefense(actor.getDefense() - actor.getEquipment().getAttack());
        actor.setHP(actor.getHP() - actor.getEquipment().getAttack());
        //脱下装备
        actor.setEquipment(null);
    }
}
