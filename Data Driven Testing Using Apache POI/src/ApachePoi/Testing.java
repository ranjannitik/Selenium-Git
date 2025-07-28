package ApachePoi;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;


import org.openqa.selenium.WebDriver;


import org.testng.annotations.Test;

public class Testing {

    WebDriver driver;

    @Test
    public void TestPopups() throws Exception {
       
     
        File src = new File("C:\\Users\\nitikran\\Documents\\LEARNING\\Selenium Apache PoI test\\TestData.xlsx");

        // Load Excel file
        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet1 = wb.getSheetAt(0); // first sheet

        // Read data from first row (index 0), first two cells (0 and 1)
        String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
        System.out.println("Data from Excel Sheet1 (Cell 0,0): " + data0);

        String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
        System.out.println("Data from Excel Sheet1 (Cell 0,1): " + data1);

        
        wb.close();
        
    }
}
