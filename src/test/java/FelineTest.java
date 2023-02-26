import com.example.Feline;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest{
    @Test
    public void eatMeatReturnCorrectResultTest() throws Exception{
        Feline feline=new Feline();
        List<String> expectedResult=List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult=feline.eatMeat();
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void getFamilyReturnFelineTest(){
        Feline feline=new Feline();
        String expectedResult="Кошачьи";
        String actualResult=feline.getFamily();
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void getKittensWithoutArgumentReturnOneTest(){
        Feline feline=new Feline();
        int expectedResult=1;
        int actualResult=feline.getKittens();
        Assert.assertEquals(expectedResult,actualResult);
    }
}
