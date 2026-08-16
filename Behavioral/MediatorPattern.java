package Behavioral;

/*
===========================================================
                    MEDIATOR PATTERN
===========================================================

Without Mediator:

Rakib ─────→ John
  │
  └────────→ Alex

John ──────→ Rakib
  │
  └────────→ Alex

Alex ──────→ Rakib
  │
  └────────→ John


This creates too many connections.


With Mediator:

                    ChatRoom
                    MEDIATOR
                  /    |    \
                 ↓     ↓     ↓
              Rakib   John   Alex
               USER   USER   USER


Users communicate through the ChatRoom.

Rakib → ChatRoom → John
                  → Alex


Main idea:

Many objects → One middle object → Communication

===========================================================
*/


import java.util.ArrayList;
import java.util.List;


// ==========================================================
// 1. MEDIATOR INTERFACE
// ==========================================================

/*
    This is the Mediator interface.

    It defines the communication rule.

    Any Mediator must have sendMessage().
*/

interface ChatMediator {

    void sendMessage(String message, User user);
}


// ==========================================================
// 2. CONCRETE MEDIATOR
// ==========================================================

/*
    ChatRoom is the actual Mediator.

    It controls communication between Users.
*/

class ChatRoom implements ChatMediator {


    /*
        ChatRoom keeps a list of users.

        Example:

        users
        ----------------
        Rakib
        John
        Alex
    */

    private List<User> users =
            new ArrayList<>();


    // ======================================================
    // ADD USER
    // ======================================================

    /*
        Add a user to the ChatRoom.
    */

    public void addUser(User user) {

        users.add(user);
    }


    // ======================================================
    // SEND MESSAGE
    // ======================================================

    /*
        This is the HEART of Mediator Pattern.

        The sender sends the message to ChatRoom.

        ChatRoom decides who should receive it.
    */

    @Override
    public void sendMessage(
            String message,
            User sender) {


        // Go through every user.
        for (User user : users) {


            /*
                Don't send the message
                back to the person who sent it.
            */

            if (user != sender) {

                user.receiveMessage(message);
            }
        }
    }
}


// ==========================================================
// 3. USER
// ==========================================================

/*
    User is the object that wants to communicate.

    User does NOT directly communicate
    with other Users.

    User communicates through ChatMediator.
*/

class User {

    private String name;

    private ChatMediator mediator;


    // Constructor

    User(
            String name,
            ChatMediator mediator) {

        this.name = name;

        this.mediator = mediator;
    }


    // ======================================================
    // SEND MESSAGE
    // ======================================================

    /*
        User sends the message to the Mediator.

        User does NOT send directly to John or Alex.
    */

    public void sendMessage(String message) {

        mediator.sendMessage(
                message,
                this
        );
    }


    // ======================================================
    // RECEIVE MESSAGE
    // ======================================================

    /*
        ChatRoom calls this method
        when another user sends a message.
    */

    public void receiveMessage(String message) {

        System.out.println(
                name + " received: " + message
        );
    }
}


// ==========================================================
// 4. MAIN / CLIENT
// ==========================================================

public class MediatorPattern {

    public static void main(String[] args) {


        // ==================================================
        // STEP 1: CREATE CHAT ROOM
        // ==================================================

        /*
            ChatRoom = Mediator
        */

        ChatRoom chatRoom =
                new ChatRoom();


        // ==================================================
        // STEP 2: CREATE USERS
        // ==================================================

        /*
            Each User knows the Mediator.

            User does NOT know other Users.
        */

        User rakib =
                new User("Rakib", chatRoom);

        User john =
                new User("John", chatRoom);

        User alex =
                new User("Alex", chatRoom);


        // ==================================================
        // STEP 3: ADD USERS TO CHAT ROOM
        // ==================================================

        chatRoom.addUser(rakib);

        chatRoom.addUser(john);

        chatRoom.addUser(alex);


        // ==================================================
        // STEP 4: RAKIB SENDS MESSAGE
        // ==================================================

        rakib.sendMessage(
                "Hello everyone!"
        );


        // ==================================================
        // STEP 5: JOHN SENDS MESSAGE
        // ==================================================

        john.sendMessage(
                "Hi Rakib!"
        );
    }
}