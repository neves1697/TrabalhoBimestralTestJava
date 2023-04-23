
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import validador.Validador;

public class ValidadorTest {

    Validador val = new Validador();

    @Test
    public void testarSomenteNumeros() {

        Assert.assertEquals(false, val.somenteNumeros(""));
        Assert.assertEquals(false, val.somenteNumeros(" "));
        Assert.assertEquals(false, val.somenteNumeros("A"));
        Assert.assertEquals(true, val.somenteNumeros("0"));
        Assert.assertEquals(true, val.somenteNumeros("123456789"));
        Assert.assertEquals(true, val.somenteNumeros(" 123 "));
        Assert.assertEquals(true, val.somenteNumeros(" 12 3 "));
        Assert.assertEquals(false, val.somenteNumeros(" Teste "));
        Assert.assertEquals(true, val.somenteNumeros(" 0 0 "));
        Assert.assertEquals(true, val.somenteNumeros(" 00 "));
        Assert.assertEquals(true, val.somenteNumeros("0 0 "));
        Assert.assertEquals(false, val.somenteNumeros(null));

    }

    @Test
    public void testarCartaoValido() {
        //Assert.assertEquals(false, val.cartaoValido("123456789101235"));
        //Assert.assertEquals(false, val.cartaoValido("1122334455667788"));
        //Assert.assertEquals(true, val.cartaoValido("4350870067173595"));
        //Assert.assertEquals(true, val.cartaoValido("4350870067173595"));
        //Assert.assertEquals(false, val.cartaoValido("4350 A 846514652"));
        //Assert.assertEquals(false, val.cartaoValido("Teste"));
        //Assert.assertEquals(true, val.cartaoValido("4350 8700 6717 3595"));
        //Assert.assertEquals(true, val.cartaoValido("4111111111111111"));
        //Assert.assertEquals(true, val.cartaoValido("4111 1111 1111 1111"));
        //Assert.assertEquals(false, val.cartaoValido("4111 1111 1111 111A"));
        //Assert.assertEquals(false, val.cartaoValido("4111A1111A1111A1111"));
        //Assert.assertEquals(false, val.cartaoValido("4111A111A111A111"));                
    }

    @Test
    public void testarCpfValido() {
        //Assert.assertEquals(false, val.cartaoValido("4111A111A111A111"));
        //Assert.assertEquals(true, val.cartaoValido("11563226585"));
        //Assert.assertEquals(false, val.cartaoValido("111"));
        //Assert.assertEquals(false, val.cartaoValido("00000000000"));
        //Assert.assertEquals(true, val.cartaoValido("118.225.256-25"));
        //Assert.assertEquals(true, val.cartaoValido("118 225 256 25"));
        //Assert.assertEquals(false, val.cartaoValido("222.222."));
        //Assert.assertEquals(false, val.cartaoValido("118/653/255/69"));
        //Assert.assertEquals(false, val.cartaoValido("118,656,132,45"));
        //Assert.assertEquals(false, val.cartaoValido("118625366/46"));
    }
    
    @Test
    public void testarCnpjValido(){
        //Assert.assertEquals(true, val.cnpjValido("94413855000198"));
        //Assert.assertEquals(true, val.cartaoValido("94.413.855/0001-98"));
        //Assert.assertEquals(false, val.cartaoValido("22222222222222"));
        //Assert.assertEquals(false, val.cartaoValido("11/222/222/0001-00"));
        //Assert.assertEquals(false, val.cartaoValido("12345678910232"));
        Assert.assertEquals(false, val.cartaoValido("123456789112"));
    }
}
