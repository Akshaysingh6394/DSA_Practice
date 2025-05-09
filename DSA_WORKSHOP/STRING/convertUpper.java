package DSA_WORKSHOP.STRING;

public class convertUpper {
    public static void main(String[] args) {
        String str = "hello world";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch-32);
            }
            result+=ch;
    }
    System.out.println(result);
}
    
}
