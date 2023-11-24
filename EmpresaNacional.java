package padroescomportamentais.templatemethod;

public class AlunoEnsinoMedio extends Aluno {

    public String verificarInpostoDevido() {

       if (this.calcularImposto() >= 20.0f) {
            return "Imposto pago corretamente";
        }
        else {
            return "Devera pagar x ate atingir 20%";
        }
    }
     @Override
    public String getTipo() {
        return "EmpresaNacional";
    }

}
