package entrypoint;

import aggregate.concrete.JellyBeanCollection;
import iterator.CandyIterator;
import model.JellyBean;

public class Program {
    public static void main(String[] args) {
        JellyBeanCollection jellyBeanCollection = new JellyBeanCollection();
        jellyBeanCollection.add(new JellyBean("Cherry"));
        jellyBeanCollection.add(new JellyBean("Bubble Gum"));
        jellyBeanCollection.add(new JellyBean("Root Beer"));
        jellyBeanCollection.add(new JellyBean("French Vanilla"));
        jellyBeanCollection.add(new JellyBean("Licorice"));
        jellyBeanCollection.add(new JellyBean("Buttered Popcorn"));
        jellyBeanCollection.add(new JellyBean("Juicy Pear"));
        jellyBeanCollection.add(new JellyBean("Cinnamon"));
        jellyBeanCollection.add(new JellyBean("Coconut"));

        CandyIterator<JellyBean> iterator = jellyBeanCollection.createIterator();
        System.out.println("Gimmie all the jelly beans!");

        for (JellyBean item = iterator.first(); !iterator.isDone(); item = iterator.next()) {
            System.out.println(item.flavour());
            //this works too
            //System.out.println(iterator.current().flavour());
        }
    }
}
