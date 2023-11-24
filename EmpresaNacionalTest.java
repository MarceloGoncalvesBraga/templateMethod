package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaNacionalTest {

    @Test
    void deveRetonarImpostoPago() {
        EmpresaNacional imposto = new EmpresaNacional();
        imposto.impostoX(10.0f);
        imposto.impostoY(10.0f);
        assertEquals("Imposto pago corretamente", imposto.verificarInpostoDevido());
    }

    @Test
    void deveRetonaraPagar() {
        EmpresaNacional imposto = new EmpresaNacional();
        imposto.impostoX(10.0f);
        imposto.impostoY(6.0f);
        assertEquals("Devera pagar x ate atingir 20%", imposto.verificarInpostoDevido());
    }

    @Test
    void deveRetornarInformacoes() {
        EmpresaNacional imposto = new EmpresaNacional();
        imposto.impostoX(8.0f);
        imposto.impostoY(10.0f);
        imposto.setNome("TecnSul");
        imposto.setCnpj(1065645);
        assertEquals("EmpresaNacional{cpnj=1065645, nome='TecnSul', resultado=Devera pagar x ate atingir 20%}", imposto.getInfo());
    }
}