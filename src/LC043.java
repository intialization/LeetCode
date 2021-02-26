public class LC043 {
    public String multiply(String num1, String num2) {
        String ans = new String("0");
        int ps =0;
        if (num1.charAt(0)-'0'==0||num2.charAt(0)-'0'==0)
            return "0";
        for (int i=num2.length()-1;i>-1;i--){
            String temp= helper(num1,num2.charAt(i)-'0',ps);
            ans = addString(temp,ans);
            ps++;
        }
        return ans;

    }
    public String  helper(String s, int n,int ps){
        StringBuilder res = new StringBuilder();
        if (n==0)
            return "0";
        for (int i=0; i<ps;i++)
            res.append("0");
        int carry =0;
        for (int i=s.length()-1;i>-1;i--){
            int x = s.charAt(i)-'0';
            int temp = x*n + carry;
            res.append(temp%10);
            carry =temp/10;
        }
        if (carry>0)
            res.append(carry);

        return res.reverse().toString();
    }
    public String addString(String s1 ,String s2){
        StringBuilder sb = new StringBuilder();
        StringBuilder s11 =new StringBuilder(s1);
        s11.reverse();
        StringBuilder s22 =new StringBuilder(s2);
        s22.reverse();
        int carry = 0;
        for (int i = 0; i < Math.max(s11.length(),s22.length());i++){
            int temp;
            if (s11.length()>i&&s22.length()>i)
                temp = (s11.charAt(i)-'0')+(s22.charAt(i)-'0')+carry;
            else{
                if (s11.length()>i)
                    temp = (s11.charAt(i)-'0')+carry;
                else
                    temp = (s22.charAt(i)-'0')+carry;
            }
            sb.append(temp%10);
            carry = temp/10;
        }
        if (carry>0)
            sb.append(carry);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s = new String("123");
        String s2 = new String("456");
        int n  =9;
        LC043 lc = new LC043();
        System.out.println(lc.helper(s,n,1));
        System.out.println(lc.addString(s,s2));
        System.out.println(lc.multiply(s,s2));
     }
}
