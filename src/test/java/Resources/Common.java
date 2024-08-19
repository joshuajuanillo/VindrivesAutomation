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
}
