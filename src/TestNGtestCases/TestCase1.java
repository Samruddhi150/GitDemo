package TestNGtestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@BeforeTest
	@Test(dependsOnMethods= {"two"})
	public void one() {
		System.out.println("first test case");
	}
	
	@Test
	public void two() {
		System.out.println("2nd test case");
	}
}
