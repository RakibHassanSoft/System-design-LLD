/*
===========================================================
                OBSERVER PATTERN
===========================================================

                    YouTube Channel
                       (Subject)
                           │
                    New Video Uploaded
                           │
              ┌────────────┼────────────┐
              ↓            ↓            ↓
            Rakib         John         Alex
          (Observer)    (Observer)    (Observer)


YouTubeChannel → Subject
Subscriber     → Observer

MAIN IDEA:

One object changes
       ↓
Notify many objects


===========================================================
HOW THE CODE IS STRUCTURED
===========================================================

             <<interface>>
                Observer
                    △
                    │ implements
                    │
               Subscriber
              /    |     \
           Rakib  John   Alex


             <<interface>>
                 Subject
                    △
                    │ implements
                    │
             YouTubeChannel
                    │
                    │ has a list of
                    ↓
               Subscribers


IMPORTANT:

Observer
→ Defines what an Observer MUST do.

Subscriber
→ A concrete Observer.

Subject
→ Defines what a Subject MUST do.

YouTubeChannel
→ A concrete Subject.
→ Keeps a list of Subscribers.
→ Notifies them when a video is uploaded.


===========================================================
*/


import java.util.ArrayList;
import java.util.List;


// ==========================================================
// 1. OBSERVER
// ==========================================================

/*
    Observer is an interface.

    It says:

    "Anyone who wants to be an Observer
     must have an update() method."

    In our example:

    Subscriber = Observer
*/

interface Observer {

    void update(String video);
}


// ==========================================================
// 2. CONCRETE OBSERVER
// ==========================================================

/*
    Subscriber is an Observer.

    "implements Observer" means:

    Subscriber MUST implement update().
*/

class Subscriber implements Observer {

    // Every subscriber has a name.
    private String name;


    // Constructor
    Subscriber(String name) {

        this.name = name;
    }


    /*
        This method comes from the Observer interface.

        When the YouTube channel sends a notification,
        this method will be called.
    */

    @Override
    public void update(String video) {

        System.out.println(
                name + " received: " + video
        );
    }
}


// ==========================================================
// 3. SUBJECT
// ==========================================================

/*
    Subject is an interface.

    It defines what a Subject should be able to do.

    A Subject should be able to:

    1. Subscribe an Observer
    2. Unsubscribe an Observer
    3. Notify all Observers
*/

interface Subject {

    void subscribe(Observer observer);

    void unsubscribe(Observer observer);

    void notifyObservers();
}


// ==========================================================
// 4. CONCRETE SUBJECT
// ==========================================================

/*
    YouTubeChannel is the actual Subject.

    It implements Subject.

    So it MUST provide:

    subscribe()
    unsubscribe()
    notifyObservers()
*/

class YouTubeChannel implements Subject {


    /*
        This is VERY IMPORTANT.

        The channel needs to remember
        who subscribed to it.

        Example:

        subscribers
        ----------------
        Rakib
        John
        Alex
    */

    private List<Observer> subscribers =
            new ArrayList<>();


    /*
        This stores the latest video.
    */

    private String video;


    // ======================================================
    // SUBSCRIBE
    // ======================================================

    /*
        When someone subscribes:

        channel.subscribe(rakib);

        Rakib is added to the list.
    */

    @Override
    public void subscribe(Observer observer) {

        subscribers.add(observer);

        System.out.println(
                "New subscriber added."
        );
    }


    // ======================================================
    // UNSUBSCRIBE
    // ======================================================

    /*
        When someone unsubscribes:

        channel.unsubscribe(alex);

        Alex is removed from the list.
    */

    @Override
    public void unsubscribe(Observer observer) {

        subscribers.remove(observer);

        System.out.println(
                "Subscriber removed."
        );
    }


    // ======================================================
    // UPLOAD VIDEO
    // ======================================================

    /*
        This is NOT part of the Subject interface.

        It is specific to YouTubeChannel.

        When a video is uploaded:

        1. Save the video
        2. Notify all subscribers
    */

    public void uploadVideo(String video) {

        this.video = video;

        System.out.println(
                "\nNew video uploaded: " + video
        );


        // Tell all subscribers.
        notifyObservers();
    }


    // ======================================================
    // NOTIFY OBSERVERS
    // ======================================================

    /*
        This is the HEART of the Observer Pattern.

        We go through every subscriber.

        For each subscriber:

            observer.update(video);

        So if we have:

        Rakib
        John
        Alex

        Java does:

        Rakib.update(video);
        John.update(video);
        Alex.update(video);
    */

    @Override
    public void notifyObservers() {

        for (Observer observer : subscribers) {

            observer.update(video);
        }
    }
}


// ==========================================================
// 5. MAIN / CLIENT
// ==========================================================

/*
    This is where we use the Observer Pattern.
*/

public class ObserverPattern {

    public static void main(String[] args) {


        // ==================================================
        // STEP 1: CREATE YOUTUBE CHANNEL
        // ==================================================

        /*
            We create our Subject.

            YouTubeChannel = Subject
        */

        YouTubeChannel channel =
                new YouTubeChannel();


        // ==================================================
        // STEP 2: CREATE SUBSCRIBERS
        // ==================================================

        /*
            We create three Observers.

            Subscriber = Observer
        */

        Subscriber rakib =
                new Subscriber("Rakib");

        Subscriber john =
                new Subscriber("John");

        Subscriber alex =
                new Subscriber("Alex");


        // ==================================================
        // STEP 3: SUBSCRIBE
        // ==================================================

        /*
            Add subscribers to the channel.

            Channel now has:

            Rakib
            John
            Alex
        */

        channel.subscribe(rakib);

        channel.subscribe(john);

        channel.subscribe(alex);


        // ==================================================
        // STEP 4: UPLOAD VIDEO
        // ==================================================

        /*
            When this happens:

            uploadVideo()
                  ↓
            notifyObservers()
                  ↓
            ┌──────┼──────┐
            ↓      ↓      ↓
          Rakib  John   Alex
            ↓      ↓      ↓
          update update update
        */

        channel.uploadVideo(
                "Observer Pattern Tutorial"
        );


        // ==================================================
        // STEP 5: UNSUBSCRIBE ALEX
        // ==================================================

        /*
            Alex no longer wants notifications.

            Remove Alex from the list.
        */

        channel.unsubscribe(alex);


        // ==================================================
        // STEP 6: UPLOAD ANOTHER VIDEO
        // ==================================================

        /*
            Now Alex will NOT receive this notification.

            Only:

            Rakib
            John

            will receive it.
        */

        channel.uploadVideo(
                "Java Design Patterns"
        );
    }
}