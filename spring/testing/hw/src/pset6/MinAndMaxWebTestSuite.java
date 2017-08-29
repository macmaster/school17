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

public class MinAndMaxWebTestSuite {

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
// test: <infinity, infinity, infinity, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t1(){
// test: <infinity, infinity, -3, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t2(){
// test: <infinity, infinity, 0, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t3(){
// test: <infinity, infinity, 7, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t4(){
// test: <infinity, -3, infinity, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t5(){
// test: <infinity, -3, -3, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t6(){
// test: <infinity, -3, 0, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t7(){
// test: <infinity, -3, 7, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t8(){
// test: <infinity, 0, infinity, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t9(){
// test: <infinity, 0, -3, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t10(){
// test: <infinity, 0, 0, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t11(){
// test: <infinity, 0, 7, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t12(){
// test: <infinity, 7, infinity, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t13(){
// test: <infinity, 7, -3, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t14(){
// test: <infinity, 7, 0, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t15(){
// test: <infinity, 7, 7, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t16(){
// test: <-3, infinity, infinity, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t17(){
// test: <-3, infinity, -3, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t18(){
// test: <-3, infinity, 0, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t19(){
// test: <-3, infinity, 7, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t20(){
// test: <-3, -3, infinity, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t21(){
// test: <-3, -3, -3, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("max(-3, -3, -3) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t22(){
// test: <-3, -3, 0, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("max(-3, -3, 0) = 0", output); // assertion to verify correct output. 
}

@Test 
public void t23(){
// test: <-3, -3, 7, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("max(-3, -3, 7) = 7", output); // assertion to verify correct output. 
}

@Test 
public void t24(){
// test: <-3, 0, infinity, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t25(){
// test: <-3, 0, -3, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("max(-3, 0, -3) = 0", output); // assertion to verify correct output. 
}

@Test 
public void t26(){
// test: <-3, 0, 0, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("max(-3, 0, 0) = 0", output); // assertion to verify correct output. 
}

@Test 
public void t27(){
// test: <-3, 0, 7, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("max(-3, 0, 7) = 7", output); // assertion to verify correct output. 
}

@Test 
public void t28(){
// test: <-3, 7, infinity, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t29(){
// test: <-3, 7, -3, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("max(-3, 7, -3) = 7", output); // assertion to verify correct output. 
}

@Test 
public void t30(){
// test: <-3, 7, 0, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("max(-3, 7, 0) = 7", output); // assertion to verify correct output. 
}

@Test 
public void t31(){
// test: <-3, 7, 7, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("max(-3, 7, 7) = 7", output); // assertion to verify correct output. 
}

@Test 
public void t32(){
// test: <0, infinity, infinity, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t33(){
// test: <0, infinity, -3, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t34(){
// test: <0, infinity, 0, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t35(){
// test: <0, infinity, 7, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t36(){
// test: <0, -3, infinity, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t37(){
// test: <0, -3, -3, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("max(0, -3, -3) = 0", output); // assertion to verify correct output. 
}

@Test 
public void t38(){
// test: <0, -3, 0, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("max(0, -3, 0) = 0", output); // assertion to verify correct output. 
}

@Test 
public void t39(){
// test: <0, -3, 7, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("max(0, -3, 7) = 7", output); // assertion to verify correct output. 
}

@Test 
public void t40(){
// test: <0, 0, infinity, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t41(){
// test: <0, 0, -3, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("max(0, 0, -3) = 0", output); // assertion to verify correct output. 
}

@Test 
public void t42(){
// test: <0, 0, 0, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("max(0, 0, 0) = 0", output); // assertion to verify correct output. 
}

@Test 
public void t43(){
// test: <0, 0, 7, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("max(0, 0, 7) = 7", output); // assertion to verify correct output. 
}

@Test 
public void t44(){
// test: <0, 7, infinity, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t45(){
// test: <0, 7, -3, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("max(0, 7, -3) = 7", output); // assertion to verify correct output. 
}

@Test 
public void t46(){
// test: <0, 7, 0, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("max(0, 7, 0) = 7", output); // assertion to verify correct output. 
}

@Test 
public void t47(){
// test: <0, 7, 7, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("max(0, 7, 7) = 7", output); // assertion to verify correct output. 
}

