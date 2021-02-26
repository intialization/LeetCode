public class LC823 {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0;i<A.length;i++){
            A[i]=helper(A[i]);
        }
        return A;
    }
    public int[] helper(int []B){
        int len = B.length;
        for (int i =0;i<len/2;i++){
            int temp = B[i];
            B[i]=B[len-1-i]^1;
            B[len-1-i]=temp^1;
        }
        if (len%2==1){
            B[len/2] ^= 1;
        }
        return B;
    }

    public static void main(String[] args) {
        int[][] a = new int[][]{{1,1,0},{1,0,1},{0,0,0}};
        LC823 lc = new LC823();
        lc.flipAndInvertImage(a);
        System.out.println(a[2][0]);
        System.out.println(a[2][1]);
        System.out.println(a[2][2]);
    }
}
