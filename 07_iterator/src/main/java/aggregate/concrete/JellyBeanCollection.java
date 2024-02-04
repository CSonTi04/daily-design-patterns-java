package aggregate.concrete;

import aggregate.CandyCollection;
import iterator.CandyIterator;
import iterator.concrete.ConcreteJellyBeanIterator;
import model.JellyBean;

import java.util.ArrayList;

/**
 * Concrete aggregate participant
 */
public class JellyBeanCollection implements CandyCollection<JellyBean> {
    private final ArrayList<JellyBean> items = new ArrayList<>();

    public CandyIterator<JellyBean> createIterator() {
        return new ConcreteJellyBeanIterator(this);
    }

    public int count() {
        return items.size();
    }

    public JellyBean get(int index) {
        return items.get(index);
    }

    public void add(JellyBean item) {
        items.add(item);
    }
}
