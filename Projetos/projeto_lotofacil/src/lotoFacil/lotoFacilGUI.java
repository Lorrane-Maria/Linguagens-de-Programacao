package lotoFacil;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class lotoFacilGUI extends JFrame {
    private JPanel painel = new JPanel();
    private JLabel texto = new JLabel("LOTOFÁCIL");
    private JButton jButtonMenu = new JButton("Clique para jogar");

    private JPanel painel2 = new JPanel();
    private JButton jButtonJogar = new JButton("Jogar");
    private JRadioButton opcao1 = new JRadioButton("Apostar de 0 a 100");
    private JRadioButton opcao2 = new JRadioButton("Apostar de A à Z");
    private JRadioButton opcao3 = new JRadioButton("Apostar em par ou ímpar");
    private JLabel label = new JLabel("Digite sua Aposta:");
    private JLabel imagem = new JLabel();
    private JTextField aposta = new JTextField("" , 20);
    private ButtonGroup group = new ButtonGroup();

    public void menuGUI(){
        ImageIcon imageIcon = new ImageIcon("src/Imagens/roleta.jpg");
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        this.setSize(800,350);
        painel2.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 40));
        painel2.setBackground(new Color(255, 255, 255));
        imagem.setIcon(imageIcon);
        imagem.setHorizontalTextPosition(JLabel.RIGHT);
        imagem.setVerticalTextPosition(SwingConstants.TOP);
        jButtonJogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 jogar();
            }
        });
        painel2.add(imagem);
        group.add(opcao1);
        group.add(opcao2);
        group.add(opcao3);
        painel2.add(opcao1);
        painel2.add(opcao2);
        painel2.add(opcao3);
        painel2.add(label);
        painel2.add(aposta);
        painel2.add(jButtonJogar);
        this.getContentPane().add(painel2);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public lotoFacilGUI() {
        this.setTitle("Menu Lotofácil");
        this.setSize(600, 200);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 40));
        painel.setBackground(new Color(255, 255, 255));
        jButtonMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuGUI();
                painel.setVisible(false);
            }
        });
        painel.add(texto);
        painel.add(jButtonMenu);
        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void jogar() {
        if (opcao1.isSelected()) {
            try{
                Random ran = new Random();
                int n1 = Integer.parseInt(aposta.getText());
                int n2 = ran.nextInt(101);

                if (n1 < 0 || n1 > 100 || aposta.getText() == ""){
                    JOptionPane.showMessageDialog(null, "Aposta inválida.");
                } else if (n1 == n2) {
                    JOptionPane.showMessageDialog(null, "Você ganhou R$ 1.000,00 reais.");
                }else {
                    JOptionPane.showMessageDialog(null, "Que pena! O número sorteado foi: " + n2);
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Aposta inválida.");
            }
        }else if (opcao2.isSelected()){
            try {
                char letraPremiada = 'L';
                char c = aposta.getText().charAt(0);
                c = Character.toUpperCase(c);
                if (!Character.isLetter(c)) {
                    JOptionPane.showMessageDialog(null, "Aposta inválida.");
                } else {
                    if (c != letraPremiada) {
                        JOptionPane.showMessageDialog(null, "Que pena! A letra sorteada foi: " + letraPremiada);
                    } else {
                        JOptionPane.showMessageDialog(null, "Você ganhou R$ 500,00 reais.");
                    }
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Aposta inválida.");
            }
        }else if (opcao3.isSelected()){
            try{
                int n3 = Integer.parseInt(aposta.getText());
                if (n3 % 2 == 0){
                    JOptionPane.showMessageDialog(null, "Você ganhou R$ 100,00 reais.");
                }else{
                    JOptionPane.showMessageDialog(null, "Que pena! O número digitado é ímpar e a premiação foi para números pares.");
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Aposta inválida.");
            }
        }
    }

    public static void main(String[] args) {
        new lotoFacilGUI();
    }
}