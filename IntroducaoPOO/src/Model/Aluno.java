//subClasse de Pessoa
package Model;

public class Aluno extends Pessoa {
    //ATRIBUTOS
    // já tem os atributos (nome, cpf, dataNasc) da SuperClasse Pessoa
    private String matricula;
    private double nota;

    // métodos
    //construtor (sem a nota)
    public Aluno(String nome, String cpf, String dataNasc, String matricula) {
        super(nome, cpf, dataNasc);
        this.matricula = matricula;
    }
    // getters and setters

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    //exibir informações do aluno
    @Override // polimorfismo de classe
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Matrícula: "+matricula);
    }
    
    
    
}
