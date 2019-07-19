package daniel.com;

import java.util.LinkedHashSet;
import java.util.Set;

public class OrderedRepository<T> implements IRepository<T> {

    Set<T> linkedHash = new LinkedHashSet<>();

    @Override
    public void save(T obj) {
        linkedHash.add(obj);

    }

    @Override
    public void remove(T obj) {
        linkedHash.remove(obj);
        System.out.println("The removed element was: " + obj);

    }

    @Override
    public int count() {
        System.out.println("The size of the LinkedHashSet is: " + linkedHash.size());
        return 0;
    }

    @Override
    public Set<T> listAll() {
        for (T num : linkedHash) {
            System.out.println(num);

        }
        return linkedHash;
    }
}
