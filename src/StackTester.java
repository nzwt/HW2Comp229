import java.util.EmptyStackException;

public class StackTester {

    public static void main(String[] args)
    {
        DStack s = new ArrayStack();
        //ListStack testerStack = new ListStack();
        ArrayStack testerStack = new ArrayStack();

        //should catch error
        try
        {
            testerStack.peek();
        }
        catch(EmptyStackException ex)
        {
            System.out.println(" The stack is empty");
        }

        //should catch error
        try
        {
            testerStack.pop();
        }
        catch(EmptyStackException ex)
        {
            System.out.println(" The stack is empty");
        }

        //should return true
        System.out.println(testerStack.isEmpty());

        //should print 0
        System.out.println(testerStack.size());

        testerStack.push(7);
        testerStack.push(8);

        //should return false
        System.out.println(testerStack.isEmpty());

        //should return 7.0 8.0
        System.out.println(testerStack.toString());

        //should return 2
        System.out.println(testerStack.size());

        //no errors should be found
        try
        {
            testerStack.peek();
        }
        catch(EmptyStackException ex)
        {
            System.out.println(" The stack is empty");
        }

        //no errors should be found
        try
        {
            testerStack.pop();
        }
        catch(EmptyStackException ex)
        {
            System.out.println(" The stack is empty");
        }

        //should print out 7.0
        System.out.println(testerStack.pop());

        //should print an empty string
        System.out.println(testerStack.toString());

        //should print out 0
        System.out.println(testerStack.size());




    }
}
