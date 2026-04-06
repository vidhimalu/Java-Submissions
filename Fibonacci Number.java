public class Solution {

    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        int a = 0, b = 1; 
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b; 
            b = temp; 
        }
        return b;
    }

    public static void main(String[] args) {
        Solution fibCalculate = new Solution();
        
    
        System.out.println(fibCalculate.fib(0)); 
        System.out.println(fibCalculate.fib(1)); 
        System.out.println(fibCalculate.fib(5)); 
        System.out.println(fibCalculate.fib(10));
    }
}
