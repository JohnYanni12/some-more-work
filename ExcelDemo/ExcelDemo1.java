package ExcelDemo;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo1 {
    public static void main(String[] args) throws IOException {

    String path = "/Users/johnhgayed/eclipse-workspace/StringDemo1/Data/Test.xlsx";//we need to know the path of the file
    FileInputStream fileInputStream = new FileInputStream(path); //navigate to this path
        //that special that can handle the xlsx files
        XSSFWorkbook excelFile = new XSSFWorkbook(fileInputStream);

Sheet sheet = excelFile.getSheet("Sheet1");
int noOfRows = sheet.getPhysicalNumberOfRows();

      //  System.out.println(noOfRows);

        for (int i = 0; i < noOfRows; i++) {
            Row row = sheet.getRow(i);
            int noOfCell = row.getPhysicalNumberOfCells();
            for (int j = 0; j < noOfCell; j++) {
                Cell cell = row.getCell(j);
                System.out.print(cell + " ");

            }
            System.out.println();
            }

//        }//Row row0 = sheet.getRow(0);
//        System.out.println(row0.getCell(0));
//        Row row1 = sheet.getRow(2);
//        System.out.println(row1.getCell(0));
    }
}