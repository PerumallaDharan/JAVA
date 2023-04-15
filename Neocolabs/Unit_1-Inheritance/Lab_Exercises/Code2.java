// Overriding-simple

// Overriding is another concept that every application developer should know. 
// Overriding is a runtime polymorphism. The inherited class has the overridden 
// method which has the same name as the method in the parent class. The 
// argument number, types or return types should not differ in any case. 
// The method is invoked with the object of the specific class ( but with 
// the reference of the parent class).

// Now let's try out a simple overriding concept in our application. For 
// this, we can take our original example of Class Event, and its child 
// classes Exhibition and StageEvent.

// Create a parent class Event with following protected attributes,
// Then create child class Exhibition that extends Event with the 
// following attribute,
// And create another child class StageEvent that extends Event with 
// the following attribute,
// Add suitable constructor (with super() if necessary) and getters/setters 
// for the classes. Add method projectedRevenue() in parent and its child class.

// Note: For Exhibition, each stall will produce Rs.10000 as revenue. For 
// StageEvent, each seat produces Rs.50 revenue.

// Input format
// Input consists of details of the event (Name, Detail, and ownerName).
// The next input is the choice, 1 for Exhibition, and 2 for StageEvent).
// If the input is 1, Enter the number of stalls. If the input is 2, enter the 
// number of shows and the number of seats per show.

// Output format
// Output prints the projected revenue of the event.

// Sample testcases

// Input 1
// Science Fair
// Explore Technology
// ABCD
// 1
// 65
// Output 1
// 650000.0

// Input 2
// Magic show
// See magic without logic
// SDFG
// 2
// 10
// 100
// Output 2
// 50000.0

// Whitelist
// class Event
// class StageEvent
// extends
// class Exhibition
// public Double projectedRevenue() 

//import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

class Event {
    protected String name;
    protected String detail;
    protected String ownerName;

    public Event(String name, String detail, String ownerName) {
        this.name = name;
        this.detail = detail;
        this.ownerName = ownerName;
    }

    public Event() {
        this.name = null;
        this.detail = null;
        this.ownerName = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Double projectedRevenue() {
        return 0.0;
    }
}

class Exhibition extends Event {
    public int noOfStall;

    public Exhibition(String name, String detail, String ownerName, int noOfStall) {
        super(name, detail, ownerName);
        this.noOfStall = noOfStall;
    }

    public Exhibition() {
        super();
        this.noOfStall = 0;
    }

    public int getNoOfStall() {
        return noOfStall;
    }

    public void setNoOfStall(int noOfStall) {
        this.noOfStall = noOfStall;
    }

    public Double projectedRevenue() {
        return (double) (noOfStall * 10000);
    }
}

class StageEvent extends Event {
    public int noOfShows;
    public int noOfSeatsPerShow;

    public StageEvent(String name, String detail, String ownerName, int noOfShows,
            int noOfSeatsPerShow) {
        super(name, detail, ownerName);
        this.noOfShows = noOfShows;
        this.noOfSeatsPerShow = noOfSeatsPerShow;
    }

    public StageEvent() {
        super();
        this.noOfShows = 0;
        this.noOfSeatsPerShow = 0;
    }

    public int getNoOfShows() {
        return noOfShows;
    }

    public void setNoOfShows(int noOfShows) {
        this.noOfShows = noOfShows;
    }

    public int getNoOfSeatsPerShow() {
        return noOfSeatsPerShow;
    }

    public void setNoOfSeatsPerShow(int noOfSeatsPerShow) {
        this.noOfSeatsPerShow = noOfSeatsPerShow;
    }

    public Double projectedRevenue() {
        return (double) (50 * noOfShows * noOfSeatsPerShow);
    }
}

class Code2 {
    public static void main(String[] args) {
        Event ev = new Event();
        Scanner sc = new Scanner(System.in);
        ev.name = sc.nextLine();
        ev.detail = sc.nextLine();
        ev.ownerName = sc.nextLine();
        Event e1 = new Event(ev.name, ev.detail, ev.ownerName);
        int n;
        DecimalFormat dd = new DecimalFormat("0.0");
        n = Integer.parseInt(sc.nextLine());
        Exhibition ex = new Exhibition();
        StageEvent se = new StageEvent();
        if (n == 1) {
            ex.noOfStall = Integer.parseInt(sc.nextLine());
            Exhibition ex1 = new Exhibition(ev.name, ev.detail, ev.ownerName, ex.noOfStall);
            double result = ex1.projectedRevenue();
            System.out.println(dd.format(result));
        }
        if (n == 2) {
            se.noOfShows = Integer.parseInt(sc.nextLine());
            se.noOfSeatsPerShow = Integer.parseInt(sc.nextLine());
            StageEvent se1 = new StageEvent(ev.name, ev.detail, ev.ownerName, se.noOfShows, se.noOfSeatsPerShow);
            double result = se1.projectedRevenue();
            System.out.println(dd.format(result));
        }
    }
}
