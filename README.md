### Overtime Adjustment Project

Welcome to the Overtime Adjustment Project! This project is designed to manage employee overtime contracts and calculate their monthly income based on these contracts. The application is built using Java 21 LTS.

#### Project Repository
- **Link:** [Overtime Adjustment Project](https://github.com/josivantarcio/rh-overtime-adjustment-project)

## Table of Contents
1. [Introduction](#introduction)
2. [Technologies](#technologies)
3. [Installation](#installation)
4. [Usage](#usage)
5. [Classes and Structure](#classes-and-structure)
6. [Contributing](#contributing)
7. [License](#license)

## Introduction
The Overtime Adjustment Project is a Java application that allows you to manage employees, their departments, and their overtime contracts. It calculates the total income for an employee for a specific month and year by considering their base salary and the value of their overtime contracts.

## Technologies
- **Java Version:** 21
- **Libraries:** Standard Java Libraries
- **Build Tool:** None (plain Java project)

## Installation
To set up the project locally, follow these steps:

1. **Clone the repository:**
   ```bash
   git clone https://github.com/josivantarcio/rh-overtime-adjustment-project.git
   ```

2. **Navigate to the project directory:**
   ```bash
   cd rh-overtime-adjustment-project
   ```

3. **Compile the Java files:**
   ```bash
   javac -d bin src/**/*.java
   ```

4. **Run the application:**
   ```bash
   java -cp bin rh.aplication.Program
   ```

## Usage
1. **Enter the department's name:**
   ```
   Enter department's name: Sales
   ```

2. **Enter worker data:**
   ```
   Enter worker data:
   Name: John Doe
   Level: MID_LEVEL
   Base Salary: 4000
   ```

3. **Enter the number of contracts:**
   ```
   How many contracts to this worker? 2
   ```

4. **Enter details for each contract:**
   ```
   Enter contract #1:
   Date (DD/MM/YYYY): 15/06/2023
   Value per hour: 50
   Duration (hours): 20

   Enter contract #2:
   Date (DD/MM/YYYY): 20/06/2023
   Value per hour: 45
   Duration (hours): 15
   ```

5. **Calculate income for a specific month and year:**
   ```
   Enter month and year to calculate income (MM/YYYY): 06/2023
   ```

6. **View the results:**
   ```
   Name: John Doe
   Department: Sales
   Income for 06/2023: 4925.00
   ```

## Classes and Structure

### Department Class
- **Attributes:** `name`
- **Methods:** Constructor, getters, and setters

### HourContract Class
- **Attributes:** `data`, `valueHour`, `hour`
- **Methods:** Constructor, getters, setters, `totalValue`

### WorkerLevel Enum
- **Values:** `JUNIOR`, `MID_LEVEL`, `PLENO`, `SENIOR`

### Worker Class
- **Attributes:** `name`, `level`, `baseSalary`, `department`, `contracts`
- **Methods:** Constructor, getters, setters, `addContract`, `removeContract`, `income`

### Program Class
- **Methods:** `main` (runs the application, handles user input and output)

## Contributing
If you'd like to contribute to this project, please fork the repository and use a feature branch. Pull requests are warmly welcome.

1. **Fork the repository**
2. **Create a feature branch**
   ```bash
   git checkout -b feature/YourFeatureName
   ```
3. **Commit your changes**
   ```bash
   git commit -m 'Add some feature'
   ```
4. **Push to the branch**
   ```bash
   git push origin feature/YourFeatureName
   ```
5. **Create a new Pull Request**

## License
This project is open-source and available under the [MIT License](LICENSE).
