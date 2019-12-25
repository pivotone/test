package actor;

public class AttackMedicine extends Equipment {
    public AttackMedicine(Actor actor){
        super(actor);
    }

    // 展示职业
    @Override
    public void showJob() {
        actor.showJob();
    }

    // 强化攻击装备
    @Override
    public String showEquipment() {
        return actor.showEquipment()+ "武器等级 + 1  \t 攻击力 + 10\n";
    }
}