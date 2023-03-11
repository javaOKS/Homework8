import org.example.ClassExamples2;
import org.junit.Assert;
import org.junit.Test;

public class ClassExamples2Test {
   @Test
    public void maxProfitTest(){
       ClassExamples2  test = new ClassExamples2();
       int [] price = {7,1,5,3,6,4};
       int result = test.maxProfit(price);
       Assert.assertEquals(5,result);
   }
}
