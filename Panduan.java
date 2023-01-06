
import javax.swing.*;
import java.awt.* ;
import javax.swing.border.LineBorder;


class Panduan  extends JFrame{
  Panduan (int time) {
      setSize(400,400);
      setLocationRelativeTo(null);
      setResizable(false);
      JPanel pan = new JPanel () ;
      pan.setSize(this.getSize().width,this.getSize().height);
      pan.setBackground(Color.DARK_GRAY);
      pan.setLayout(null);
      setContentPane(pan);
      JLabel howLabel = new JLabel("<html><center>Anda memiliki "+ time/60+" Menit "+time%60 +"  Detik Untuk Menjawab 10 Pertanyaan Berbeda"
                              + " Dan Kamu Bisa memakai alat bantu fitur 50:50 Untuk menghilangkan dua jawaban "
                                    + "Atau Fitur Hint untuk memberimu petunjuk jawaban.</center></html>");
      howLabel.setFont(new Font("Verdana", Font.BOLD, 15));
      howLabel.setBounds(8,5,350,150);
      howLabel.setForeground(Color.white);
      JLabel border = new JLabel() ;
      border.setBorder(new LineBorder(Color.orange, 2, true));
      border.setBounds(10,5,365,350);
      JLabel img = new JLabel(new ImageIcon(getClass().getResource("how it works.jpg")));
      img.setBounds(8,160,350,150);
      border.add(howLabel);
      border.add(img);
      pan.add(border);
      setVisible(true);
  }
}