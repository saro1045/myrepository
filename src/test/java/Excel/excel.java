package Excel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Browser.Browser;

public class excel extends Browser {
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	
	public void excels(String sheetname) throws Exception  {
		
		
		workbook=new XSSFWorkbook("C:\\Users\\ephron\\Desktop\\Book3.xlsx");
		sheet=workbook.getSheet(sheetname);
		
	}
	
}
