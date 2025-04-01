package integracionnumerica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class IntegracionNumerica extends JFrame {
    private JTextField txtFuncion, txtA, txtB, txtN, txtResultado;
    private JPanel panelBotones;
    private String funcionInput = "";

    public IntegracionNumerica() {
        setTitle("Integración Numérica");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(5, 5));
        
        JPanel panelEntrada = new JPanel(new GridLayout(6, 2, 5, 5));
        panelEntrada.setBorder(BorderFactory.createTitledBorder("Datos de Entrada"));
        
        panelEntrada.add(new JLabel("FUNCIÓN f(x):"));
        txtFuncion = new JTextField();
        txtFuncion.setEditable(false);
        panelEntrada.add(txtFuncion);
        
        panelEntrada.add(new JLabel("Límite Inferior (a):"));
        txtA = new JTextField();
        panelEntrada.add(txtA);
        
        panelEntrada.add(new JLabel("Límite Superior (b):"));
        txtB = new JTextField();
        panelEntrada.add(txtB);
        
        panelEntrada.add(new JLabel("Número de Intervalos:"));
        txtN = new JTextField();
        panelEntrada.add(txtN);
        
        JButton btnCalcular = new JButton("CALCULAR");
        btnCalcular.setBackground(Color.YELLOW);
        btnCalcular.addActionListener(e -> calcularIntegral());
        panelEntrada.add(btnCalcular);
        
        panelEntrada.add(new JLabel("RESULTADO:"));
        txtResultado = new JTextField();
        txtResultado.setEditable(false);
        panelEntrada.add(txtResultado);
        
        add(panelEntrada, BorderLayout.NORTH);
        
        panelBotones = new JPanel(new GridLayout(4, 5, 5, 5));
        String[] botones = {"0", "1", "2", "+", "(x)", "3", "4", "5", "-", "(", "6", "7", "8", "*", ")", "9", "√", "^", "/", "<-"};
        
        for (String texto : botones) {
            JButton btn = new JButton(texto);
            btn.setBackground(texto.equals("<-") ? Color.RED : Color.YELLOW);
            btn.addActionListener(e -> manejarEntradaBoton(texto));
            panelBotones.add(btn);
        }
        
        add(panelBotones, BorderLayout.WEST);
        
        JPanel panelPrincipal = new JPanel(new GridLayout(1, 2));
        panelPrincipal.setBorder(BorderFactory.createLineBorder(Color.MAGENTA, 2));
        add(panelPrincipal, BorderLayout.CENTER);
    }
    
    private void manejarEntradaBoton(String texto) {
        if (texto.equals("<-")) {
            if (funcionInput.length() > 0) {
                funcionInput = funcionInput.substring(0, funcionInput.length() - 1);
                txtFuncion.setText(funcionInput);
            }
        } else {
            funcionInput += texto;
            txtFuncion.setText(funcionInput);
        }
    }
    
    private void calcularIntegral() {
        try {
            double a = Double.parseDouble(txtA.getText());
            double b = Double.parseDouble(txtB.getText());
            int n = Integer.parseInt(txtN.getText());
            String funcionStr = txtFuncion.getText();
            
            if (n <= 0) {
                txtResultado.setText("El número de intervalos debe ser positivo");
                return;
            }
            
            double h = (b - a) / n;
            double suma = 0.5 * (evaluarFuncion(funcionStr, a) + evaluarFuncion(funcionStr, b));
            
            for (int i = 1; i < n; i++) {
                double x = a + i * h;
                suma += evaluarFuncion(funcionStr, x);
            }
            
            double resultado = h * suma;
            txtResultado.setText("Resultado: " + resultado);
            
        } catch (Exception ex) {
            txtResultado.setText("Error: " + ex.getMessage());
        }
    }
    
    private double evaluarFuncion(String funcion, double x) {
        try {
            Expression expression = new ExpressionBuilder(funcion).variable("x").build().setVariable("x", x);
            return expression.evaluate();
        } catch (Exception e) {
            throw new RuntimeException("Error evaluando la función: " + e.getMessage());
        }
    }
}