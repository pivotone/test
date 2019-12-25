package actor;

public class Witch implements Actor{
    @Override
    public void showJob(){
        System.out.println("职业-卧龙军师");
    }

    @Override
    public String showEquipment() {
        return "武器： 羽扇\n防具： 七星法袍\n";
    }
}
