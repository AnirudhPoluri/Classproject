package generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Lib implements Iautoconstant {

static int rowcount;
	
static Workbook wb;
	public static String getproperties(String CONFIG_PATH,String Key) {
		
		String property="";
		
		Properties prop = new Properties();
		try {
			
			prop.load(new FileInputStream(CONFIG_PATH));
			property = prop.getProperty(Key);
			
		   }catch(Exception e) {
			   
			   
		   }
		
		return property;
		
	}
	
	
	
	public static int getRowCont(String Excel_path,String sheet) {
		
		try {
			 wb = WorkbookFactory.create(new FileInputStream(Excel_path));
			 rowcount = wb.getSheet(sheet).getLastRowNum();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
		 return rowcount;
	}
	public static String getCellvalue(String Excel_path,String sheet,int row,int column) {
		
		String value="";
		 try {
			wb = WorkbookFactory.create(new FileInputStream(Excel_path));
			 value = wb.getSheet(sheet).getRow(row).getCell(column).toString();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
		
		
		return value;
		
	}
	
	            
}
