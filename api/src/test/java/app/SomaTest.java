package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

public class SomaTest{

    Soma soma;

    @BeforeEach
    public void setup(){
        soma = new Soma();
    }
    
    @Test
    public void VerifyDefaultCase(){
        //Soma soma = new Soma();
        double result = soma.calculaSoma("5", "5");
        assertEquals(10.0, result);
    }

    @Test
    public void VerifyNegativeNumber(){
        //Soma soma = new Soma();
        double result = soma.calculaSoma("5", "-5");
        assertEquals(0.0, result);
    }

    @Test
    public void VerifyDecimalNumber(){
        //Soma soma = new Soma();
        double result = soma.calculaSoma("5", "5.5");
        assertEquals(10.5, result);
    }
} 