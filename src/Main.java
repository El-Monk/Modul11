import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Lada");
        list.add("Audi");
        list.add("Porshe");
        list.add("BMW");
        list.add("Toyota");

        System.out.println(list);

        list.add(1,"Suzuki");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);
    }
}
