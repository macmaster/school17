package pset6;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

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
public void test0(){
// test: <infinity, infinity, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test1(){
// test: <infinity, infinity, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test2(){
// test: <infinity, infinity, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test3(){
// test: <infinity, infinity, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test4(){
// test: <infinity, -3, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test5(){
// test: <infinity, -3, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test6(){
// test: <infinity, -3, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test7(){
// test: <infinity, -3, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test8(){
// test: <infinity, 0, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test9(){
// test: <infinity, 0, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test10(){
// test: <infinity, 0, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test11(){
// test: <infinity, 0, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test12(){
// test: <infinity, 7, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test13(){
// test: <infinity, 7, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test14(){
// test: <infinity, 7, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test15(){
// test: <infinity, 7, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test16(){
// test: <-3, infinity, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test17(){
// test: <-3, infinity, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test18(){
// test: <-3, infinity, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test19(){
// test: <-3, infinity, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test20(){
// test: <-3, -3, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test21(){
// test: <-3, -3, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(-3, -3, -3) = -3", output); // assertion to verify correct output. 
}

@Test 
public void test22(){
// test: <-3, -3, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(-3, -3, 0) = -3", output); // assertion to verify correct output. 
}

@Test 
public void test23(){
// test: <-3, -3, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(-3, -3, 7) = -3", output); // assertion to verify correct output. 
}

@Test 
public void test24(){
// test: <-3, 0, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test25(){
// test: <-3, 0, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(-3, 0, -3) = -3", output); // assertion to verify correct output. 
}

@Test 
public void test26(){
// test: <-3, 0, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(-3, 0, 0) = -3", output); // assertion to verify correct output. 
}

@Test 
public void test27(){
// test: <-3, 0, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(-3, 0, 7) = -3", output); // assertion to verify correct output. 
}

@Test 
public void test28(){
// test: <-3, 7, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test29(){
// test: <-3, 7, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(-3, 7, -3) = -3", output); // assertion to verify correct output. 
}

@Test 
public void test30(){
// test: <-3, 7, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(-3, 7, 0) = -3", output); // assertion to verify correct output. 
}

@Test 
public void test31(){
// test: <-3, 7, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(-3, 7, 7) = -3", output); // assertion to verify correct output. 
}

@Test 
public void test32(){
// test: <0, infinity, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test33(){
// test: <0, infinity, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test34(){
// test: <0, infinity, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test35(){
// test: <0, infinity, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test36(){
// test: <0, -3, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test37(){
// test: <0, -3, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(0, -3, -3) = -3", output); // assertion to verify correct output. 
}

@Test 
public void test38(){
// test: <0, -3, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(0, -3, 0) = -3", output); // assertion to verify correct output. 
}

@Test 
public void test39(){
// test: <0, -3, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(0, -3, 7) = -3", output); // assertion to verify correct output. 
}

@Test 
public void test40(){
// test: <0, 0, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test41(){
// test: <0, 0, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(0, 0, -3) = -3", output); // assertion to verify correct output. 
}

@Test 
public void test42(){
// test: <0, 0, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(0, 0, 0) = 0", output); // assertion to verify correct output. 
}

@Test 
public void test43(){
// test: <0, 0, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(0, 0, 7) = 0", output); // assertion to verify correct output. 
}

@Test 
public void test44(){
// test: <0, 7, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test45(){
// test: <0, 7, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(0, 7, -3) = -3", output); // assertion to verify correct output. 
}

@Test 
public void test46(){
// test: <0, 7, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(0, 7, 0) = 0", output); // assertion to verify correct output. 
}

@Test 
public void test47(){
// test: <0, 7, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(0, 7, 7) = 0", output); // assertion to verify correct output. 
}

@Test 
public void test48(){
// test: <7, infinity, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test49(){
// test: <7, infinity, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test50(){
// test: <7, infinity, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test51(){
// test: <7, infinity, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test52(){
// test: <7, -3, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test53(){
// test: <7, -3, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(7, -3, -3) = -3", output); // assertion to verify correct output. 
}

@Test 
public void test54(){
// test: <7, -3, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(7, -3, 0) = -3", output); // assertion to verify correct output. 
}

@Test 
public void test55(){
// test: <7, -3, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(7, -3, 7) = -3", output); // assertion to verify correct output. 
}

@Test 
public void test56(){
// test: <7, 0, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test57(){
// test: <7, 0, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(7, 0, -3) = -3", output); // assertion to verify correct output. 
}

@Test 
public void test58(){
// test: <7, 0, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(7, 0, 0) = 0", output); // assertion to verify correct output. 
}

