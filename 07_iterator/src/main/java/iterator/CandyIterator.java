package iterator;


/**
 * Iterator participant
 */

//Truth to be told, T should be a class, that extends Candy
public interface CandyIterator<T> {

    T first();

    T next();

    boolean isDone();

    T current();
}
