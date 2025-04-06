package adRecursion;

public class substringSecMeth {
    static int count =0;
    public static void subSetStr(String str, String ans,int i){
        if(i==str.length()){
            count++;
            System.out.println(ans);
            return;
        }
        subSetStr(str, ans+str.charAt(i), i+1);
        subSetStr(str, ans, i+1);
    }
    public static void main(String[] args) {
        subSetStr("abc", "", 0);
        System.out.println(count);
    }
    
}
