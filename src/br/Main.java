package Aula10;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Funcionario funcionario = new Funcionario();

        pessoa.setNome("Guilherme");
        aluno.setNome("Alan");
        professor.setNome("Michael");
        funcionario.setNome("Creusa");

        pessoa.setIdade(31);
        aluno.setIdade(14);
        professor.setIdade(42);
        funcionario.setIdade(49);

        pessoa.setSexo("Masculino");
        aluno.setSexo("Masculino");
        pessoa.setSexo("Masculino");
        funcionario.setSexo("Feminino");

        aluno.setCurso("Informatica");
        professor.setEspecialidade("Matematica aplicada");
        funcionario.setSetor("Limpeza");

        System.out.println(pessoa);
        System.out.println(aluno);
        System.out.println(professor);
        System.out.println(funcionario);


    }
}