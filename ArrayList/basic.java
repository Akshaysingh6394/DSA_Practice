
import java.util.*;
public class basic{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 10; i >0; i--) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println(list.contains(6));
        Collections.sort(list);
        System.out.println(list);
    }
}
