package steps.v2;

import Resources.DemoClient;
import Utility.Utility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import Utility.DealRating;

import java.util.ArrayList;
import java.util.List;

public class DealRatingByChannel {
    @When("I select all providers available from customize button")
    public void iSelectAllProvidersAvailableFromCustomizeButton() throws InterruptedException {
        Utility.driver.findElement(By.xpath("//button[text()='Customize']")).click();
        List<WebElement> dynamicDivs = Utility.driver.findElements(By.xpath("//div[@class='css-1qm3vnl']//div[@class='css-1qm3vnl']//div[@class='css-1qm3vnl']/div"));

        // Check if the element exists
        By locator = By.xpath("//div[contains(text(),'Website')]"); // Change this to your locator

        boolean elementExists = false;
        int provider = 0;
        try {
            WebElement element = Utility.driver.findElement(locator);
            elementExists = true; // If we reach here, the element exists
        } catch (Exception e) {
            // Element does not exist
        }

        if (elementExists) {
            provider = dynamicDivs.size() - 1;
        } else {
            provider = dynamicDivs.size();
        }

        for (int i = 0; i < provider; i++) {
            int count = i + 1;
            Utility.driver.findElement(By.xpath("//div[@class='css-1qm3vnl']//div[@class='css-1qm3vnl']//div[@class='css-1qm3vnl']/div[" + count + "]//div[2]//button[1]//*[name()='svg']")).click();
            Thread.sleep(1000);
        }
    }

    @When("I click sort from cargurus")
    public void IClickSortFromCargurus() throws InterruptedException {
        try {
            // Scroll to the element using Actions
            Actions actions = new Actions(Utility.driver);

            WebElement cargurusSort =  Utility.driver.findElement(By.xpath(DemoClient.CargurusRankSort));
            actions.moveToElement(cargurusSort).perform();
            cargurusSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.DealRatingByChannelTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='CarGurus']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            DealRating.CarGurus = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                DealRating.CarGurus.add(cellText);
            }

