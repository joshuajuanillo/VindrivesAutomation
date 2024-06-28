package steps;

import Resources.NeedAttention;
import Utility.Utility;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class needsAttentionStepsDefinition {

    @When("the {string} results score has data")
    public void the_results_score_has_data(String resultColor) throws InterruptedException {
        switch (resultColor) {
            case "Red":
                // Find the elements using Selenium
                List<WebElement> NeedAttentionRed = Utility.driver.findElements(By.xpath(NeedAttention.RedNeedAttention));

                // Create an array to store the text from elements
                String[] NeedAttentionRedArray = new String[NeedAttentionRed.size()];

                // Iterate through the elements and store their text in the array
                for (int i = 0; i < NeedAttentionRed.size(); i++) {
                    NeedAttentionRedArray[i] = NeedAttentionRed.get(i).getText();
                }
                System.out.println("Hello" + Arrays.toString(NeedAttentionRedArray));
                // Print the text from the array
                for (String text : NeedAttentionRedArray) {
                    // Split the input string by newline character '\n'
                    String[] stringArray = text.split("\n");

                    Assert.assertNotEquals("Values should not be equal","0", stringArray[0]);
                }
                break;
            case "Yellow":
                // Find the elements using Selenium
                List<WebElement> NeedAttentionYellow = Utility.driver.findElements(By.xpath(NeedAttention.YellowNeedAttention));

                // Create an array to store the text from elements
                String[] NeedAttentionYellowArray = new String[NeedAttentionYellow.size()];

                // Iterate through the elements and store their text in the array
                for (int i = 0; i < NeedAttentionYellow.size(); i++) {
                    NeedAttentionYellowArray[i] = NeedAttentionYellow.get(i).getText();
                }
                System.out.println("Hello" + Arrays.toString(NeedAttentionYellowArray));
                // Print the text from the array
                for (String text : NeedAttentionYellowArray) {
                    // Split the input string by newline character '\n'
                    String[] stringArray = text.split("\n");
                    Assert.assertNotEquals("Values should not be equal","0", stringArray[0]);
                }
                break;
        }
    }
}
