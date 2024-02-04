package prototype;

/**
 * Prototype participant, which is the interface for cloning itself
 */
public abstract class SandwichPrototype implements Cloneable{
    public abstract SandwichPrototype cloneSandwich() throws CloneNotSupportedException;
}
