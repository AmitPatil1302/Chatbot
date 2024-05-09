import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! How can I assist you today?");
        
        while (true) {
            String userInput = scanner.nextLine();
            String response = getResponse(userInput);
            System.out.println(response);
        }
    }
    
    private static String getResponse(String userInput) {
        // Example responses, you'll need to replace these with actual NLP and ML logic
        if (userInput.contains("hello") || userInput.contains("hi")) {
            return "Hello! How can I help you?";
        } else if (userInput.contains("weather")) {
            // Call weather API or retrieve from a database
            return "The weather today is sunny.";
        } else {
            return "I'm sorry, I didn't understand that. Can you please rephrase?";
        }
    }
}
