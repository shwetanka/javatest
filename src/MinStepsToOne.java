/**
 * Created by shwetanka on 10/31/15.
 */

/**
 * Problem Statement: On a positive integer, you can perform any one of the following 3 steps.
 * 1.) Subtract 1 from it. ( n = n - 1 )  , 2.) If its divisible by 2, divide by 2. ( if n % 2 == 0 , then n = n / 2  )  ,
 * 3.) If its divisible by 3, divide by 3. ( if n % 3 == 0 , then n = n / 3  ).
 * Now the question is, given a positive integer n, find the minimum number of steps that takes n to 1
 * eg: 1.)For n = 1 , output: 0       2.) For n = 4 , output: 2  ( 4  /2 = 2  /2 = 1 )    3.)
 * For n = 7 , output: 3  (  7  -1 = 6   /3 = 2   /2 = 1 )
 */
public class MinStepsToOne {
    static int c = 0;
    static int c1 = 0;

    static int [] vals;

    public static void main(String [] args){
        int n = 10;
        vals = new int[n+1];
        for (int i=0;i<vals.length;i++){
            vals[i] = -1;
        }
        System.out.println("Steps: "+minStepsBF(n));
        System.out.println("recursion count: "+c);

        System.out.println("StepsDP: "+minStepsDP(n));
        System.out.println("recursion count: "+c1);
    }

    static int minStepsBF(int n){
        c++;
        if (n==1){
            return 0;
        }
        int r = 1+minStepsBF(n-1);

        if (n%2==0){
            r = min(r, 1+minStepsBF(n/2));
        }
        if (n%3==0){
            r = min(r, 1+minStepsBF(n/3));
        }
        return r;
    }

    static int min(int a, int b){
        if (a<=b){
            return a;
        }
        return b;
    }

    static int minStepsDP(int n){
        if (vals[n]!=-1){
            return vals[n];
        }
        c1++;
        if (n==1){
            return 0;
        }
        int r = 1+minStepsBF(n-1);

        if (n%2==0){
            r = min(r, 1+minStepsBF(n/2));
        }
        if (n%3==0){
            r = min(r, 1+minStepsBF(n/3));
        }
        vals[n] = r;
        return r;
    }
}
