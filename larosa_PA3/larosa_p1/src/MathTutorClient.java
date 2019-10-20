public class MathTutorClient {
    public static void main(String args[]){
        MathTutor tutor = new MathTutor();
        int choice = tutor.getQuestionType();
        tutor.askQuestions();
        tutor.printReport();
    }
}
