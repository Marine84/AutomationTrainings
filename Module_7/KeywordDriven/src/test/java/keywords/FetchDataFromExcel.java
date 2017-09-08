package keywords;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

/**
 * Created by Marine_Yegoryan on 9/8/2017.
 */
public class FetchDataFromExcel {

    File excel = new File("src/test/resources/Keywords.xlsx");
    FileInputStream fis = new FileInputStream(excel);
    XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
    XSSFSheet mySheet = myWorkBook.getSheetAt(0);

    public int rowNum = mySheet.getLastRowNum();
    public int colnum = mySheet.getRow(rowNum).getLastCellNum();
    String[][] excelData = new String[rowNum][colnum];
    public int j;
    public int i;

    public void GetDataFromExcel() {
        for (i = 0; i < rowNum; i++) {
            XSSFRow row = mySheet.getRow(i);
            for (j = 0; j < colnum; j++) {
                XSSFCell cell = row.getCell(j);
                String value = cell.getStringCellValue();
                excelData[i][j] = value;
                System.out.println("value is " + excelData[i][j]);
            }
        }
    }

    public String GetExactDataFromExcel(int celNum, int RowNum){
        XSSFRow row = mySheet.getRow(celNum);
        XSSFCell cell = row.getCell(RowNum);
        String value = cell.getStringCellValue();
        return value;
    }

    public FetchDataFromExcel() throws IOException {
    }
}
