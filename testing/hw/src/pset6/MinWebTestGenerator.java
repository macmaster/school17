package pset6;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/** MinWebTestGenerator <br>
 * Generates a test suite for the the min web application.
 * Achieves combinatorial coverage.
 * 
 * four inputs: three numbers and a button click
 * x, y, z : integer inputs
 * computeButton : a button click
 * 
 * @author ronny
 */
public class MinWebTestGenerator {
    
    public static final int numFaults = 27;
	
	public static void main(String[] a) {
		String suite = new MinWebTestGenerator().createTestSuite();
		System.out.println(suite);
	}
	
	String createTestSuite() {
		StringBuilder sb = new StringBuilder();
		sb.append(packageDecl() + "\n");
		sb.append(imports() + "\n");
		sb.append(testsuite());
		return sb.toString();
	}
	
	String packageDecl() {
		return "package pset6;\n";
	}
	
	String imports() {
		return "import static org.junit.Assert.*;\n\n" + "import org.junit.AfterClass;\n" + "import org.junit.BeforeClass;\n"
				+ "import org.junit.Test;\n\n" + "import org.openqa.selenium.By;\n" + "import org.openqa.selenium.WebDriver;\n"
				+ "import org.openqa.selenium.WebElement;\n" + "import org.openqa.selenium.firefox.FirefoxDriver;\n";
	}
	
	String testsuite() {
		StringBuilder sb = new StringBuilder();
		sb.append(faults() + "\n\n");
		sb.append("public class MinWebTestSuite {\n\n");
		sb.append(fields() + "\n\n");
		sb.append(statics() + "\n\n");
		
		// input space partition.
		String[] xvals = {
				"infinity", "-3", "0", "7"
		};
		String[] yvals = {
				"infinity", "-3", "0", "7"
		};
		String[] zvals = {
				"infinity", "-3", "0", "7"
		};
		boolean[] clickvals = {
				true, false
		};
		
		// loop over the input partition space. 
		int id = 0; // test id;
		for (boolean click : clickvals) {
			for (String x : xvals) {
				for (String y : yvals) {
					for (String z : zvals) {
						sb.append(testMethod(id++, x, y, z, click) + "\n\n");
					}
				}
			}
		}
		sb.append("}\n");
		return sb.toString();
	}
	

	/** logs the number of regression faults */
	String faults(){
	    StringBuilder builder = new StringBuilder();
	    builder.append(String.format("/** number of test failures: %d \n", numFaults));
	    builder.append(" * These failures don't arise from bugs. \n");
	    builder.append(" * The tests need to be refactored to expect a max function based on new input. \n");
	    builder.append(" */ ");
	    return builder.toString();
	}
	
	/** returns the parameter fields for the class */
	String fields() {
		StringBuilder builder = new StringBuilder();
		builder.append("private static WebDriver driver;");
		return builder.toString();
	}
	
	/** 
	 * returns the setup and teardown static methods. <br>
	 * these methods are initializers and destructors for the test suite.
	 */
	String statics() {
		StringBuilder builder = new StringBuilder();
		
		// BeforeClass static method
		String commentBefore = "/** runs once at startup.\n" + "* sets up the test suite at the beginning. <br>\n" + "*/";
		StringBuilder before = new StringBuilder();
		before.append(commentBefore + "\n");
		before.append("@BeforeClass \n");
		before.append("public static void setUpClass(){\n");
		before.append("driver = new FirefoxDriver(); // launch the browser\n");
		before.append("//System.setProperty(\"webdriver.gecko.driver\" , \"geckodriver.exe\");\n");
		before.append("}");
		
		// AfterClass static method
		String commentAfter = "/** runs once at completion.\n" + "* cleans up the test suite at the end. <br>\n" + "*/";
		StringBuilder after = new StringBuilder();
		after.append(commentAfter + "\n");
		after.append("@AfterClass \n");
		after.append("public static void tearDownClass(){\n");
		after.append("driver.quit();\n");
		after.append("}");
		
		builder.append(before.toString() + "\n\n");
		builder.append(after.toString());
		return builder.toString();
	}
	
	/** 
	 * returns a JUnit test method string. <br>
	 */
	String testMethod(int id, String x, String y, String z, boolean click) {
		StringBuilder builder = new StringBuilder();
		String name = String.format("t%d", id);
		builder.append("@Test \n");
		builder.append(String.format("public void %s(){\n", name));
		
		// code for a web test case.
		String file = "file:////home/ronny/school/testing/hw/min.html";
		builder.append(String.format("// test: <%s, %s, %s, %s> \n", x, y, z, (click ? "click" : "noclick")));
		builder.append("// edit the next line to enter the location of \"min.html\" on your file system \n");
		builder.append(String.format("driver.get(\"%s\"); \n", file));
		builder.append(String.format("driver.findElement(By.id(\"x\")).sendKeys(\"%s\"); // enter value for x \n", x));
		builder.append(String.format("driver.findElement(By.id(\"y\")).sendKeys(\"%s\"); // enter value for y \n", y));
		builder.append(String.format("driver.findElement(By.id(\"z\")).sendKeys(\"%s\"); // enter value for z \n", z));
		
		if(click){ // verify test with assertion.
			builder.append("driver.findElement(By.id(\"computeButton\")).click(); // computeButton click \n");
			builder.append("String output = driver.findElement(By.id(\"result\")).getText();  // read the output text \n");
			// builder.append(String.format("System.out.println(\"output %d: \" + output);", id)); // assertEquals("min(0, 0, 0) = 0", output);
			
			// calculate minimum from oracle
			String minimum = "\"Please enter integer values only!\"";
			if(!x.equals("infinity") && !y.equals("infinity") && !z.equals("infinity")){
				Integer value = (Integer) Math.min(Math.min(Integer.parseInt(x), Integer.parseInt(y)), Math.min(Integer.parseInt(x), Integer.parseInt(z)));
				minimum = String.format("\"min(%s, %s, %s) = %d\"", x, y, z, value);
			}
			
			// assertion to verify correct output.
			builder.append(String.format("assertEquals(%s, output); // assertion to verify correct output. \n", minimum));
		}
		
		builder.append("}");
		return builder.toString();
	}
}
