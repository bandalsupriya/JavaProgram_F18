package InterfaceStudy;

public interface Interface1 
{
    void test();
    default void plain()
    {
    	System.out.println("from I1");
    }
     static void car()
    {
    	System.out.println("from I1");
    }
}
