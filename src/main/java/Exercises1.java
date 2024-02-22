public class Exercises1 {
    /*
    implement a function that returns factorial of given n
     */
    public static long factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
                result = result * i;
        }

        return result;
    }


    /*
    implement a function that return nth number of fibonacci series
    the series -> 1, 1, 2, 3, 5, 8, ...
    */
    public static long fibonacci(int n) {
        long num1 = 1, num2 = 1, num3 = 0;
        if (n > 2) {
            for (int i = 0; i < n - 2; i++) {
                num3 = num1 + num2;
                num1 = num2;
                num2 = num3;
            }
            return num3;
        }

        return 1;
    }


    /*
    implement a function that returns a triangle for example:
    row = 5

    *
    **
    ***
    ****
    *****

     */
    public static char[][] generateTriangle(int rows) {
        String line = "*";
        char[][] triangle = new char[rows][];
        for (int i = 0; i < rows; i++)
        {
            triangle[i] = line.toCharArray();
            line = line + "*";
        }
        return triangle;
    }


    public static void main(String[] args) {
    }

}