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
        for(Question question : question){
            System.out.println(question);
        }
    }
}
