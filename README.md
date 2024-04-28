# Dummy Rest Api Example Employee Test

This project is a sample test project to test "https://dummy.restapiexample.com/api/v1/employees" endpoint

## Prerequisites

Before running the tests, ensure you have the following software installed:

- Java Development Kit (JDK)
- Maven

## Installation

1. Clone this repository to your local machine.
2. Navigate to the project directory.
3. Run `mvn clean install` to download dependencies and build the project.

## Usage

To run the tests, execute the following command:

```bash
mvn clean install test -DsuiteXmlFile="employeetest.xml"
```
## Test Structure
- Tests are written using TestNG framework.
- Test reports are generated in the reports/ directory using extent reports

## Test Functions Descriptions
getEmployeeTest: This test verifies
- Status code for the given endpoint
- Total number of the records
- The name of the employee where salary value is 313500

## Dependencies
This project relies on the following dependencies:

- Rest Assured: For API testing
- TestNG: For test execution
- Extent Reports: For reporting
