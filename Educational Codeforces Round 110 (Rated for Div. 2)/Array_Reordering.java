import java.util.*;
public class Array_Reordering{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int test_cases;
        test_cases=sc.nextInt();
        for(int j1=0;j1<test_cases;j1++){
            int n=sc.nextInt();
            int odd=0,even=0;
            int [] odds= new int[n];
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x % 2 == 0) {
                    even++;
                } else {
                    odds[odd] = x;
                    odd++;
                }
            }
            int ans = 0;
                if (even > 0) {
                    ans += ((n - 1) + odd) * even / 2;
                }
                for (int i = 0; i < odd; i++) {
                    for (int j = i + 1; j < odd; j++) {
                        if (getGCD(odds[i], odds[j]) > 1) {
                            ans++;
                        }
                    }
                }
                System.out.println(ans);
        }
    }

static int getGCD(int m, int n) {
    if (n == 0) {
        return m;
    }
    return getGCD(n, m % n);
}
}