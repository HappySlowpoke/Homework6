import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AddRemoveElement {

    public void ClickElement(WebDriver driver) {
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
    }

    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "/Users/sofiiakostrubina/IdeaProjects/Lesson6/src/test/resourses/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        this.ClickElement(driver);
        this.ClickElement(driver);
        driver.findElement(By.xpath("//button[text()='Delete']")).click();
        int iCount = driver.findElements(By.xpath("//button[text()='Delete']")).size();
        Assert.assertEquals(1, iCount);

        driver.close();
        driver.quit();
    }

}