@Test 
public void test59(){
// test: <7, 0, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(7, 0, 7) = 0", output); // assertion to verify correct output. 
}

@Test 
public void test60(){
// test: <7, 7, infinity, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("Please enter integer values only!", output); // assertion to verify correct output. 
}

@Test 
public void test61(){
// test: <7, 7, -3, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(7, 7, -3) = -3", output); // assertion to verify correct output. 
}

@Test 
public void test62(){
// test: <7, 7, 0, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(7, 7, 0) = 0", output); // assertion to verify correct output. 
}

@Test 
public void test63(){
// test: <7, 7, 7, click> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
driver.findElement(By.id("computeButton")).click(); // computeButton click 
String output = driver.findElement(By.id("result")).getText();  // read the output text 
assertEquals("min(7, 7, 7) = 7", output); // assertion to verify correct output. 
}

@Test 
public void test64(){
// test: <infinity, infinity, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void test65(){
// test: <infinity, infinity, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void test66(){
// test: <infinity, infinity, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void test67(){
// test: <infinity, infinity, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

@Test 
public void test68(){
// test: <infinity, -3, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void test69(){
// test: <infinity, -3, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void test70(){
// test: <infinity, -3, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void test71(){
// test: <infinity, -3, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

@Test 
public void test72(){
// test: <infinity, 0, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void test73(){
// test: <infinity, 0, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void test74(){
// test: <infinity, 0, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void test75(){
// test: <infinity, 0, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

@Test 
public void test76(){
// test: <infinity, 7, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void test77(){
// test: <infinity, 7, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void test78(){
// test: <infinity, 7, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void test79(){
// test: <infinity, 7, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("infinity"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

@Test 
public void test80(){
// test: <-3, infinity, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void test81(){
// test: <-3, infinity, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void test82(){
// test: <-3, infinity, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void test83(){
// test: <-3, infinity, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

@Test 
public void test84(){
// test: <-3, -3, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void test85(){
// test: <-3, -3, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void test86(){
// test: <-3, -3, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void test87(){
// test: <-3, -3, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

@Test 
public void test88(){
// test: <-3, 0, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void test89(){
// test: <-3, 0, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void test90(){
// test: <-3, 0, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void test91(){
// test: <-3, 0, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

@Test 
public void test92(){
// test: <-3, 7, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void test93(){
// test: <-3, 7, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void test94(){
// test: <-3, 7, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void test95(){
// test: <-3, 7, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("-3"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

@Test 
public void test96(){
// test: <0, infinity, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void test97(){
// test: <0, infinity, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void test98(){
// test: <0, infinity, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void test99(){
// test: <0, infinity, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

@Test 
public void test100(){
// test: <0, -3, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void test101(){
// test: <0, -3, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void test102(){
// test: <0, -3, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void test103(){
// test: <0, -3, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

@Test 
public void test104(){
// test: <0, 0, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void test105(){
// test: <0, 0, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void test106(){
// test: <0, 0, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void test107(){
// test: <0, 0, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

@Test 
public void test108(){
// test: <0, 7, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void test109(){
// test: <0, 7, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void test110(){
// test: <0, 7, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void test111(){
// test: <0, 7, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("0"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

@Test 
public void test112(){
// test: <7, infinity, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void test113(){
// test: <7, infinity, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void test114(){
// test: <7, infinity, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void test115(){
// test: <7, infinity, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("infinity"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

@Test 
public void test116(){
// test: <7, -3, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void test117(){
// test: <7, -3, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void test118(){
// test: <7, -3, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void test119(){
// test: <7, -3, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("-3"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

@Test 
public void test120(){
// test: <7, 0, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void test121(){
// test: <7, 0, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void test122(){
// test: <7, 0, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void test123(){
// test: <7, 0, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("0"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

@Test 
public void test124(){
// test: <7, 7, infinity, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("infinity"); // enter value for z 
}

@Test 
public void test125(){
// test: <7, 7, -3, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("-3"); // enter value for z 
}

@Test 
public void test126(){
// test: <7, 7, 0, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("0"); // enter value for z 
}

@Test 
public void test127(){
// test: <7, 7, 7, noclick> 
// edit the next line to enter the location of "min.html" on your file system 
driver.get("file:///C:/Users/ronny/Desktop/EE/testing/hw/min.html"); 
driver.findElement(By.id("x")).sendKeys("7"); // enter value for x 
driver.findElement(By.id("y")).sendKeys("7"); // enter value for y 
driver.findElement(By.id("z")).sendKeys("7"); // enter value for z 
}

}

