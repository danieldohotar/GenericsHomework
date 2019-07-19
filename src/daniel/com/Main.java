package daniel.com;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sorted repo example: ");
        sort();

        System.out.println("");
        System.out.println("Ordered repo example: ");
        ordered();
    }

    private static void sort() {

        IRepository<Character> sorted = new SortedRepository<>();

        sorted.save('b');
        sorted.save('k');
        sorted.save('a');
        sorted.save('f');
        sorted.save('s');

        sorted.listAll();
        sorted.remove('b');
        sorted.count();
    }

    private static void ordered() {

        IRepository<String> ordered = new OrderedRepository<>();

        ordered.save("Mere");
        ordered.save("Lapte");
        ordered.save("Paine");
        ordered.save("Gutui");
        ordered.save("Oua");

        ordered.listAll();
        ordered.remove("Lapte");
        ordered.count();
    }
}
