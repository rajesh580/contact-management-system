# contact--management-system
# 📇 Contact Management System (Java)
<img width="616" height="279" alt="Screenshot 2025-08-12 132954" src="https://github.com/user-attachments/assets/9d850b32-d972-4c77-8682-c04ec8dd76ce" />

## 📌 Introduction
The **Contact Management System** is a console-based Java application that allows users to **add, view, search, update, and delete contacts** easily.  
It is designed using **pure Java** without any external dependencies, making it lightweight and portable.  
This project demonstrates the use of **Object-Oriented Programming (OOP)** concepts, arrays for data storage, and a **menu-driven approach** for user interaction.  

---

## 🎯 Objectives
- To provide an easy way to store and manage personal or business contacts.
- To implement core CRUD (Create, Read, Update, Delete) operations in Java.
- To enhance understanding of Java programming and OOP principles.
- To create a structured and user-friendly program that can be extended for advanced features.

---

## 🛠️ Tools & Technologies Used
- **Programming Language:** Java (JDK 8+)
- **IDE:** Any Java-supported IDE (Eclipse, IntelliJ IDEA, NetBeans) or Command-line
- **Platform:** JVM (Java Virtual Machine)
- **Data Storage:** In-memory array (size 100 for demonstration)

---

## 📚 Concepts Used
- **Object-Oriented Programming (OOP)** – Classes, Objects, Encapsulation
- **Arrays** – To store contact information
- **Control Structures** – Loops, Conditionals, Switch-case
- **Methods** – For modular and reusable code
- **Custom String Comparison** – Implementing case-insensitive search without built-in functions

---

## 📂 Project Structure
ContactManagementSystem.java

└── class Contact <br>
├── String name <br>
├── String phone <br>
├── String email <br><br>

  
└── class ContactManagementSystem <br>
├── addContact()<br>
├── viewContacts()<br>
├── searchContact()<br>
├── updateContact()<br>
├── deleteContact()<br>
├── main()<br>


---

## 🚀 Functionalities
1. **Add Contact** – Store a new contact with name, phone, and email.
2. **View Contacts** – Display all saved contacts.
3. **Search Contact** – Find a contact by name (case-insensitive).
4. **Update Contact** – Modify existing contact details.
5. **Delete Contact** – Remove a contact from the list.
6. **Exit Application** – Close the program safely.

---

## 📦 How to Run
1. **Clone or Download** the project.
2. Open in your **IDE** or save as `ContactManagementSystem.java`.
3. Compile the program: <br>
       javac ContactManagementSystem.java
4. Run the program: <br>
      java ContactManagementSystem
