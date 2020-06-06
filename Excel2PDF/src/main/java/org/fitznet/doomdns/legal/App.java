package org.fitznet.doomdns.legal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws IOException
    {
        System.out.println( "Hello World!" );
        File test = new File("spreadsheet.xlsx");
        FileInputStream fis = new FileInputStream(test);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(1);
        System.out.println(sheet.getSheetName());
        

}
}