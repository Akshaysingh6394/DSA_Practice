package String;

import java.util.ArrayList;
import java.util.List;

public class labled {
    public List<Integer> partitionLabels(String str) {
        List<Integer> partitions = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            int startIndex = i;
            int endIndex = str.lastIndexOf(str.charAt(startIndex));
            for(int s=startIndex+1;s<=endIndex-1;s++){
                int lastIndexOfNextChar = str.lastIndexOf(str.charAt(s));
                if(lastIndexOfNextChar>endIndex){
                    endIndex = lastIndexOfNextChar;
                }
            }
            partitions.add(endIndex-startIndex+1);
            i=endIndex+1;
            
        }
        return partitions;
    }
    public static void main(String[] args) {
        
    }
    
}
