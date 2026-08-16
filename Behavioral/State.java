/*

State Pattern allows an object to change its behavior when its internal state changes.

                 FanState
                    △
                    │
              ┌─────┴─────┐
              │           │
          OffState      OnState
              │           │
              └─────┬─────┘
                    │
                    ↓
                   Fan
                 Context
*/

package Behavioral;


// ===============================
// State
// ===============================

interface FanState {

    void pressButton();
}


// ===============================
// Context
// ===============================

class Fan {

    private FanState state;

    public Fan() {
        state = new OffState(this);
    }

    public void setState(FanState state) {
        this.state = state;
    }

    public void pressButton() {
        state.pressButton();
    }
}


// ===============================
// State 1: OFF
// ===============================

class OffState implements FanState {

    private Fan fan;

    public OffState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void pressButton() {

        System.out.println("Fan is ON.");

        fan.setState(
                new OnState(fan)
        );
    }
}


// ===============================
// State 2: ON
// ===============================

class OnState implements FanState {

    private Fan fan;

    public OnState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void pressButton() {

        System.out.println("Fan is OFF.");

        fan.setState(
                new OffState(fan)
        );
    }
}


// ===============================
// Client
// ===============================

public class State {

    public static void main(String[] args) {

        Fan fan = new Fan();

        fan.pressButton(); // OFF → ON
        fan.pressButton(); // ON → OFF
        fan.pressButton(); // OFF → ON
    }
}