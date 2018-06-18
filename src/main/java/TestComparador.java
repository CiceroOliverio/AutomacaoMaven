import org.junit.jupiter.api.Test;


public class TestComparador {

    ComparadorTeste testeSite = new ComparadorTeste();

    @Test
    public void  compararValores(){

        testeSite.testaCorDisponivel("Azul");
        testeSite.testaNomePdpXnomeCart();
        testeSite.testaTamanhoDisponivel(33);

    }

}
