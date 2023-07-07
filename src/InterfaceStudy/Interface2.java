package InterfaceStudy;

public interface Interface2 
{
 void sample();
 default void plain()
 {
 	System.out.println("from I2");
 }
 static void car()
 {
 	System.out.println("from I2");
 }

}
