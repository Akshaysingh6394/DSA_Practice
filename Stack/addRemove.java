import java.util.*;
public class addRemove {
    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>();
        int size = 0;
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
System.out.println(s.size());
        while(!s.isEmpty()){
            System.out.print(s.pop());
            size++;
        }
        System.out.println();

        
    }
    
}
