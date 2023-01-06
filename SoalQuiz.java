
class SoalQuiz {
    
    String question ,
            op1 ,
            op2 ,
            op3 , 
            op4 ,
            correct_answer ,
            hint;
    
    SoalQuiz (String question , String op1 , String op2 ,String op3, String op4 , String corrAns , String hint) {
        this.question = question ;
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3 ;
        this.op4 = op4 ;
        this.correct_answer = corrAns ;
        this.hint = hint ;
    }
}