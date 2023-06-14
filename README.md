# CucumberBDD
This is a UI Automation framework for https://reqres.in/ where in the feature files are created under
/src/test/resources/uiautomation 
step definition files are kept under /src/test/java

Prerequisites Before you begin, ensure that you have the following tools installed on your computer:

a. Git b. Maven c. A Java Development Kit (JDK)

Step 1: Clone the Repository Clone the GitHub repository to your local machine. Follow these steps to clone the repository:

Open a terminal or command prompt on your computer. Navigate to the directory where you want to clone the repository. Run the following command to clone the repository: git clone Replace with the URL of the GitHub repository provided.
git clone Replace with the URL of the GitHub repository provided.

Step 2: Build the Project After cloning the repository, navigate to the project directory
by running cd [repository directory] in command prompt
and run the following command to build the project using Maven: 
mvn clean install 
This command will compile the code, run tests, and generate a JAR file in target directory
Then use can use mvn verify to run all the test cases from command prompt

Reports
This project generates multiple types of test reports:

PDF Report: [test output>PdfReport>ExtentPdf.pdf].

Spark Report: [test output>SparkReport>index.html].

Browser Cucumber Report: [Once the tests are executed and build is success you will see a View your cucumber reprt Web URL. Copy paste it in browser and report will load].



