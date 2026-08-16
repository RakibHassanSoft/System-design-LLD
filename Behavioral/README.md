# Behavioral Design Patterns

This repository contains simple Java examples of common **Behavioral Design Patterns**.

The examples are designed to explain each pattern using:

* Simple definitions
* Rules
* Easy-to-remember formulas
* Real-life examples
* Java implementations

---

## 📁 Project Structure

```text
Behavioral/
│
├── State Pattern/
│   ├── StatePattern.java
│   └── README.md
│
├── Observer Pattern/
│   ├── ObserverPattern.java
│   └── README.md
│
├── Mediator Pattern/
│   ├── MediatorPattern.java
│   └── README.md
│
└── README.md
```

---

# 1. State Pattern

The **State Pattern** is used when an object can have different states and its behavior changes depending on its current state.

Instead of putting all state-related logic inside one class with many `if-else` or `switch` statements, each state gets its own class.

### Example

A music player can have:

```text
Playing
Paused
Stopped
```

The same button can behave differently depending on the current state.

## State Pattern — Rules

* Use it when an object has different states.
* Each state can have different behavior.
* Create a separate class for each state.
* The main object keeps track of its current state.
* A state can change to another state.
* Helps avoid too many `if-else` or `switch` statements.

### Easy to Remember

```text
Different state
       ↓
Different behavior
       ↓
State Pattern
```

### Real-Life Example

```text
Fan
 ↓
OFF → ON → OFF
```

---

# 2. Observer Pattern

The **Observer Pattern** is used when one object changes and other objects need to know about that change.

The main object, called the **Subject**, keeps a list of objects called **Observers** and notifies them when something happens.

### Example

When a YouTube channel uploads a new video, all its subscribers can be notified.

## Observer Pattern — Rules

* Have one main object called the **Subject**.
* Other objects are called **Observers**.
* Observers subscribe/register with the Subject.
* When something changes, the Subject notifies all Observers.
* Observers can subscribe or unsubscribe.
* Useful when many objects need to react to one change.

### Easy to Remember

```text
One object changes
       ↓
Notify many objects
       ↓
Observer Pattern
```

### Real-Life Example

```text
YouTube Channel
       ↓
New Video
       ↓
Notify Subscribers
```

---

# 3. Mediator Pattern

The **Mediator Pattern** is used when many objects need to communicate with each other.

Instead of objects communicating directly with everyone, they communicate through a **Mediator**.

This reduces the connections between objects and makes the system easier to manage.

### Example

In a chat room, users don't need to send messages directly to every other user.

Instead:

```text
User
 ↓
Chat Room
 ↓
Other Users
```

The chat room acts as the **Mediator**.

## Mediator Pattern — Rules

* Create a **Mediator** to control communication.
* Objects communicate through the Mediator.
* Objects don't need to communicate directly with each other.
* The Mediator knows who should receive the message.
* Helps reduce complex connections between objects.
* Useful when many objects need to communicate.

### Easy to Remember

```text
Many objects
       ↓
One middle person
       ↓
Mediator Pattern
```

### Real-Life Example

```text
User sends message
       ↓
Chat Room
       ↓
Other Users
```

---

# Simple Comparison

| Pattern      | Main Purpose                                |
| ------------ | ------------------------------------------- |
| **State**    | Changes behavior based on the current state |
| **Observer** | Notifies many objects about a change        |
| **Mediator** | Manages communication between many objects  |

---

# Real-Life Examples

### State

```text
Fan
 ↓
OFF → ON → OFF
```

### Observer

```text
YouTube Channel
 ↓
New Video
 ↓
Notify Subscribers
```

### Mediator

```text
Chat Room
 ↓
User sends message
 ↓
Chat Room
 ↓
Other Users
```

---

# Quick Memory Guide

```text
State
Different state → Different behavior


Observer
One object changes → Notify many objects


Mediator
Many objects → One middle person
```

---

## Behavioral Pattern Overview

```text
State
  │
  └── Changes behavior based on state

Observer
  │
  └── Notifies multiple objects

Mediator
  │
  └── Manages communication between objects
```

These three patterns mainly focus on **how objects behave and communicate with each other**.
