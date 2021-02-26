import java.util.ArrayList;
import java.util.List;

class MinStack {

    /** initialize your data structure here. */
    node header;
    List<Integer> minList;
    class node {
        public int val;
        public node next;
        public node(int val,node next){
            this.val =val;
            this.next =next;
        }
        public node(int val){
            this.val =val;
            this.next =null;
        }
    }
    public MinStack() {
        this.header =null;
        minList =new ArrayList<>();
    }

    public void push(int x) {
        if(this.header ==null){
            header =new node(x);
            minList.add(x);
        }else{
            header =new node(x,header);
            int flag =0;
            for(int i = 0;i<minList.size();i++){
                if(x<minList.get(i)){
                    minList.add(i,x);
                    flag =1;
                    break;
                }
            }
            if(flag ==0){
                minList.add(x);
            }
        }
    }

    public void pop() {
        if(header.val== minList.get(0)){
            minList.remove(0);
        }
        header =header.next;
    }

    public int top() {
        return header.val;
    }

    public int getMin() {
        return this.minList.get(0);
    }
}
