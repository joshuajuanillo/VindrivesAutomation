package Utility;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class GlobalUtility {
    public static String DealerName = "";
    public static String vehicleType = "";

    public static void selectDropdown(List<WebElement> clickDealer, String dealerName) throws InterruptedException {

        System.out.println(clickDealer);
        for (WebElement option : clickDealer)
        {
            if (option.getText().equals(dealerName))
            {
                option.click(); // click the desired option
                break;
            }
        }
        Thread.sleep(10000);
    }

    public static void checkAllZeroData(ArrayList<Integer> tippableCargurus){
        System.out.println("Array List " + tippableCargurus);
        boolean allZeros = tippableCargurus.stream().allMatch(num -> num == 0);
        System.out.println("All Zero List ? " + allZeros);
        Assert.assertNotEquals("Values should not be true",true, allZeros);
    }

    public static void checkTableIfEmpty(Integer ReportTable, String DataValue){
        System.out.println(DataValue);
        if(DataValue.equalsIgnoreCase("No Data") || DataValue.equalsIgnoreCase("No results.")){
            Assert.assertTrue("Data should have data", 0 > 1);
        }else{
            Assert.assertTrue("Data should have data", 0 < ReportTable);
        }
    }

    public static void checkAllUnkownData(ArrayList<String> column){
        System.out.println("Array List " + column);
        boolean allUnknown = column.stream().allMatch(col -> col.equals("Unknown"));
        System.out.println("All Unknown List ? " + allUnknown);
        Assert.assertNotEquals("Values should not be true",true, allUnknown);
    }

    public static void checkAllNullData(ArrayList<String> column){
        System.out.println("Array List " + column);
        boolean allUnknown = column.stream().allMatch(col -> col.equals(""));
        System.out.println("All Null List ? " + allUnknown);
        Assert.assertNotEquals("Values should not be true",true, allUnknown);
    }

    public static void checkAllNAData(ArrayList<String> column){
        System.out.println("Array List " + column);
        boolean allUnknown = column.stream().allMatch(col -> col.equals("N/A"));
        System.out.println("All Null List ? " + allUnknown);
        Assert.assertNotEquals("Values should not be true",true, allUnknown);
    }

    public static void checkIfAllZeroData(ArrayList<String> column){
        System.out.println("Array List " + column);
        boolean allUnknown = column.stream().allMatch(col -> col.equals("0"));
        System.out.println("All Zero List ? " + allUnknown);
        Assert.assertNotEquals("Values should not be true",true, allUnknown);
    }

    public static void checkIfALlZeroPercent(ArrayList<String> column){
        System.out.println("Array List " + column);
        boolean allUnknown = column.stream().allMatch(col -> col.equals("0.00%"));
        System.out.println("All Unknown List ? " + allUnknown);
        Assert.assertNotEquals("Values should not be true",true, allUnknown);
    }
}
