public class magical {
    public static boolean  conv(int n){
        String str = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '0'){
                sb.append('1');
            }else{
                sb.append('2');
            }
        }
        String str1 = sb.toString();
        int sum = 0;
        for(int i=0;i<str1.length();i++){
            sum += str1.charAt(i)-'0';
        }
        if(sum % 2 != 0){
            return true;
        }else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        int n =5;
        for(int g=1;g<=n;g++){
            System.out.println(conv(g));
        }

    }
    
}
