// Multilevel inheritance

// We can implement multi-level inheritance in our application. 
// Let's consider the domain 'Stall' and its types. There exists 
// a multilevel inheritance.

// Create a class SilverStall with the following protected attributes

// Create default constructor and a parameterized constructor with 
// arguments in order SilverStall(String name, String detail, String 
// owner, Integer cost).

// Include appropriate getters and setters.

// Total cost computes only the stall cost.

// Create a class GoldStall which extends SilverStall with following 
// private attributes

// Create default constructor and a parameterized constructor with arguments 
// in order GoldStall(String name, String detail, String owner, Integer cost, Integer tvSet).

// Include appropriate getters and setters.

// Total cost computed by stall cost and TV set cost. Each TV set costs 100Rs.

// Create a class PlatinumStall which extends GoldStall (i.e Multilevel 
// Inheritance) with following private attributes

// Create default constructor and a parameterized constructor with arguments 
// in order PlatinumStall(String name, String detail, String owner, Integer 
// cost, Integer tvSet, Integer projector).

// Include appropriate getters and setters.

// Total cost computed by stall cost,TV set cost and projector cost where 
// each TV set and projector costs 100Rs and 500Rs respectively.

// Create a driver class named Main to test the above class.

// Note:

// Strictly adhere to the Object-Oriented Specifications given in the problem 
// statement.All class names, attribute names and method names should be the 
// same as given in the problem statement.

// The first line of the input consists of the choice. 1 for silver stall, 2 
// for gold stall and 3 for platinum stall.

// The next input is the details of the stalls.
// Output format

// The output consists of stall details.

// Refer sample output for formatting specifications.

// Sample testcases

// Input 1
// 1
// fruits
// fruits are good for health
// kishore
// 2000
// Output 1
// 2000

// Input 2
// 2
// junk foods
// tastier world
// jm
// 5000
// 7
// Output 2
// 5700

// Input 3
// 3
// vehicular
// engines are the best
// raizak
// 6000
// 5
// 3
// Output 3
// 8000

// Input 4
// 4
// Output 4
// Invalid Input

// Whitelist
// SilverStall
// name
// detail
// owner
// cost
// Set 2:
// GoldStall
// tvSet
// projector
// Set 3:
// PlatinumStall
// extends 

import java.util.*;

class SilverStall {
    protected String name;
    protected String detail;
    protected String owner;
    protected int cost;

    public SilverStall(String name, String detail, String owner, int cost) {
        this.name = name;
        this.detail = detail;
        this.owner = owner;
        this.cost = cost;
    }

    public SilverStall() {
        this.name = null;
        this.detail = null;
        this.owner = null;
        this.cost = 0;
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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}

class GoldStall extends SilverStall {
    private int tvSet;

    public GoldStall(String name, String detail, String owner, int cost, int tvSet) {
        this.name = name;
        this.detail = detail;
        this.owner = owner;
        this.cost = cost;
        this.tvSet = tvSet;
    }

    public GoldStall() {
        this.name = null;
        this.detail = null;
        this.owner = null;
        this.cost = 0;
        this.tvSet = 0;
    }

    public int getTvSet() {
        return tvSet;
    }

    public void setTvSet(int tvSet) {
        this.tvSet = tvSet;
    }
}

class PlatinumStall extends GoldStall {
    private int projector;

    public PlatinumStall(String name, String detail, String owner, int cost,
            int tvSet, int projector) {
        this.name = name;
        this.detail = detail;
        this.owner = owner;
        this.cost = cost;
        this.setTvSet(tvSet);
        this.projector = projector;
    }

    public PlatinumStall() {
        this.name = null;
        this.detail = null;
        this.owner = null;
        this.cost = 0;
        this.setTvSet(0);
        this.projector = 0;
    }

    public int getProjector() {
        return projector;
    }

    public void setProjector(int projector) {
        this.projector = projector;
    }
}

class Code3 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        n = Integer.parseInt(scan.nextLine());
        SilverStall s = new SilverStall();
        GoldStall g = new GoldStall();
        PlatinumStall p = new PlatinumStall();
        if (n == 1) {
            s.setName(scan.nextLine());
            s.setDetail(scan.nextLine());
            s.setOwner(scan.nextLine());
            s.setCost(Integer.parseInt(scan.nextLine()));
            SilverStall s1 = new SilverStall(s.name, s.detail, s.owner, s.cost);
            System.out.println(s.cost);
        }
        if (n == 2) {
            g.setName(scan.nextLine());
            g.setDetail(scan.nextLine());
            g.setOwner(scan.nextLine());
            g.setCost(Integer.parseInt(scan.nextLine()));
            g.setTvSet(Integer.parseInt(scan.nextLine()));
            GoldStall g1 = new GoldStall(g.name, g.detail, g.owner, g.cost, g.getTvSet());
            System.out.println(g.cost + (g.getTvSet() * 100));
        }
        if (n == 3) {
            p.setName(scan.nextLine());
            p.setDetail(scan.nextLine());
            p.setOwner(scan.nextLine());
            p.setCost(Integer.parseInt(scan.nextLine()));
            p.setTvSet(Integer.parseInt(scan.nextLine()));
            p.setProjector(Integer.parseInt(scan.nextLine()));
            PlatinumStall p1 = new PlatinumStall(p.name, p.detail, p.owner, p.cost, p.getTvSet(), p.getProjector());
            System.out.println(p.cost + (p.getTvSet() * 100) + (p.getProjector() * 500));
        }
        if (n > 3) {
            System.out.println("Invalid Input");
        }

        scan.close();
    }
}
