package pset6;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/** number of test failures: 27 
 * These failures don't arise from bugs. 
 * The tests need to be refactored to expect a max function based on new input. 
 */ 

public class MinWebTestSuite {

private static WebDriver driver;

/** runs once at startup.
* sets up the test suite at the beginning. <br>
*/
@BeforeClass 
public static void setUpClass(){
driver = new FirefoxDriver(); // launch the browser
//System.setProperty("webdriver.gecko.driver" , "geckodriver.exe");
}

/** runs once at completion.
* cleans up the test suite at the end. <br>
*/
@AfterClass 
public static void tearDownClass(){
driver.quit();
}

@Test 
public void t0(){
// test: <infinity, infinity, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t1(){
// test: <infinity, infinity, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t2(){
// test: <infinity, infinity, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t3(){
// test: <infinity, infinity, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t4(){
// test: <infinity, -3, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t5(){
// test: <infinity, -3, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t6(){
// test: <infinity, -3, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t7(){
// test: <infinity, -3, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t8(){
// test: <infinity, 0, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t9(){
// test: <infinity, 0, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t10(){
// test: <infinity, 0, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t11(){
// test: <infinity, 0, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t12(){
// test: <infinity, 7, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t13(){
// test: <infinity, 7, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t14(){
// test: <infinity, 7, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t15(){
// test: <infinity, 7, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t16(){
// test: <-3, infinity, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t17(){
// test: <-3, infinity, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t18(){
// test: <-3, infinity, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t19(){
// test: <-3, infinity, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t20(){
// test: <-3, -3, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t21(){
// test: <-3, -3, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(-3, -3, -3) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t22(){
// test: <-3, -3, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(-3, -3, 0) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t23(){
// test: <-3, -3, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(-3, -3, 7) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t24(){
// test: <-3, 0, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t25(){
// test: <-3, 0, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(-3, 0, -3) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t26(){
// test: <-3, 0, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(-3, 0, 0) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t27(){
// test: <-3, 0, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(-3, 0, 7) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t28(){
// test: <-3, 7, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t29(){
// test: <-3, 7, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(-3, 7, -3) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t30(){
// test: <-3, 7, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(-3, 7, 0) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t31(){
// test: <-3, 7, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(-3, 7, 7) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t32(){
// test: <0, infinity, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t33(){
// test: <0, infinity, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t34(){
// test: <0, infinity, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t35(){
// test: <0, infinity, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t36(){
// test: <0, -3, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t37(){
// test: <0, -3, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(0, -3, -3) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t38(){
// test: <0, -3, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(0, -3, 0) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t39(){
// test: <0, -3, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(0, -3, 7) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t40(){
// test: <0, 0, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t41(){
// test: <0, 0, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(0, 0, -3) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t42(){
// test: <0, 0, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(0, 0, 0) = 0", output); // assertion to verify correct output. 
}

@Test 
public void t43(){
// test: <0, 0, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(0, 0, 7) = 0", output); // assertion to verify correct output. 
}

@Test 
public void t44(){
// test: <0, 7, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t45(){
// test: <0, 7, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(0, 7, -3) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t46(){
// test: <0, 7, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(0, 7, 0) = 0", output); // assertion to verify correct output. 
}

@Test 
public void t47(){
// test: <0, 7, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(0, 7, 7) = 0", output); // assertion to verify correct output. 
}

@Test 
public void t48(){
// test: <7, infinity, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t49(){
// test: <7, infinity, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t50(){
// test: <7, infinity, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t51(){
// test: <7, infinity, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t52(){
// test: <7, -3, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t53(){
// test: <7, -3, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(7, -3, -3) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t54(){
// test: <7, -3, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(7, -3, 0) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t55(){
// test: <7, -3, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(7, -3, 7) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t56(){
// test: <7, 0, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t57(){
// test: <7, 0, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(7, 0, -3) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t58(){
// test: <7, 0, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(7, 0, 0) = 0", output); // assertion to verify correct output. 
}

@Test 
public void t59(){
// test: <7, 0, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(7, 0, 7) = 0", output); // assertion to verify correct output. 
}

@Test 
public void t60(){
// test: <7, 7, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t61(){
// test: <7, 7, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(7, 7, -3) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t62(){
// test: <7, 7, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(7, 7, 0) = 0", output); // assertion to verify correct output. 
}

@Test 
public void t63(){
// test: <7, 7, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(7, 7, 7) = 7", output); // assertion to verify correct output. 
}

@Test 
public void t64(){
// test: <infinity, infinity, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void t65(){
// test: <infinity, infinity, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void t66(){
// test: <infinity, infinity, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void t67(){
// test: <infinity, infinity, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

@Test 
public void t68(){
// test: <infinity, -3, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void t69(){
// test: <infinity, -3, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void t70(){
// test: <infinity, -3, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void t71(){
// test: <infinity, -3, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

@Test 
public void t72(){
// test: <infinity, 0, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void t73(){
// test: <infinity, 0, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void t74(){
// test: <infinity, 0, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void t75(){
// test: <infinity, 0, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

@Test 
public void t76(){
// test: <infinity, 7, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void t77(){
// test: <infinity, 7, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void t78(){
// test: <infinity, 7, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void t79(){
// test: <infinity, 7, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

@Test 
public void t80(){
// test: <-3, infinity, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void t81(){
// test: <-3, infinity, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void t82(){
// test: <-3, infinity, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void t83(){
// test: <-3, infinity, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

@Test 
public void t84(){
// test: <-3, -3, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void t85(){
// test: <-3, -3, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void t86(){
// test: <-3, -3, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void t87(){
// test: <-3, -3, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

@Test 
public void t88(){
// test: <-3, 0, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void t89(){
// test: <-3, 0, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void t90(){
// test: <-3, 0, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void t91(){
// test: <-3, 0, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

@Test 
public void t92(){
// test: <-3, 7, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void t93(){
// test: <-3, 7, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void t94(){
// test: <-3, 7, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void t95(){
// test: <-3, 7, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

@Test 
public void t96(){
// test: <0, infinity, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void t97(){
// test: <0, infinity, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void t98(){
// test: <0, infinity, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void t99(){
// test: <0, infinity, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

@Test 
public void t100(){
// test: <0, -3, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void t101(){
// test: <0, -3, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void t102(){
// test: <0, -3, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void t103(){
// test: <0, -3, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

@Test 
public void t104(){
// test: <0, 0, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void t105(){
// test: <0, 0, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void t106(){
// test: <0, 0, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void t107(){
// test: <0, 0, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

@Test 
public void t108(){
// test: <0, 7, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void t109(){
// test: <0, 7, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void t110(){
// test: <0, 7, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void t111(){
// test: <0, 7, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

@Test 
public void t112(){
// test: <7, infinity, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void t113(){
// test: <7, infinity, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void t114(){
// test: <7, infinity, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void t115(){
// test: <7, infinity, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

@Test 
public void t116(){
// test: <7, -3, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void t117(){
// test: <7, -3, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void t118(){
// test: <7, -3, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void t119(){
// test: <7, -3, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

@Test 
public void t120(){
// test: <7, 0, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void t121(){
// test: <7, 0, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void t122(){
// test: <7, 0, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void t123(){
// test: <7, 0, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

@Test 
public void t124(){
// test: <7, 7, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void t125(){
// test: <7, 7, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void t126(){
// test: <7, 7, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void t127(){
// test: <7, 7, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

}

