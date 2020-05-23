import java.util.Arrays;

/**
 * @author 贲阳林
 */
public class LC957 {
    public int[] prisonAfterNDays(int[] cells, int N) {
        int[] ans = new int[cells.length];
        int[] ans1 = new int[cells.length];
        ans = func(cells,1);
        ans1 =func(cells,1);
        for(int i = 2; i <= N; i++){
            ans = func(cells,i);
            if(ans[1]==ans1[1]&&ans[2]==ans1[2]&&ans[3]==ans1[3]&&ans[4]==ans1[4]&&ans[5]==ans1[5]&&ans[6]==ans1[6]){
               if(N%(i-1) == 0){
                   return  func(cells,i-1);
               }
                return func(cells,(N)%(i-1));
            }
        }
        return ans;
    }
    public int[] func(int[] cells, int N){
        int[] ans = new int[cells.length];
        int max = 0;
        while(N > 0){
            for(int i = 1; i < cells.length-1;i++){
                ans[i] = 1- cells[i-1] ^ cells[i+1];
            }
            cells = Arrays.copyOf(ans,ans.length);
            N--;
        }
        return ans;
    }
}
