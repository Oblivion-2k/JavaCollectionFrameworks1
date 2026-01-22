import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        stack1.push(6); //last in item popped LIFO followed by stack

        Integer x = stack1.pop();

        //Printing all the elements of a Stack using Simple for-loop
        for(int i=0; i<stack1.size();i++){
            System.out.println(stack1.get(i));

        }

//        //Printing all the elements of a Stack using enhanced for-loop
        try{
            for(int e : stack1){
            System.out.println(stack1.get(e));
        }}catch(Exception e){
            System.out.println("Exception Occured");
            System.out.println(e);
            //e.getStackTrace();
        }



    }

}
