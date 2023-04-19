import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import validador.Validador;

public class ValidadorTest {
    @Test
    public void testarSomenteNumeros(){
        Validador val = new Validador();
        String str = " ";// deu erro;
        //str = "l";
        val.somenteNumeros(str);                
        try {
            assertEquals(true, val.somenteNumeros(str));
        } catch (ArithmeticException e) {
            System.out.println("O valor não é um número \n" + e.getMessage());
        }
        /*
        try {
            assertEquals(7.0, ma.fecharNotasCalcularMediaFinal(),0.0000001);
        } catch (NotaInvalidaException ex) {
            System.out.println("Erro: "+ex.getMessage());
        }
        */
        
    }
      
}
