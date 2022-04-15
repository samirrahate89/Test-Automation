package Test.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test(enabled=true)
    public void shouldAnswerWithTrue()
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\gkerk\\Desktop\\ATT-Build-and-Plan with parallel\\src\\main\\Resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.tutorialspoint.com/index.htm");
        driver.manage().window().maximize();
        
        String color = driver.findElement(By.xpath("//*[@href='https://www.tutorialspoint.com/angular_8_full_stack_development_with_spring_boot/index.asp']")).getCssValue("color");
        System.out.println(color);
        System.out.println(Color.fromString(color).asHex());
        String backcolor = driver.findElement(By.xpath("//*[@href='https://www.tutorialspoint.com/angular_8_full_stack_development_with_spring_boot/index.asp']")).getCssValue("background-color");
        System.out.println(backcolor);
        System.out.println(Color.fromString(backcolor).asHex());
        driver.quit();
    }
}
