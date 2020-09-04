package model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import service.JobConstructor;

public class PdfGeneration {
	
	public static void excelgenerate(JobConstructor itjob, List<JobConstructor> list) throws IOException {

	//public static void display() {
		
		
	Document document = new Document();
	
	try {
	PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("E:\\ProGradJobSearch.pdf"));
	document.open();
	Paragraph paragraph = new Paragraph("PROGRADE JOB SEARCH ");
	Paragraph paragraph1 = new Paragraph("List Of Job Available  ");
	document.add(paragraph);
	
	
	PdfPTable table = new PdfPTable(4);
	table.setWidthPercentage(100);
	table.setSpacingBefore(11f);
	table.setSpacingAfter(11f);
	
	
	float[] colwidth = {2f,2f,2f,2f};
	table.setWidths(colwidth);
	
	
	
//	PdfPCell c1 = new PdfPCell(new Paragraph("Job ID"));
//	PdfPCell c2 = new PdfPCell(new Paragraph("Job Title"));
//	PdfPCell c3 = new PdfPCell(new Paragraph("Job Description"));
//	PdfPCell c4 = new PdfPCell(new Paragraph("Job Website"));
//	table.addCell(c1);
//	table.addCell(c2);
//	table.addCell(c3);
//	table.addCell(c4);
	
	
	
	
	
	/////////////////////////////////////////////
	int i =0;
	for(JobConstructor jobcon : list) {
		int j=i+1;
		
		PdfPCell c1 = new PdfPCell(new Paragraph(jobcon.getJobid()));
		PdfPCell c2 = new PdfPCell(new Paragraph(jobcon.getJobtitle()));
		PdfPCell c3 = new PdfPCell(new Paragraph(jobcon.getJobDescription()));
		PdfPCell c4 = new PdfPCell(new Paragraph(jobcon.getWebsite()));
		table.addCell(c1);
		table.addCell(c2);
		table.addCell(c3);
		table.addCell(c4);

		
	}

	
	
	
	
	
	document.add(table);
	
	
	

	document.close();
	writer.close();
	
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}

}
