package utils.extentreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;


public class ExtentManager {
	public static final ExtentReports extentReports = new ExtentReports();
	private static final SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
	static Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	static ExtentSparkReporter reporter = new ExtentSparkReporter("./reports/" + sdf1.format(timestamp) + ".html");

	public synchronized static ExtentReports createExtentReports() throws IOException {

		reporter.config().setReportName("Test Report for : Dummy Rest Api Example Employee");
		extentReports.attachReporter(reporter);
		extentReports.setSystemInfo("Test On", "Dummy Rest Api Example");
		extentReports.setSystemInfo("Author", "Burak Cengiz");
		return extentReports;
	}
}