
/**
 * @author 贲阳林
 */
public class BinaryTree0403 {
    /**
     *给定一棵二叉树，设计一个算法，创建含有某一深度上所有节点的链表（比如，若一棵树的深度为 D，则会创建出 D 个链表）。返回一个包含所有深度的链表的数组。
     * @param tree 二叉树 eg.[1,2,3,4,5,null,7,8]
     * @return ListNode[] eg.[[1],[2,3],[4,5,7],[8]]
     */
    public ListNode[] listOfDepth(TreeNode tree) {
        if(tree==null){
            return null;
        }
        int depth=getDepth(tree,0);
        ListNode[] lit =new ListNode[depth];
        return getEachDepth(tree,lit,0,depth);
    }
    public int getDepth(TreeNode tree,int depth){
        if(tree!=null){
             int a=getDepth(tree.left,depth+1);
             int b=getDepth(tree.right,depth+1);
             return Math.max(a,b);
        }else {
            return depth;
        }
    }
    public ListNode[] getEachDepth(TreeNode tree,ListNode[] lit,int level,int depth){
        if(level<depth){
            ListNode temp =new ListNode(tree.val);
            ListNode litEnd = lit[level];
            if(lit[level]==null){
                lit[level]=temp;
            }else {
            while(litEnd.next != null){
                litEnd=litEnd.next;
            }
            litEnd.next=temp;
            }


        }
        if(tree.left!=null) {
            getEachDepth(tree.left,lit,level+1,depth);
        }
        if(tree.right!=null) {
            getEachDepth(tree.right,lit,level+1,depth);
        }
        return lit;
        }
}

