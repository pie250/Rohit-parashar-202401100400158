import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        //push,pop,peek,search,empty
        Stack<Integer>stk=new Stack<>();
        stk.push(9);
        stk.push(19);
        stk.push(23);
        stk.push(25);
        stk.push(27);
        System.out.println(stk);
        stk.pop();
        System.out.println(stk);
        System.out.println(stk.peek());
        System.out.println(stk.search(23));
        System.out.println(stk.empty());
    }
}
