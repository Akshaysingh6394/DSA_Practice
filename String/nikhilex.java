public class nikhilex {
    public static void main(String[] args) {
        String str = "abcabc";
        // a-bb-ccc-a-bb-ccc
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int k = str.indexOf(ch);
            for(int j=0;j<=k;j++){
                sb.append(ch);
            }
            if(i<str.length()-1){
                sb.append("-");
            }
        }
        System.out.println(sb.toString());
    }
    
}
