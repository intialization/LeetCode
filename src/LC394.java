import java.util.Stack;

public class LC394 {
    public String decodeString(String s) {
        Stack<Integer> num = new Stack<>();
        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < s.length() ; i++){
            if ('0'<=s.charAt(i)&&s.charAt(i)<='9'){
                StringBuilder temp = new StringBuilder();
                while('0'<=s.charAt(i)&&s.charAt(i)<='9'){
                    temp.append(s.charAt(i++));
                }
                i--;
                num.push(Integer.valueOf(String.valueOf(temp.toString())));
                System.out.println(num.toString());
            }else {
                if (s.charAt(i)==']') {
                    StringBuilder sb = new StringBuilder();
                    while (characters.peek() != '[') {
                        sb.append(characters.pop());
                        //System.out.println(sb.toString());
                    }
                    characters.pop();
                    String temp = sb.reverse().toString();
                    int n =num.pop();
                    for (int j = 0; j < n; j++) {
                        for (int k = 0; k < temp.length(); k++) {
                            characters.push(temp.charAt(k));
                        }
                    }
                }
                else{
                    characters.push(s.charAt(i));
                    System.out.println(characters.toString());
                }

            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i =0 ; i < characters.size(); i++){
            ans.append(characters.get(i));
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String a  =new String("100[a]2[bc]");
        LC394 s =new LC394();
        System.out.println(s.decodeString(a));
    }
}