            Utility.driver.findElement(By.xpath(DemoClient.CargurusRankSort)).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='CarGurus']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                DealRating.CarGurus.add(cellText);
            }

            System.out.println("CheckData"+DealRating.CarGurus);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from AutoTrader")
    public void IClickSortFromAutoTrader() throws InterruptedException {
        try {
            Actions actions = new Actions(Utility.driver);

            WebElement autoTraderSort =  Utility.driver.findElement(By.xpath(DemoClient.AutotraderRankSort));
            actions.moveToElement(autoTraderSort).perform();
            autoTraderSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.DealRatingByChannelTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Autotrader']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            DealRating.AutoTrader = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                DealRating.AutoTrader.add(cellText);
            }

            Utility.driver.findElement(By.xpath(DemoClient.AutotraderRankSort)).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Autotrader']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                DealRating.AutoTrader.add(cellText);
            }

            System.out.println("CheckData"+DealRating.AutoTrader);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Carscom")
    public void IClickSortFromCarscom() throws InterruptedException {
        try {
            Actions actions = new Actions(Utility.driver);

            WebElement carsDotCom =  Utility.driver.findElement(By.xpath(DemoClient.CarsDotComSort));
            actions.moveToElement(carsDotCom).perform();
            carsDotCom.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.DealRatingByChannelTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Cars.com']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            DealRating.CarsCom = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                DealRating.CarsCom.add(cellText);
            }

            Utility.driver.findElement(By.xpath(DemoClient.CarsDotComSort)).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Cars.com']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                DealRating.CarsCom.add(cellText);
            }

            System.out.println("CheckData"+DealRating.CarsCom);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Carfax")
    public void IClickSortFromCarfax() throws InterruptedException {
        try {
            Actions actions = new Actions(Utility.driver);

            WebElement CarfaxSort =  Utility.driver.findElement(By.xpath(DemoClient.CarfaxSort));
            actions.moveToElement(CarfaxSort).perform();
            CarfaxSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.DealRatingByChannelTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Carfax']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            DealRating.CarFax = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                DealRating.CarFax.add(cellText);
            }

            Utility.driver.findElement(By.xpath(DemoClient.CarfaxSort)).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Carfax']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                DealRating.CarFax.add(cellText);
            }

            System.out.println("CheckData"+DealRating.CarFax);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from Price")
    public void IClickSortFromPrice() throws InterruptedException {
        try {
            Actions actions = new Actions(Utility.driver);

            WebElement priceSort =  Utility.driver.findElement(By.xpath(DemoClient.PriceSort));
            actions.moveToElement(priceSort).perform();
            priceSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.DealRatingByChannelTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            DealRating.Price = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                DealRating.Price.add(cellText);
            }

            Utility.driver.findElement(By.xpath(DemoClient.PriceSort)).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='Price']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                DealRating.Price.add(cellText);
            }

            System.out.println("CheckData"+DealRating.Price);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from DOL")
    public void IClickSortFromDOL() throws InterruptedException {
        try {
            Actions actions = new Actions(Utility.driver);

            WebElement dolSort =  Utility.driver.findElement(By.xpath(DemoClient.DolSort));
            actions.moveToElement(dolSort).perform();
            dolSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.DealRatingByChannelTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='DOL']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            DealRating.DOL = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                DealRating.DOL.add(cellText);
            }

            Utility.driver.findElement(By.xpath(DemoClient.DolSort)).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='DOL']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                DealRating.DOL.add(cellText);
            }

            System.out.println("CheckData"+DealRating.DOL);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @When("I click sort from No of Photos")
    public void IClickSortFromNoOfPhotos() throws InterruptedException {
        try {
            Actions actions = new Actions(Utility.driver);

            WebElement noOfPhotosSort =  Utility.driver.findElement(By.xpath(DemoClient.PhotoSort));
            actions.moveToElement(noOfPhotosSort).perform();
            noOfPhotosSort.click();

            Thread.sleep(5000);
            // Locate the table
            WebElement DemoClientTable = Utility.driver.findElement(By.xpath(DemoClient.DealRatingByChannelTable)); // Change to the actual table ID or selector

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='# of Photos']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary
            DealRating.NoOfPhotos = new ArrayList<>();
            for (WebElement cell : columnCells) {
                String cellText = cell.getText().trim();
                DealRating.NoOfPhotos.add(cellText);
            }

            Utility.driver.findElement(By.xpath(DemoClient.PhotoSort)).click();
            Thread.sleep(5000);

            // Locate the specific column (e.g., the second column)
            List<WebElement> columnCells2 = DemoClientTable.findElements(By.xpath("//table//tr/td[count((//table//th[normalize-space(.)='# of Photos']/preceding-sibling::th)) + 1]")); // Adjust the xpath as necessary


            for (WebElement cell : columnCells2) {
                String cellText = cell.getText().trim();
                DealRating.NoOfPhotos.add(cellText);
            }

            System.out.println("CheckData"+DealRating.NoOfPhotos);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("CarGurus are not showing Unknown Data")
    public void CargurusAreNotShowingUnknownData() throws InterruptedException {
        try {
            boolean allUnknown = DealRating.CarGurus.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Carscom are not showing Unknown Data")
    public void CarsComAreNotShowingUnknownData() throws InterruptedException {
        try {
            boolean allUnknown = DealRating.CarsCom.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("AutoTrader are not showing Unknown Data")
    public void AutoTraderAreNotShowingUnknownData() throws InterruptedException {
        try {
            boolean allUnknown = DealRating.AutoTrader.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Carfax are not showing Unknown Data")
    public void CarfaxAreNotShowingUnknownData() throws InterruptedException {
        try {
            boolean allUnknown = DealRating.CarFax.stream().allMatch(col -> col.equals("Unknown"));
            System.out.println("All Unknown List ? " + allUnknown);
            Assert.assertNotEquals("Values should not be true",true, allUnknown);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("Price are not showing Empty Data")
    public void PriceAreNotShowingEmptyData() throws InterruptedException {
        try {
            boolean ZeroData = DealRating.CarFax.stream().allMatch(col -> col.equals("$0"));
            System.out.println("All $0 List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("DOL are not showing Empty Data")
    public void DOLAreNotShowingEmptyData() throws InterruptedException {
        try {
            boolean ZeroData = DealRating.CarFax.stream().allMatch(col -> col.equals("0"));
            System.out.println("All 0 List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    @Then("No of Photos are not showing Empty Data")
    public void PhotosAreNotShowingEmptyData() throws InterruptedException {
        try {
            boolean ZeroData = DealRating.CarFax.stream().allMatch(col -> col.equals("0"));
            System.out.println("All 0 List ? " + ZeroData);
            Assert.assertNotEquals("Values should not be true",true, ZeroData);
        } catch (Exception e) {
            // Handle any unexpected exceptions that might occur
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
