# Product Pricing System (Encapsulation)

This project demonstrates **Encapsulation** using a product pricing domain model.

It focuses on protecting pricing data and enforcing business rules such as discount validation and final price calculation.

---

## 🎯 Objective

To design a product model that:
- Protects pricing integrity
- Validates discount rules
- Encapsulates business logic

---

## 🧠 Concepts Covered

- Encapsulation with private fields
- Controlled setters for validation
- Immutable identity design patterns
- Constructor chaining
- Business logic inside domain model
- Defensive programming

---

## 📦 Class Overview

### `Product`
Represents a product with validated pricing and discount rules.

**Key Features:**
- Private identity fields with controlled mutation
- Discount range enforcement (0–100%)
- Final price calculation logic
- Currency formatting for readability

---

## ⚙️ Functionalities

### ✅ Product Validation
- Rejects null or blank product names
- Prevents invalid product IDs

### ✅ Price Validation
- Rejects negative pricing values

### ✅ Discount Rules
- Accepts values between 0% and 100%
- Prevents unrealistic discounts

### ✅ Business Logic
Includes a utility method:
- `getFinalPrice()` → calculates discounted price safely

---

## 🧪 Demo Scenarios

The demo includes:

✔ Valid product pricing  
✔ Null product name validation  
✔ Excessive discount rejection  
✔ Negative price handling  


---

## 📁 Files

- `Product.java` → Encapsulated pricing model
- `Main.java` → Demonstration and validation scenarios

---

## 💡 Design Decisions

- Identity fields use private setters to prevent external mutation
- Discount validation enforces realistic pricing constraints
- Business logic remains inside the domain model (OOP best practice)
- Constructor chaining improves API usability

---

## 🚀 Learning Outcome

This project demonstrates how encapsulation:
- Protects business rules
- Prevents invalid pricing states
- Encourages domain-driven modeling

---

## 📌 Author

**Arnold Joel Joshua Matangi**  
Java Portfolio Project – Encapsulation Series
