import com.example.Feline;
import com.example.Lion;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParameterizedLionTest{
    private final String sex;
    private final boolean expectedResult;

    public ParameterizedLionTest(String sex, boolean expectedResult){
        this.sex=sex;
        this.expectedResult=expectedResult;
    }
    @Parameterized.Parameters
    public static Object[][] getDataLion(){
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }
    @Test
    public void doesHaveManeReturnCorrectResultTest() throws Exception{
        Feline feline = new Feline();
        Lion lion=new Lion(sex,feline);
        boolean actualResult=lion.doesHaveMane();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
