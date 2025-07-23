# Sistema Escolar em Java - POO HERANÇA -

Este projeto é uma implementação simples em Java de um sistema escolar orientado a objetos.  
O objetivo é demonstrar conceitos de Programação Orientada a Objetos (POO), como **herança**, **abstração**, **sobrescrita de métodos** e **modificadores de acesso**.

## 📋 Descrição

O sistema modela diferentes tipos de pessoas presentes em um ambiente escolar:  
- `Visitante`
- `Aluno`
- `Professor`
- `Funcionário`
- `Bolsista`

Cada classe estende a classe abstrata `Pessoa`, que define os atributos e comportamentos comuns.

## 🧩 Classes

### `Pessoa` (abstract)
- Atributos: `nome`, `idade`, `sexo`
- Métodos: `fazerAniversario()`, getters/setters, `toString()`

### `Visitante`
- Apenas herda de `Pessoa`.

### `Aluno`
- Atributos: `matricula`, `curso`
- Métodos: `cancelarMatricula()`, `pagarMensalidade()`

### `Bolsista` (final)
- Estende `Aluno`.
- Atributo adicional: `bolsa`
- Métodos: `renovarBolsa()`, sobrescreve `pagarMensalidade()`.

### `Professor`
- Atributos: `especialidade`, `salario`
- Métodos: `receberAumento()`

### `Funcionario`
- Atributos: `setor`, `trabalhando`
- Métodos: `mudarTrabalho()`

### `Main`
Classe principal que cria e manipula instâncias das outras classes para demonstrar seu comportamento.

## 🚀 Tecnologias
- Java SE 17 (ou compatível)

## 🧪 Exemplos de execução

```java
Visitante v = new Visitante();
v.setNome("Ariel");
v.setIdade(20);
v.setSexo("Masculino");
System.out.println(v);

Aluno a = new Aluno();
a.setNome("Maria");
a.setMatricula(123456);
a.setCurso("Informática");
System.out.println(a);
a.pagarMensalidade();

Bolsista b = new Bolsista();
b.setNome("Juvenal");
b.setBolsa(12.5f);
b.pagarMensalidade();


📚 Conceitos aplicados
✅ Abstração
✅ Herança
✅ Sobrescrita de métodos (@Override)
✅ Polimorfismo
✅ Modificadores de visibilidade (private, public, final)
