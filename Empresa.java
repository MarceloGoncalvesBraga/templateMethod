package padroescomportamentais.templatemethod;

public abstract class Empresa {

    private int cpnj;
    protected String nome;
    private float impostoX;
    private float nota2;

    public int getCnpj() {
        return cpnj;
    }

    public void setCnpj(int cpnj) {
        this.cpnj = cpnj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getImpostoX() {
        return impostoX;
    }

    public void setNota1(float impostoX) {
        this.impostoX = impostoX;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float calcularImposto() {
        return (this.impostoX + this.nota2) / 2;
    }

    public abstract String verificarInpostoDevido();

    public String getTipo() {
        return "Empresa";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "cpnj=" + this.cpnj +
                ", nome='" + this.nome + '\'' +
                ", resultado=" + this.verificarInpostoDevido() +
                '}';
    }
}
