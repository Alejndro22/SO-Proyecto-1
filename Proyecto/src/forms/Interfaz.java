package forms;

import clases.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Interfaz extends javax.swing.JFrame {
    int nuevoy = 100;
    ArrayList<PropiedadRect> rec = new ArrayList<>();
    
    DefaultListModel listModel = new DefaultListModel();
//    Objeto de la clase hora
    Hora horario = new Hora();
//    Se declara el objeto de la clase rr
    round_robin rr = new round_robin();
//    Arraylist donde se almacenarán los procesos para dejarlo simple
    ArrayList<Proceso> Procesos = new ArrayList();    
//    Arraylist donde se almacenarán los rectángulos a pintar (class Rectangle)
    ArrayList<Rectangle> Rectangulos = new ArrayList();    
//    Arraylist donde se almacenará por donde va el rectángulo a pintar (class Rectangle)
    ArrayList<Rectangle> ContadorBarra = new ArrayList(); 
//    Objero para crear un numero random  
    Random rand = new Random();
//    Cantidad de procesos creados
    int nProcesos = 0;  
//    Variables de prueba
    int xAxis = 0, yAxis = 0;
    
    public Interfaz() {
        horario.start();
        rr.start();
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Proyecto Sistamas Operativos");
        this.setResizable(false);
        jListHistorial.setModel(listModel);
    }
    
    public class Hora extends Thread {
        
        boolean stop = true;
        @Override      
        public void run(){
                while (stop){
                    //    Cada segundo se crea objeto de la clase date, que obtiene la hora exacta en la que se crea
                    Date date = new Date();
                    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
                    Hora.setText(dateFormat.format(date));                  
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Hora = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabelMenuPrincipall = new javax.swing.JLabel();
        jLabelMenuPrincipall1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListHistorial = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Crear proceso");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Borrar primero");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Hora");

        jButton3.setText("Imprimir ArrayList");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabelMenuPrincipall.setText("Menu principal");

        jLabelMenuPrincipall1.setText("Procesador");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane1.setViewportView(jListHistorial);

        jLabel2.setText("Historial");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(212, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabelMenuPrincipall)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMenuPrincipall1)
                .addGap(177, 177, 177))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, Short.MAX_VALUE))
                .addGap(91, 91, 91)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMenuPrincipall)
                    .addComponent(jLabelMenuPrincipall1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //
        // AVANZAR CON HACERLOS DE TAMAÑOS ALEATORIOS (Entre 5 y 15 segundos de duraci[on)
        int randomN = (int) (Math.random() * (15 - 5 + 1) + 5);
        //
        // Se crea un nuevo proceso cada vez que se presiona el botón, se almacena en :
        
        // Se debe ver que si no se puede crear el proceso restar 1 a nProcesos y eliminar
        // la entrada del arraylist
        
        nProcesos++;
//        Compara si la lista de procesos está vacía, de ser así solo añade el proceso sin siguiente
//        En caso de no ser el primero, asigna al anterior que el nuevo será el siguiente, y el nuevo
//        Apuntará al primero que se encuentra en el index 0
//        if(Procesos.isEmpty()){
//            Proceso Proces0 = new Proceso(nProcesos, randomN*5, randomN, 0, 0, null);
//            Procesos.add(Proces0);
//        }else{
//            Proceso Proces0 = new Proceso(nProcesos, randomN*5, randomN, 0, 0, Procesos.get(0));
//            Procesos.get(Procesos.size()-1).setSiguiente(Proces0);
//            Procesos.add(Proces0);
//        }
        //Verifica si es el primer rectangulo
        if (Rectangulos.size() == 0) {
            Proceso Proces0 = new Proceso(nProcesos, randomN*5, randomN, 100, 0, null);
            Procesos.add(Proces0);
            PropiedadRect nuevo = new PropiedadRect(60, 100, 150, randomN*5);
            Rectangulos.add(new Rectangle(60,100,150,randomN*5));
            rec.add(nuevo);
            //System.out.println("PRIMER NUMERO: " + randomN);
        }else{
            //Si el tamaño supera el rectangulo no se agrega ningun proceso
            if (ultimo() >450) {
                JOptionPane.showMessageDialog(null, "No puedo agregar el proceso por falta de memoria!","ERROR!!", JOptionPane.ERROR_MESSAGE);
            }else{
                //agrega el nuevo proceso y verifica donde deberia ir
                nuevoy = ultimo();
                Proceso Proces0 = new Proceso(nProcesos, randomN*5, randomN, nuevoy, 0, Procesos.get(0));
                Procesos.get(Procesos.size()-1).setSiguiente(Proces0);
                Procesos.add(Proces0);
                PropiedadRect nuevo = new PropiedadRect(60, nuevoy, 150, randomN*5);
                Rectangulos.add(new Rectangle(60,nuevoy,150,randomN*5));
                rec.add(nuevo);
            }
        }
        listModel.addElement("P" + nProcesos + " creado a las " + Hora.getText() + " de duración = " + Procesos.get(Procesos.size()-1).getCantInstrucciones() + " s");
        repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    public int ultimo(){
        return rec.get(rec.size()-1).getIniciay() + rec.get(rec.size()-1).getLargo();
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Pruebas de rectángulos:
        Procesos.remove(0);
        Rectangulos.remove(0);
        Procesos.get(Procesos.size()-1).setSiguiente(Procesos.get(0));
        repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        for(int i=0; i<Procesos.size();i++){
            System.out.println("--------- Proceso no. " + i + " ---------");
            System.out.println("Identificador: " + Procesos.get(i).getIdentificador());
            System.out.println("Tamaño: " + Procesos.get(i).getTamaño());
            System.out.println("Instrucciones (s restantes): " + Procesos.get(i).getCantInstrucciones());
            System.out.println("LowerSpot: " + Procesos.get(i).getRegistroBase());
            System.out.println("HigherSpot: " + Procesos.get(i).getRegistroLimite());
            if(Procesos.size()>1){
                System.out.println("El proceso siguiente es: " + Procesos.get(i).getSiguiente().getIdentificador());
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    int randomS=0;
    int pxLower=0;
    int pxHigher=0;
    boolean avaliable;
    public int lookForAvaliableSpot(int rectangleSize){
        System.out.println("-----Nuevo-----");
        avaliable = true;
        // Los valores para agregar procesos están entre 102-496
        randomS = (int) (Math.random() * (496 - 102 + 1) + 102);
        pxLower = randomS; System.out.println(pxLower);
        pxHigher = randomS + rectangleSize; System.out.println(pxHigher);
        System.out.println("El valor de la bandera es " + avaliable);
        for(int i=0; i<Procesos.size()-1;i++){
            
            // El nuevo cuadro no está contenido en uno ya creado
            
            if(pxLower >= Procesos.get(i).getRegistroBase() && pxLower <= Procesos.get(i).getRegistroLimite()){
                System.out.println("El limite inferior interfiere");
                System.out.println(Procesos.get(i).getRegistroBase());
                System.out.println(Procesos.get(i).getRegistroLimite());
                System.out.println(pxLower);
                avaliable = false;
            }
            else if(pxHigher >= Procesos.get(i).getRegistroBase() && pxHigher <= Procesos.get(i).getRegistroLimite()){
                System.out.println("El limite superior interfiere");
                System.out.println(Procesos.get(i).getRegistroBase());
                System.out.println(Procesos.get(i).getRegistroLimite());
                System.out.println(pxHigher);
                avaliable = false;
            }
            
            // El nuevo cuadro no contiene uno ya creado
            
            else if(Procesos.get(i).getRegistroBase() >= pxLower && Procesos.get(i).getRegistroBase() <= pxHigher){
                System.out.println("El limite inferior de un cuadro existente interfiere");
                System.out.println(Procesos.get(i).getRegistroBase());
                System.out.println(Procesos.get(i).getRegistroLimite());
                System.out.println(pxLower);
                avaliable = false;
            }
            
            else if(Procesos.get(i).getRegistroLimite() >= pxLower && Procesos.get(i).getRegistroLimite() <= pxHigher){
                System.out.println("El limite superior de un cuadro existente interfiere");
                System.out.println(Procesos.get(i).getRegistroBase());
                System.out.println(Procesos.get(i).getRegistroLimite());
                System.out.println(pxLower);
                avaliable = false;
            }
            
            if(avaliable==false){
                break;
            }
        }
        System.out.println("El valor de la bandera es " + avaliable);
        if(avaliable==true){
            //Acá se agregan los atributos de registro base y límite para el planificador
            Procesos.get(Procesos.size()-1).setRegistroBase(pxLower);
            Procesos.get(Procesos.size()-1).setRegistroLimite(pxHigher);
            return randomS;
        }else{
            System.out.println(avaliable);
            System.out.println("Se hará de nuevo por fallo"); 
            lookForAvaliableSpot(rectangleSize);
        }
        System.out.println("finalizó");
        return randomS;
    }
    
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    
    //Se define un quantum de 10 s
    public class round_robin extends Thread{
        boolean forever = true;
        int tiempo = 0, pxInicio, barSize;        
        Rectangle a = new Rectangle(6000,6000,119,barSize);;
        @Override
        public void run(){
            ContadorBarra.add(a);
            while(forever){
                while(Procesos.size() > 0){
                    for(int i=0; i<Procesos.size(); i++){
                        pxInicio = Procesos.get(i).getRegistroBase() + (Procesos.get(i).getCantInstrucciones()-Procesos.get(i).getTiempoRestante())*5;
                        barSize = 5;
                        if(Procesos.get(i).getTiempoRestante()>10){
                            for(int j=0; j<10; j++){
                                a = new Rectangle(60,(pxInicio + (barSize*j)),150,barSize);
                                ContadorBarra.set(0, a);
                                repaint();
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            Procesos.get(i).setTiempoRestante(Procesos.get(i).getTiempoRestante() - 10);
                        }
                        else{
                            for(int j=0; j<Procesos.get(i).getTiempoRestante(); j++){
                                a = new Rectangle(60,(pxInicio + (barSize*j)),150,barSize);
                                ContadorBarra.set(0, a);
                                repaint();
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            listModel.addElement("P" + Procesos.get(i).getIdentificador() + " eliminado a las " + Hora.getText());
                            Procesos.remove(i);
                            Rectangulos.remove(i);
                            if(i != Procesos.size()){
                                i--;
                            }
                            repaint();
                        }
                    }
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                try {
                    Thread.sleep(50);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public void paint(Graphics g){
        String posi;
        String posif;
        Color procesos = new Color(171, 235, 198);
        Color so = new Color(46, 134, 193);
        Color lineas = new Color(14, 102, 85);
        Color letras = new Color(52, 73, 94);
        Color cola = new Color(174, 214, 241);
        super.paint(g);
        g.setColor(cola);
        g.fillRect(60, 100, 150, 400);
        g.setColor(so);
        g.fillRect(60, 501, 150, 50);
        g.setColor(letras);
        g.drawString("S.O", 130, 520);
        g.drawString("0x00FH", 10, 501);
        g.drawString("0x00FH", 10, 551);   
        // Pinta los rectángulos que están en el arraylist
        for(int i=0; i<Rectangulos.size();i++){
            g.setColor(procesos);
            g.fillRect(Rectangulos.get(i).x, Rectangulos.get(i).y, Rectangulos.get(i).width, Rectangulos.get(i).height);
            g.setColor(letras);
            posi = String.valueOf(Rectangulos.get(i).y);
            g.drawString(posi, Rectangulos.get(i).x-30, Rectangulos.get(i).y+5);
            g.setColor(lineas);
            g.drawLine(Rectangulos.get(i).x, Rectangulos.get(i).y, 209, Rectangulos.get(i).y);
        }
        for(int i=0; i<ContadorBarra.size();i++){
            g.setColor(Color.BLUE);
            g.fillRect(ContadorBarra.get(i).x, ContadorBarra.get(i).y, ContadorBarra.get(i).width, ContadorBarra.get(i).height);
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hora;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelMenuPrincipall;
    private javax.swing.JLabel jLabelMenuPrincipall1;
    private javax.swing.JList<String> jListHistorial;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
