package model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import service.JobConstructor;

public class ExcelGeneration {
	static FileOutputStream fileout;
	
	public static void excelgenerate(JobConstructor itjob, List<JobConstructor> list) throws IOException {
		
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("ProGrad Job Search ");
		HSSFRow hrow = sheet.createRow(0);
		hrow.createCell(0).setCellValue("Job Id");
		hrow.createCell(1).setCellValue("Job Title");
		hrow.createCell(2).setCellValue("Job Description");
		hrow.createCell(3).setCellValue("Job Website");
		
		int i =0;
		for(JobConstructor jobcon : list) {
			int j = i+1;
			HSSFRow row =sheet.createRow(j);
			row.createCell(0).setCellValue(jobcon.getJobid());
			row.createCell(1).setCellValue(jobcon.getJobtitle());
			row.createCell(2).setCellValue(jobcon.getJobDescription());
			row.createCell(3).setCellValue(jobcon.getWebsite());
			i++;
				
			
			
		}
		
		fileout = new FileOutputStream("E:\\progradejobsearch.xlsx");
		workbook.write(fileout);
		
		fileout.close();
	}
	
	

}
