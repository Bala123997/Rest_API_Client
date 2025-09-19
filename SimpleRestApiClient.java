package restAPIClient;
//Simple Java Program to call a REST API
//and print the response
//Beginner level code with clear comments
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class SimpleRestApiClient {
	public static void main(String[] args) {
		try {
			// Step 1: URL of the REST API
			URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");
			// Step 2: Open connection
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			// Step 3: Set request method (GET)
			conn.setRequestMethod("GET");
			// Step 4: Read response using BufferedReader
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close(); // close the stream
			// Step 5: Print the API response
			System.out.println("Response from API:");
			System.out.println(response.toString());
		} catch (Exception e) {
			// If error occurs, print it
			System.out.println("Error: " + e.getMessage());
		}
	}
}
