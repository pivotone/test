package lab3.test;

import lab3.equipment.Equipment;
import lab3.actor.SimpleActor;
import lab3.observer.PutOnObserver;
import lab3.observer.TakeOffObserver;
import lab3.observer.UsePerObserver;

public class Test {
    public static void main(String[] args) {
        SimpleActor actor = new SimpleActor();
        //添加穿戴装备观察者
        actor.addPutOnObserver(new PutOnObserver());
        //添加脱下装备观察者
        actor.addTakeOffObserver(new TakeOffObserver());
        // 添加经验药水观察者
        actor.addUsePerObserver(new UsePerObserver());
        //输出角色信息
        actor.showAttr();
        //装备创建、穿戴、输出角色信息
        Equipment equipment = new Equipment(50,40,200,0,"新手套装");
        actor.putOnEquipment(equipment);
        actor.showAttr();
        //新装备创建、更换、输出角色信息
        Equipment equipment1 = new Equipment(100,70,350,0,"进阶套装");
        actor.putOnEquipment(equipment1);
        actor.showAttr();

        // 使用经验药水
        Equipment equipment2 = new Equipment(0,0,0,100,"小经验药水");
        actor.usePer(equipment2);
        actor.showAttr();

    }
}
