package Resources;
import Utility.GlobalUtility;

public class Common {
    public static String ResultSummaryQuickResultTable = "//body/div[@id='root']/div[2]/div[3]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/table[1]";

    // Filter
    public static String LastSevenDays = "//button[contains(text(),'Last 7 Days')]";
    public static String LastMonth = "//body/div[@id='root']/div[2]/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]";
    public static String LastThirtyDays = "//button[contains(text(),'Last 30 Days')]";
    public static String LastSixtyDays = "//body/div[@id='root']/div[2]/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[4]";
    public static String LastNinetyDays = "//body/div[@id='root']/div[2]/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[5]";
    public static String AllTime = "//button[contains(text(),'All Time')]";

    public static String VehicleTypeUsed = "//body/div[@id='root']/div[2]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]";
    public static String VehicleTypeNew = "//body/div[@id='root']/div[2]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]";

    public static String LastSevenDaysV2 = "//button[normalize-space()='Last 7 Days']";
    public static String LastMonthV2 = "//button[normalize-space()='Last Month']";
    public static String AllTimeV2 = "//button[normalize-space()='All Time']";
    public static String LastThirtyDaysV2 = "//button[normalize-space()='Last 30 Days']";
    public static String LastSixtyDaysV2 = "//div[@class='styles_tableDateRange__jLnrb']//button[@class='styles_buttonGroup__button__v1c-M'][normalize-space()='Last 60 Days']";
    public static String LastNinetyDaysV2 = "//div[@class='styles_tableDateRange__jLnrb']//button[@class='styles_buttonGroup__button__v1c-M'][normalize-space()='Last 90 Days']";
}
