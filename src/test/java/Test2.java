import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	int a=3,b=9,c;
	 @Test(priority=1)
	 public void add() 
	 {
		 int c=a+b;
		 Assert.assertEquals(c,12);
	 }
	 @Test(priority=12)
	 public void Multiply() 
	 {
		 int c=a*b;
		 Assert.assertEquals(c,27);
	 }
	 @Test(priority=3)
	 public void subtract() 
	 {
		 int c=a-b;
		 Assert.assertEquals(c,-6);
	 }
	 @Test(priority=4)
	 public void divide() 
	 {
		 int c=a/b;
		 Assert.assertEquals(c,0);
	 }
	 
}
