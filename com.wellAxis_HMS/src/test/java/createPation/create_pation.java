package createPation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class create_pation {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://106.51.90.215/Build/Hospital_Doctor_Patient_Management_System/");
    
	}

}
