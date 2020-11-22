import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Checkboxes {

    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "/Users/sofiiakostrubina/IdeaProjects/Lesson6/src/test/resourses/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");

        WebElement element1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[1]"));
        Assert.assertEquals(element1.isSelected(), false);
        element1.click();
        Assert.assertEquals(element1.isSelected(), true);

        WebElement element2 = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[2]"));
        Assert.assertEquals(element2.isSelected(), true);
        element2.click();
        Assert.assertEquals(element2.isSelected(), false);

        driver.close();
        driver.quit();
    }

}
