package visitor;

import element.Element;
/**
 * Visitor participant
 */
public interface Visitor {
    void visit(Element element);
}
