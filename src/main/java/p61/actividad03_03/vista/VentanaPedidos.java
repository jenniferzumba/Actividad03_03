/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.actividad03_03.vista;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import p61.actividad03_03.controlador.PedidoControl;
import p61.actividad03_03.modelo.Pedido;

/**
 *
 * @author jenniferzumba
 */
public class VentanaPedidos extends JFrame implements ActionListener{
    
    public List<JPanel> jPanelList;
     public List<JLabel> jLabelList;
     public List<JTextField> jTextFieldList;
     public List<JButton> jButtonList;
     public List<JCheckBox> jCheckBoxList;
     public List<JRadioButton> jRadioButtonList;
     public List<JComboBox> jComboBoxList;




     public VentanaPedidos(String title) throws HeadlessException {
         super(title);
         this.setSize(400, 400);
         this.setLocation(200, 100);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.iniciarPanels();
         this.iniciarJTextFields();
         this.iniciarJButtons();
         this.iniciarJCheckBoxs();
         
         this.iniciarCombos();
         this.setContentPane(this.jPanelList.get(0));
         this.setVisible(true);
     }

     public void iniciarPanels(){
         this.jPanelList = new ArrayList<>();
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());


         this.jPanelList.get(0).setLayout(new GridLayout(10,1));
         this.jPanelList.get(0).add(this.jPanelList.get(1));
         this.jPanelList.get(0).add(this.jPanelList.get(2));
         this.jPanelList.get(0).add(this.jPanelList.get(3));
         this.jPanelList.get(0).add(this.jPanelList.get(4));
         this.jPanelList.get(0).add(this.jPanelList.get(5));
         this.jPanelList.get(0).add(this.jPanelList.get(7));
         this.jPanelList.get(0).add(this.jPanelList.get(8));
         this.jPanelList.get(0).add(this.jPanelList.get(9));
         this.jPanelList.get(0).add(this.jPanelList.get(10));


         this.jPanelList.get(0).add(this.jPanelList.get(6));


     }

     public void iniciarJTextFields(){
         this.jLabelList = new ArrayList<>();

         this.jLabelList.add(new JLabel("Código: "));
         this.jLabelList.add(new JLabel(" Nombre Proveedor: "));
         
         

         this.jTextFieldList = new ArrayList<>();

         this.jTextFieldList.add(new JTextField(5));
         this.jTextFieldList.add(new JTextField(20));
         
         this.jTextFieldList.get(0).addActionListener(this);
         this.jTextFieldList.get(1).addActionListener(this);
         

         this.jPanelList.get(1).add(this.jLabelList.get(0));
         this.jPanelList.get(1).add(this.jTextFieldList.get(0));
         this.jPanelList.get(2).add(this.jLabelList.get(1));
         this.jPanelList.get(2).add(this.jTextFieldList.get(1));
         

     }

     public void iniciarJButtons(){
         this.jButtonList = new ArrayList<>();

         this.jButtonList.add(new JButton("Guardar"));
         this.jButtonList.add(new JButton("Cancelar"));
         this.jButtonList.add(new JButton("Listar"));
         this.jButtonList.get(0).addActionListener(this);
         this.jButtonList.get(1).addActionListener(this);
         this.jButtonList.get(2).addActionListener(this);

         this.jPanelList.get(6).add(this.jButtonList.get(0));
         this.jPanelList.get(6).add(this.jButtonList.get(1));
        this.jPanelList.get(6).add(this.jButtonList.get(2));

     }

     public void iniciarJCheckBoxs(){
         this.jCheckBoxList = new ArrayList<>();

         this.jCheckBoxList.add(new JCheckBox("Verduras",true));
         this.jCheckBoxList.add(new JCheckBox("Frutas"));
         this.jCheckBoxList.add(new JCheckBox("Golosinas"));
         this.jCheckBoxList.add(new JCheckBox("Granos"));

         this.jCheckBoxList.get(0).addActionListener(this);
         this.jCheckBoxList.get(1).addActionListener(this);
         this.jCheckBoxList.get(2).addActionListener(this);
         this.jCheckBoxList.get(3).addActionListener(this);

         this.jPanelList.get(7).add(this.jCheckBoxList.get(0));
         this.jPanelList.get(7).add(this.jCheckBoxList.get(1));
         this.jPanelList.get(7).add(this.jCheckBoxList.get(2));
         this.jPanelList.get(7).add(this.jCheckBoxList.get(3));

     }

    

     public void iniciarCombos(){
         this.jComboBoxList = new ArrayList<>();
         var listapedido = new String[4];
         listapedido[0]="Pedidos Grande";
         listapedido[1]="Pedido normal";
         listapedido[2]="pedido especial";
         listapedido[3]="Pedido Pequeno";

         this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listapedido)));
         this.jComboBoxList.add(new JComboBox());
         
         this.jComboBoxList.get(0).addActionListener(this);
         this.jComboBoxList.get(1).addActionListener(this);
         




         this.jPanelList.get(9).add(this.jComboBoxList.get(0));
         this.jPanelList.get(10).add(this.jComboBoxList.get(1));
         


     }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Guardar")) {
            System.out.println(this.recuperarDatosIngresados()[0]);
            

        } 
        if(e.getActionCommand().equals(this.jButtonList.get(1))){
            this.limpiarDatosIngresados();
        }
        if (e.getActionCommand().equals("Cancelar")){
            System.out.println("Dio click en en un botón cancelar");

        }

        if (e.getActionCommand().equals("Frutas")) {
            System.out.println("Hizo un pedido de frutas");
        }
        if (e.getActionCommand().equals("Golosinas")) {
            System.out.println("Hizo un pedido de golosinas");

        }
        if (e.getActionCommand().equals("Verduras")) {
            System.out.println("Hizo un pedido de verduras");
        }
        if (e.getActionCommand().equals("Granos")) {
           System.out.println("Hizo un pedido de granos"); 
        }
        
        

    }
    private void limpiarDatosIngresados(){
        this.jTextFieldList.get(0).setText("");
    }
    public String[]recuperarDatosIngresados(){
        var retorno=new String[12];
        retorno[0]=this.jTextFieldList.get(0).getText();
        return retorno;
    }
    
 }
        

 

    

