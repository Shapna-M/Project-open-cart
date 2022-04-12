package group1_art;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.IOException;

public class excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fileloc="C:\\Batch 1\\group1_art\\src\\test\\java\\data\\Testdata.xlsx";
		XSSFWorkbook wbook = new XSSFWorkbook(fileloc);
		XSSFSheet sheet=wbook.getSheetAt(0);
		for(int i=1;i<=2;i++)
		{
		XSSFRow row=sheet.getRow(i);
		for(int j=0;j<2;j++)
		{
		XSSFCell cell = row.getCell(0);
		String value=cell.getStringCellValue();
		System.out.println(value);

		
		}
	}

	}
}
