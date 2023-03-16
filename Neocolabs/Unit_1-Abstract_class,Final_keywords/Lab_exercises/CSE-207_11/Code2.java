// According to Wikipedia, a factory is simply an 
// object that returns another object from some other 
// method call, which is assumed to be “new”.

// In this problem, you are given an interface Food. 
// There are two classes Pizza and Cake which implement 
// the Food interface, and they both contain a method getType().

// The main function in the Main class creates an instance 
// of the FoodFactory class. The FoodFactory class contains 
// a method getFood(String) that returns a new instance of 
// Pizza or Cake according to its parameter.

// Input format
// pizza (/cake)

// Output format
// please see the sample output

// Sample testcases
// Input 1
// pizza
// Output 1
// The factory returned class Pizza
// Someone ordered a Fast Food!
// Input 2
// cake
// Output 2
// The factory returned class Cake
// Someone ordered a Dessert!

import java.util.*;

interface Food {
    public String getType();
}

class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory {
    public Food getFood(String order) {
        if (order.equalsIgnoreCase("Pizza")) {
            return new Pizza();
        } else if (order.equalsIgnoreCase("Cake")) {
            return new Cake();
        }
        return null;
    }
}

class Code2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        FoodFactory obj = new FoodFactory();

        Food food = obj.getFood(sc.nextLine());
        System.out.println("The factory returned " + food.getClass());

        System.out.println(food.getType());
        sc.close();
    }
}