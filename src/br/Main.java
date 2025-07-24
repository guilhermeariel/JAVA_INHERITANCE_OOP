package Aula10;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Funcionario funcionario = new Funcionario();
        Bolsista bolsista = new Bolsista();

        pessoa.setNome("Guilherme");
        aluno.setNome("Alan");
        professor.setNome("Michael");
        funcionario.setNome("Creusa");
        bolsista.setNome("Juvenal");

        pessoa.setIdade(31);
        aluno.setIdade(14);
        professor.setIdade(42);
        funcionario.setIdade(49);
        bolsista.setIdade(19);

        pessoa.setSexo("Masculino");
        aluno.setSexo("Masculino");
        funcionario.setSexo("Feminino");
        bolsista.setSexo("Masculino");

        aluno.setCurso("Informatica");
        professor.setEspecialidade("Matematica aplicada");
        funcionario.setSetor("Limpeza");
        bolsista.setBolsa(12.5f);

        System.out.println(pessoa);
        System.out.println(aluno);
        System.out.println(professor);
        System.out.println(funcionario);
        aluno.pagarMensalidade();
        bolsista.pagarMensalidade();


    }
}