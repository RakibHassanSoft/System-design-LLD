# Syllabus & Beginner Study Guide

The exam mainly covers **6 areas**:

1. Creational Design Patterns
2. Structural Design Patterns
3. Behavioral Design Patterns
4. Git Commands
5. Git Merge Conflict
6. Frontend, Backend & Database

---

# 1. Creational Design Patterns

Creational patterns are related to **creating objects**.

You need to study:

```text
Factory
Abstract Factory
Builder
```

In the exam, you may receive a **scenario** and need to:

1. Understand the problem.
2. Identify the correct pattern.
3. Write the Java code.
4. Draw the UML diagram.

---

## 1.1 Factory Pattern

### Main Idea

Use Factory when you need to create **one object from different possible types**.

```text
Need an object
      ↓
Ask Factory
      ↓
Factory creates object
```

### Example

A notification system supports:

```text
Email
SMS
Push Notification
```

Instead of:

```java
new Email();
new SMS();
new PushNotification();
```

the client asks the Factory.

### Remember

> **Factory = Creates one object**

### Exam Clue

If the scenario says:

* "Create different types of..."
* "Based on user choice..."
* "Decide which object to create..."
* "Hide object creation..."

Think:

```text
FACTORY
```

---

# 1.2 Abstract Factory Pattern

### Main Idea

Use Abstract Factory when you need to create a **family of related objects**.

Example:

```text
Modern Factory
   ├── Modern Chair
   ├── Modern Table
   └── Modern Sofa

Classic Factory
   ├── Classic Chair
   ├── Classic Table
   └── Classic Sofa
```

Each factory creates matching products.

### Remember

> **Abstract Factory = Creates a family of related objects**

### Exam Clue

If the scenario says:

* "Family of objects"
* "Related products"
* "Matching components"
* "Different themes"
* "Modern/Classic"
* "Light/Dark"

Think:

```text
ABSTRACT FACTORY
```

---

# 1.3 Builder Pattern

### Main Idea

Use Builder when an object is **complex and has many optional properties**.

Example:

```text
Burger
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

Instead of a large constructor:

```java
new Burger("Bread", "Beef", "Cheese", "Sauce", ...);
```

we build it step by step.

### Remember

> **Builder = Builds a complex object step by step**

### Exam Clue

If the scenario says:

* "Many optional parameters"
* "Build step by step"
* "Complex object"
* "Avoid large constructor"
* "Choose only required options"

Think:

```text
BUILDER
```

---

# Creational Pattern Comparison

| Pattern          | Main Purpose                          |
| ---------------- | ------------------------------------- |
| Factory          | Creates one object                    |
| Abstract Factory | Creates a family of related objects   |
| Builder          | Creates a complex object step by step |

### Quick Memory

```text
Factory         → One object
Abstract Factory → Family
Builder         → Step by step
```

---

# 2. Structural Design Patterns

Structural patterns are related to **how classes and objects are connected or combined**.

You need to study:

```text
Adapter
Decorator
Composite
```

In the exam, you may receive a scenario and need to:

1. Identify the pattern.
2. Write the Java code.
3. Draw the UML diagram.

---

# 2.1 Adapter Pattern

### Main Idea

Use Adapter when **two incompatible interfaces need to work together**.

The Adapter works like a translator.

```text
Client
  ↓
Adapter
  ↓
Existing Class
```

### Real-Life Example

A charger has one type of plug, but the socket accepts another type.

```text
Different Interface
        ↓
      Adapter
        ↓
Compatible Interface
```

### Remember

> **Adapter = Makes incompatible things work together**

### Exam Clue

If the scenario says:

* "Incompatible classes"
* "Different interfaces"
* "Existing class cannot be changed"
* "Convert one interface into another"

Think:

```text
ADAPTER
```

---

# 2.2 Decorator Pattern

### Main Idea

Use Decorator when you want to **add features to an existing object without changing its original class**.

Example:

```text
Basic Coffee
     ↓
   + Milk
     ↓
   + Sugar
     ↓
   + Cream
```

Each decorator adds additional behavior.

### Remember

> **Decorator = Adds features to an existing object**

### Exam Clue

If the scenario says:

* "Add extra features"
* "Add behavior dynamically"
* "Don't modify original class"
* "Wrap an existing object"
* "Multiple additional features"

Think:

```text
DECORATOR
```

---

# 2.3 Composite Pattern

### Main Idea

Use Composite when you need to treat **individual objects and groups of objects in the same way**.

It is commonly used for tree structures.

Example:

```text
Company
  │
  ├── Employee
  ├── Employee
  │
  └── Department
        ├── Employee
        └── Employee
