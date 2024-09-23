package Resources;
import Utility.GlobalUtility;

public class Common {
    public static String ResultSummaryQuickResultTable = "//body/div[@id='root']/div[2]/div[3]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/table[1]";

    // Filter
    public static String LastSevenDays = "//button[normalize-space()='Last 7 Days']";
    public static String LastMonth = "//button[normalize-space()='Last Month']";
    public static String LastThirtyDays = "//div[@class='css-1q94rgb']//button[@class='styles_buttonGroup__button__v1c-M'][normalize-space()='Last 30 Days']";
    public static String LastSixtyDays = "//div[@class='css-1q94rgb']//button[@class='styles_buttonGroup__button__v1c-M'][normalize-space()='Last 60 Days']";
    public static String LastNinetyDays = "//button[normalize-space()='Last 90 Days']";
    public static String AllTime = "//button[contains(text(),'All Time')]";

    public static String VehicleTypeUsed = "//button[contains(text(),'Used Inventory')]";
    public static String VehicleTypeNew = "//button[contains(text(),'New Inventory')]";

    public static String LastSevenDaysV2 = "//button[normalize-space()='Last 7 Days']";
    public static String LastMonthV2 = "//div[@class='css-1q94rgb']//button[@class='styles_buttonGroup__button__v1c-M'][normalize-space()='Last Month']";
    public static String AllTimeV2 = "//button[normalize-space()='All Time']";
    public static String LastThirtyDaysV2 = "//button[normalize-space()='Last 30 Days']";
    public static String LastSixtyDaysV2 = "//div[@class='css-1q94rgb']//button[@class='styles_buttonGroup__button__v1c-M'][normalize-space()='Last 60 Days']";
    public static String LastNinetyDaysV2 = "//div[@class='css-1q94rgb']//button[@class='styles_buttonGroup__button__v1c-M'][normalize-space()='Last 90 Days']";
}