@Test 
public void t48(){
// test: <7, infinity, infinity, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t49(){
// test: <7, infinity, -3, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t50(){
// test: <7, infinity, 0, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t51(){
// test: <7, infinity, 7, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t52(){
// test: <7, -3, infinity, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t53(){
// test: <7, -3, -3, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("max(7, -3, -3) = 7", output); // assertion to verify correct output. 
}

@Test 
public void t54(){
// test: <7, -3, 0, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("max(7, -3, 0) = 7", output); // assertion to verify correct output. 
}

@Test 
public void t55(){
// test: <7, -3, 7, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("max(7, -3, 7) = 7", output); // assertion to verify correct output. 
}

@Test 
public void t56(){
// test: <7, 0, infinity, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t57(){
// test: <7, 0, -3, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("max(7, 0, -3) = 7", output); // assertion to verify correct output. 
}

@Test 
public void t58(){
// test: <7, 0, 0, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("max(7, 0, 0) = 7", output); // assertion to verify correct output. 
}

@Test 
public void t59(){
// test: <7, 0, 7, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("max(7, 0, 7) = 7", output); // assertion to verify correct output. 
}

@Test 
public void t60(){
// test: <7, 7, infinity, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t61(){
// test: <7, 7, -3, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("max(7, 7, -3) = 7", output); // assertion to verify correct output. 
}

@Test 
public void t62(){
// test: <7, 7, 0, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("max(7, 7, 0) = 7", output); // assertion to verify correct output. 
}

@Test 
public void t63(){
// test: <7, 7, 7, click, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("max(7, 7, 7) = 7", output); // assertion to verify correct output. 
}

@Test 
public void t64(){
// test: <infinity, infinity, infinity, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t65(){
// test: <infinity, infinity, -3, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t66(){
// test: <infinity, infinity, 0, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t67(){
// test: <infinity, infinity, 7, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t68(){
// test: <infinity, -3, infinity, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t69(){
// test: <infinity, -3, -3, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t70(){
// test: <infinity, -3, 0, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t71(){
// test: <infinity, -3, 7, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t72(){
// test: <infinity, 0, infinity, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t73(){
// test: <infinity, 0, -3, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t74(){
// test: <infinity, 0, 0, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t75(){
// test: <infinity, 0, 7, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t76(){
// test: <infinity, 7, infinity, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t77(){
// test: <infinity, 7, -3, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t78(){
// test: <infinity, 7, 0, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t79(){
// test: <infinity, 7, 7, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t80(){
// test: <-3, infinity, infinity, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t81(){
// test: <-3, infinity, -3, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t82(){
// test: <-3, infinity, 0, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t83(){
// test: <-3, infinity, 7, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t84(){
// test: <-3, -3, infinity, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t85(){
// test: <-3, -3, -3, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t86(){
// test: <-3, -3, 0, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t87(){
// test: <-3, -3, 7, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t88(){
// test: <-3, 0, infinity, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t89(){
// test: <-3, 0, -3, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t90(){
// test: <-3, 0, 0, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t91(){
// test: <-3, 0, 7, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t92(){
// test: <-3, 7, infinity, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t93(){
// test: <-3, 7, -3, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t94(){
// test: <-3, 7, 0, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t95(){
// test: <-3, 7, 7, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t96(){
// test: <0, infinity, infinity, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t97(){
// test: <0, infinity, -3, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t98(){
// test: <0, infinity, 0, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t99(){
// test: <0, infinity, 7, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t100(){
// test: <0, -3, infinity, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t101(){
// test: <0, -3, -3, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t102(){
// test: <0, -3, 0, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t103(){
// test: <0, -3, 7, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t104(){
// test: <0, 0, infinity, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t105(){
// test: <0, 0, -3, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t106(){
// test: <0, 0, 0, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t107(){
// test: <0, 0, 7, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t108(){
// test: <0, 7, infinity, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t109(){
// test: <0, 7, -3, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t110(){
// test: <0, 7, 0, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t111(){
// test: <0, 7, 7, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t112(){
// test: <7, infinity, infinity, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t113(){
// test: <7, infinity, -3, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t114(){
// test: <7, infinity, 0, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t115(){
// test: <7, infinity, 7, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t116(){
// test: <7, -3, infinity, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t117(){
// test: <7, -3, -3, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t118(){
// test: <7, -3, 0, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t119(){
// test: <7, -3, 7, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t120(){
// test: <7, 0, infinity, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t121(){
// test: <7, 0, -3, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t122(){
// test: <7, 0, 0, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t123(){
// test: <7, 0, 7, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t124(){
// test: <7, 7, infinity, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t125(){
// test: <7, 7, -3, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t126(){
// test: <7, 7, 0, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t127(){
// test: <7, 7, 7, noclick, max> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("max")).click(); // computeButton click 
}

