package GarbageCollection;

public class EligibleObjectForGC
{

    String obj_name;

    public EligibleObjectForGC(String obj_name)
    {
        this.obj_name = obj_name;
    }

    static void show()
    {
        EligibleObjectForGC t1 = new EligibleObjectForGC("t1");
        display();

    }
    static void display()
    {
        EligibleObjectForGC t2 = new EligibleObjectForGC("t2");
    }

    // Driver method
    public static void main(String args[])
    {

        EligibleObjectForGC o1 = new EligibleObjectForGC("ABC");

        EligibleObjectForGC o2 = new EligibleObjectForGC("ABC");

        o1 = o2 = null;

        show();

        System.gc();
    }

    @Override
    protected void finalize() throws Throwable
    {
        System.out.println(this.obj_name + " successfully garbage collected");
    }
}
