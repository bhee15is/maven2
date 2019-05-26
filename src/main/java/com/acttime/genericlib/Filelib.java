package com.acttime.genericlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author bhima
 * this class contain file related methods which is used to read the dta from excel and 
 */

public class Filelib {
	/**
	 * it is used to get the property key value from common_data,properties
	 * @param key
	 * @return value
	 * @throws  
	 * @throws Throwable
	 */
	public String getPropertyKeyValue(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./data/commondata.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String value=pobj.getProperty(key);
		
		return value;

	}
	
	/**
	 * its is used to read data  from excel_workbook,based on user argument
	 * @param sheetname 
	 * @param rownum,cellnum
	 * @return data
	 * @throws Throwable
	 */
	public String getExcelData(String SheetName,int rownum,int cellnum)throws Throwable 
	{
		FileInputStream fis=new FileInputStream("./data/testdata.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet(SheetName);
	Row row=sh.getRow(rownum);
	String Data=row.getCell(cellnum).getStringCellValue();
	wb.close();
	return Data;
	
}
	/**
	 * used to write data back to Excel based on used argumnrt 
	 * @param SheetName
	 * @param roenum.cellnum,data
	 * @throws Throwable
	 */
	public void SetExcelData(String SheetName,int rownum,int cellnum,String data)throws Throwable
	{
		FileInputStream fis=new FileInputStream("./data/testdata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(SheetName);
		Row row=sh.getRow(rownum);
		Cell cell=row.createCell(cellnum);
		cell.setCellValue(data);
		FileOutputStream fos=new FileOutputStream("./data/testdata.xlsx");
		wb.write(fos);
		wb.close();
	}
	
	
	
	
}