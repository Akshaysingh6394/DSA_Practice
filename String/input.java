package String;

public class input{
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String str = sc.next();
        
        // System.out.println(str);
        // System.out.println(str.length());
        int s = 13;
        String str = Integer.toString(s);
      
        for(char ch:str.toCharArray()){
            System.out.println(ch);
        }

        
    }
}