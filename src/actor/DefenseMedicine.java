package actor;

public class DefenseMedicine extends Equipment {
    public DefenseMedicine(Actor actor){
        super(actor);
    }

    // 展示职业
    @Override
    public void showJob() {
        actor.showJob();
    }

    // 强化防具
    @Override
    public String showEquipment() {
        return actor.showEquipment()+ "防具等级 + 1  \t 防御力 + 5\n";
    }
}
