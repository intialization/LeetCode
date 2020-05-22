
import java.util.*;

/**
 * @author 贲阳林
 */
public class BinaryTree102 {
  /*  static List<List<Integer>> lit= new ArrayList<>();

    public static void getNode(TreeNode a, int level){
        if(level==lit.size())
            lit.add(new ArrayList<Integer>());
        lit.get(level).add(a.val);
        if(a.left!=null) getNode(a.left,level+1);
        if(a.right!=null) getNode(a.right,level+1);

    }



    public static List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return lit;
        getNode(root,0);
        return lit;
    }*/
    //方法二：队列

    /**
     * 题源：LeetCode102 给你一个二叉树，请你返回其按层序遍得到的节点值。（即逐层地，从左到右访问所有节点）。
     * @param root 二叉树：eg.[3,9,20,null,null,15,7]
     * @see TreeNode 二叉树的定义
     * @return 二叉树遍历结果 eg.[[3],[9,20],[15,7]]
     */
    public static List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>> lit= new ArrayList<>();
         LinkedList<TreeNode> queue = new LinkedList<>();
         if(root==null) {
             return lit;
         }
         queue.add(root);
        while(!queue.isEmpty())
        {
            int s = queue.size();
            List<Integer> temp= new ArrayList<>();
            for(int i=0;i<s;i++) {
                TreeNode t = queue.pollFirst();
                assert t != null;
                    temp.add(t.val);
                    if(t.left!=null) {
                        queue.add(t.left);
                    }
                    if(t.right!=null) {
                        queue.add(t.right);
                    }
            }
            lit.add(temp);
        }
         return lit;
    }
}
