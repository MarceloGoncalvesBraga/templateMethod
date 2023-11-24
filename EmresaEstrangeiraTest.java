package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaEstrangeiraTest {

    @Test
    void deveRetonarAprovado() {
        EmpresaEstrangeira imposto = new EmpresaEstrangeira();
        imposto.impostoX(20.0f);
        imposto.impostoY(20.0f);
        assertEquals("Imposto pago corretamente", imposto.verificarInpostoDevido());
    }

    @Test
    void deveRetonarReprovado() {
        EmpresaEstrangeira imposto = new EmpresaEstrangeira();
        imposto.impostoX(10.0f);
        imposto.impostoY(20.0f);
        assertEquals("Devera pagar x ate atingir 40%", imposto.verificarInpostoDevido());
    }

    @Test
    void deveRetornarInformacoes() {
        EmpresaEstrangeira imposto = new EmpresaEstrangeira();
        imposto.impostoX(18.0f);
        imposto.impostoY(20.0f);
        imposto.setNome("TecnSul");
        imposto.setCnpj(1065645);
        assertEquals("EmpresaEstrangeira{cpnj=1065645, nome='TecnSul', resultado=Devera pagar x ate atingir 40%}", imposto.getInfo());
    }
}