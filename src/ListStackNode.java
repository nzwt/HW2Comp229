public class ListStackNode
{

    double value;
    ListStackNode next;

    public ListStackNode(double value)
    {
        this.value = value;
    }

    //toString method for testing purposes
    public String toString()
    {
        String returner = "";
        returner += this.value;
        if(this.next != null)
        {
            returner += " ";
        }
        return returner;
    }
    public double getValue()
    {
        return this.value;
    }
}
