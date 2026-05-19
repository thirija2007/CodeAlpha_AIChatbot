import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("=== AI Chatbot ===");
        System.out.println("Hello! I am your AI Assistant!");
        System.out.println("Type 'bye' to exit\n");

        while(true) {
            System.out.print("You: ");
            input = sc.nextLine().toLowerCase();

            if(input.equals("bye")) {
                System.out.println("Bot: Goodbye! Have a nice day!");
                break;
            }
            else if(input.contains("hello") ||
                    input.contains("hi")) {
                System.out.println("Bot: Hello! How are you?");
            }
            else if(input.contains("name")) {
                System.out.println("Bot: I am Java AI Chatbot!");
            }
            else if(input.contains("how are you")) {
                System.out.println("Bot: I am doing great!");
            }
            else if(input.contains("java")) {
                System.out.println("Bot: Java is a great programming language!");
            }
            else if(input.contains("help")) {
                System.out.println("Bot: I can answer your questions!");
            }
            else if(input.contains("age")) {
                System.out.println("Bot: I am a new AI chatbot!");
            }
            else if(input.contains("weather")) {
                System.out.println("Bot: I cannot check weather but stay safe!");
            }
            else if(input.contains("thank")) {
                System.out.println("Bot: You are welcome!");
            }
            else {
                System.out.println("Bot: I am still learning! Ask me something else!");
            }
        }
        sc.close();
    }
}
