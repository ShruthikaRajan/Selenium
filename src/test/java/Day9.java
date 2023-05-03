import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day9 {
	
  @Test(dataProvider = "dp1")
  
  public void add(int num1, int num2,int expected){
		int actual=num1+num2;
		Assert.assertEquals(expected,actual);
	  }
  @Test(dataProvider = "dp2")
  public void sub(int num1, int num2,int expected){
		int actual=num1-num2;
		Assert.assertEquals(expected,actual);
	  }
  @Test(dataProvider = "dp3")
  public void multiply(int num1, int num2,int expected){
		int actual=num1*num2;
		Assert.assertEquals(expected,actual);
	  }
  @Test(dataProvider = "dp4")
  public void div(int num1, int num2,int expected){
		int actual=num1/num2;
		Assert.assertEquals(expected,actual);
	  }
  
  @DataProvider
  public Object[][] dp1() {
	  return new Object[][] {
		  new Object[] {1,2,3},
		  new Object[] {2,3,5}
		  
	  
  };
  }
  @DataProvider
  public Object[][] dp2() {
	  return new Object[][] {
		  new Object[] {3,2,1},
		  new Object[] {5,3,2}
		  
	  
  };
  }
  @DataProvider
  public Object[][] dp3() {
	  return new Object[][] {
		  new Object[] {3,2,6},
		  new Object[] {1,3,3}
		  
	  
  };
  }
  
  @DataProvider
  public Object[][] dp4() {
	  return new Object[][] {
		  new Object[] {3,9,0},
		  new Object[] {5,5,1}
		  
	  
  };
  }
 }
