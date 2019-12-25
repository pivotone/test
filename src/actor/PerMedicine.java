package actor;

public class PerMedicine extends Equipment {
    public PerMedicine(Actor actor){
        super(actor);
    }

    // 展示职业
    @Override
    public void showJob() {
        actor.showJob();
    }

    // 使用经验药水
    @Override
    public String showEquipment() {
        return actor.showEquipment() + "使用经验瓶  \t 经验 + 50\n";
    }
}
