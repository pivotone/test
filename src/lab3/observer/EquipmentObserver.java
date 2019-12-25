package lab3.observer;

import lab3.actor.SimpleActor;
import lab3.equipment.Equipment;

public interface EquipmentObserver {
    void equimentChange(SimpleActor actor, Equipment equipment);
}
