import org.junit.Test;


import java.util.LinkedList;

public class LC844 {
    public boolean backspaceCompare(String S, String T) {
        LinkedList<Character> list1 = new LinkedList<>();
        for (char c : S.toCharArray()) {
            if(c=='#'){
                list1.pollLast();
            }
            else {
                list1.add(c);
            }
        }
        LinkedList<Character> list2 = new LinkedList<>();
        for (char c : T.toCharArray()) {
            if(c=='#'){
                list2.pollLast();
            }
            else {
                list2.add(c);
            }
        }
        System.out.println(list1);
        System.out.println(list2);
        if(list1.size()!=list2.size()){
            return false;
        }else {
            for(int i =0;i<list1.size();i++){
                if(list1.get(i)!=list2.get(i))
                return false;
            }
        }
        return true;
    }
    @Test
    public void LC844Test(){
        String S ="a#c";
        String T ="b";
        System.out.println(new LC844().backspaceCompare(S,T));
    }
}

