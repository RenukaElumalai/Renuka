package testCases;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnReport {
	@Test
	public void reportSample() throws IOException
	{
		ExtentHtmlReporter html = new ExtentHtmlReporter(new File("./reports/result.html"));
		html.setAppendExisting(true);
		//to build reports
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		// create a test with desc
		ExtentTest test =extent.createTest("TestCase_002", "MergeLeadTest");
		test.assignAuthor("Gayathri");
		test.assignCategory("Smoke");
		//testcase steps
		test.pass("DemoSales Manager entered Successfully", 
				MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/snap0.jpeg").build());
		test.pass("crmsfa entered Successfully"+test.addScreenCaptureFromPath("./../snaps/snap0.jpeg"));
		extent.setAnalysisStrategy(AnalysisStrategy.TEST);
		extent.flush();			


	}

}