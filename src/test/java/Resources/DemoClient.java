package Resources;

public class DemoClient {

   // Merchandising Report
   public static String DealRatingsByChennelMenu = "//body/div[@id='root']/div[2]/div[1]/ul[1]/li[2]/button[1]";
   public static String DealRatingByChannelTable = "//body/div[@id='root']/div[2]/div[3]/div[2]/div[3]/div[1]/div[3]/table[1]";
   public static String TipReportTable = "//body/div[@id='root']/div[2]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]";
   public static String ChannelStatReportTable = "//body/div[@id='root']/div[2]/div[3]/div[2]/div[3]/div[1]/div[3]/table[1]";
   public static String PreshootReportTable = "//body/div[@id='root']/div[2]/div[3]/div[2]/div[3]/div[2]/div[2]/table[1]";
   public static String VdpResultTable = "//body/div[@id='root']/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]";

   public static String DealRatingsByChennelTab = "//li[contains(text(),'Deal Ratings by Channel')]";
   public static String TipReportTab = "//button[normalize-space()='Tip Report']";
   public static String ChannelStatReportTab = "//button[normalize-space()='Channel Stats Report']";
   public static String PreShootReportTab = "//button[normalize-space()='Pre Shoot Report']";

   // VDP Result
   public static String VdpResults = "//body/div[@id='root']/div[2]/div[1]/ul[1]/li[3]/button[1]";
   public static String VDPResultLastMonth = "//button[contains(text(),'Last Month')]";

   //Advance Report
   public static String LeadsTab = "//body/div[@id='root']/div[2]/div[1]/ul[1]/li[4]/button[1]";
   public static String Leads = "//li[contains(text(),'Leads')]";
   public static String MostVdps = "//button[contains(text(),'Most VDPs')]";
   public static String LeastVdps = "//button[contains(text(),'Least VDPs (10+ DOL)')]";
   public static String DaysOnLot = "//button[contains(text(),'Days on Lot')]";

   public static String LeadsTable = "//body/div[@id='root']/div[2]/div[3]/div[2]/div[1]/div[3]/div[3]/table[1]";
   public static String MostVdpsTable = "//body/div[@id='root']/div[2]/div[3]/div[2]/div[1]/div[3]/div[3]/table[1]";
   public static String LeastVdpsTable = "//body/div[@id='root']/div[2]/div[3]/div[2]/div[1]/div[3]/div[3]/table[1]";
   public static String DaysOnLotTable = "//body/div[@id='root']/div[2]/div[3]/div[2]/div[1]/div[3]/div[3]/table[1]";
   public static String AdvanceReportLastMonth = "//body/div[@id='root']/div[2]/div[3]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]";

   // Marketing Result
   public static String BudgetRoiTab = "//body/div[@id='root']/div[2]/div[1]/ul[1]/li[5]/button[1]";
   public static String BudgetRoi = "//li[contains(text(),'Budget ROI')]";
   public static String BudgetRoiTable = "//body/div[@id='root']/div[2]/div[3]/div[1]/div[3]/div[1]/div[1]/div[3]/table[1]";
   public static String BudgetRoiLastSevenDays = "//button[contains(text(),'Last 7 Days')]";
   public static String BudgetRoiLastMonth = "//button[contains(text(),'Last Month')]";
   public static String BudgetRoiLastNinetyDays = "//button[contains(text(),'Last 90 Days')]";

   public static String VdpsByChannelTab = "//body/div[@id='root']/div[2]/div[1]/ul[1]/li[5]/button[1]";
   public static String VdpsByChannel = "//li[contains(text(),'VDPs by Channel')]";
   public static String VdpsByChannelTable = "//body/div[@id='root']/div[2]/div[3]/div[1]/div[3]/div[1]/div[3]/table[1]";
   public static String VdpsByChannelLastSevenDays = "//button[contains(text(),'Last 7 Days')]";
   public static String VdpsByChannelLastMonth = "//button[contains(text(),'Last Month')]";
   public static String VdpsByChannelLastNinetyDays = "//button[contains(text(),'Last 90 Days')]";

