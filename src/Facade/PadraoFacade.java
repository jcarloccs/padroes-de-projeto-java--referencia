package Facade;

// classe com métodos que utiliza métodos de outras classes
public class PadraoFacade {

    public void escrever() {
        Separador.separar();
        Texto.escreverTexto();
        Separador.separar();
    }

}
