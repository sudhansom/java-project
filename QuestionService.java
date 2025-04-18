import java.util.Scanner;

public class QuestionService {
    Question[] question = new Question[5];

    public QuestionService(){
        question[0] = new Question(1, "what is the size of int", "1 byte", "2 bytes", "3 bytes", "4 bytes", "4 bytes");
        question[1] = new Question(2, "what is the size of short", "1 byte", "2 bytes", "3 bytes", "4 bytes", "1 byte1");
        question[2] = new Question(3, "what is the size of boolean", "1 byte", "2 bytes", "3 bytes", "4 bytes", "1 byte");
        question[3] = new Question(4, "what is the size of string", "1 byte", "2 bytes", "3 bytes", "4 bytes", "2 bytes");
        question[4] = new Question(5, "what is the size of double", "1 byte", "2 bytes", "3 bytes", "4 bytes", "4 bytes");
    }

    public void playQuiz(){
        int i = 0;
        int result = 0;
        String ans;
        boolean opt = true;
        for(Question question : question){
            do{
                if(!opt){
                    System.out.println("Please choose from the option only.");
                }

                System.out.println(i + ". " + question);
                Scanner sc = new Scanner(System.in);
                ans = sc.nextLine();
                opt = ans.equals(question.getOpt1()) || ans.equals(question.getOpt2()) || ans.equals(question.getOpt3()) || ans.equals(question.getOpt4());
                System.out.println(opt);
            }while(!opt);
            if(ans.equals( question.getAnswer())){

                System.out.println(ans + " you are right");
            }else {
                System.out.println(ans + question.getAnswer() + " you are Wrong...");
            }
            result ++;
        }
        System.out.println(result + " Right answer.");
    }
}
