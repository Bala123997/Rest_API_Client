package restAPIClient;
//Java program to call a REST API
//User can enter multiple post numbers repeatedly
//No external libraries required
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
public class SimpleRestApiClient {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     try {
         while (true) { // Loop until user wants to exit
             // Step 1: Ask user for multiple post numbers
             System.out.print("Enter post numbers separated by space (1-100) or type 'exit' to quit: ");
             String input = sc.nextLine();
             // Exit condition
             if (input.equalsIgnoreCase("exit")) {
                 System.out.println("Exiting program. Goodbye!");
                 break;
             }
             String[] numbers = input.split("\\s+"); // split by space
             // Step 2: Loop through each post number
             for (String numStr : numbers) {
                 int postNumber;
                 try {
                     postNumber = Integer.parseInt(numStr);
                     if (postNumber < 1 || postNumber > 100) {
                         System.out.println("Invalid number (must be 1-100): " + postNumber);
                         continue;
                     }
                 } catch (NumberFormatException e) {
                     System.out.println("Invalid input (not a number): " + numStr);
                     continue;
                 }
                 // Step 3: URL of the REST API (dynamic)
                 URL url = new URL("https://jsonplaceholder.typicode.com/posts/" + postNumber);
                 // Step 4: Open connection
                 HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                 conn.setRequestMethod("GET");
                 // Step 5: Check response code
                 int status = conn.getResponseCode();
                 if (status == 200) {
                     System.out.println("\n--- Post " + postNumber + " ---");
                     // Step 6: Read response
                     BufferedReader in = new BufferedReader(
                             new InputStreamReader(conn.getInputStream())
                     );
                     String inputLine;
                     StringBuilder response = new StringBuilder();
                     while ((inputLine = in.readLine()) != null) {
                         response.append(inputLine);
                     }
                     in.close();
                     // Step 7: Print raw response
                     System.out.println("Raw Response:");
                     System.out.println(response.toString());
                     // Step 8: Simple formatting
                     System.out.println("\nFormatted JSON-like output:");
                     String formatted = response.toString()
                             .replace("{", "{\n  ")
                             .replace("}", "\n}")
                             .replace(",", ",\n  ");
                     System.out.println(formatted);
                 } else {
                     System.out.println("API call for post " + postNumber + " failed with response code: " + status);
                 }
             }
             System.out.println("\n------------------------------\n");
         }
     } catch (Exception e) {
         System.out.println("Error occurred:");
         e.printStackTrace();
     } finally {
         sc.close();
     }
 }
}
