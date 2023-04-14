package av2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Q8_MatheusAlves extends JFrame implements ActionListener {
    private JLabel label;
    private JButton[] botoes;
    private JButton bAdivinhar;

    private int numeroRandom;
    private int numTentativas;
    private int restantes = 5;

    public Q8_MatheusAlves () {



        super("Adivinhar um numero de 0 a 20");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        bAdivinhar = new JButton("Adivinhar");
        bAdivinhar.addActionListener(this);




        label = new JLabel("Tente adivinhar o número entre 1 e 20");
        add(label, BorderLayout.NORTH);

        JPanel digitosPanel = new JPanel(new GridLayout(4, 5));
        botoes = new JButton[20];


        for (int i = 0; i < 20; i++) {
            JButton botao = new JButton(Integer.toString(i));
            botao.addActionListener(this);
            digitosPanel.add(botao);
        }
        add(digitosPanel, BorderLayout.CENTER);




        numeroRandom = (int) (Math.random() * 20) + 1;
        System.out.println(numeroRandom);


        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(label);
        c.add(bAdivinhar);

        numTentativas = 0;

        setSize(400, 300);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        int palpite = Integer.parseInt(e.getActionCommand());
        numTentativas++;
        restantes--;

        if (palpite == numeroRandom) {
            label.setText("Parabens! Voce acertou na " + numTentativas + "º tentativa!");
            bAdivinhar.setEnabled(false);
        } else if (numTentativas == 5) {
            label.setText("Infelizmente voce perdeu todas as chances, o numero era: " + numeroRandom);

            bAdivinhar.setEnabled(false);
        } else {
            label.setText("Voce errou essa vez, mas ainda tem " + restantes + " tentativas");

        }

    }


    public static void main (String [] args) {

        Q8_MatheusAlves jogo = new Q8_MatheusAlves();


    }

}
