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
        String str = " ";// deu erro, porque há apenas um espaço e considerou como número Para corrigir é necessário adicionar um espaço
        //no regex;
        String str2 = "0";
        //val.somenteNumeros(str);              
        //val.somenteNumeros(str2);
        try {
            assertEquals(true, val.somenteNumeros(str));
            assertEquals(true, val.somenteNumeros(str2));
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
