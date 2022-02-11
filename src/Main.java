import Facade.PadraoFacade;
import Singleton.PadraoSingleton;
import Strategy.Contexto;
import Strategy.ImplementacaoPadraoStrategy1;
import Strategy.ImplementacaoPadraoStrategy2;

public class Main {

    public static void main(String[] args) {

        // Singleton
        System.out.println("Mesma instância");
        PadraoSingleton singleton1 = PadraoSingleton.pegarInstancia();
        System.out.println(singleton1);
        PadraoSingleton singleton2 = PadraoSingleton.pegarInstancia();
        System.out.println(singleton2);
        System.out.println();

        // Strategy
        Contexto contexto = new Contexto();

        contexto.setEstrategia(new ImplementacaoPadraoStrategy1());
        contexto.metodo1();
        contexto.metodo2();

        contexto.setEstrategia(new ImplementacaoPadraoStrategy2());
        contexto.metodo1();
        contexto.metodo2();
        System.out.println();

        // Facade
        PadraoFacade facade = new PadraoFacade();
        facade.escrever();

    }

}
