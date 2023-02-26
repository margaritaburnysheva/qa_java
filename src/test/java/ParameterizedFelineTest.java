import com.example.Feline;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParameterizedFelineTest{
    public final int kittensCount;
    public final int expectedResult;

    public ParameterizedFelineTest(int kittensCount, int expectedResult){
        this.kittensCount=kittensCount;
        this.expectedResult=expectedResult;
    }
    @Parameterized.Parameters
    public static Object[][] getDataKittensCount(){
        return new Object[][]{
                {0, 0},
                {1, 1},
                {5, 5},
        };
    }
    @Test
    public void getKittensWithArgumentReturnCorrectCountTest(){
        Feline feline=new Feline();
        int actualResult=feline.getKittens(kittensCount);
        Assert.assertEquals(expectedResult,actualResult);
    }

}
