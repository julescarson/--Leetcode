import java.util.ArrayList;

public class tester {
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<>();
        x.add("hi");
        x.add("bye");
        x.add("hi");

        x.remove("hi");
        x.remove("hi");

        System.out.println(x);
    }
}
