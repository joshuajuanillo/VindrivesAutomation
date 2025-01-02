package steps.v2;

import Utility.Utility;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Utility.VdpsByChannelRprt;

public class VdpsByChannel {

    @When("All data are not zero from VDPs By Channel")
    public void AllDataAreNotZeroFromVDPsByChannel() {
        try {

            // Locate the table (adjust the selector as per your HTML structure)
            WebElement table = Utility.driver.findElement(By.xpath("//table[@class='chakra-table css-5605sr']"));
            Thread.sleep(5000);

            // Get headers
            List<WebElement> headerElements = table.findElements(By.xpath(".//thead/tr/th"));
            String[] headers = new String[headerElements.size()];
            for (int i = 0; i < headerElements.size(); i++) {
                headers[i] = headerElements.get(i).getText();
            }

            // Get rows
            List<WebElement> rowElements = table.findElements(By.xpath(".//tbody/tr"));
            List<String[]> rowData = new ArrayList<>();

            for (WebElement row : rowElements) {
                List<WebElement> cells = row.findElements(By.xpath(".//td"));
                String[] rowValues = new String[cells.size()];
                for (int j = 0; j < cells.size(); j++) {
                    rowValues[j] = cells.get(j).getText();
                }
                rowData.add(rowValues);
            }

            // Example: Printing the extracted data
            System.out.println("Headers:");
            for (String header : headers) {
                System.out.print(header + " ");
            }
            System.out.println("\nData:");

            for (String[] row : rowData) {
                for (String value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }

            // Optionally, if you want to convert List<String[]> to String[][]
            String[][] dataArray = new String[rowData.size()][];
            dataArray = rowData.toArray(dataArray);

            VdpsByChannelRprt.Providers = Arrays.deepToString(dataArray);
            System.out.println(Arrays.deepToString(dataArray).length());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
