/*

Mediator Pattern
Acts as a middleman between objects.
Objects communicate through the mediator instead of directly.
Reduces dependencies between objects.
Centralizes communication logic.
Flow: Object A → Mediator → Object B.


It is defining a rule/contract for the mediator.=======

ChatMediator = mediator interface.
sendMessage() = the communication method.
It says: “Any mediator must provide a way to send a message.”
It does not contain the actual communication logic.
ChatRoom later implements this interface and provides the actual logic.

So simply:

ChatMediator → Defines WHAT the mediator should do.
ChatRoom → Defines HOW the mediator does it.
*/

package Behavioral;

interface ChatMediator {
    void sendMessage(String message, User user);
}

class ChatRoom implements ChatMediator {

    @Override
    public void sendMessage(String message, User user) {
        System.out.println(user.name + ": " + message);
    }
}

class User {
    String name;
    ChatMediator mediator;

    User(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    void send(String message) {
        mediator.sendMessage(message, this);
    }
}

public class Mediator {

    public static void main(String[] args) {

        ChatMediator chatRoom = new ChatRoom();

        User user1 = new User("Rakib", chatRoom);
        User user2 = new User("John", chatRoom);

        user1.send("Hello John!");
        user2.send("Hello Rakib!");
    }
}