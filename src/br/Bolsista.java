package Aula10;

public final class Bolsista extends Aluno {

    private float bolsa;

    public void renovarBolsa() {
        System.out.println("Bolsa renovada para " + getNome());
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(getNome() + " é bolsista! Pagamento facilitado.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
