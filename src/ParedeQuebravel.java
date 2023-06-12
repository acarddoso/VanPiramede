public class ParedeQuebravel extends ElementoBasico {


    public ParedeQuebravel(String id, int linInicial, int colInicial, Tabuleiro tabuleiro) {
        super(id, "wall.jpg", linInicial, colInicial, tabuleiro);
    }

    @Override
    public void acao(ElementoBasico outro) {

    }
}