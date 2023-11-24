package padroescomportamentais.templatemethod;

public class EmpresaEstrangeira extends Empresa {

    public String verificarInpostoDevido() {
        
        if (this.calcularImposto() >= 40.0f) {
            return "Imposto pago corretamente";
        }
        else {
            return "Devera pagar x ate atingir 40%";
        }
    }

    @Override
    public String getTipo() {
        return "EmpresaEstrangeira";
    }
}
