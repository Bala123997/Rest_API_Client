# Rest_API_Client
My second task that was given by CODTECH IT SOLUTIONS

■ JAVA internships

■ COMPANY : CODTECH IT SOLUTIONS

■ NAME :BATTULA BALA SUBRAMANYAM

■ INTERN ID : CT04DY2327

■ DOMAIN : JAVA

■ DURATION : 4 WEEKS

■ MENTOR : NEELA SANTOSH


![WhatsApp Image 2025-09-20 at 21 17 09_1f7a0df1](https://github.com/user-attachments/assets/781efe4a-4e12-4b53-9186-f4bb52826332)


🌐 Simple REST API Client (Java)

This is a Java program that calls a REST API (https://jsonplaceholder.typicode.com/posts/{id}) and displays the response.
The user can enter multiple post numbers at once, and the program fetches and prints the results in both raw JSON and formatted output.
It runs in a loop until the user types exit.
No external libraries are required – uses only Java’s built-in HttpURLConnection.


🚀 Features

✅ Calls REST API using Java standard libraries

✅ Accepts multiple post numbers (e.g., 1 2 3 10)

✅ Handles invalid inputs (non-numeric or out-of-range values)

✅ Displays response in:

Raw JSON

Readable formatted style


✅ Runs until user types exit


📂 Project Structure

restAPIClient/
│
├── SimpleRestApiClient.java   # Main program file
├── README.md                  # Documentation (this file)


<img width="1920" height="966" alt="Simple-AI-Based-Recomendation-System_README md at main · Bala123997_Simple-AI-Based-Recomendation-System - Google Chrome 20-09-2025 21_21_20" src="https://github.com/user-attachments/assets/9c68f2e3-8c9b-428f-8460-0f651ed3abb7" />


<img width="1920" height="966" alt="eclipse-workspace - resrAPIClient_src_restAPIClient_SimpleRestApiClient java - Eclipse IDE 20-09-2025 21_21_32" src="https://github.com/user-attachments/assets/d14429f4-224d-4894-a905-0436868f95e4" />


🛠 How to Run the Program

<img width="1920" height="966" alt="eclipse-workspace - resrAPIClient_src_restAPIClient_SimpleRestApiClient java - Eclipse IDE 20-09-2025 21_13_21" src="https://github.com/user-attachments/assets/c616d355-94a8-45a0-bda0-5d62d4e68772" />


<img width="1920" height="966" alt="eclipse-workspace - resrAPIClient_src_restAPIClient_SimpleRestApiClient java - Eclipse IDE 20-09-2025 21_13_25" src="https://github.com/user-attachments/assets/9e1f312d-7475-44da-976f-eee38debf2c8" />


📖 API Details

This program uses the free test API:
👉 JSONPlaceholder Posts API

Available post IDs: 1–100

Each post contains:

userId
id
title
body


🧑‍💻 Code Overview

User Input → Enter post numbers or exit to quit.

Validation → Checks if input is numeric and within 1-100.

API Call → Uses HttpURLConnection with GET request.

Response Handling → Prints both raw JSON and formatted output.


✨ Future Improvements

Parse JSON properly using libraries like org.json or Gson

Add support for fetching comments (/comments) or users (/users)

Provide search functionality by keyword

Display results in tabular format


Acknowledgements 🙏

Thanks to Codetech IT Solutions for this opportunity — this was my first internship task and it boosted my confidence! 🚀





