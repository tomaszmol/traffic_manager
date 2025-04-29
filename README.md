## Running the application locally

### 1. Clone the repository
```bash
git clone https://github.com/tomaszmol/traffic_manager.git
cd traffic_manager
```

### 2. Install Java 21
Make sure you have **Java 21** installed on your machine, as this application requires it to run.

To verify if you have Java 21 installed, run:

```bash
java -version
```

### 3. Run the application
If you have Gradle installed:
```bash
gradle run
```

If you don’t have Gradle, you can use the included wrapper:
- On Unix/Linux/macOS:
  ```bash
  ./gradlew run
  ```
- On Windows:
  ```bash
  ./gradlew.bat run
  ```
