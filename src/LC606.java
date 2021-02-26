public class LC606 {
    public String tree2str(TreeNode t) {
        if (t ==null)
            return new String("");
        String s= helper(t);
        return s.substring(1,s.length()-1);
    }
    public String helper(TreeNode t){
        StringBuilder sb = new StringBuilder("");
        if (t!=null){
            sb.append("(");
            sb.append(t.val);
            if (t.left==null&&t.right!=null)
                sb.append("()");
            sb.append(helper(t.left));
            sb.append(helper(t.right));
            sb.append(")");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LC606 lc =new LC606();
        TreeNode one =new  TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        one.left=two;
        one.right=three;
        two.right=four;
        System.out.println(lc.tree2str(one));
    }
}
