package daniel.com;

import java.util.*;

public class SortedRepository<T> implements IRepository<T> {

    Set<T> listT = new TreeSet<>();

    @Override
    public void save(T obj) {
        listT.add(obj);
    }

    @Override
    public void remove(T obj) {
        listT.remove(obj);
        System.out.println("The removed element was: " + obj);
    }

    @Override
    public int count() {

        System.out.println("The size of the treeSet is " + listT.size());
        return listT.size();

    }

    @Override
    public Set<T> listAll() {
        for (T num : listT) {
            System.out.println(num);

        }
        return listT;
    }

    @Override
    public String toString() {
        return
                "listT= " + listT.toString();

    }
}
