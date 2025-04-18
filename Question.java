public class Question{
    private int id;
    private String question;
    private String opt1;
    private String opt2;
    private String opt3;
    private String opt4;
    private String answer;

    public Question(int id, String question, String opt1, String opt2, String opt3, String opt4, String answer){
     this.id = id;
     this.question = question;
     this.opt1 = opt1;
     this.opt2 = opt2;
     this.opt3 = opt3;
     this.opt4 = opt4;
     this.answer = answer;
    }

    public String getAnswer(){
        return this.answer;
    }

    public String getOpt1(){
        return this.opt1;
    }

    public String getOpt2(){
        return this.opt2;
    }

    public String getOpt3(){
        return this.opt3;
    }

    public String getOpt4(){
        return this.opt4;
    }

    public String toString(){
        return "Question " + this.question +  "?\n" +  "\t" +"a. " + this.opt1 + " b.  " + this.opt2 + "c.  " + this.opt3 + "d.  " + this.opt4;
    }
}