package observer;

import subject.Veggies;

/*
 * Observer participant
 */
public interface Restaurant {
    void update(Veggies veggies);
}
