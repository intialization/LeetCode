import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

public class LC96 {
    public int numTrees(int n) {
        int ans=0;
        if(n==0) return 1;
        if(n==1) return 1;
        if(n==2) return 2;
        if(n%2==0){
            for(int i=1;i<=n/2;i++){
                ans+=2*numTrees(n-i)*numTrees(i-1);
            }
        }
        if(n%2==1){
            int i ;
            for(i=1;i<=n/2;i++){
                ans+=2*numTrees(n-i)*numTrees(i-1);
            }
            ans+=numTrees(n-i)*numTrees(i-1);
        }
        return ans;
    }
    @Test
    public void test(){
        LC96 lc96 = new LC96();
        System.out.println(lc96.numTrees(5));
    }
}
