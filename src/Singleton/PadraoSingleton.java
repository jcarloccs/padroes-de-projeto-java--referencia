package Singleton;

// padrão de projeto singleton
public class PadraoSingleton {

    private static PadraoSingleton unicaInstancia;

    // construtor privado para evitar ser instanciado
    private PadraoSingleton() {
    }

    // método estático que pega uma instância da classe e cria se ainda não estiver sido instanciada
    public static synchronized PadraoSingleton pegarInstancia() {
        if (unicaInstancia == null)
            unicaInstancia = new PadraoSingleton();
        return unicaInstancia;
    }

}
