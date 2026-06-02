
# Customer Management System

A Java-based Customer Relationship Management (CRM) application developed using Object-Oriented Programming (OOP) concepts. The project enables efficient management of customer records, status updates, and interaction tracking through a simple console-based interface.

## 📌 Features

- Add new customers
- Search customers by Customer ID
- Update customer status
- Log customer interactions
- View customer interaction history
- Display all customers
- Delete customer records
- Custom exception handling
- Modular package structure

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Collections Framework (ArrayList)
- Exception Handling
- Eclipse IDE

## 📂 Project Structure

```
src/
│
├── com.wipro.crm.entity
│   ├── Customer.java
│   └── Interaction.java
│
├── com.wipro.crm.services
│   └── CRMService.java
│
├── com.wipro.crm.util
│   ├── CustomerExistsException.java
│   ├── CustomerNotFoundException.java
│   └── InteractionOperationException.java
│
└── com.wipro.crm.main
    └── Main.java
```

## 🚀 Functionalities

### Customer Management
- Create customer records
- Search customer details
- Update customer status
- Delete customers

### Interaction Management
- Record customer interactions
- Store interaction notes
- Retrieve interaction history

### Exception Handling
- Prevent duplicate customer entries
- Handle invalid customer searches
- Validate interaction operations

## 📋 Sample Customer Data

| Customer ID | Name  | Email             | Status |
|-------------|--------|------------------|---------|
| C001 | Arjun | arjun@mail.com | NEW |
| C002 | Megha | megha@mail.com | IN_PROGRESS |

## ▶️ How to Run

1. Clone the repository

```bash
git clone <repository-url>
```

2. Open the project in Eclipse or any Java IDE.

3. Navigate to:

```text
src/com/wipro/crm/main/Main.java
```

4. Run the `Main.java` file.

## 📖 OOP Concepts Demonstrated

- Encapsulation
- Abstraction
- Modular Design
- Exception Handling
- Object Interaction
- Collection Management

## 🎯 Learning Outcomes

This project demonstrates how CRM operations can be implemented using Java OOP principles, custom exceptions, and collection-based data management while maintaining a clean and modular architecture.

## 👨‍💻 Author

**Yadesh** - yadesh-coder

Java | OOP | CRM Application Development
