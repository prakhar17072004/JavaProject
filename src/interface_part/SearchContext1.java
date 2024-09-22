package interface_part;

public interface SearchContext1 {
   public void findElement();
   default void start() {
	   System.out.println("Starts method default body");
   }
   default void drive() {
	   System.out.println("driver method default body");
   }
   
}
