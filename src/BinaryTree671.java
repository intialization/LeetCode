import java.util.Map;

/**
 * @author 贲阳林
 */
public class BinaryTree671 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    /**
     *题源：LEETCODE671给定一个非空特殊的二叉树，每个节点都是正数，并且每个节点的子节点数量只能为 2 或 0。如果一个节点有两个子节点的话，那么这个节点的值不大于它的子节点的值。
     * @param root 二叉树
     * @return 二叉树中第二小的值，不存在则返回-1
     */
        public int findSecondMinimumValue(TreeNode root) {
            //方法一：自己想的
            /*if(root.left==null){
                return -1;
            }
            else{
                int temp =2;
                if((root.left.val+root.right.val)!=temp*root.val){
                    if(root.left.val==root.val||root.right.val==root.val)  {
                        if(root.left.val==root.val){
                            int a=findSecondMinimumValue(root.left);
                            int b=root.right.val;
                            return (b==-1)||(a<b&&a!=-1)?a:b;
                        }
                            int a=root.left.val;
                            int b=findSecondMinimumValue(root.right);
                            return (b==-1)||(a<b&&a!=-1)?a:b;
                    }
                    else{
                        return root.left.val<root.right.val? root.left.val:root.right.val;
                    }
                }
                int a=findSecondMinimumValue(root.right);
                int b=findSecondMinimumValue(root.left);
                return (b==-1)||(a<b&&a!=-1)?a:b;
            }
        }*/
            //方法二
            return findMin(root,root.val);
        }
    //方法二：将需求转化为求二叉树左右子树中的比根节点大的第一个值，返回其中较小的值。
    /**
     * 求二叉树左右子树中的比根节点大的第一个值
     * @param root 二叉树，rValve根节点的值
     * @return 第一个出现的比rValve大的值，不存在返回-1
     */
    public int findMin(TreeNode root,int rValve){
        if(root==null){
            return -1;
        }
        if(root.val>rValve){
            return root.val;
        }
        int a=findMin(root.left,rValve);
        int b=findMin(root.right,rValve);
        if(a>-1&&b>-1){
            return Math.min(a,b);
        }
        return Math.max(a,b);
    }


}


