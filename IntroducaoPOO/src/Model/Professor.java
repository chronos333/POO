// subClasse de Pessoa
package Model;

public class Professor extends Pessoa{
    //atributos
    private double salario;

    //métodos
    //construtor
    public Professor(String nome, String cpf, String dataNasc, double salario) {
        super(nome, cpf, dataNasc);
        this.salario = salario;
    }
    //getter and setter

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    

    //exibir info
    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Salário: R$"+salario);
    }


    
    
}
