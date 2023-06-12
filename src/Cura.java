import javax.swing.JOptionPane;

public class Cura extends ElementoBasico {
    Personagem heroi;


    public Cura(String id, int nroPista, int linInicial, int colInicial, Tabuleiro tabuleiro, Personagem heroi) {
        super(id, "carne.png", linInicial, colInicial, tabuleiro);
        this.heroi = heroi;
    }

    @Override
    public void acao(ElementoBasico outro) {
        System.out.println(this.toString());
        heroi.cura();
        trocaParaFundo();
        
    
    
       // throw new UnsupportedOperationException("Unimplemented method 'acao'");
}

    public String toString() {
        return super.toString() + " cura... vidas: " + heroi.getVida();
    }
    
}


