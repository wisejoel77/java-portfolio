# Bank Account System (Encapsulation)

This project demonstrates the concept of **Encapsulation** using a real-world banking example.

It models a secure bank account where sensitive data like balance, is protected and accessed only through controlled methods.

---

## 🎯 Objective

To implement a simple banking system that:
- Protects account data
- Validates transactions
- Demonstrates proper encapsulation in Java

---

## 🧠 Concepts Covered

- Private fields and controlled access
- Constructor validation
- Getter and setter usage
- Input validation
- Encapsulation of business logic
- Defensive programming

---

## 📦 Class Overview

### `BankAccount`
Represents a secure bank account with validated operations.

**Key Features:**
- Immutable account number (no setter)
- Safe deposit and withdrawal logic
- Negative withdrawal normalization (intentional design)
- Consistent currency formatting

---

## ⚙️ Functionalities

### ✅ Deposit
- Accepts only positive amounts
- Rejects invalid values

### ✅ Withdraw
- Prevents overdraft
- Accepts both positive and negative values  
  (Negative values are normalized using absolute value)

### ✅ Data Protection
- Balance cannot be directly modified
- Account number cannot be changed after creation

---

## 🧪 Demo Scenarios

The demo includes:

✔ Valid account operations  
✔ Negative deposit attempt  
✔ Over-withdrawal protection  
✔ Invalid constructor inputs  

---

## 📁 Files

- `BankAccount.java` → Core encapsulated model
- `Main.java` → Demonstration and validation scenarios

---

## 💡 Design Decisions

- Withdrawal accepts negative input intentionally for normalization
- The constructor uses setters to avoid validation duplication
- Currency formatting improves real-world readability

---

## 🚀 Learning Outcome

This project demonstrates how encapsulation:
- Protects object integrity
- Prevents invalid state mutations
- Improves reliability of domain models

---

## 📌 Author

**Arnold Joel Joshua Matangi**  
Java Portfolio Project – Encapsulation Series
