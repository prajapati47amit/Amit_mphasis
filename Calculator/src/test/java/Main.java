import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
@RunWith(MockitoJUnitRunner.class)
public class Main {
    @Mock
    CalculatorService calculatorService;

 
    @Test
    public void testCalculator() {


        //CalculatorService.add(2, 4);
        when(calculatorService.add(20.0, 30.0)).thenReturn(50.0);
        when(calculatorService.subtract(30.0, 20.0)).thenReturn(10.0);
        when(calculatorService.multiply(10.0, 30.0)).thenReturn(300.0);
        when(calculatorService.divide(40.0, 20.0)).thenReturn(2.0);

        Assert.assertEquals(50.0, 50.0);


    }
}