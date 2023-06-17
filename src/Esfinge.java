import javax.swing.JOptionPane;
public class Esfinge extends ElementoBasico {
    private int tentativas = 0;


    public Esfinge(String id, int nroPista, int linInicial, int colInicial, Tabuleiro tabuleiro) {
        super(id, "esfinge.jpg", linInicial, colInicial, tabuleiro);
  
    }

    @Override
    public void acao(ElementoBasico outro) {
     if (tentativas == 3){
            JOptionPane.showMessageDialog(getRootPane(), "Muitas tentativas, você perdeu!");
            System.exit(0);
        }
        JOptionPane.showMessageDialog(getRootPane(), "Você se depara com uma esfinge muito poderosa, ela lhe da uma charada, porém você tem 3 tentativas se errar você sera devorado");
        String codigo = JOptionPane.showInputDialog(getRootPane(), "Qual animal tem quatro patas pela manhâ, duas pela tarde e à noite três patas?");
        if (codigo.equals("humano") || codigo.equals("ser humano")) {
            getTabuleiro().atualizaVisualizacao();
            JOptionPane.showMessageDialog(getRootPane(), "Parabéns, você resolveu minha charada");
            trocaParaFundo();
            JOptionPane.showMessageDialog(getRootPane(), "As enfinge desaparece como um passe de magica");
        } else {
            JOptionPane.showMessageDialog(getRootPane(), "Você errou, continue tentando horrivel");
        
        tentativas++;
        }
    
         System.out.println(this.toString());
    
    
       // throw new UnsupportedOperationException("Unimplemented method 'acao'");
}

    public String toString() {
        return super.toString();
    }
    
}