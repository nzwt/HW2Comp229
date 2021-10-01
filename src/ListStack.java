import java.util.EmptyStackException;

public class ListStack implements DStack
{

    //resources:
    //

    int size;
    ListStackNode head;

    public ListStack()
    {
    }

    /**
     * This method should return the number of elements in the Stack.
     */
    public int size()
    {
        return this.size;
    }

    /**
     * This method should return true if the Stack is empty.
     */

    public boolean isEmpty()
    {
        if(this.head == null)
        {
            return true;
        }
        return false;
    }

    /**
     * This method takes a double d and pushes d to the Stack.
     */

    public void push(double d)
    {
        ListStackNode newNode = new ListStackNode(d);
        ListStackNode tempNode = this.head;
        this.head = newNode;
        this.head.next = tempNode;
        this.size++;
    }

    /**
     * This method removes and returns the top of the Stack.
     * @return the deleted value
     * @throws EmptyStackException if stack is empty
     */

    public double pop()
    {
        if(this.head == null)
        {
            throw new EmptyStackException();
        }
        //store double value before you move the head
        double returner = this.head.getValue();
        this.head = this.head.next;
        this.size--;
        return returner;
    }

    /**
     * This method returns the top of the Stack without removing.
     * @throws EmptyStackException if stack is empty
     */

    public double peek()
    {
       if(this.head == null)
       {
           throw new EmptyStackException();
       }
       return this.head.value;
    }

    /**
     * This method returns a formatted string of the Stack from top to bottom:
     * 3.4  2.3  5.2  6.5
     */

    public String toString()
    {
        String returner = "";
        ListStackNode current = this.head;
        while (current != null)
        {
            returner += current.toString();
            current = current.next;
        }
        return returner;
    }
}