```

### Remember

> **Composite = Treat individual objects and groups the same way**

### Exam Clue

If the scenario says:

* "Tree structure"
* "Hierarchy"
* "Individual + group"
* "Folder contains files/folders"
* "Department contains employees/departments"

Think:

```text
COMPOSITE
```

---

# Structural Pattern Comparison

| Pattern   | Main Purpose                                      |
| --------- | ------------------------------------------------- |
| Adapter   | Makes incompatible objects work together          |
| Decorator | Adds features to an existing object               |
| Composite | Treats individual objects and groups the same way |

### Quick Memory

```text
Adapter    → Connect
Decorator  → Add
Composite  → Group
```

---

# 3. Behavioral Design Patterns

Behavioral patterns focus on **how objects behave and communicate with each other**.

You need to study:

```text
State
Observer
Mediator
```

In the exam, you may receive a scenario and need to:

1. Identify the pattern.
2. Write the Java code.
3. Draw the UML diagram.

---

# 3.1 State Pattern

### Main Idea

Use State when an object's **behavior changes depending on its current state**.

Example:

```text
Music Player

Stopped
  ↓
Playing
  ↓
Paused
  ↓
Playing
```

The same action can behave differently depending on the current state.

### Remember

> **State = Different state → Different behavior**

### Exam Clue

If the scenario says:

* "Object has different states"
* "Behavior changes depending on state"
* "Avoid many if-else statements"
* "Playing/Paused/Stopped"
* "On/Off"
* "Different modes"

Think:

```text
STATE
```

---

# 3.2 Observer Pattern

### Main Idea

Use Observer when **one object changes and many other objects need to be notified**.

Example:

```text
YouTube Channel
       ↓
New Video
       ↓
Notify Subscribers
```

The main object is the:

```text
Subject
```

The objects receiving updates are:

```text
Observers
```

### Remember

> **Observer = One changes → Notify many**

### Exam Clue

If the scenario says:

* "Notify many objects"
* "Subscribers"
* "Listeners"
* "Updates"
* "Register/unregister"
* "One object changes"

Think:

```text
OBSERVER
```

---

# 3.3 Mediator Pattern

### Main Idea

Use Mediator when **many objects need to communicate**.

Instead of every object communicating directly with every other object, they communicate through a Mediator.

Example:

```text
User A ──┐
User B ──┼──→ Chat Room
User C ──┘
```

The Chat Room is the Mediator.

### Remember

> **Mediator = Many objects → One middle person**

### Exam Clue

If the scenario says:

* "Many objects communicate"
* "Reduce direct communication"
* "Central communication"
* "Chat room"
* "Air traffic control"
* "Objects should not communicate directly"

Think:

```text
MEDIATOR
```

---

# Behavioral Pattern Comparison

| Pattern  | Main Purpose                            |
| -------- | --------------------------------------- |
| State    | Changes behavior based on current state |
| Observer | Notifies many objects about a change    |
| Mediator | Manages communication between objects   |

### Quick Memory

```text
State     → Behavior
Observer  → Notification
Mediator  → Communication
```

---

# 4. Git Commands

The exam may give you a **branch name** and ask you to perform operations using Git commands.

You should know:

```text
commit
checkout
merge
branching
stash
staging
```

---

# 4.1 Check Git Status

```bash
git status
```

Shows:

* Modified files
* Staged files
* Untracked files
* Current branch

---

# 4.2 Create a Branch

```bash
git branch feature-login
```

This creates a branch but does not switch to it.

To create and immediately switch:

```bash
git checkout -b feature-login
```

---

# 4.3 Switch Branch

```bash
git checkout feature-login
```

This moves you to the specified branch.

Example:

```bash
git checkout main
```

---

# 4.4 Stage Files

After modifying a file:

```bash
git add .
```

This stages all changed files.

You can also stage a specific file:

```bash
git add Main.java
```

---

# 4.5 Commit

After staging:

```bash
git commit -m "Add login feature"
```

A commit saves the staged changes to Git history.

---

# 4.6 Merge

Suppose we have:

```text
main
feature-login
```

You want to merge `feature-login` into `main`.

First:

```bash
git checkout main
```

Then:

```bash
git merge feature-login
```

Remember:

> **Switch to the branch that will receive the changes, then merge the other branch.**

---

# 4.7 Stash

Suppose you are working on a file but need to switch branches before committing.

You can temporarily save your changes:

```bash
git stash
```

Now your working directory becomes clean.

Later, restore the changes:

```bash
git stash pop
```

### Remember

```text
Working changes
      ↓
