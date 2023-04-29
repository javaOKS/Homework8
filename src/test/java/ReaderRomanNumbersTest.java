import org.example.ReaderRomanNumbers;
import org.junit.Assert;
import org.junit.Test;

public class ReaderRomanNumbersTest {
    private ReaderRomanNumbers romanNumbers = new ReaderRomanNumbers();
    @Test
    public void romanToIntTest(){
        String s = "MCMXCIV";
        int result = romanNumbers.romanToInt(s);
        int expect = 1994;
        Assert.assertTrue((expect == result));
    }
}
