public class LC572 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
        public boolean isSame(TreeNode s, TreeNode t) {
            if (s == null && t == null)
                return true;
            if (s==null||t==null||s.val != t.val)
                return false;
            return isSame(s.left, t.left) && isSame(s.right, t.right);
        }


    public static void main(String[] args) {
        LC572 lc = new LC572();
        LC572.TreeNode r1 = new TreeNode(4);
        LC572.TreeNode r2 = new TreeNode(1);
        LC572.TreeNode r3 = new TreeNode(2);
        LC572.TreeNode r4 = new TreeNode(0);
        r1.left=r2;
        r1.right=r3;
        r2.right=r4;
        LC572.TreeNode t1 = new TreeNode(4);
        LC572.TreeNode t2 = new TreeNode(1);
        LC572.TreeNode t3 = new TreeNode(2);
        t1.left=t2;
        t1.right=t3;
        System.out.println(lc.isSame(r1,t1));
    }
}