git stash
      ↓
Temporarily stored
      ↓
Switch branch / do other work
      ↓
git stash pop
      ↓
Changes restored
```

---

# Git Command Cheat Sheet

| Command                   | Purpose                  |
| ------------------------- | ------------------------ |
| `git status`              | Check current status     |
| `git branch`              | Show branches            |
| `git branch name`         | Create branch            |
| `git checkout name`       | Switch branch            |
| `git checkout -b name`    | Create + switch          |
| `git add .`               | Stage changes            |
| `git commit -m "message"` | Commit changes           |
| `git merge name`          | Merge branch             |
| `git stash`               | Temporarily save changes |
| `git stash pop`           | Restore stashed changes  |

---

# 5. Merge Conflict

A **merge conflict** happens when Git cannot automatically decide between different changes.

Usually, two branches modify the same part of a file differently.

### Example

Original:

```java
String name = "Rakib";
```

Branch 1:

```java
String name = "Rakib Hassan";
```

Branch 2:

```java
String name = "Rahim";
```

When Git merges them, it doesn't know which version to keep.

Git may show:

```text
<<<<<<< HEAD
String name = "Rakib Hassan";
=======
String name = "Rahim";
>>>>>>> branch2
```

---

# Meaning of Conflict Markers

```text
<<<<<<< HEAD
```

Current branch's version.

```text
=======
```

Separates the two versions.

```text
>>>>>>> branch2
```

Other branch's version.

---

# How to Resolve a Conflict

Choose the correct version.

For example:

```java
String name = "Rakib Hassan";
```

Remove the conflict markers.

Then:

```bash
git add .
git commit -m "Resolve merge conflict"
```

---

# Merge Conflict Memory

```text
Two branches
     ↓
Same code changed
     ↓
Different changes
     ↓
Git confused ❌
     ↓
Merge Conflict
     ↓
Developer chooses
     ↓
git add .
     ↓
git commit
```

### Exam Definition

> A merge conflict occurs when Git cannot automatically merge different changes made to the same part of a file, so the developer must manually resolve the conflict.

---

# 6. Frontend, Backend & Database

A web application mainly has three parts:

```text
Frontend
Backend
Database
```

The basic architecture is:

```text
User
 ↓
Frontend
 ↓
API
 ↓
Backend
 ↓
Database
```

---

# 6.1 Frontend

The **frontend** is what the user sees and interacts with.

Examples:

```text
HTML
CSS
JavaScript
TypeScript
React
Vue
Next.js
```

Examples of frontend elements:

```text
Buttons
Forms
Menus
Images
Dashboard
Login page
```

### Remember

```text
Frontend = SHOW
```

---

# 6.2 Backend

The **backend** processes requests and contains the application's business logic.

Examples:

```text
Node.js + Express
Python + Django
Python + FastAPI
Java + Spring Boot
C# + ASP.NET
```

The backend handles:

* Authentication
* Validation
* Business logic
* API requests
* Database communication

### Remember

```text
Backend = PROCESS
```

---

# 6.3 Database

The database stores application data.

Examples:

```text
PostgreSQL
MySQL
MongoDB
SQL Server
```

It can store:

```text
Users
Products
Orders
Messages
Payments
```

### Remember

```text
Database = STORE
```

---

# 6.4 API

The frontend usually communicates with the backend through an **API**.

Common approaches:

```text
REST API
GraphQL
```

Data is commonly exchanged as:

```text
JSON
```

Example:

```http
POST /api/login
```

```json
{
  "email": "rakib@gmail.com",
  "password": "123456"
}
```

---

# 6.5 Example Communication — Login

Suppose a user logs into a website.

### Step 1

User enters:

```text
Email: rakib@gmail.com
Password: 123456
```

### Step 2

Frontend sends:

```text
POST /api/login
```

### Step 3

Backend receives the request.

### Step 4

Backend asks the database to find the user.

```text
Backend
   ↓
