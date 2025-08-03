package Marathon3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CommonIntegrationExcel1 {

	public static String[][] readData(String excelFileName) throws IOException {
		//locate the workbook
		
		XSSFWorkbook wb=new XSSFWorkbook("./data/"+excelFileName+".xlsx");
		//locate the worksheet
		
		XSSFSheet ws = wb.getSheetAt(0);
		//locate the row
		/*
		 * XSSFRow row = ws.getRow(1); System.out.println(row); XSSFCell cell =
		 * row.getCell(1); System.out.println(cell); String stringCellValue =
		 * cell.getStringCellValue(); System.out.println(stringCellValue);
		 */
		/*
		 * String stringCellValue = ws.getRow(2).getCell(2).getStringCellValue();
		 * System.out.println(stringCellValue); //including the header row int
		 * physicalNumberOfRows = ws.getPhysicalNumberOfRows();
		 * System.out.println(physicalNumberOfRows);
		 */
		//to find the rowcount
		int rowCount = ws.getLastRowNum();
		//System.out.println(rowCount);
		//to find the column count
		short columnCount = ws.getRow(1).getLastCellNum();
		//System.out.println(columnCount);
		//entire row
		/*
		 * for (int i = 1; i <=rowCount; i++) { XSSFRow row = ws.getRow(i);
		 * System.out.println(row); }
		 */
		String[][] data=new String[rowCount][columnCount];
		//entire data
		for (int i = 1; i <=rowCount ; i++) {
			for (int j = 0; j <columnCount ; j++) {
				String stringCellValue2 = ws.getRow(i).getCell(j).getStringCellValue();
				//System.out.println(stringCellValue2);
				data[i-1][j]=stringCellValue2;//[0][0]
				
			}
			
		}
		wb.close();
		return data;
	}
}
