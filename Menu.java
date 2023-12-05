import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class Menu extends Tela {
    private JButton startButton;
    private JPanel painel;

    public Menu(){
        this.painel = new JPanel();
        this.startButton = new JButton();

        this.startButton.setText("Clique no botão");
        this.startButton.setVisible(true);
        this.startButton.setBackground(Color.WHITE);
        this.startButton.setBounds(32, 60, 110, 33);
        
        //this.add(painel);
        //painel.add(this.startButton);
        
        this.add(startButton);


        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Tela.telaAtual = 1;
            }
        });
        
    }

    

}
