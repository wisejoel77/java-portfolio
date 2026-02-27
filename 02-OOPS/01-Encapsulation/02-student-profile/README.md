# Student Profile System (Encapsulation)

This project demonstrates **Encapsulation** using a student domain model.

It focuses on protecting academic data and ensuring that all student attributes remain valid through controlled access methods.

---

## 🎯 Objective

To design a student model that:
- Protects identity fields
- Validates academic data
- Encapsulates domain logic

---

## 🧠 Concepts Covered

- Encapsulation using private fields
- Immutable identity (final roll number)
- Constructor chaining
- Validation through setters
- Domain-driven utility methods
- Defensive programming

---

## 📦 Class Overview

### `Student`
Represents a student with validated academic and contact data.

**Key Features:**
- Immutable roll number (final field)
- GPA validation (0–10 range)
- Safe email validation
- Default constructor fallback values
- Topper detection logic

---

## ⚙️ Functionalities

### ✅ Name Validation
- Rejects null or blank names

### ✅ GPA Validation
- Accepts values between 0 and 10 only
- Prevents invalid academic states

### ✅ Email Validation
- Null-safe validation
- Accepts placeholder values
- Basic format checking

### ✅ Business Logic
Includes a utility method:
- `isTopper()` → identifies high-performing students

---

## 🧪 Demo Scenarios

The demo includes:

✔ Valid student profile  
✔ Blank name validation  
✔ Invalid GPA rejection  
✔ Invalid email handling  

---

## 📁 Files

- `Student.java` → Encapsulated student model
- `Main.java` → Demonstration of validation scenarios

---

## 💡 Design Decisions

- Roll number is immutable using `final`
- Constructor reuses setters to avoid duplicate validation
- Email validation is intentionally lightweight for learning clarity
- Business logic is kept inside the model (OOP best practice)

---

## 🚀 Learning Outcome

This project demonstrates how encapsulation:
- Preserves identity integrity
- Prevents invalid academic data
- Encourages domain-driven design

---

## 📌 Author

**Arnold Joel Joshua Matangi**  
Java Portfolio Project – Encapsulation Series
