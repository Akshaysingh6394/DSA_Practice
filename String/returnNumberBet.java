public class returnNumberBet {
    public static void main(String[] args) {
        String str = "ab1cd11c";
        int count = 0;
        String temp = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                temp+=ch;
            }else{
                if(!temp.isEmpty()){
                    if(i - temp.length()-1 >=0 && Character.isLetter(str.charAt(i - temp.length()-1))){
                        count++;
                    }
                    temp = "";
                }
            }
        }
        System.out.println(count);
    }
    
}
