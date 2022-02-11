package Strategy;

// classe que acessa os atributos e métodos da intância atribuida a variável
public class Contexto {

    private PadraoStrategy estrategia;

    // nesse caso recebe um objeto ImplementaçãoPadraoStrategy1 ou ImplementaçãoPadraoStrategy1 e atribui à variável
    public void setEstrategia(PadraoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    // executa o método1 da instância configurada
    public void metodo1() {
        estrategia.metodo1();
    }

    // executa o método2 da instância configurada
    public void metodo2() {
        estrategia.metodo2();
    }
}
