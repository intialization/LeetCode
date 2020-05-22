/**
 * @author 贲阳林
 */
public class BinaryTree105 {
    /**
     * 题源 LeetCode105根据一棵树的前序遍历与中序遍历构造二叉树。假设树中没有重复的元素。
     * @param preorder 二叉树前序遍历结果 eg.[3,9,20,15,7]
     * @param inorder  二叉树中序遍历结果 eg.[9,3,15,20,7]
     * @return 重构的二叉树
     * @see TreeNode 二叉树的定义
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return getTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

    public TreeNode getTree(int[] pre,int pStart,int pEnd,int[] in,int iStart,int iEnd){
            if(pStart>pEnd||iStart>iEnd){
                return null;
            }
            TreeNode ans =new TreeNode(pre[pStart]);
            int i;
            for( i=iStart;i<iEnd;i++){
                if(in[i]==pre[pStart]) {
                    break;
                }
            }
            ans.left=getTree(pre,pStart+1,i-iStart+pStart,in,iStart,i-1);
            ans.right=getTree(pre,i-iStart+pStart+1,pEnd,in,i+1,iEnd);
            return ans;
    }
}
