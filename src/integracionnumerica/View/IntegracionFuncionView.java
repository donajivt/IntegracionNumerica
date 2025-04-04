/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package integracionnumerica.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author vania
 */
public class IntegracionFuncionView extends javax.swing.JFrame {

    private DefaultTableModel modeloTabla;
    private String funcionInput = "";
    private JTable tablaResultados;
    private JPanel panelGrafica2;
    /**
     * Creates new form IntegracionFuncionView
     */
    public IntegracionFuncionView() {
        initComponents();
        this.setLocationRelativeTo(null);
        // Agregar evento a los botones de números
        btn0.addActionListener(evt -> agregarACampo("0"));
        btn1.addActionListener(evt -> agregarACampo("1"));
        btn2.addActionListener(evt -> agregarACampo("2"));
        btn3.addActionListener(evt -> agregarACampo("3"));
        btn4.addActionListener(evt -> agregarACampo("4"));
        btn5.addActionListener(evt -> agregarACampo("5"));
        btn6.addActionListener(evt -> agregarACampo("6"));
        btn7.addActionListener(evt -> agregarACampo("7"));
        btn8.addActionListener(evt -> agregarACampo("8"));
        btn9.addActionListener(evt -> agregarACampo("9"));
        
        // Agregar eventos a los botones de operaciones
        btnMas.addActionListener(evt -> agregarACampo("+"));
        btnMenos.addActionListener(evt -> agregarACampo("-"));
        btnMult.addActionListener(evt -> agregarACampo("*"));
        btnDivision.addActionListener(evt -> agregarACampo("/"));
        btnRaiz.addActionListener(evt -> agregarACampo("sqrt("));
        btnPotencia.addActionListener(evt -> agregarACampo("^"));
        btnX.addActionListener(evt -> agregarACampo("x"));
        btnParIzq.addActionListener(e -> agregarACampo("("));
        btnParDer.addActionListener(e -> agregarACampo(")"));
        // Agregar evento al botón de eliminar último carácter
        btnDelete.addActionListener(evt -> eliminarUltimoCaracter());

        // Agregar evento al botón de calcular
        btnCalcular.addActionListener(evt -> calcularIntegral());
        modeloTabla = new DefaultTableModel(new String[]{"x", "f(x)"}, 0);
        tablaResultados = new JTable(modeloTabla);
        tablaResultados.setBackground(new Color(255, 255, 255));
        JScrollPane scrollPane = new JScrollPane(tablaResultados);
        tblTabla.add(scrollPane);
        tblTabla.setEnabled(false);
        
        this.add(panelGrafica, BorderLayout.CENTER);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn0 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btnMas = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btnMult = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnRaiz = new javax.swing.JButton();
        btnPotencia = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFuncion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        txtB = new javax.swing.JTextField();
        txtN = new javax.swing.JTextField();
        lblResultado = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnParIzq = new javax.swing.JButton();
        btnParDer = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtError = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        tblTabla = new java.awt.ScrollPane();
        panelGrafica = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Integración Númerica por Método de Trapecio");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2));

        btn0.setBackground(new java.awt.Color(255, 255, 153));
        btn0.setText("0");

        btn1.setBackground(new java.awt.Color(255, 255, 153));
        btn1.setText("1");

        btn2.setBackground(new java.awt.Color(255, 255, 153));
        btn2.setText("2");

        btnMas.setBackground(new java.awt.Color(255, 255, 153));
        btnMas.setText("+");

        btn3.setBackground(new java.awt.Color(255, 255, 153));
        btn3.setText("3");

        btn4.setBackground(new java.awt.Color(255, 255, 153));
        btn4.setText("4");

        btn5.setBackground(new java.awt.Color(255, 255, 153));
        btn5.setText("5");

        btn6.setBackground(new java.awt.Color(255, 255, 153));
        btn6.setText("6");

        btnMenos.setBackground(new java.awt.Color(255, 255, 153));
        btnMenos.setText("-");

        btn7.setBackground(new java.awt.Color(255, 255, 153));
        btn7.setText("7");

        btn8.setBackground(new java.awt.Color(255, 255, 153));
        btn8.setText("8");

        btnMult.setBackground(new java.awt.Color(255, 255, 153));
        btnMult.setText("*");

        btn9.setBackground(new java.awt.Color(255, 255, 153));
        btn9.setText("9");

        btnRaiz.setBackground(new java.awt.Color(255, 255, 153));
        btnRaiz.setText("√");

        btnPotencia.setBackground(new java.awt.Color(255, 255, 153));
        btnPotencia.setText("^");

        btnDivision.setBackground(new java.awt.Color(255, 255, 153));
        btnDivision.setText("/");

        btnX.setBackground(new java.awt.Color(255, 255, 153));
        btnX.setText("(x)");

        btnDelete.setBackground(new java.awt.Color(255, 102, 102));
        btnDelete.setText("<-");

        jLabel1.setText("FUNCIÓN f(x):");

        txtFuncion.setEditable(false);
        txtFuncion.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Límite Inferior (a):");

        jLabel3.setText("Límite Superior (b):");

        jLabel4.setText("Número de Intervalos:");

        lblResultado.setText("RESULTADO:");

        txtResultado.setEditable(false);
        txtResultado.setDisabledTextColor(new java.awt.Color(255, 255, 204));

        btnCalcular.setBackground(new java.awt.Color(255, 255, 153));
        btnCalcular.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnCalcular.setText("CALCULAR");
        btnCalcular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 153), 3));

        btnParIzq.setBackground(new java.awt.Color(255, 255, 153));
        btnParIzq.setText("(");

        btnParDer.setBackground(new java.awt.Color(255, 255, 153));
        btnParDer.setText(")");

        jLabel5.setText("ERROR ABSOLUTO:");

        txtError.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtError.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn0)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMas))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMenos)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnX, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnParIzq)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnParDer))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMult))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRaiz)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPotencia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDivision)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(txtFuncion)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblResultado))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtResultado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtN, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtError)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(28, 28, 28)
                        .addComponent(txtB))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(35, 35, 35)
                        .addComponent(txtA, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblResultado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn0)
                                    .addComponent(btn1)
                                    .addComponent(btn2)
                                    .addComponent(btnMas))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn3)
                                    .addComponent(btn4)
                                    .addComponent(btn5)
                                    .addComponent(btnMenos)
                                    .addComponent(btnParIzq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnParDer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnX, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(36, 36, 36)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn6)
                                    .addComponent(btn7)
                                    .addComponent(btn8)
                                    .addComponent(btnMult))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn9)
                                    .addComponent(btnRaiz)
                                    .addComponent(btnPotencia)
                                    .addComponent(btnDivision)))
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnCalcular)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tblTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tblTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
        );

        panelGrafica.setBackground(new java.awt.Color(255, 255, 255));
        panelGrafica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 153), 2));
        panelGrafica.setPreferredSize(new java.awt.Dimension(480, 4));

        javax.swing.GroupLayout panelGraficaLayout = new javax.swing.GroupLayout(panelGrafica);
        panelGrafica.setLayout(panelGraficaLayout);
        panelGraficaLayout.setHorizontalGroup(
            panelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        panelGraficaLayout.setVerticalGroup(
            panelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panelGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Integración Númerica por Método de Trapecio");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarACampo(String texto) {
        funcionInput += texto;
        txtFuncion.setText(funcionInput);
    }

    private void eliminarUltimoCaracter() {
        if (funcionInput.length() > 0) {
            funcionInput = funcionInput.substring(0, funcionInput.length() - 1); // Eliminar el último carácter
            txtFuncion.setText(funcionInput);
        }
    }
    
    private boolean isNumberInt(String cadena){
        try {
            double number = Double.parseDouble(cadena);
            return true;
        }  catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: '" + cadena + "' no es un número válido."
                    + "\nIntenta ingresar un número entero.", 
               "Error de formato", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    private boolean isNumberDouble(String cadena){
        try {
            double number = Double.parseDouble(cadena);
            return true;
        }  catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: '" + cadena + "' no es un número válido."
                    + "\nIntenta ingresar un número décimal o fraccionario.", 
               "Error de formato", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    private boolean isNull(String cadena){
        if(cadena.isEmpty()){
            return false;
        }else{
            return true;
        }
    }
    
    private boolean isValidAll() {
        // Verificar que no están vacíos
        if (!isNull(txtA.getText())) {
            JOptionPane.showMessageDialog(null, "Error: Debes ingresar un valor al Límite Inferior", 
                                          "Error de valores", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!isNull(txtB.getText())) {
            JOptionPane.showMessageDialog(null, "Error: Debes ingresar un valor al Límite Superior", 
                                          "Error de valores", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!isNull(txtN.getText())) {
            JOptionPane.showMessageDialog(null, "Error: Debes ingresar un valor al Número de Intervalos", 
                                          "Error de valores", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!isNull(txtFuncion.getText())) {
            JOptionPane.showMessageDialog(null, "Error: Debes ingresar una función a evaluar", 
                                          "Error de valores", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validar si son números
        if (!isNumberDouble(txtA.getText())) {
            JOptionPane.showMessageDialog(null, "Error: El límite inferior no es un número válido.", 
                                          "Error de valores", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!isNumberDouble(txtB.getText())) {
            JOptionPane.showMessageDialog(null, "Error: El límite superior no es un número válido.", 
                                          "Error de valores", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!isNumberInt(txtN.getText())) {
            JOptionPane.showMessageDialog(null, "Error: El número de intervalos no es un número entero válido.", 
                                          "Error de valores", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private double evaluarFuncion(String funcion, double x) {
        try {
            Expression expression = new ExpressionBuilder(funcion).variable("x").build().setVariable("x", x);
            return expression.evaluate();
        } catch (Exception e) {
            throw new RuntimeException("Error evaluando la función: " + e.getMessage());
        }
    }
    
    private void calcularIntegral() {
        try {
            if(isValidAll()){
                double a = Double.parseDouble(txtA.getText());
                double b = Double.parseDouble(txtB.getText());
                int n = Integer.parseInt(txtN.getText());
                String funcionStr = txtFuncion.getText();
                
                if (n <= 0 || a == b) {
                    JOptionPane.showMessageDialog(null, "Error: El número de intervalos debe ser positivo y el límite inferior debe ser diferente al límite superior", 
                       "Error de valores", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Limpiar la tabla de resultados
                modeloTabla.setRowCount(0);

                // Crear la serie para la gráfica
                XYSeries serie = new XYSeries("f(x)");

                // Hacer el cálculo de la integral
                double h = (b - a) / n;
                double suma = 0.5 * (evaluarFuncion(funcionStr, a) + evaluarFuncion(funcionStr, b));
                System.out.println("H: "+h);
                System.out.println("Suma: "+suma);

                // Evaluar f(x) para cada valor de x
                for (int i = 0; i <= n; i++) {
                    double x = a + i * h;
                    double fx = evaluarFuncion(funcionStr, x);
                    double error = Math.abs(fx - (suma / (n + 1)));
                    
                    // Redondear a 5 decimales
                    x = Math.round(x * 100000.00) / 100000.00;
                    fx = Math.round(fx * 100000.000000) / 100000.000000;
                    
                    // Añadir los datos a la tabla
                    modeloTabla.addRow(new Object[]{x, fx});

                    // Añadir los puntos a la serie para graficarlos
                    serie.add(x, fx);
                    
                    txtError.setText(""+error);
                    
                    // Sumar los valores de la función para la integral
                    if (i > 0 && i < n) suma += fx;
                }
                
                if(a > b){
                    // Calcular el resultado de la integral
                    double resultado = h * suma*(-1);
                    txtResultado.setText(""+resultado);
                }else{
                    // Calcular el resultado de la integral
                    double resultado = h * suma;
                    txtResultado.setText(""+resultado);
                }
                
                 // Crear el conjunto de datos para la gráfica
                XYSeriesCollection dataset = new XYSeriesCollection();
                dataset.addSeries(serie);

                 // Crear la gráfica
                JFreeChart chart = ChartFactory.createXYLineChart("Gráfica de f(x)", "x", "f(x)", dataset,
                        PlotOrientation.VERTICAL, true, true, false);

                // Crear un panel para la gráfica
                ChartPanel chartPanel = new ChartPanel(chart);
                chartPanel.setPreferredSize(new Dimension(panelGrafica.getWidth(), panelGrafica.getHeight())); // Ajustar al tamaño del panel

                // Limpiar y agregar el nuevo gráfico al panel existente
                panelGrafica.removeAll();
                panelGrafica.setLayout(new BorderLayout());
                panelGrafica.add(chartPanel, BorderLayout.CENTER);

                // Refrescar la interfaz
                panelGrafica.revalidate();
                panelGrafica.repaint();
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: Verifica que tu función ingresada contenga los '()' correctos, si se abre uno, se debe de cerrar:)", 
                       "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(IntegracionFuncionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(IntegracionFuncionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(IntegracionFuncionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(IntegracionFuncionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new IntegracionFuncionView().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMult;
    private javax.swing.JButton btnParDer;
    private javax.swing.JButton btnParIzq;
    private javax.swing.JButton btnPotencia;
    private javax.swing.JButton btnRaiz;
    private javax.swing.JButton btnX;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JPanel panelGrafica;
    private java.awt.ScrollPane tblTabla;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtError;
    private javax.swing.JTextField txtFuncion;
    private javax.swing.JTextField txtN;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