Database
```

### Step 5

Database returns the user's information.

### Step 6

Backend checks the credentials.

### Step 7

Backend sends a response.

```text
Backend
   ↓
Frontend
```

### Step 8

Frontend displays the dashboard.

---

# Complete Communication

```text
User
 ↓
Frontend
 ↓
API
 ↓
Backend
 ↓
Database
 ↓
Backend
 ↓
API
 ↓
Frontend
 ↓
User
```

### Easy Memory

```text
Frontend = SHOW
Backend  = PROCESS
Database = STORE
```

---

# Exam Preparation — Pattern Identification

When you receive a scenario, look for the **main problem**.

| Scenario Clue                                  | Pattern          |
| ---------------------------------------------- | ---------------- |
| Create different object types                  | Factory          |
| Create related object families                 | Abstract Factory |
| Build complex object step by step              | Builder          |
| Incompatible interfaces                        | Adapter          |
| Add features without changing object           | Decorator        |
| Individual + group/tree                        | Composite        |
| Behavior changes by state                      | State            |
| Notify many objects                            | Observer         |
| Many objects communicate through middle object | Mediator         |

---

# Design Pattern Master Memory Table

| Category   | Pattern          | Remember     |
| ---------- | ---------------- | ------------ |
| Creational | Factory          | One object   |
| Creational | Abstract Factory | Family       |
| Creational | Builder          | Step by step |
| Structural | Adapter          | Connect      |
| Structural | Decorator        | Add          |
| Structural | Composite        | Group        |
| Behavioral | State            | Behavior     |
| Behavioral | Observer         | Notify       |
| Behavioral | Mediator         | Communicate  |

---

# UML Exam Strategy

For Design Pattern questions, don't start writing code immediately.

Follow this order:

```text
1. Read scenario
       ↓
2. Identify problem
       ↓
3. Choose pattern
       ↓
4. Identify classes/interfaces
       ↓
5. Draw UML
       ↓
6. Write Java code
       ↓
7. Check relationships
```

For example, if the scenario says:

> "A YouTube channel should notify all subscribers when a new video is uploaded."

Think:

```text
One object changes
       ↓
Notify many objects
       ↓
Observer Pattern
```

Then identify:

```text
Subject
Observer
YouTubeChannel
Subscriber
```

Then draw the UML and write the code.

---

# Final Exam Quick Revision

## Creational

```text
Factory
→ One object

Abstract Factory
→ Family of objects

Builder
→ Complex object step by step
```

## Structural

```text
Adapter
→ Incompatible interfaces

Decorator
→ Add features

Composite
→ Individual + Group
```

## Behavioral

```text
State
→ Different state = Different behavior

Observer
→ One changes = Notify many

Mediator
→ Many objects = One middle person
```

## Git

```text
branch
→ Create branch

checkout
→ Switch branch

add
→ Stage changes

commit
→ Save changes

merge
→ Combine branches

stash
→ Temporarily save changes
```

## Merge Conflict

```text
Same code
+
Different changes
=
Merge Conflict
```

## Web Application

```text
Frontend
→ SHOW

Backend
→ PROCESS

Database
→ STORE
```

---

# Most Important Things to Practice

Before the final exam, make sure you can do these **without looking at notes**:

* Identify all 9 design patterns from a scenario.
* Write basic Java code for all 9 patterns.
* Draw UML diagrams for all 9 patterns.
* Create and switch Git branches.
* Stage and commit changes.
* Merge two branches.
* Use `git stash` and `git stash pop`.
* Explain and resolve a merge conflict.
* Explain frontend, backend, API, and database.
* Draw the communication flow between frontend, backend, and database.

---

# One-Page Final Memory

```text
================================================
              CSE402 FINAL EXAM
================================================

CREATIONAL
Factory          → One object
Abstract Factory → Family
Builder          → Step by step

STRUCTURAL
Adapter          → Connect incompatible
Decorator        → Add features
Composite        → Individual + Group

BEHAVIORAL
State            → Change behavior
Observer         → Notify many
Mediator         → Communication

GIT
branch           → Create branch
checkout         → Switch
add              → Stage
commit           → Save
merge            → Combine
stash            → Temporarily save

MERGE CONFLICT
Same part + Different changes
            ↓
       Git cannot decide
            ↓
     Developer resolves

WEB APPLICATION
Frontend → SHOW
Backend  → PROCESS
Database → STORE

Communication:
User → Frontend → API → Backend → Database
================================================
```
