import org.junit.Test;

public class TestComparador {

    ComparadorTeste testeSite = new ComparadorTeste();

    @Test
    public void  compararValores(){

        testeSite.testaCorDisponivel("Azul");
        testeSite.testaNomePdpXnomeCart();
        testeSite.testaTamanhoDisponivel(3);

    }

}
