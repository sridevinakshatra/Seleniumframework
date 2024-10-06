package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;

public class utilities {
	
	
	public static Object[][] getTestdatafromExcel(String sheetname) throws IOException
	{
		
		File f = new File(System.getProperty("user.dir")+"\\src\\main\\java\\testdata\\Testdata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheet(sheetname);
	int rows = sheet.getLastRowNum();
	int col = sheet.getRow(0).getLastCellNum();
	Object[][] obje = new Object[rows][col];
	for(int i =0;i<rows;i++)
	{
		XSSFRow row = sheet.getRow(i+1);
		for(int j = 0;j<col;j++)
		{
			XSSFCell cell = row.getCell(j);
			CellType celltype = cell.getCellType();
		switch(celltype){
				
		case STRING:
			obje[i][j] = cell.getStringCellValue();
			break;
		case NUMERIC:
			obje[i][j] = Integer.toString((int)cell.getNumericCellValue());
			break;
		case BOOLEAN:
			obje[i][j] = cell.getBooleanCellValue();
			break;
			
			
		
			}
			
			
		}
	}
	return obje;
	}

}
