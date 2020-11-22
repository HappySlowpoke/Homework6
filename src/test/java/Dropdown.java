import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {


    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "/Users/sofiiakostrubina/IdeaProjects/Lesson6/src/test/resourses/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dropdown");

        WebElement dropdown = driver.findElement(By.id("dropdown"));
        dropdown.click();
        Select select = new Select(dropdown);
        select.selectByVisibleText("Option 1");
        dropdown.click();
        Assert.assertTrue(true, "Option 1");

        dropdown.click();
        select.selectByVisibleText("Option 2");
        dropdown.click();
        Assert.assertTrue(true, "Option 2");

        driver.close();
        driver.quit();
    }

}