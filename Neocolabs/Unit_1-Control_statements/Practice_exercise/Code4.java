// Hanging Bridge

// At the annual "KrackerJack Karnival", there was the newest attraction 
// ever in the City, the "Hanging Bridge". Visitors will be able to walk 
// 200ft on the bridge, hanging around 50ft above the ground, and enjoy a 
// wide-angle view of the breathtaking greenery.

// The Hanging Bridge was inaugurated successfully in coordination with the 
// Event Manager Rahul. There is a limit on the maximum number of people on 
// the bridge and Rahul has to now ensure the count of people on the bridge 
// currently should not exceed the limit. He then approximately estimated that 
// C adults and D kids who came to the show were on the hanging bridge. He also 
// noticed that there are L legs of the people touching the bridge.

// Rahul knows that kids love to ride on the adults and they might ride on the 
// adults, and their legs won't touch the ground hence he would miss counting 
// their legs. Also, Rahul knew that the adults would be strong enough to ride 
// at max two kids on their backs.

// Rahul is now wondering whether he counted the legs properly or not. Specifically, 
// he is wondering if is there some possibility of his counting being correct. Please 
// help Rahul in finding it.

// Input format
// The only line of input contains three space-separated integers C, D, and L denoting 
// number of the adults, number of the kids, and the number of legs people counted by 
// Rahul, respectively.

// Output format
// The output displays either Yes or No based on the condition.

// Sample testcases
// Input 1
// 1 1 4
// Output 1
// Yes
// Input 2
// 2 4 16
// Output 2
// No

import java.util.*;

class Code4 {
	public static void main(String [] args) {
	    int c,d,l;
	    Scanner sc = new Scanner(System.in);
	    c = sc.nextInt();
	    d = sc.nextInt();
	    l = sc.nextInt();
	    c = (c+d)*2;
	    if(c == l) {
	    	System.out.println("Yes");
	    }
	    else {
	    	System.out.println("No");
	    }
        sc.close();
	}
}