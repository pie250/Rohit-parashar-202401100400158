import java.util.ArrayDeque;
public class dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq=new ArrayDeque<>();
      // Add Elements.  
        dq.add(7);
        dq.add(7);
        dq.add(0);
        dq.addFirst(9);
        dq.addLast(3);
        System.out.println(dq);
//Add using offer
dq.offer(4);
dq.offerFirst(9);
dq.offerLast(4);
//offer is only used for queue.
//offer and add works with same way.but offer returns boolean value
//if our queue is full.
System.out.println(dq);
System.out.println(dq.peek());
System.out.println("remove first using poll : "+dq.pollFirst());
System.out.println("remove first using remove : "+dq.removeFirst());
System.out.println("remove second using poll : "+dq.pollFirst());
System.out.println("remove from Last using remove : "+dq.removeLast());
System.out.println(dq);
    }
    
}