@Test 
public void t128(){
// test: <infinity, infinity, infinity, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t129(){
// test: <infinity, infinity, -3, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t130(){
// test: <infinity, infinity, 0, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t131(){
// test: <infinity, infinity, 7, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t132(){
// test: <infinity, -3, infinity, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t133(){
// test: <infinity, -3, -3, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t134(){
// test: <infinity, -3, 0, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t135(){
// test: <infinity, -3, 7, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t136(){
// test: <infinity, 0, infinity, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t137(){
// test: <infinity, 0, -3, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t138(){
// test: <infinity, 0, 0, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t139(){
// test: <infinity, 0, 7, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t140(){
// test: <infinity, 7, infinity, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t141(){
// test: <infinity, 7, -3, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t142(){
// test: <infinity, 7, 0, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t143(){
// test: <infinity, 7, 7, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t144(){
// test: <-3, infinity, infinity, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t145(){
// test: <-3, infinity, -3, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t146(){
// test: <-3, infinity, 0, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t147(){
// test: <-3, infinity, 7, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t148(){
// test: <-3, -3, infinity, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t149(){
// test: <-3, -3, -3, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(-3, -3, -3) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t150(){
// test: <-3, -3, 0, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(-3, -3, 0) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t151(){
// test: <-3, -3, 7, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(-3, -3, 7) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t152(){
// test: <-3, 0, infinity, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t153(){
// test: <-3, 0, -3, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(-3, 0, -3) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t154(){
// test: <-3, 0, 0, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(-3, 0, 0) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t155(){
// test: <-3, 0, 7, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(-3, 0, 7) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t156(){
// test: <-3, 7, infinity, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t157(){
// test: <-3, 7, -3, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(-3, 7, -3) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t158(){
// test: <-3, 7, 0, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(-3, 7, 0) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t159(){
// test: <-3, 7, 7, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(-3, 7, 7) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t160(){
// test: <0, infinity, infinity, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t161(){
// test: <0, infinity, -3, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t162(){
// test: <0, infinity, 0, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t163(){
// test: <0, infinity, 7, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t164(){
// test: <0, -3, infinity, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t165(){
// test: <0, -3, -3, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(0, -3, -3) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t166(){
// test: <0, -3, 0, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(0, -3, 0) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t167(){
// test: <0, -3, 7, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(0, -3, 7) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t168(){
// test: <0, 0, infinity, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t169(){
// test: <0, 0, -3, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(0, 0, -3) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t170(){
// test: <0, 0, 0, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(0, 0, 0) = 0", output); // assertion to verify correct output. 
}

@Test 
public void t171(){
// test: <0, 0, 7, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(0, 0, 7) = 0", output); // assertion to verify correct output. 
}

@Test 
public void t172(){
// test: <0, 7, infinity, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t173(){
// test: <0, 7, -3, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(0, 7, -3) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t174(){
// test: <0, 7, 0, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(0, 7, 0) = 0", output); // assertion to verify correct output. 
}

@Test 
public void t175(){
// test: <0, 7, 7, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(0, 7, 7) = 0", output); // assertion to verify correct output. 
}

@Test 
public void t176(){
// test: <7, infinity, infinity, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t177(){
// test: <7, infinity, -3, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t178(){
// test: <7, infinity, 0, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t179(){
// test: <7, infinity, 7, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t180(){
// test: <7, -3, infinity, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t181(){
// test: <7, -3, -3, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(7, -3, -3) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t182(){
// test: <7, -3, 0, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(7, -3, 0) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t183(){
// test: <7, -3, 7, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(7, -3, 7) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t184(){
// test: <7, 0, infinity, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t185(){
// test: <7, 0, -3, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(7, 0, -3) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t186(){
// test: <7, 0, 0, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(7, 0, 0) = 0", output); // assertion to verify correct output. 
}

