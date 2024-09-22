package interface_part;

public class RemoteWebDriver1 implements WebDriver1, JavaScriptExecutor1,TakeScreenShot {
	 public void test() {
		 System.out.println("test method of remote web driver");
	 }
	 public void findElement() {
		 System.out.println("find element is implements");
	 }
	 public void get() {
		 System.out.println("get is implements");
	 }
	 public void executeScript() {
		 System.out.println("execute Script is implements ");
	 }
	 public void getScreenShot() {
		 System.out.println("get Screenshot is implements");
	 }
	 
}
