import java.util.*;
public class addRemove {
    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>();
        int n = s.size();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.print(s.pop());
        }
        
    }
    
}