@Test 
public void t187(){
// test: <7, 0, 7, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(7, 0, 7) = 0", output); // assertion to verify correct output. 
}

@Test 
public void t188(){
// test: <7, 7, infinity, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void t189(){
// test: <7, 7, -3, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(7, 7, -3) = -3", output); // assertion to verify correct output. 
}

@Test 
public void t190(){
// test: <7, 7, 0, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(7, 7, 0) = 0", output); // assertion to verify correct output. 
}

@Test 
public void t191(){
// test: <7, 7, 7, click, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(7, 7, 7) = 7", output); // assertion to verify correct output. 
}

@Test 
public void t192(){
// test: <infinity, infinity, infinity, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t193(){
// test: <infinity, infinity, -3, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t194(){
// test: <infinity, infinity, 0, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t195(){
// test: <infinity, infinity, 7, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t196(){
// test: <infinity, -3, infinity, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t197(){
// test: <infinity, -3, -3, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t198(){
// test: <infinity, -3, 0, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t199(){
// test: <infinity, -3, 7, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t200(){
// test: <infinity, 0, infinity, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t201(){
// test: <infinity, 0, -3, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t202(){
// test: <infinity, 0, 0, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t203(){
// test: <infinity, 0, 7, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t204(){
// test: <infinity, 7, infinity, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t205(){
// test: <infinity, 7, -3, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t206(){
// test: <infinity, 7, 0, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t207(){
// test: <infinity, 7, 7, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t208(){
// test: <-3, infinity, infinity, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t209(){
// test: <-3, infinity, -3, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t210(){
// test: <-3, infinity, 0, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t211(){
// test: <-3, infinity, 7, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t212(){
// test: <-3, -3, infinity, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t213(){
// test: <-3, -3, -3, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t214(){
// test: <-3, -3, 0, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t215(){
// test: <-3, -3, 7, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t216(){
// test: <-3, 0, infinity, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t217(){
// test: <-3, 0, -3, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t218(){
// test: <-3, 0, 0, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t219(){
// test: <-3, 0, 7, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t220(){
// test: <-3, 7, infinity, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t221(){
// test: <-3, 7, -3, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t222(){
// test: <-3, 7, 0, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t223(){
// test: <-3, 7, 7, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t224(){
// test: <0, infinity, infinity, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t225(){
// test: <0, infinity, -3, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t226(){
// test: <0, infinity, 0, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t227(){
// test: <0, infinity, 7, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t228(){
// test: <0, -3, infinity, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t229(){
// test: <0, -3, -3, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t230(){
// test: <0, -3, 0, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t231(){
// test: <0, -3, 7, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t232(){
// test: <0, 0, infinity, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t233(){
// test: <0, 0, -3, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t234(){
// test: <0, 0, 0, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t235(){
// test: <0, 0, 7, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t236(){
// test: <0, 7, infinity, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t237(){
// test: <0, 7, -3, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t238(){
// test: <0, 7, 0, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t239(){
// test: <0, 7, 7, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t240(){
// test: <7, infinity, infinity, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t241(){
// test: <7, infinity, -3, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t242(){
// test: <7, infinity, 0, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t243(){
// test: <7, infinity, 7, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t244(){
// test: <7, -3, infinity, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t245(){
// test: <7, -3, -3, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t246(){
// test: <7, -3, 0, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t247(){
// test: <7, -3, 7, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t248(){
// test: <7, 0, infinity, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t249(){
// test: <7, 0, -3, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t250(){
// test: <7, 0, 0, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t251(){
// test: <7, 0, 7, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t252(){
// test: <7, 7, infinity, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t253(){
// test: <7, 7, -3, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t254(){
// test: <7, 7, 0, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

@Test 
public void t255(){
// test: <7, 7, 7, noclick, min> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:////home/ronny/school/testing/hw/minandmax.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("min")).click(); // computeButton click 
}

}

