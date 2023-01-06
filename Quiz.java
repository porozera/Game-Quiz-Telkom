
import javax.swing.*;

public class Quiz {
    public static void main(String[] args) throws InterruptedException {
        
      JFrame window = new JFrame ("Quiz Telkom University") ;  
      window.setSize(800,500);
      window.setLocationRelativeTo(null);
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setResizable(false);

    while (true) {  
    
      int nbr =0 , score=0 , s=0 ;
      int time = 60 ; //sec  
        
      welcomePage welcome = new welcomePage (window);
      welcome.choose(time);
        
        SoalQuiz [] qObj = {
            new SoalQuiz("Telkom University berada di kota apa?","Bojong Santos","Balaendah","Jakarta","Bandung","Bandung","Ibu kota Jawa Barat"),
            new SoalQuiz("Ada berapa fakultas yang ada di Telkom University?","10","4","7","5","7","Angka ganjil"),
            new SoalQuiz("Berapa lama jangka waktu untuk mahasiswa baru menempati asrama?","6 tahun","4 tahun","1 tahun","Sampai lulus","1 tahun","31536000 detik"),
            new SoalQuiz("Apa nama acara yang sering diadakan di Telkom University yang ditujukan untuk mengenal kehidupan kampus?","PMB","OSPEK","PKMB","PKKMB","PKKMB","Dilaksanakan oleh Mahasiswa Semester 1"),
            new SoalQuiz("Nama awal sebelum Telkom University di bangun?","ITS Bandung","STT Telkom","STT Bandung","Teknik Telkom","STT Telkom","Teknok"),
            new SoalQuiz("Apa singkatan Telkom University?","Untel","Telyutizen","Tel-U","STT Telkom","Tel-U","Nama depan disingkat"),
            new SoalQuiz("Telkom University berdiri pada tahun?","2016","2012","2013","2010","2013","Tahun setelah film kiamat"),
            new SoalQuiz("Nama danau pada telkom university?","danau galau","danau avanger","danau toba","danau citarum","danau galau","Gagal Move on"),
            new SoalQuiz("Berapa lantai pada gedung tult","12","15","17","20","20","Genap"),
            new SoalQuiz("Nama klinik telkom","Telkommedika","Telkomcare","Klinik telu","Puskesmas telkom","Telkommedika","Medicine"),
        };
        
        while (nbr != qObj.length && s<time ) {
            questions quiz = new questions(qObj[nbr], window);
            quiz.getAnswer(time); 
            quiz.getTime();
            s = quiz.getTime().S ;
            score = quiz.getScore();
            if (nbr == qObj.length-1 || (s==time)) quiz.Reset();
            nbr++ ;
        }
        
        int nbrQ = qObj.length ;  
        PanelScore scorePane = new PanelScore (window,score,nbrQ) ;
        scorePane.choose();
     
     }    
      
    }    
}