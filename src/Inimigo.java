import javax.swing.JOptionPane;

public class Inimigo extends ElementoBasico {
    Personagem combate;


    public Inimigo(String id, int nroPista, int linInicial, int colInicial, Tabuleiro tabuleiro, Personagem combate) {
        super(id, "hint.jpg", linInicial, colInicial, tabuleiro);
        this.combate = combate;
    }

    @Override
    public void acao(ElementoBasico outro) {
        System.out.println(this.toString());
        if(combate.dano()==true){
            trocaParaFundo();
        }
        else {JOptionPane.showMessageDialog(getRootPane(), "Morreu troxa");
        System.exit(0);}
    
    
       // throw new UnsupportedOperationException("Unimplemented method 'acao'");
}

    public String toString() {
        return super.toString() + " combate... vidas: " + combate.getVida();
    }
    
}

