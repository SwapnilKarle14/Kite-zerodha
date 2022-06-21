package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UseOfDataProvider {
   @DataProvider(name="NameData")
   public Object [][]data(){
	   return new Object[][] {{"Velocity","Katraj"},{"Katraj","Pune"},{"Pune","Maharashtra"}};
   }
   @Test(dataProvider  = "NameData")
   public void MultipleDataTest(String value, String pass) {
	   System.out.println(value+pass);
   }
}
