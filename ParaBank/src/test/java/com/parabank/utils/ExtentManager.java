package com.parabank.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getReportInstance() {

        if (extent == null) {

            // Create Spark Reporter
            ExtentSparkReporter spark =
                    new ExtentSparkReporter(
                            "test-output/ExtentReport.html");

            // Report Configuration
            spark.config().setReportName(
                    "ParaBank Automation Report");

            spark.config().setDocumentTitle(
                    "ParaBank Extent Report");

            spark.config().setTheme(
                    Theme.STANDARD);

            spark.config().setTimeStampFormat(
                    "dd.MM.yyyy hh:mm:ss a");

            // Create Extent Report
            extent = new ExtentReports();

            extent.attachReporter(spark);

            // System Information
            extent.setSystemInfo(
                    "Tester", "Hemanth Kumar");

            extent.setSystemInfo(
                    "Environment", "QA");

            extent.setSystemInfo(
                    "Browser", "Chrome");

            extent.setSystemInfo(
                    "Operating System",
                    System.getProperty("os.name"));

            extent.setSystemInfo(
                    "Java Version",
                    System.getProperty("java.version"));
        }

        return extent;
    }
}
