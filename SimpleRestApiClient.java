package restAPIClient;
//Simple REST API Client in Java
//This program fetches weather data from a public REST API
//Written in beginner-level Java (basic methods, class, and comments)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SimpleRestApiClient {

 // Main method
 public static void main(String[] args) {
     try {
         // 1. API URL (Open-Meteo free weather API - no key needed)
         String apiUrl = "https://api.open-meteo.com/v1/forecast?latitude=35&longitude=139&current_weather=true";

         // 2. Create URL object
         URL url = new URL(apiUrl);

         // 3. Open HTTP connection
         HttpURLConnection conn = (HttpURLConnection) url.openConnection();
         conn.setRequestMethod("GET");  // HTTP GET request

         // 4. Read response from API
         BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
         String inputLine;
         StringBuffer response = new StringBuffer();

         while ((inputLine = in.readLine()) != null) {
             response.append(inputLine); // add each line of response
         }
         in.close(); // close connection

         // 5. Print the response (JSON format)
         System.out.println("Weather API Response:");
         System.out.println(response.toString());

         // NOTE: In a beginner program, we just print the JSON response.
         // If needed, we can parse JSON later using libraries like org.json or Gson.

     } catch (Exception e) {
         // Print error message if something goes wrong
         System.out.println("Error: " + e.getMessage());
     }
 }
}