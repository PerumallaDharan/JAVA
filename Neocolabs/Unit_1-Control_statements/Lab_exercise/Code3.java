// Minimum Travel Time

// The renowned book fair of the season "Publishers Federation Book Expo" is back, 
// it promises to be bigger and better with a spread of about a million books on display. 
// It is organized in a wide space this year on the topmost floor N of Hotel Grand Regency.

// Williams, an ardent book lover visits the fair and wants to minimize the time it takes 
// him to go from the N-th floor to the ground floor. He can either take the elevator or the stairs.

// The stairs are at an angle of 45 degrees and Williams's velocity is V1 m/s when taking 
// the stairs down. The elevator on the other hand moves with a velocity V2 m/s. Whenever 
// an elevator is called, it always starts from the ground floor and goes to the N-th floor 
// where it collects Williams (collecting takes no time), it then makes its way down to the 
// ground floor with Williams in it.

// The elevator crosses a total distance equal to N meters when going from the N-th floor to 
// the ground floor or vice versa, while the length of the stairs is sqrt(2) * N because the 
// stairs are at an angle of 45 degrees. Williams has requested your help to decide whether 
// he should use the stairs or the elevator to minimize his travel time. Can you help him out?

// Input format
// The input contains three space-separated integers N, V1, and V2.

// Output format
// The output displays either Elevator or Stairs depending on the condition.

// Sample testcases
// Input 1
// 5 10 15
// Output 1
// Elevator
// Input 2
// 2 10 14
// Output 2
// Stairs

import java.util.*;

class Code3 {
    public static void main(String args[]) {
        int n, v1, v2;
        double t1, t2;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        v1 = sc.nextInt();
        v2 = sc.nextInt();
        t1 = 1.41421356237 * n * 100 / v1;
        t2 = 2 * n * 100;
        t2 = t2 / v2;

        if (t1 < t2) {
            System.out.println("Stairs");
        } else {
            System.out.println("Elevator");
        }
        sc.close();
    }
}