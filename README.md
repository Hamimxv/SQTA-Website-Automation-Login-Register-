# Selenium Testing Project

![Java](https://img.shields.io/badge/Java-8-blue?logo=java)
![Selenium](https://img.shields.io/badge/Selenium-3.141.59-green?logo=selenium)
![GitHub](https://img.shields.io/badge/GitHub-Repository-orange?logo=github)
![License](https://img.shields.io/badge/License-Apache%202.0-blue?logo=apache)

This project demonstrates automated testing using Selenium for a hotel booking web application. It includes test cases for user registration and login functionalities.

## Prerequisites

- Java 8
- Selenium WebDriver
- ChromeDriver (make sure it's compatible with your Chrome browser version)

## Setup

1. Clone the repository:

    ```bash
    git clone https://github.com/Hamimxv/SQTA-Website-Automation-Login-Register-.git
    ```

2. Download and configure ChromeDriver. Update the `webdriver.chrome.driver` property in your code with the correct path to your ChromeDriver executable.

    ```java
    System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver.exe");
    ```

3. Open the project in NetBeans or your preferred IDE.

4. Run the `STQALabProject` class.

## Project Structure

- `STQALabProject.java`: Main class containing Selenium test cases for user registration and login.
- `chromedriver_win32/`: Folder containing ChromeDriver executable.
- `result.txt`: File where test results are logged.

## Test Cases

### Registration

- Verify successful registration with valid user information.
- Verify proper handling of duplicate username during registration.

### Login

- Verify successful login with valid credentials.
- Verify proper handling of invalid login attempts.

## Test Results

Check the `result.txt` file for detailed test results after running the test cases.

## Contributing

Feel free to contribute to this project by opening issues or submitting pull requests. Your feedback and improvements are welcome!

## License

This project is licensed under the [Apache License 2.0](LICENSE).
