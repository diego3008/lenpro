import javax.swing.*;
import javax.swing.JOptionPane.*;
import java.awt.event.*;
import java.text.DecimalFormat;


public class Main extends JFrame implements ActionListener {
    private JButton boton1, boton2, boton3, boton4;
    private JLabel label1;

    public Main() {
        setLayout(null);
        boton1 = new JButton("Dolar");
        boton1.setBounds(10, 100, 90, 20);
        add(boton1);
        boton1.addActionListener(this);

        boton2 = new JButton("Euro");
        boton2.setBounds(130, 100, 90, 20);
        add(boton2);
        boton2.addActionListener(this);

        boton3 = new JButton("Yen");
        boton3.setBounds(240, 100, 90, 20);
        add(boton3);
        boton3.addActionListener(this);

        boton4 = new JButton("DolarHK");
        boton4.setBounds(350, 100, 90, 20);
        add(boton4);
        boton4.addActionListener(this);

        label1 = new JLabel("Conversor de pesos");
        label1.setBounds(10, 10, 300, 30);
        add(label1);

        boton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pesoDolar();
            }
        });


        boton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pesoEuro();
            }
        });

        boton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pesoYen();
            }
        });

        boton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pesoDolarHK();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            label1.setText("Convertir Peso a Dolar");
        }
        if (e.getSource() == boton2) {
            label1.setText("Convertir Peso a Euro");
        }

        if (e.getSource() == boton3) {
            label1.setText("Convertir peso a Yen");
        }

        if (e.getSource() == boton4) {
            label1.setText("Convertir peso a Dolar HK");
        }
    }

    public static void main(String[] args) {
        Main formulario = new Main();
        formulario.setBounds(0,0,500,500);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
    }

    public void pesoDolar() {
        DecimalFormat df1 = new DecimalFormat("#.00");
        double precioDolar = 23.67d, peso1, equivalencia;
        peso1 = Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto deseas convertir?: "));
        equivalencia = peso1 / precioDolar;
        JOptionPane.showMessageDialog(null,peso1 + " pesos es igual a: " + df1.format(equivalencia) + " Dolares americanos");
    }

    public void pesoEuro() {
        DecimalFormat df2 = new DecimalFormat("#.00");
        double precioEuro = 25.97d, peso2, equivalencia2;
        peso2 = Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto deseas convertir?: "));
        equivalencia2 = peso2 / precioEuro;
        JOptionPane.showMessageDialog(null, peso2 + " pesos es igual a: " + df2.format(equivalencia2) + " Euros");
    }

    public void pesoYen() {
        DecimalFormat df3 = new DecimalFormat("#.00");
        double precioYen = 0.22d, peso3, equivalencia3;
        peso3 = Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto deseas convertir?: "));
        equivalencia3 = peso3 / precioYen;
        JOptionPane.showMessageDialog(null, peso3 + " pesos es igual a: " + df3.format(equivalencia3) + " Yens");

    }

    public void pesoDolarHK() {
        DecimalFormat df4 = new DecimalFormat("#.00");
        double precioDolHK = 3.05d, peso4, equivalencia4;
        peso4 = Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto deseas convertir?: "));
        equivalencia4 = peso4 / precioDolHK;
        JOptionPane.showMessageDialog(null, peso4 + " pesos es igual a: " + df4.format(equivalencia4) + " Dolares Hongkoneses");
    }

}
