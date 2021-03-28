import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class runner {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://kaspi.kz/");
        WebElement cityCheckerButtonYes = driver.findElement(By.xpath("//*[@id=\"headerRegionConfirm__ConfirmButton\"]"));
        cityCheckerButtonYes.click();
        WebElement shopSection = driver.findElement(By.xpath("//*[@id=\"headerMenu\"]/a[1]"));
        shopSection.click();
        WebElement cityChoiceAlmaty = driver.findElement(By.xpath("//*[@id=\"dialogService\"]/div/div[1]/div[1]/div/ul[1]/li[8]/a"));
        cityChoiceAlmaty.click();
        WebElement inputFieldShop = driver.findElement(By.xpath("//*[@id=\"searchComponent\"]/form/div/input"));
        inputFieldShop.sendKeys("iphone 11");
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"searchComponent\"]/form/div/button"));
        searchButton.click();
        Thread.sleep(2000);
        driver.quit();

    }
}
