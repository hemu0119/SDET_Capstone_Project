# ParaBank Automation Framework

## Overview

This project is a Selenium Automation Framework developed using Java, Selenium WebDriver, TestNG, Maven, Jenkins, and the Page Object Model (POM) design pattern.

The framework automates the complete user registration and login functionality of the ParaBank application and demonstrates reusable automation architecture, reporting, screenshot capture, and CI/CD integration.

---

# Technologies Used

* Java
* Selenium WebDriver
* TestNG
* Maven
* WebDriverManager
* Extent Reports
* Apache Commons IO
* Jenkins
* Git & GitHub

---

# Framework Design

The framework follows the **Page Object Model (POM)** design pattern for better maintainability, scalability, and code reusability.

---

# Project Structure

```
src/test/java

├── com.parabank.base
│     └── BaseClass.java
│
├── com.parabank.pages
│     ├── RegisterPage.java
│     └── LoginPage.java
│
├── com.parabank.tests
│     └── RegisterTest.java
│
├── com.parabank.utils
│     ├── Utility.java
│     ├── ScreenshotUtil.java
│     └── ExtentManager.java
│
├── pom.xml
├── testng.xml
└── Jenkinsfile
```

---

# Automated Scenarios

## User Registration

The framework automates:

* Opening ParaBank Application
* Filling Registration Form
* Entering User Details
* Creating Unique Username
* Registering User
* Verifying Successful Registration

## Login Functionality

The framework automates:

* Logout Operation
* Login with Registered Credentials
* Verification of Successful Login

---

# Framework Features

### Page Object Model (POM)

Page classes are separated from test classes for better maintenance.

### Base Class

Centralized browser setup and teardown methods.

### Utility Class

Reusable methods for generating unique usernames.

### Screenshot Utility

Automatically captures screenshots whenever a test fails.

### Extent Reports

Generates professional HTML execution reports.

### TestNG Execution

Supports execution using testng.xml.

### Maven Integration

Dependency management and build execution.

### Jenkins CI/CD Integration

Automates build and test execution.

### GitHub Version Control

Maintains project source code and version history.

---

# Reporting

## Extent Reports

Reports are generated automatically after execution.

```
test-output/
└── ExtentReport.html
```

Report includes:

* Execution Summary
* Pass / Fail Status
* Test Details
* Execution Time
* Environment Information
* Browser Information
* Screenshots (on failure)

---

# Screenshot Capture

Screenshots are automatically captured whenever a test fails.

```
test-output/
└── screenshots/
      └── RegistrationFailed.png
```

This helps in debugging and analyzing failures.

---

# Test Execution

## Using Maven

Run the complete test suite using:

```bash
mvn test
```

## Using TestNG

Run:

```
testng.xml
```

as TestNG Suite.

---

# Jenkins CI/CD Integration

The framework is integrated with Jenkins.

Jenkins performs the following:

* Pull latest code from GitHub
* Execute Maven Build
* Run TestNG Test Suite
* Generate Extent Reports
* Archive Test Results
* Publish Extent Reports

---

# Jenkins Workflow

```
GitHub Repository
        ↓
Jenkins Pipeline
        ↓
Checkout Stage
        ↓
Build Stage
        ↓
Execute Tests Stage
        ↓
Extent Report Generation
        ↓
Report Published
        ↓
Build Result Published
```

---

# Jenkins Pipeline Stages

### Checkout Stage

Clones the latest source code from GitHub repository.

### Build Stage

Executes:

```bash
mvn clean
```

to clean previous build files.

### Execute Tests Stage

Executes:

```bash
mvn test
```

to run automation scripts.

### Post Actions

* Archive test artifacts
* Publish Extent Reports
* Display build status

---

# Project Outcome

* Automated User Registration
* Automated Login Validation
* Page Object Model Implementation
* Reusable Framework Design
* Screenshot Capture on Failure
* Extent Reporting
* Jenkins CI/CD Integration
* GitHub Integration
* Maven Build Management

---

# Future Enhancements

* Data Driven Testing using Excel
* Cross Browser Execution
* Parallel Execution using TestNG
* Log4j Logging
* Docker Integration
* Selenium Grid Integration

---

# Author

**Hemanth Kumar**

**Wipro SDET Automation Testing Capstone Project**
