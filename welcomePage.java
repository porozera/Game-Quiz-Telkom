import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.* ;



class welcomePage extends JPanel {
    
    JButton play ,
            Panduan ,
            Anggota ,
            exit ;
    
    static boolean go  = false ;
    
    welcomePage(JFrame window) {
        
        setSize(window.getSize().width,window.getSize().height);
        setLayout(null);
        setBackground(Color.black);
        window.setContentPane(this);
        
        play = new JButton ("Play");
        play.setBackground(new Color(255,165,0)) ;
        play.setBounds(300,50,200,50);
        add(play);
        
        Panduan = new JButton ("Panduan");
        Panduan.setBackground(new Color(255,165,0)) ;
        Panduan.setBounds(300,150,200,50);
        add(Panduan);
        
        Anggota = new JButton ("Anggota");
        Anggota.setBackground(new Color(255,165,0)) ;
        Anggota.setBounds(300,250,200,50);
        add(Anggota);
        
        exit = new JButton ("Exit");
        exit.setBackground(new Color(255,165,0)) ;
        exit.setBounds(300,350,200,50);
        add(exit);
        
        window.setVisible(true);
        
    }
    
    void choose (int time) {
        
        play.addActionListener((ActionEvent e) -> {
            go = true ;
            setVisible(false);
        });
        
        Panduan.addActionListener((ActionEvent e) -> {
            new Panduan(time);
        });
        
        Anggota.addActionListener((ActionEvent e) -> {
            new Anggota () ;
        });
        
        exit.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        
        while (!go) {
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {}
        }
        
        go = false ;
    
    }
    
}