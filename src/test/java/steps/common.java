package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import Utility.Utility;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class common {
    @Given("a user with a correct credentials")
    public void a_user_with_a_correct_credentials(DataTable dataTable) throws InterruptedException {
        Utility.getDriver();
        Utility.driver.get("https://vindrives.app");
        List<List<String>> credentials = dataTable.asLists(String.class);
        Utility.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Utility.driver.findElement(By.cssSelector("input[name=email]")).sendKeys(credentials.get(0).get(1));
        Utility.driver.findElement(By.cssSelector("input[name=password]")).sendKeys(credentials.get(1).get(1));
        Thread.sleep(30000);
        Utility.driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
        Thread.sleep(10000);
    }

    @And("I select {string}")
    public void iSelect(String dealerName) throws InterruptedException {
        WebElement dropdown = Utility.driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[1]/div[2]/button[1]"));
        dropdown.click(); // assuming you have to click the "dropdown" to open it
        switch (dealerName){
            case "Demo Client":
                List<WebElement> demoClients = dropdown.findElements(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]"));
                Utility.selectDropdown(demoClients,"Demo Client");
                break;
            case "Bill Brandt Ford" :
                List<WebElement> billBrandt = dropdown.findElements(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[2]"));
                Utility.selectDropdown(billBrandt,"Bill Brandt Ford");
                break;
            case "Dan Deery Toyota" :
                List<WebElement> danDeeryToyota = dropdown.findElements(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[3]"));
                Utility.selectDropdown(danDeeryToyota,"Dan Deery Toyota");
                break;
            case "Dan Deery Motors" :
                List<WebElement> danDeeryMotors = dropdown.findElements(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[4]"));
                Utility.selectDropdown(danDeeryMotors,"Dan Deery Motors");
                break;
            case "Lost Pines Toyota" :
                List<WebElement> lostPinesToyota = dropdown.findElements(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[5]"));
                Utility.selectDropdown(lostPinesToyota,"Lost Pines Toyota");
                break;
            case "Deery Brothers CDJR Waukee" :
                List<WebElement> deeryBrothers = dropdown.findElements(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[7]"));
                Utility.selectDropdown(deeryBrothers,"Deery Brothers CDJR Waukee");
                break;
            case "Valu Ford Chrysler" :
                List<WebElement> valuFord = dropdown.findElements(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[11]"));
                Utility.selectDropdown(valuFord,"Valu Ford Chrysler");
                break;
        }
    }

    @Then("Close Browser")
    public void close_browser() {
        Utility.driver.quit();
    }
}
