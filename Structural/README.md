# Structural Design Patterns

This section contains simple Java examples of common **Structural Design Patterns**.

Structural patterns focus on **how classes and objects are combined to form larger structures**.

The examples include:

* Adapter Pattern
* Decorator Pattern
* Composite Pattern

---

# 1. Adapter Pattern

The **Adapter Pattern** is used when two parts of a system are incompatible and cannot communicate directly.

The Adapter works like a **translator** between them.

For example, if an application expects data in one format but an external service provides data in another format, an Adapter converts the external data into the format the application understands.

### Simple Idea

```text
Adapter = Makes incompatible things work together.
```

### Real-Life Example

A phone charger Adapter allows a charger with one type of plug to work with a different type of socket.

```text
Different Plug
      ↓
   Adapter
      ↓
Different Socket
```

## Adapter Pattern — Rules

* Use it when two classes cannot work together because their interfaces are different.
* Create an **Adapter** between them.
* The Adapter converts one interface into another.
* The original class (**Adaptee**) does not need to be changed.
* The **Client** works with the expected interface.
* The Adapter usually wraps the existing class.

### Easy to Remember

```text
Different interfaces
        ↓
     Adapter
        ↓
They can work together
```

### Basic Structure

```text
Client
  ↓
Target Interface
  ↓
Adapter
  ↓
Adaptee
```

---

# 2. Decorator Pattern

The **Decorator Pattern** is used to add new features or behavior to an existing object without changing its original code.

You wrap the original object with another object that adds extra functionality.

For example, you may have a basic coffee and then decorate it by adding milk, sugar, or cream.

### Simple Idea

```text
Decorator = Adds extra features to an existing object.
```

### Real-Life Example

```text
Basic Coffee
     ↓
   + Milk
     ↓
   + Sugar
     ↓
   + Cream
     ↓
Final Coffee
```

The original coffee does not need to be changed.

## Decorator Pattern — Rules

* Use it when you want to add new features or behavior to an object.
* Don't change the original class.
* Create a **Decorator** that wraps the object.
* The Decorator uses the same interface as the original object.
* You can add multiple decorators one after another.
* Each decorator adds its own extra behavior.

### Easy to Remember

```text
Same object
     +
Extra features
     ↓
Decorator
```

### Basic Structure

```text
Client
  ↓
Component Interface
  ↓
Concrete Component
  ↑
Decorator
  ↑
Concrete Decorators
```

---

# 3. Composite Pattern

The **Composite Pattern** is used when you want to treat **individual objects and groups of objects in the same way**.

It is useful for creating **tree-like structures**.

For example, a file system contains files and folders.

* A **File** is an individual object.
* A **Folder** can contain many files and other folders.

However, operations such as `open`, `delete`, or `move` can be performed on both using a common approach.

### Simple Idea

```text
Composite = Treat individual objects and groups of objects the same way.
```

### Real-Life Example

A company can have:

```text
Company
   ↓
Department
   ├── Employee
   ├── Employee
   └── Department
          ├── Employee
          └── Employee
```

You can perform an operation on an individual employee or an entire department using the same general approach.

## Composite Pattern — Rules

* Use it when objects form a tree or hierarchy.
* Have a common interface for all objects.
* **Leaf** = Single/individual object.
* **Composite** = Group that contains other objects.
* A Composite can contain both **Leaf** and other **Composite** objects.
* Treat single objects and groups in the same way.

### Easy to Remember

```text
Single object
      +
Group of objects
      ↓
Treat them the same
```

### Basic Structure

```text
        Component
        /       \
       /         \
    Leaf       Composite
                 /   \
                /     \
             Leaf   Composite
```

---

# Simple Comparison

| Pattern       | Main Purpose                                         |
| ------------- | ---------------------------------------------------- |
| **Adapter**   | Makes incompatible objects work together             |
| **Decorator** | Adds features to an existing object                  |
| **Composite** | Treats individual objects and groups in the same way |

---

# Real-Life Examples

### Adapter

```text
Different Plug
      ↓
   Adapter
      ↓
Different Socket
```

**Purpose:** Makes incompatible interfaces work together.

---

### Decorator

```text
Basic Coffee
      ↓
    + Milk
      ↓
    + Sugar
      ↓
    + Cream
```

**Purpose:** Adds features without changing the original object.

---

### Composite

```text
Company
   ↓
Department
   ├── Employee
   ├── Employee
   └── Department
          ├── Employee
          └── Employee
```

**Purpose:** Treats individual objects and groups of objects in the same way.

---

# Quick Memory Guide

```text
Adapter
Different interfaces → Adapter → Work together


Decorator
Existing object → Add features → Decorator


Composite
Single object + Group → Treat them the same
```

---

# Structural Pattern Overview

```text
Adapter
   │
   └── Makes incompatible interfaces work together


Decorator
   │
   └── Adds behavior to an existing object


Composite
   │
   └── Treats objects and groups uniformly
```

These patterns mainly focus on **how objects and classes are connected, wrapped, and organized into larger structures**.
