package lab1;

public abstract class Factory {
    //制造披萨
    public abstract Pizza pizzaCreate (int redius);
    //制造面条
    public abstract Noddle noddleCreate (String num);
}
