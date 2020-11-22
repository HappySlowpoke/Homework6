import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Inputs {

    @Test
    public void test (){
        System.setProperty("webdriver.chrome.driver", "/Users/sofiiakostrubina/IdeaProjects/Lesson6/src/test/resourses/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/inputs");

        WebElement field = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/input"));
        field.sendKeys(Keys.ARROW_DOWN);
        field.sendKeys(Keys.ARROW_DOWN);
        field.sendKeys(Keys.ARROW_DOWN);
        field.sendKeys(Keys.ARROW_DOWN);
        field.sendKeys(Keys.ARROW_DOWN);
        field.sendKeys(Keys.ARROW_DOWN);
        Assert.assertNotNull(field);
        driver.close();
        driver.quit();
    }

}
