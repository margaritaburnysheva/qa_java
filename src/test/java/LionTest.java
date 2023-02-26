import com.example.Feline;
import com.example.Lion;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest{
    @Mock
    Feline feline;

    @Test
    public void getKittensReturnCorrectCountTest() throws Exception{
        Lion lion=new Lion("Самец",feline);
        int expectedResult=5;
        Mockito.when(feline.getKittens()).thenReturn(5);
        int actualResult=lion.getKittens();
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void getFoodReturnCorrectResultTest() throws Exception{
        Lion lion=new Lion("Самец",feline);
        List<String> expectedResult=List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualResult=lion.getFood();
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test(expected= Exception.class)
    public void lionExceptionReturnErrorMessage() throws Exception{
        Lion lion=new Lion("Тестовое значение для ошибки",feline);
    }
}
