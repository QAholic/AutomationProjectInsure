# 🛡️ Insurance Portal - BDD Automation Framework

## 📌 Project Overview
This is a professional-grade Test Automation Framework developed for end-to-end testing of insurance portals. It utilizes **Behavior Driven Development (BDD)** to bridge the gap between technical testers and business stakeholders.

## 🛠️ Tech Stack & Tools
* **Language:** Java 23
* **Automation Tool:** Selenium WebDriver (v4.18+)
* **Framework:** Cucumber (BDD) with TestNG
* **Design Pattern:** Page Object Model (POM)
* **Build Management:** Maven
* **CI/CD:** Jenkins (Integrated with GitHub)
* **Version Control:** Git

## 🏗️ Architectural Design (OOPS Principles)
This framework is built on core OOPS concepts to ensure high maintainability:
* **Encapsulation:** UI Elements are kept private within Page Classes and accessed via public methods.
* **Inheritance:** Common browser actions and driver initializations are inherited from a `BasePage`.
* **Abstraction:** Complex Selenium logic is abstracted behind Gherkin Feature files.
* **Polymorphism:** Support for multiple browser execution (Chrome, Firefox, Edge) through a common WebDriver interface.

## 🚀 How to Run the Project
### 1. Prerequisites
* JDK 21+ installed
* Maven installed
* Jenkins (for CI/CD execution)

### 2. Local Execution
Open your terminal in the project root and run:
```bash
mvn clean test