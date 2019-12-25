package lab3.observer;

import lab3.actor.SimpleActor;
import lab3.equipment.Equipment;

public class UsePerObserver implements EquipmentObserver {
    @Override
    public void equimentChange(SimpleActor actor, Equipment equipment) {
        System.out.println("经验药水-观察者执行操作");
        actor.setPer(actor.getPer() + equipment.getPer());
    }
}
