package element;

import visitor.Visitor;

/**
 * The Element participant, defines an accept operation that takes a visitor as an argument.
 */
public abstract class Element {
    public abstract void accept(Visitor visitor);
}
