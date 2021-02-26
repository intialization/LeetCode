import java.util.LinkedList;
import java.util.Queue;

public class LC235 {
    public static class TreeNode { int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
  }
    public static int sumOfLeftLeaves(TreeNode root) {
        int ans =0;
        if(root==null)
            return ans;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            //System.out.println(queue.size());
            TreeNode temp = queue.poll();
            if(temp.left!=null&&temp.left.left==null&&temp.left.right==null){
                ans += temp.left.val;
            }
            if(temp.left!=null)
                queue.offer(temp.left);
            if(temp.right!=null)
                queue.offer(temp.right);
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode nine = new TreeNode(9);
        root.left=nine;
        TreeNode tw = new TreeNode(20);
        tw.left =new TreeNode(15);
        tw.right =new TreeNode(7);
        root.right = tw;
        int ans;
        LC235 lc = new LC235();
        ans =lc.sumOfLeftLeaves(root);
        System.out.println(ans);

    }
}
