/*
Four players participate in the playoff tournament. 
The tournament is held according to the following scheme:
the first player will play with the second, and the third player with the fourth, 
then the winners of the pairs will play in the finals of the tournament.
It is known that in a match between two players, the one whose skill is greater will win.
The skill of the i-th player is equal to si and all skill levels are pairwise different
(i. e. there are no two identical values in the array s).
The tournament is called fair if the two players with the highest skills meet in the finals.
Determine whether the given tournament is fair.

Input
The first line contains a single integer t (1≤t≤104) — the number of test cases.

A single line of test case contains four integers s1,s2,s3,s4 (1≤si≤100) — skill of the players. It is guaranteed that all the numbers in the array are different.

Output
For each testcase, output YES if the tournament is fair, or NO otherwise.

Example
inputCopy
4
3 7 9 5
4 5 6 9
5 3 8 1
6 5 3 2
outputCopy
YES
NO
YES
NO


*/
import java.util.*;
public class Fair_Playoff{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int test_cases;
        test_cases=sc.nextInt();
        for(int j=0;j<test_cases;j++){
        int [] arr= new int[4];
        for(int i=0;i<4;i++)
            arr[i]=sc.nextInt();
        int max12 = Math.max(arr[0], arr[1]);
        int max34 = Math.max(arr[2], arr[3]);
        int min12 = Math.min(arr[0], arr[1]);
        int min34 = Math.min(arr[2], arr[3]);

        System.out.println(((max12 > min34) && (max34 > min12) ? "YES" : "NO"));

        }
    }
}