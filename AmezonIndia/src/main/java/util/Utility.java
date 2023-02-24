package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EmptyFileException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	public static void captureScreenShot( WebDriver driver,String testID) throws IOException
	{
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		Date date = new Date();
		String currentDate= sdf.format(date);
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\RRRRR\\Videos\\Captures\\"+testID+currentDate+".jpg");
	    FileHandler.copy(source, dest);
	    
	}
	public static String getTestData(String sheet,int row,int cell) throws IOException 
	{
		String path="C:\\Users\\RRRRR\\Desktop\\grammer.xlsx";
	  FileInputStream file = new FileInputStream(path);
	  String credintial="";
	  Workbook book = WorkbookFactory.create(file);
	  try
	  {
		  book.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	  }
	  catch(IllegalStateException e)
	  {
		 
		 long data = (long)book.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
		
		 credintial = Long.toString(data);
	  }
	  
	  return credintial;
	}
	 }
	
	