public class Inimigo extends ElementoBasico {
    Personagem combate;
    int vivo=1;

    public Inimigo(String id, int nroPista, int linInicial, int colInicial, Tabuleiro tabuleiro, Personagem combate) {
        super(id, "hint.jpg", linInicial, colInicial, tabuleiro);
        this.combate = combate;
    }

    public int getVivo(){
        return vivo;
    }

    @Override
    public void acao(ElementoBasico outro) {
        if(combate.getVida()>20){
          combate.dano();
          vivo = 0;
        }
    
        throw new UnsupportedOperationException("Unimplemented method 'acao'");
    }

    
}
