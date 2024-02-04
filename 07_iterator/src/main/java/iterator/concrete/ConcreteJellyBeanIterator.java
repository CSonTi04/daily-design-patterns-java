package iterator.concrete;

import aggregate.concrete.JellyBeanCollection;
import iterator.CandyIterator;
import model.JellyBean;

/**
 * Concrete iterator participant
 */
public class ConcreteJellyBeanIterator implements CandyIterator<JellyBean> {

    private final JellyBeanCollection jellyBeanCollection;
    private int current = 0;
    private final int step = 1;

    public ConcreteJellyBeanIterator(JellyBeanCollection jellyBeanCollection) {
        this.jellyBeanCollection = jellyBeanCollection;
    }

    @Override
    public JellyBean first() {
        this.current = 0;
        return this.jellyBeanCollection.get(this.current);
    }

    @Override
    public JellyBean next() {
        this.current += this.step;
        if (!this.isDone()) {
            return this.jellyBeanCollection.get(this.current);
        }
        return null;
    }

    @Override
    public boolean isDone() {
        return this.current >= this.jellyBeanCollection.count();
    }

    @Override
    public JellyBean current() {
        return this.jellyBeanCollection.get(this.current);
    }
}
