    package View;

    import java.util.Scanner;

    import Controller.CursoController;
import Model.Aluno;
import Model.Professor;

    public class CursoView {
        //atributo
        //instanciar obj de professor
        Professor jp = new Professor("joao pereira", "123.456", "10/10/1945", 0.03);
        //instanciar obj de CursoController
        CursoController  cursoJava = new CursoController("programaçao java ",jp);

        //metodos view (tela interativa CLI)
        int operacao;
        boolean continuar = true;
        Scanner sc = new Scanner(System.in);

        public void menu(){
            while (continuar){
            System.out.println("==Gerenciamento de Curso==");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Informação do Curso");
            System.out.println("3. Lançar Nota dos Alunos");
            System.out.println("4. Status da Turma");
            System.out.println("5. Sair");
            System.out.println("==Escolha Opção Desejada==");
            operacao = sc.nextInt();
            switch (operacao) {
                case 1:
                    Aluno aluno = cadastrarAluno();
                    cursoJava.adicionarAluno(aluno);
                    break;
                case 2:
                    System.out.println();//exibir
                    break;
                case 3:
                    cursoJava.notaAlunos();
                    break;
                case 4: 
                    cursoJava.statusCurso();
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                default:
                    System.out.println("informe uma opçao valida");
                    break;
            }
        }
    }

    private Aluno cadastrarAluno() {
        System.out.println("digite o nome do aluno:");
        String nome = sc.next();
        System.out.println("informe o cpf do aluno: ");
        String cpf = sc.next();
        System.out.println("informe a data de nascimento do aluno: ");
        String dataNasc = sc.next();
        System.out.println("informe a Matricula do aluno: ");
        String matricula = sc.next();
        return new Aluno(nome, cpf, dataNasc, matricula);
    }

}