   public static String TopTenWebsiteTab = "//body/div[@id='root']/div[2]/div[1]/ul[1]/li[5]/button[1]";
   public static String TopTenWebsite = "//li[contains(text(),'Top 10 Website Sources')]";
   public static String TopTenWebsiteTable = "//body/div[@id='root']/div[2]/div[3]/div[1]/div[3]/div[1]/div[3]/table[1]";
   public static String TopTenWebsiteLastSevenDays = "//button[contains(text(),'Last 7 Days')]";
   public static String TopTenWebsiteLastMonth = "//button[contains(text(),'Last Month')]";
   public static String TopTenWebsiteLastNinetyDays = "//button[contains(text(),'Last 90 Days')]";

   public static String VdpRoiTab = "//body/div[@id='root']/div[2]/div[1]/ul[1]/li[5]/button[1]";
   public static String VdpRoi = "//li[contains(text(),'VDP ROI')]";
   public static String VdpRoiTable = "//body/div[@id='root']/div[2]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/table[1]";
   public static String VdpRoiLastSevenDays = "//button[contains(text(),'Last 7 Days')]";
   public static String VdpRoiLastMonth = "//button[contains(text(),'Last Month')]";
   public static String VdpRoiLastNinetyDays = "//button[contains(text(),'Last 90 Days')]";

   public static String NewInventoryDemoClientZeroLeads = "//tbody/tr/td[5]";

   public static String TippableCargurus = "//div[@class='styles_tableContainer__daXYB styles_frontLineReadyTable__YwpoD']//table[@class='styles_table__0+Z02']//tr/td[count( //div[@class='styles_tableContainer__daXYB styles_frontLineReadyTable__YwpoD']//table[@class='styles_table__0+Z02']//th[normalize-space(.)='Tippable CarGurus']/preceding-sibling::th) + 1]";
   public static String TippableAutotrader = "//div[@class='styles_tableContainer__daXYB styles_frontLineReadyTable__YwpoD']//table[@class='styles_table__0+Z02']//tr/td[count( //div[@class='styles_tableContainer__daXYB styles_frontLineReadyTable__YwpoD']//table[@class='styles_table__0+Z02']//th[normalize-space(.)='Tippable Autotrader']/preceding-sibling::th) + 1]";
   public static String TippableCarsDotCom = "//div[@class='styles_tableContainer__daXYB styles_frontLineReadyTable__YwpoD']//table[@class='styles_table__0+Z02']//tr/td[count( //div[@class='styles_tableContainer__daXYB styles_frontLineReadyTable__YwpoD']//table[@class='styles_table__0+Z02']//th[normalize-space(.)='Tippable Cars.com']/preceding-sibling::th) + 1]";
   public static String ZeroLeads = "//div[@class='styles_tableContainer__daXYB styles_frontLineReadyTable__YwpoD']//table[@class='styles_table__0+Z02']//tr/td[count( //div[@class='styles_tableContainer__daXYB styles_frontLineReadyTable__YwpoD']//table[@class='styles_table__0+Z02']//th[normalize-space(.)='Zero Leads']/preceding-sibling::th) + 1]";

   public static String CargurusRankSort = "//thead/tr[1]/th[3]/div[1]/div[2]/*[1]";
   public static String AutotraderRankSort = "//body[1]/div[1]/div[2]/div[3]/div[2]/div[3]/div[1]/div[3]/table[1]/thead[1]/tr[1]/th[4]/div[1]/div[2]";
   public static String CarsDotCom = "//body[1]/div[1]/div[2]/div[3]/div[2]/div[3]/div[1]/div[3]/table[1]/thead[1]/tr[1]/th[5]/div[1]/div[2]";

}
