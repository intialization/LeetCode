

import java.util.ArrayList;
import java.util.List;

/**
 * @author 贲阳林
 */
public class LC884 {
    public String[] uncommonFromSentences( String A, String B) {
        List<String> ans= new ArrayList<>();
        String all =A.concat(" "+B);
        String[] split = all.split(" ");
        for(int i = 0 ;i<split.length;i++){
            int flag=0;
            for(int j =0; j<split.length;j++){
                if(split[i].equals(split[j])){
                    flag +=1;
                }
            }
            if(flag==1){
                ans.add(split[i]);
            }
        }
        String[] ansArray =new String[ans.size()];
        ans.toArray(ansArray);
        return ansArray ;
    }
}
