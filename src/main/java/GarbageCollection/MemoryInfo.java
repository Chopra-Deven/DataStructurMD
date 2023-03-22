package GarbageCollection;

class memoryDemo
{
    public static void main(String arg[])
    {
        Runtime runtime = Runtime.getRuntime();

        long memory1, memory2;

        Integer integer[] = new Integer[1000];

        System.out.println("Total memory is: "
                + runtime.totalMemory());

        memory1 = runtime.freeMemory();
        System.out.println("Initial free memory: "
                + memory1);

        runtime.gc();

        memory1 = runtime.freeMemory();

        System.out.println("Free memory after garbage "
                + "collection: " + memory1);

        for (int i = 0; i < 1000; i++)
            integer[i] = new Integer(i);

        memory2 = runtime.freeMemory();

        System.out.println("Free memory after allocation: "
                + memory2);

        System.out.println("Memory used by allocation: " +
                (memory1 - memory2));

        for (int i = 0; i < 1000; i++)
            integer[i] = null;

        runtime.gc();

        memory2 = runtime.freeMemory();
        System.out.println("Free memory after "
                + "collecting discarded Integers: " + memory2);
    }
}

