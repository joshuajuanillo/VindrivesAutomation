package Resources;

public class DemoClient {

   //ResultSummary
   public static String TopVehicleVDPs = "//div[@class='styles_tableContainer__daXYB']//table[@class='styles_table__0+Z02']";

   // Merchandising Report
   public static String DealRatingsByChennelMenu = "//li[2]//button[1]//*[name()='svg']";
   public static String DealRatingByChannelTable = "//body/div[@id='root']/div[2]/div[3]/div[2]/div[3]/div[1]/div[3]/table[1]";
   public static String TipReportTable = "//table[@class='chakra-table css-5605sr']";
   public static String ChannelStatReportTable = "//table[@class='styles_table__0+Z02']";
   public static String PreshootReportTable = "//table[@class='styles_table__0+Z02']";
   public static String VdpResultTable = "//body/div[@id='root']/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]";

   public static String DealRatingsByChennelTab = "//li[contains(text(),'Deal Ratings by Channel')]";
   public static String TipReportTab = "//li[contains(text(),'Tip Report')]";
   public static String ChannelStatReportTab = "//li[normalize-space()='Channel Stats Report']";
   public static String PreShootReportTab = "//li[normalize-space()='Pre Shoot Report']";

   // VDP Result
   public static String VdpResults = "//body/div[@id='root']/div[2]/div[1]/ul[1]/li[3]/button[1]";
   public static String VDPResultLastMonth = "//button[contains(text(),'Last Month')]";

   //Advance Report
   public static String LeadsTab = "//body/div[@id='root']/div[2]/div[1]/ul[1]/li[4]/button[1]";
   public static String Leads = "//li[contains(text(),'Leads')]";
   public static String MostVdps = "//button[contains(text(),'Most VDPs')]";
   public static String LeastVdps = "//button[contains(text(),'Least VDPs (10+ DOL)')]";
   public static String DaysOnLot = "//button[contains(text(),'Days on Lot')]";

   public static String LeadsTable = "//table[@class='chakra-table css-5605sr']";
   public static String MostVdpsTable = "//table[@class='chakra-table css-5605sr']";
   public static String LeastVdpsTable = "//table[@class='chakra-table css-5605sr']";
   public static String DaysOnLotTable = "//table[@class='chakra-table css-5605sr']";
   public static String AdvanceReportLastMonth = "//div[@class='css-1q94rgb']//button[@class='styles_buttonGroup__button__v1c-M'][normalize-space()='Last Month']";

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

   // Provider Columns
   public static String TippableCargurus = "//div[@class='styles_tableContainer__daXYB styles_frontLineReadyTable__YwpoD']//table[@class='styles_table__0+Z02']//tr/td[count( //div[@class='styles_tableContainer__daXYB styles_frontLineReadyTable__YwpoD']//table[@class='styles_table__0+Z02']//th[normalize-space(.)='Tippable CarGurus']/preceding-sibling::th) + 1]";
   public static String TippableAutotrader = "//div[@class='styles_tableContainer__daXYB styles_frontLineReadyTable__YwpoD']//table[@class='styles_table__0+Z02']//tr/td[count( //div[@class='styles_tableContainer__daXYB styles_frontLineReadyTable__YwpoD']//table[@class='styles_table__0+Z02']//th[normalize-space(.)='Tippable Autotrader']/preceding-sibling::th) + 1]";
   public static String TippableCarsDotCom = "//div[@class='styles_tableContainer__daXYB styles_frontLineReadyTable__YwpoD']//table[@class='styles_table__0+Z02']//tr/td[count( //div[@class='styles_tableContainer__daXYB styles_frontLineReadyTable__YwpoD']//table[@class='styles_table__0+Z02']//th[normalize-space(.)='Tippable Cars.com']/preceding-sibling::th) + 1]";
   public static String ZeroLeads = "//div[@class='styles_tableContainer__daXYB styles_frontLineReadyTable__YwpoD']//table[@class='styles_table__0+Z02']//tr/td[count( //div[@class='styles_tableContainer__daXYB styles_frontLineReadyTable__YwpoD']//table[@class='styles_table__0+Z02']//th[normalize-space(.)='Zero Leads']/preceding-sibling::th) + 1]";

   // Sorting Table
   public static String CargurusRankSort = "//th[@id='cgr_deal_rating']//div[@class='styles_table__header__item--sortable__d3Fzm']//*[name()='svg']";
   public static String AutotraderRankSort = "//th[@id='atc_deal_rating']//div[@class='styles_table__header__item--sortable__d3Fzm']//*[name()='svg']";
   public static String CarsDotComSort = "//th[@id='ccm_deal_rating']//div[@class='styles_table__header__item--sortable__d3Fzm']//*[name()='svg']";
   public static String DolSort = "//th[@id='dol']//div[@class='styles_table__header__item--sortable__d3Fzm']//*[name()='svg']";
   public static String PriceSort = "//th[@id='price']//div[@class='styles_table__header__item--sortable__d3Fzm']//*[name()='svg']";
   public static String PhotoSort = "//th[@id='photos_count']//div[@class='styles_table__header__item--sortable__d3Fzm']//*[name()='svg']";
}
