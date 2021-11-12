package Excel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Browser.Browser2;

public class excel2 extends Browser2{
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	
	public void excels2(String sheetname) throws Exception  {
		
		
		workbook=new XSSFWorkbook("C:\\Users\\ephron\\Desktop\\Book3.xlsx");
		sheet=workbook.getSheet(sheetname);
		
	}

}
