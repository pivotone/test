package actor;

public abstract class Equipment implements Actor{
    protected Actor actor;
    public Equipment(Actor actor){
        this.actor = actor;
    }
}
