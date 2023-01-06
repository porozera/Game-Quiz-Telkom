
import javax.swing.*;
import java.awt.* ;
import javax.swing.border.LineBorder;


class Anggota  extends JFrame{
  Anggota () {
      setSize(400,400);
      setResizable(false);
      setLocationRelativeTo(null);
      JPanel pan = new JPanel () ;
      pan.setSize(this.getSize().width,this.getSize().height);
      pan.setBackground(Color.DARK_GRAY);
      pan.setLayout(null);
      setContentPane(pan);
      JLabel border = new JLabel() ;
      border.setBorder(new LineBorder(Color.white, 2, true));
      border.setBounds(10,5,370,350);
      pan.add(border);
      JLabel me =new JLabel (new ImageIcon(getClass().getResource("logo.png")));
      JLabel myName =new JLabel ("<html><center>Apocalypse Day<center></html>") ;
      JLabel copyright = new JLabel ("<html><center>Tubes PBO<center></html>");
      JLabel contact = new JLabel ("<html>"
                                       + "1. Aufar Nugratama PS (1202210064)<br/>"+ 
                                          "2. Adiyatma Sadya Nugraha  (1202210368)<br/>" +
                                          "3. Arief Muttaqin  (1202210381)<br/>"+
                                          "4. Iqmal Nuriadi (1202213098)</a>"
                                           + "</html>");
      copyright.setBounds(150,290,200,30);
      copyright.setForeground(Color.white);
      border.add(copyright);
      contact.setBounds(60,140,250,150);
      contact.setForeground(Color.white);
      border.add(contact);
      myName.setBounds(0,110,80,20);
      myName.setFont(new Font("Verdana", Font.BOLD, 10));
      myName.setForeground(Color.white);
      me.setBounds(140,10,80,130);
      me.add(myName);
      JSeparator sep = new JSeparator();
      JSeparator sep2 = new JSeparator();
      sep.setBounds(30,150,300,5);
      sep2.setBounds(55,275,250,5);
      border.add(sep);
      border.add(sep2);
      border.add(me);
      setVisible(true);
  }
}