package interface_part;

public class Driver {
  public static void main(String[] args) {
	 WebDriver1 wd = new ChromeDriver1();
	  TakeScreenShot t1 = (TakeScreenShot)wd;
	  ChromeDriver1 cd = (ChromeDriver1)wd;
	 cd.get();
	 cd.drive();
	 cd.start();
	 cd.findElement();
	 cd.executeScript();
	 cd.getScreenShot();
	 
}
}
