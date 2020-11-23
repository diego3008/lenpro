import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Main extends JFrame implements ActionListener{
    private JButton boton1, boton2;
    private JLabel label1;

    public Main() {
        setLayout(null);
        boton1 = new JButton("ºC --> ºF");
        boton1.setBounds(10,100,90,20);
        add(boton1);
        boton1.addActionListener(this);

        boton2 = new JButton("ºF --> ºC");
        boton2.setBounds(110,100,90,20);
        add(boton2);
        boton2.addActionListener(this);

        label1 = new JLabel("En espera");
        label1.setBounds(10,10,300,30);
        add(label1);

        boton1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                celsiusAFarenehit();
            }
        });

        boton2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                farenheitACelsius();
            }
        });

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            label1.setText("Convertir de Celsius a Farenheit");
        }
        if (e.getSource() == boton2) {
            label1.setText("Convertir de Farenheit a Celsius");
        }
    }

    public static void main(String[] args) {
        Main formulario = new Main();
        formulario.setBounds(0,0,500,500);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
    }

    public void celsiusAFarenehit() {
        DecimalFormat df = new DecimalFormat("#.00");
        double n, tempFinal;
        n = Double.parseDouble(JOptionPane.showInputDialog("Digite la temperatura que desea convertir: "));
        tempFinal = ((n * 9) / 5) + 32;
        JOptionPane.showMessageDialog(null, n +"ºC " + "--> " + df.format(tempFinal) + "ºF");
    }

    public void farenheitACelsius() {
        DecimalFormat df1 = new DecimalFormat("#.00");
        double x, temp;
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite la temperatura que desea convertir: "));
        temp = ((x - 32) * 5) / 9;
        JOptionPane.showMessageDialog(null, x +"ºF " + "--> " + df1.format(temp) + "ºC");
    }

}