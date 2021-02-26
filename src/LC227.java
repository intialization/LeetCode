import org.junit.Test;

import java.util.Stack;

public class LC227 {
    //实现一个基本的计算器来计算一个简单的字符串表达式的值。
//
// 字符串表达式仅包含非负整数，+， - ，*，/ 四种运算符和空格 。 整数除法仅保留整数部分。
//
// 示例 1:
//
// 输入: "3+2*2"
//输出: 7
//
//
// 示例 2:
//
// 输入: " 3/2 "
//输出: 1
//
// 示例 3:
//
// 输入: " 3+5 / 2 "
//输出: 5
//
//
// 说明：
//
//
// 你可以假设所给定的表达式都是有效的。
// 请不要使用内置的库函数 eval。
//
// Related Topics 栈 字符串
// 👍 243 👎 0



    //leetcode submit region begin(Prohibit modification and deletion)
    static  class Solution {
        public int calculate(String s) {
            Stack<String> stack = new Stack<>();
            Stack<String> stack1 = new Stack<>();
            StringBuilder sb = new StringBuilder();
            int ans;
            //先计算乘除法
            for (int i = 0; i < s.length() ; i++){
                if (s.charAt(i)!=' ')
                {
                    if (s.charAt(i) == '+'||s.charAt(i) == '-'||s.charAt(i) == '*'||s.charAt(i) == '/')
                    {
                        stack.push(sb.toString());
                        sb.delete(0,sb.length());
                        stack.push((Character.toString(s.charAt(i))));
                    }
                    else{
                        sb.append(s.charAt(i));
                    }

                }
                if (i==s.length()-1)
                    stack.push(sb.toString());
            }
            System.out.println(stack.toString());
            for(int i = 0 ;i < stack.size(); i++){
                if (stack.get(i).equals("*")){
                    String a = stack1.pop();
                    stack1.push(Integer.toString(Integer.valueOf(a)*Integer.valueOf(stack.get(++i))));
                }
                else if (stack.get(i).equals("/")){
                    String a = stack1.pop();
                    stack1.push(Integer.toString(Integer.valueOf(a)/Integer.valueOf(stack.get(++i))));
                }
                else{
                    stack1.push(stack.get(i));
                }
            }
            System.out.println(stack1.toString());
            ans = Integer.valueOf(stack1.get(0));
            for (int i =1;i<stack1.size();i++){
                if (stack1.get(i).equals("+")){
                    ans +=Integer.valueOf(stack1.get(++i));
                }
                if (stack1.get(i).equals("-")){
                    ans -= Integer.valueOf(stack1.get(++i));
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String ss= " 3/2 ";
        System.out.println(s.calculate(ss));

    }
    //leetcode submit region end(Prohibit modification and deletion)
}

