import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LC056 {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new LinkedList<>();
        for (int i = 0 ;i<intervals.length;i++){
            list.add(intervals[i]);
        }
        Collections.sort(list, new Comparator<>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        for (int i = 0 ;i<list.size()-1;i++){
            if (list.get(i+1)[0]<=list.get(i)[1]){
                list.set(i+1,new int[]{list.get(i)[0],Math.max(list.get(i)[1],list.get(i+1)[1])});
                list.remove((i));
                i--;
            }
        }
        int[][] ans = new int[list.size()][];
        System.out.println(list.toString());
        for (int i = 0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        LC056 lc = new LC056();
        //int [][] test = new int[][]{{1,3},{2,6},{8,10},{15,18}};
        int [][] test = new int[][]{{1,3}};
        lc.merge(test);
    }
}
