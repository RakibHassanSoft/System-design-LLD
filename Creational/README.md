# Creational Design Patterns

This section contains simple Java examples of common **Creational Design Patterns**.

Creational patterns focus on **how objects are created**.

The examples include:

* Factory Pattern
* Abstract Factory Pattern
* Builder Pattern

---

# 1. Factory Pattern

The **Factory Pattern** is used to create objects without exposing the exact creation logic to the user.

Instead of creating objects directly with `new`, we ask a **Factory** to create the object for us.

This makes the code more flexible and easier to maintain.

### Example

An application may need different types of notifications:

```text
Email
SMS
Push Notification
```

Instead of creating each notification directly, the client asks the Factory to create the required notification.

## Factory Pattern — Rules

* Use it when you need to create different types of objects.
* Don't create objects directly everywhere in your code.
* Put object creation inside a **Factory**.
* The Factory decides which object to create.
* The client only asks the Factory for an object.
* Makes object creation easier to manage and change.

### Easy to Remember

```text
Need an object
      ↓
Ask the Factory
      ↓
Factory creates it
```

### Real-Life Example

```text
Coffee Machine
      ↓
Select Espresso
      ↓
Machine creates one coffee
```

---

# 2. Abstract Factory Pattern

The **Abstract Factory Pattern** is used to create **groups or families of related objects** without specifying their exact classes.

It provides an interface for creating multiple related objects together.

### Example

A GUI application may have different themes:

```text
Light Theme
Dark Theme
```

The Light Factory creates:

```text
Light Button
Light Text Box
Light Menu
```

The Dark Factory creates:

```text
Dark Button
Dark Text Box
Dark Menu
```

Each factory creates a complete family of matching objects.

## Abstract Factory Pattern — Rules

* Use it when you need to create groups of related objects.
* Create a common **Abstract Factory** interface.
* Create different factories for different families of objects.
* Each factory creates objects that belong together.
* The client doesn't need to know the exact classes being created.
* Useful when you have multiple related products.

### Easy to Remember

```text
Need a family of related objects
             ↓
Ask the Abstract Factory
             ↓
Get matching objects
```

### Real-Life Example

```text
Furniture Set
      ↓
   Factory
   ↙     ↘
Modern   Classic
   ↓        ↓
Chair     Chair
Table     Table
Sofa      Sofa
```

---

# 3. Builder Pattern

The **Builder Pattern** is used to create **complex objects step by step**.

It is useful when an object has many optional parts or configurations.

Instead of using a large constructor with many parameters, a Builder allows us to add parts one by one and then create the final object.

### Example

When building a pizza, we can choose:

```text
Size
Cheese
Toppings
Sauce
```

The pizza is created after selecting the required options.

## Builder Pattern — Rules

* Use it when an object has many properties or options.
* Build the object step by step.
* Keep object creation separate from the final object.
* Choose only the options you need.
* Useful for avoiding large constructors with many parameters.
* The final step creates the complete object.

### Easy to Remember

```text
Build a complex object
          ↓
Step by step
          ↓
Builder Pattern
```

### Real-Life Example

```text
Burger Shop
     ↓
Choose Bread
     ↓
Choose Meat
     ↓
Choose Cheese
     ↓
Choose Sauce
     ↓
Choose Vegetables
     ↓
Complete Burger
```

---

# Simple Comparison

| Pattern              | Main Purpose                          |
| -------------------- | ------------------------------------- |
| **Factory**          | Creates one object                    |
| **Abstract Factory** | Creates a family of related objects   |
| **Builder**          | Creates a complex object step by step |

---

# Real-Life Examples

### Factory

```text
Coffee Machine
      ↓
Select Espresso
      ↓
Machine creates one coffee
```

### Abstract Factory

```text
Furniture Set
      ↓
Modern Factory
      ↓
Modern Chair + Modern Table + Modern Sofa

OR

Classic Factory
      ↓
Classic Chair + Classic Table + Classic Sofa
```

### Builder

```text
Burger Shop
      ↓
Bread
      ↓
Meat
      ↓
Cheese
      ↓
Sauce
      ↓
Vegetables
      ↓
Complete Burger
```

---

# Quick Memory Guide

```text
Factory
Need one object → Ask the Factory → Get the object


Abstract Factory
Need a family → Ask the Abstract Factory → Get matching objects


Builder
Need a complex object → Build step by step → Get final object
```

---

# Creational Pattern Overview

```text
Factory
   │
   └── Creates one object

Abstract Factory
   │
   └── Creates a family of related objects

Builder
   │
   └── Builds a complex object step by step
```

These patterns mainly focus on **how objects are created, organized, and configured**.
