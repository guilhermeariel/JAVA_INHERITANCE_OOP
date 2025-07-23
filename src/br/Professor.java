package Aula10;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    //METODOS
    public void receberAumento() {
        this.salario *= 1.20;

    }
    //METODOS ESPECIAIS
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }


}
