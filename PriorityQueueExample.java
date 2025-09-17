import java.util.PriorityQueue;
public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        //Priority Queue works according to the minheap;
        pq.add(10);
        pq.add(40);
        pq.add(30);
        pq.add(20);
        System.out.println(pq);
        System.out.println("Adding using offer : "+pq.offer(25));
        // offer is similar to add but it returns boolean value;
        System.out.println(pq);
        System.out.println("Deleted element : "+pq.poll());
        System.out.println(pq);
        System.out.println("After deleting second time : "+pq.poll());
       // poll always delete and return the smallest element; 
        System.out.println(pq);
        pq.remove();
        //poll and remove both are same but poll returns null
        //if the queue is empty, but remove throws exception,if the queue is empty;;
        System.out.println("Peeking : "+pq.peek());
        System.out.println(pq.isEmpty());
    }
}
