import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG {
    WebDriver driver;

    @BeforeTest
    public void precondition(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Bohdan\\IdeaProjects\\NG\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.i.ua/");

    }

}