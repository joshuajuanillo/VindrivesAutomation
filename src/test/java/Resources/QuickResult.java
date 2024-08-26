package Resources;

public class QuickResult {
    // New Inventory Demo Client Note : Remove Index from tr[1] to get all rows
    public static String MissingPhotos = "//div[@class='styles_tableContainer__daXYB styles_frontLineReadyTable__YwpoD']//table[@class='styles_table__0+Z02']//tr/td[count( //div[@class='styles_tableContainer__daXYB styles_frontLineReadyTable__YwpoD']//table[@class='styles_table__0+Z02']//th[normalize-space(.)='Missing Photos']/preceding-sibling::th) + 1]";
    public static String LessThanFiftyVdps = "//div[@class='styles_tableContainer__daXYB styles_frontLineReadyTable__YwpoD']//table[@class='styles_table__0+Z02']//tr/td[count( //div[@class='styles_tableContainer__daXYB styles_frontLineReadyTable__YwpoD']//table[@class='styles_table__0+Z02']//th[normalize-space(.)='Less than 50 VDPs']/preceding-sibling::th) + 1]";

}
