import com.example.Feline;
import com.example.Cat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Assert;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest{
    @Mock
    Feline feline;

    @Test
    public void getSoundReturnMeowTest(){
        Cat cat=new Cat(feline);
        String expectedResult="Мяу";
        String actualResult=cat.getSound();
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getFoodReturnCorrectResultTest() throws Exception{
        Cat cat=new Cat(feline);
        List<String> expectedResult=List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualResult=cat.getFood();
        Assert.assertEquals(expectedResult, actualResult);
    }
 }
