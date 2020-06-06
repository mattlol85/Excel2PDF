package org.fitznet.doomdns.legal;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws IOException
    {
        File test = new File("spreadsheet.xlsx");
        FileInputStream fis = new FileInputStream(test);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(1);
        System.out.println(sheet.getSheetName());

        //createBlankDoc();
        readAndPopulate();
        

}

public static void createBlankDoc() throws IOException {
    PDDocument pdfDoc = new PDDocument();
    PDPage firstPage = new PDPage();
    // Add first page
    pdfDoc.addPage(firstPage);

    try {
        PDPageContentStream cs = new PDPageContentStream(pdfDoc, firstPage);
        // Writing to a page
        cs.beginText();
        cs.setFont(PDType1Font.COURIER, 15);
        cs.newLineAtOffset(20, 750);
        cs.setLeading(12);
        cs.showText("PDFBOX TEST. FITZNET 2020.");
        cs.newLine();
        String text = "This long ass string of text can span hella lines and apparently does something cool";
        cs.setFont(PDType1Font.TIMES_BOLD, 15);
        cs.setNonStrokingColor(Color.red);
        cs.showText(text);
        cs.newLine();
        cs.endText();
        cs.close();
        pdfDoc.save("test.pdf");
        pdfDoc.close();
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }

}
public static void readAndPopulate(){
    try{
        PDDocument doc = PDDocument.load(new File("SAMPLEPDF.pdf"));
        PDAcroForm docAcro = doc.getDocumentCatalog().getAcroForm();
        PDField name = docAcro.getField("name");
        name.setValue("Matthew Fitzgerald");
        name = docAcro.getField("address");
        name.setValue("testAddress 1235123 USA");
        doc.save("writtenFile.pdf");
        doc.close();
    }catch(IOException e){
        System.out.println(e.getMessage());
    }
}
}
// Read Workbook
//readWorkbook();
//Create new Client
//createNewClient();
//Print Pdf
//printPDF();