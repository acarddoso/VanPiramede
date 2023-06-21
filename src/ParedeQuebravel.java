public class ParedeQuebravel extends ElementoBasico {
    Personagem parede;
    boolean danificado = false; 

    public ParedeQuebravel(String id, int linInicial, int colInicial, Tabuleiro tabuleiro, Personagem parede) {
        super(id, "paredequebravel.png", linInicial, colInicial, tabuleiro);
        this.parede = parede;
    }

    @Override
    public void acao(ElementoBasico outro) {
        System.out.println(this.toString());
        if(danificado == true){
            trocaParaFundo();
        }
        if(parede.quebrar()==true){
            danificarparede();
            danificado = true;
        }
    }

    public String toString() {
        return super.toString();
    }
}
