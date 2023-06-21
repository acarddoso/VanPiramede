import javax.swing.JOptionPane;

public class Tesouro extends ElementoBasico{

    public Tesouro(String id, int linInicial, int colInicial, Tabuleiro tabuleiro) {
        super(id, "tesouro.png", linInicial, colInicial, tabuleiro);
        //super(id, "fundo.jpg", linInicial, colInicial, tabuleiro);
    }


    @Override
    public void acao(ElementoBasico outro) {
        JOptionPane.showMessageDialog(getRootPane(), "Parabéns você encontrou o tesouro da piramede!");
        System.exit(0);

        throw new UnsupportedOperationException("Unimplemented method 'acao'");
    }
}

