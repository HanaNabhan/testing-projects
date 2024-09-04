

# Testing Projects Workspace

This repository contains a collection of testing projects, including both manual testing performed with Postman and automated testing using Rest Assured. These projects demonstrate a range of testing methodologies and tools, with examples that cover various aspects of API testing.

## Project Structure

The repository is organized into two main sections:

### 1. **Manual Testing (Postman)**

- **Folder**: `manual-testing-postman`
- **Description**: This section includes manual testing projects created and executed using Postman. The projects contain collections with various pre-request and post-request scripts, assertions, and workflows.
- **Usage**:
  1. Import the provided JSON files into Postman.
  2. Run the collections to execute the API tests.
  3. Review the results and logs within Postman.

- **Prerequisites**:
  - Postman installed on your machine.
  - Internet connection to access the API endpoints.

### 2. **Automated Testing (Rest Assured)**

- **Folder**: `rest-assured-tests`
- **Description**: This section includes automated API tests using the Rest Assured library in Java. The projects are set up with Maven, including test cases for various HTTP methods, assertions, and validations.
- **Usage**:
  1. Clone the repository and navigate to the `rest-assured-tests` folder.
  2. Ensure you have Java and Maven installed.
  3. Run the tests using Maven:
     ```bash
     mvn test
     ```
  4. Review the test results in the terminal or your preferred IDE.

- **Prerequisites**:
  - Java Development Kit (JDK) installed.
  - Maven installed and configured.
  - IDE (e.g., IntelliJ IDEA, Eclipse) for project management and test execution.

## Getting Started

### Cloning the Repository

To get a local copy of this repository, run the following command in your terminal:

```bash
git clone https://github.com/HanaNabhan/testing-projects.git
```

Navigate into the repository folder:

```bash
cd testing-projects
```
