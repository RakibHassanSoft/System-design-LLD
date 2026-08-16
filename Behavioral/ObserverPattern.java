/*
Observer Pattern — First 4 Steps
Subject → The main object that has information.
Example: YouTube Channel
Observer → Objects that want to receive updates.
Example: Subscribers
Subscribe → Observers register with the Subject.
Example: User subscribes to a channel.
Notify → When something changes, the Subject tells all subscribed Observers.
Example: New video → Notify all subscribers.
Easy flow:

Subject → Subscribe → Something changes → Notify Observers


                    <<interface>>
                       Subject
                          △
                          │
                          │ implements
                          │
                   YouTubeChannel
                   - subscribers
                   - video
                          │
                          │ notifies
                          ↓
                    <<interface>>
                       Observer
                          △
                          │
                          │ implements
                          │
                      Subscriber
                          │
                   ┌──────┼──────┐
                   ↓      ↓      ↓
                 Rakib   John   Alex
*/

package Behavioral;

import java.util.ArrayList;
import java.util.List;


// ======================================
// Observer
// ======================================

interface Observer {

    void update(String video);
}


// ======================================
// Subject
// ======================================

interface Subject {

    void subscribe(Observer observer);

    void unsubscribe(Observer observer);

    void notifyObservers();
}


// ======================================
// Concrete Subject
// ======================================

class YouTubeChannel implements Subject {

    private List<Observer> subscribers = new ArrayList<>();

    private String video;


    @Override
    public void subscribe(Observer observer) {

        subscribers.add(observer);
    }


    @Override
    public void unsubscribe(Observer observer) {

        subscribers.remove(observer);
    }


    public void uploadVideo(String video) {

        this.video = video;

        System.out.println("\nNew video uploaded: " + video);

        notifyObservers();
    }


    @Override
    public void notifyObservers() {

        for (Observer observer : subscribers) {

            observer.update(video);
        }
    }
}


// ======================================
// Concrete Observer
// ======================================

class Subscriber implements Observer {

    private String name;


    public Subscriber(String name) {

        this.name = name;
    }


    @Override
    public void update(String video) {

        System.out.println(
                name + " received notification: " + video
        );
    }
}


// ======================================
// Client
// ======================================

public class ObserverPattern {

    public static void main(String[] args) {


        // Create YouTube Channel

        YouTubeChannel channel =
                new YouTubeChannel();


        // Create Subscribers

        Subscriber user1 =
                new Subscriber("Rakib");

        Subscriber user2 =
                new Subscriber("John");

        Subscriber user3 =
                new Subscriber("Alex");


        // Subscribe users

        channel.subscribe(user1);

        channel.subscribe(user2);

        channel.subscribe(user3);


        // Upload video

        channel.uploadVideo(
                "Observer Pattern Tutorial"
        );


        // Unsubscribe Alex

        channel.unsubscribe(user3);


        // Upload another video

        channel.uploadVideo(
                "Java Design Patterns"
        );
    }
}