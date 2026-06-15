package com.parabank.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getReportInstance() {

        if (extent == null) {

            ExtentSparkReporter spark =
                    new ExtentSparkReporter(
                            "test-output/ExtentReport.html");

            spark.config().setReportName(
                    "ParaBank Automation Report");

            spark.config().setDocumentTitle(
                    "ParaBank Extent Report");

            extent = new ExtentReports();

            extent.attachReporter(spark);

            extent.setSystemInfo(
                    "Tester", "Hemanth Kumar");

            extent.setSystemInfo(
                    "Environment", "QA");

            extent.setSystemInfo(
                    "Browser", "Chrome");
        }

        return extent;
    }
}
