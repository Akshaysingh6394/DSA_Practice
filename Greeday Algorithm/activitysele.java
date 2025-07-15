import java.lang.classfile.attribute.AnnotationDefaultAttribute;
import java.util.ArrayList;

public class activitysele{
    public static void main(String[] args) {
       int start[] = {1,3,0,5,8,5};
        int endtime[] = {2,4,6,7,9,9};
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        maxAct = 1;
        ans.add(0);
        int lastEnd = endtime[0];
        for (int i = 1; i < endtime.length; i++) {
            if(start[i] > lastEnd){
                ans.add(i);
                maxAct++;
                lastEnd = endtime[i];
            }
        }
        System.out.println(maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i)+" ");
        }
    }
}