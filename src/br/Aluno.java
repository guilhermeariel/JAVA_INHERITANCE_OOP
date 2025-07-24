package Aula10;

public class Aluno extends Pessoa {

  private int matricula;
  private String curso;

  //METODOS
  public void cancelarMatricula() {
    this.matricula = 0;

  }

  public void pagarMensalidade() {
    System.out.println("Pagando mensalidade do aluno " + this.getNome());
  }

  //METODOS ESPECIAIS
  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public String getCurso() {
    return curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

}
