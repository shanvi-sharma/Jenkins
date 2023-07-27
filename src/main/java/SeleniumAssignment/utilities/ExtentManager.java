package SeleniumAssignment.utilities;

import java.io.File;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
    
    private static ExtentReports extent;
    
    public static ExtentReports getInstance(String Reports) {
    	if (extent == null) {
    		extent = new ExtentReports(Reports, true, DisplayOrder.NEWEST_FIRST);

			//Loading the configuration file for the report
			extent.loadConfig(new File(System.getProperty("user.dir") + "//reportConfig.xml"));
			
			//Adding the system information in the reports
			extent.addSystemInfo("Selenium Version", "4.3.0").addSystemInfo("Nagarro","Automation");
    	}
   
    	
        return extent;
    }
    
}
