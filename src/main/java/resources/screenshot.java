
package resources;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class screenshot extends Base{
	//public File src;
	public String result;
	public static void getSS(String result) throws IOException
	{
 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(src,new File("./SS/"+result+"screenshot.png"));
	//return result;
	
	} 

}
