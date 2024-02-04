package aggregate;

import iterator.CandyIterator;

/**
 * Aggregate participant
 */
public interface CandyCollection<T> {
    CandyIterator<T> createIterator();
}
