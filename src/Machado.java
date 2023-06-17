
public class Machado extends ElementoBasico {
    Personagem heroi;


    public Machado(String id, int nroPista, int linInicial, int colInicial, Tabuleiro tabuleiro, Personagem heroi) {
        super(id, "picareta.png", linInicial, colInicial, tabuleiro);
        this.heroi = heroi;
    }

    @Override
    public void acao(ElementoBasico outro) {
        heroi.pegaMachado();
        trocaParaFundo();
        
    
    
    //   throw new UnsupportedOperationException("Unimplemented method 'acao'");
}

    
}
