import Model.Pessoa;
import View.CursoView;

public class App {
    public static void main(String[] args) throws Exception {
        //instanciando obj das classes

        //ao transformar a classe em abstrata, nao é permitido instanciar
        //objeto desta
        //Pessoa pes1 = new Pessoa("fulano", "123.456.789-00", "10/10/1945");
        //pes1.exibirInfo();

        new CursoView().menu();
    }
}
