package Calculator;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalcultor {

    @Test
    public void testAdd(){
        calcultorService calcultorService = mock(Calculator.calcultorService.class);
         when(calcultorService.add(10,10)).thenReturn(20);
         assertEquals(20, calcultorService.add(10,10));
    }
    @Test
    public void testMinus(){
        calcultorService calcultorService = mock(Calculator.calcultorService.class);
        when(calcultorService.minus(20,10)).thenReturn(10);
        assertEquals(10, calcultorService.minus(20,10));

    }
    @Test

    public void testDivide(){
        calcultorService calcultorService = mock(Calculator.calcultorService.class);
        when(calcultorService.divide(20,10)).thenReturn(200);
        assertEquals(200, calcultorService.divide(20,10));
    }




}
