import java.util.EmptyStackException;

public class ArrayStack implements DStack
{
    double[] stackArray;
    int size;

    //default constructor, default size set to 5
    public ArrayStack()
    {
        this.stackArray = new double[5];
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
        if(this.size == 0)
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
        if(this.size == this.stackArray.length)
        {
            //if out of room, doubles length
            double[] tempArray = new double[this.stackArray.length*2];
            for(int i = 0 ; i < stackArray.length ; i++)
            {
                //+1 accounts for pushing of new value
                tempArray[i] = this.stackArray[i];
            }
            this.stackArray = tempArray;
        }
        //makes more sense to push to the end, then you don't have to move all
        //other indices when you push
        this.stackArray[this.size + 1] = d;
        this.size++;

    }

    /**
     * This method removes and returns the top of the Stack.
     * @return the deleted value
     * @throws EmptyStackException if stack is empty
     */

    public double pop()
    {
        if(this.size == 0)
        {
            throw new EmptyStackException();
        }
        //don't actually need to remove anything, the value will just be overwritten
        //if anything new is pushed on, just need to change size variable to smaller
        this.size--;
        return this.stackArray[size+1];
    }

    /**
     * This method returns the top of the Stack without removing.
     * @throws EmptyStackException if stack is empty
     */

    public double peek()
    {
        if(this.size == 0)
        {
            throw new EmptyStackException();
        }
        return this.stackArray[size];
    }

    /**
     * This method returns a formatted string of the Stack from top to bottom:
     * 3.4  2.3  5.2  6.5
     */

    public String toString()
    {
        String returner = "";
        for(int i = size ; i > 0 ; i--)
        {
            returner += this.stackArray[i] + " ";
        }
        return returner;
    }
}
