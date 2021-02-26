import java.util.Vector;

public class MinHeap {
    Vector<Integer> heap;
    public MinHeap(){};
    public MinHeap(int[] array){
        this.heap = new Vector<>();
        if (array.length!=0){
            heap.add(array[0]);
            for (int i = 1; i < array.length; i++){
                heap.add(array[i]);
                compare(i, this.heap);
            }
        }
    }

    private void compare(int i, Vector<Integer> heap) {
        //System.out.println(heap.get(i));
        //System.out.println(heap.get(i-1/2));
        if (heap.get(i)<heap.get((i-1)/2)){
            //System.out.println(i);
            int temp = heap.get(i);
            heap.setElementAt(heap.get((i-1)/2),i);
            heap.setElementAt(temp,(i-1)/2);
            if (i-1>0) compare((i-1)/2,heap);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{4,7,2,5,6,1,0,3,8};
        MinHeap mh = new MinHeap(array);
        System.out.println(mh.heap.toString());
    }
}
