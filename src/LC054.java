import java.util.LinkedList;
import java.util.List;

public class LC054 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new LinkedList<>();
        int iter = Math.min((matrix.length+1)/2+1,(matrix[0].length+1)/2);
        for (int i=0;i<iter;i++){
            System.out.println(i);
            helper(matrix,i,ans);
        }
        return ans;

    }
    public void helper(int[][] matrix, int begin, List<Integer> list){
        int m = matrix.length;//矩阵的高 3
        int n = matrix[0].length;//矩阵的长 5
        for (int i= begin;i<n-begin;i++){
            list.add(matrix[begin][i]);
        }
        for (int i= begin+1;i<m-begin;i++){
            list.add(matrix[i][n-begin-1]);
        }
        if (m-begin-1>begin){
            for (int i=n-begin-2;i>begin-1;i--){
                list.add(matrix[m-begin-1][i]);
            }
        }
        if(begin<n-begin-1){
            for (int i =m-begin-2;i>begin;i--){
                list.add(matrix[i][begin]);
            }
        }

    }

    public static void main(String[] args) {
         //int[][] matrix={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        int[][] matrix={{1},{6},{11}};
        //int[][] matrix=new int[][]{new int[]{1},new int[]{6},new int[]{11}};
         LC054 lc =new LC054();
         //lc.helper(matrix,2,ans);
         List<Integer> ans = lc.spiralOrder(matrix);
         System.out.println(ans);
    }
}
