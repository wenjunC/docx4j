package org.docx4j.samples.documents4j.local;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.docx4j.convert.out.documents4j.local.Documents4jLocalExporter;
import org.docx4j.openpackaging.exceptions.Docx4JException;

import com.documents4j.api.DocumentType;


/**
 * This example uses documents4j (running locally) to convert a docx file
 * to PDF.
 * 
 * Note that you'd typically have a WordprocessingMLPackage, in which case
 * see that example instead.
 *
 */
public class DocxFileToPDF {

	
	public static void main(String[] args) throws IOException, Docx4JException {
	
		File output = new File(System.getProperty("user.dir")+"/result.pdf");
		FileOutputStream fos = new FileOutputStream(output); 
		
		Documents4jLocalExporter exporter = new Documents4jLocalExporter();
		exporter.export(new File(System.getProperty("user.dir")+"/Hello.docx") , fos, DocumentType.MS_WORD); 
		
		fos.close();
	}
	
}	