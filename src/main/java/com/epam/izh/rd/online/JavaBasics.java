package com.epam.izh.rd.online;

import com.epam.izh.rd.online.service.MathService;
import com.epam.izh.rd.online.service.SimpleMathService;

public class JavaBasics {
    public static void main(String[] args) {

        {/* SECTION FOR DEBUGGING maxFrom(array) METHOD ALGORITHM */

            //Input parameters
            int[] val = {-1, -3, 477, 8, 55, 22, -5};

            //maxFrom(array) algorithm implementation
            int ma = val[0];

            for (int n = 1; n < val.length; n++) {
                if (val[n] > ma)
                    ma = val[n];
            }

            //Building string of array elements
            String s = "{" + String.valueOf(val[0]);
            for (int k = 1; k < val.length; k++) {
                s = s + ", " + String.valueOf(val[k]);
                if (val[k] == ma)
                    s = s + '*';
            }
            s = s + "}";

            //Typing out the result of analysis
            System.out.println("MaxFrom(array): Number " + ma + " is the maximum value within the given array: " + s);

        }/* END OF maxFrom(array) DEBUGGING SECTION */


        {/* SECTION FOR DEBUGGING sum(array) METHOD ALGORITHM */

            //Input parameters
            int[] a = {1, 2, 0}; //{-1, -3, 4, 8, 5, 22, -5}

            //sum(array) algorithm implementation
            if (a.length == 0) {
                System.out.println("sum(array): The sum is 0 because the given array is void: {}");
            } else {
                int total = a[0];

                for (int n = 1; n < a.length; n++) {
                    total = total + a[n];
                }

                //Building string of array elements
                String s = "{" + String.valueOf(a[0]);
                for (int k = 1; k < a.length; k++) {
                    s = s + ", " + String.valueOf(a[k]);
                }
                s = s + "}";

                //Typing out the result of analysis
                System.out.println("sum(array): The sum of all elements of the given array " + s + " is " + total);
            }
        }/* END OF sum(array) DEBUGGING SECTION */


        {/* SECTION FOR DEBUGGING getEvenDigits(array) METHOD ALGORITHM */

            //Input parameters
            int[] arr = {5, 4, 1, 1}; //для списка {-1, -3, 4, 8, 5, 22, 17} метод должен вернуть {4, 8, 22}

            //Building string of input array elements
            String in = "{" + String.valueOf(arr[0]);
            for (int k = 1; k < arr.length; k++) {
                in = in + ", " + String.valueOf(arr[k]);
            }
            in = in + "}";

            //Implementation of the getEvenDigits(array) algorithm
            int size = 0;

            //Counting even numbers
            for (int n = 0; n < arr.length; n++) {
                if((arr[n] % 2) == 0){
                    size++;
                }
            }

            //Creating new array for even digits
            int[] even = new int[size];

            if(size > 0) {
                //Filling even digits array
                for (int n = 0, pos = 0; n < arr.length; n++) {
                    if ((arr[n] % 2) == 0) {
                        even[pos++] = arr[n];
                    }
                }
            }

            String out = "";//String to write output array elements

            if(size > 0) {
                //Building string of output array elements
                out = "{" + String.valueOf(even[0]);
                for (int k = 1; k < even.length; k++) {
                    out = out + ", " + String.valueOf(even[k]);
                }
                out = out + "}";
            }

            //Typing out the result of analysis
            if(size == 0) {
                System.out.println("getEvenDigits(array): There are no even digits within the given array " + in);
            } else {
                System.out.println("getEvenDigits(array): The even digits from the given array " + in + " are as follows: " + out);
            }
        }/* END OF getEvenDigits(array) DEBUGGING SECTION */


        {/* SECTION FOR DEBUGGING calcFactorial() METHOD ALGORITHM */

            //Input parameters
            int n = 10; //для числа 5 метод должен вернуть 120. Факториал 0 равен 1

            //Implementation of the calcFactorial() algorithm
            long factor = 1;

            //Counting factorial of n
            if(n > 0) {
                for (int i = 1; i < n; ){
                    factor = factor * ++i;
                }
            }

            //Building the string to write factorial of n
            String s = "";

            if(n < 2) {
                s = "";
            } else {
                s = "1";
                for(int i = 2; i <= n; i++) {
                    if ((i == 4) && (n > 6)) {
                        s = s + "*...";
                    } else if ((i < 4) || (i > (n - 2))) {
                        s = s + "*" + i;
                    }
                }
                s = s + " = ";
            }

            //Typing out the result of analysis
            System.out.println("calcFactorial(): Factorial of " + n + " is " + n + "! = " + s + factor);

        }/* END OF calcFactorial() DEBUGGING SECTION */


        {/* SECTION FOR DEBUGGING calcFibonacci() METHOD ALGORITHM */

            //Input parameters
            int n = 10; //Fibonacci(n = 0, 1, 2, ...) = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ... ; F(0) = 0, F(9) = 34.

            //Implementation of the calcFibonacci() algorithm
            long fibonacci = 0;
            long preElement1 = 1;
            long preElement2 = 0;

            //Counting n-th element of the Fibonacci sequence
            if(n > 0) {
                for (int i = 1; i <= n; i++){
                    fibonacci = preElement1 + preElement2;
                    preElement1 = preElement2;
                    preElement2 = fibonacci;
                }
            }

            //Typing out the result of analysis
            System.out.println("calcFibonacci(): Element at the position " + n + " in Fibonacci sequence is " + "F(" + n + ") = " + fibonacci);

        }/* END OF calcFibonacci() DEBUGGING SECTION */


        {/* SECTION FOR DEBUGGING isPrimary() METHOD ALGORITHM */

            //Input parameters
            int i = 4; //Например для числа 22 вернется false, а для числа 23 true.

            //Implementation of the isPrimary() algorithm
            boolean isPrime = true;

            if(i < 2){
                isPrime = false;
            } else {
                for (int n = 2; n < i; n++) {
                    if((i % n) == 0 ){
                        isPrime = false;
                    }
                }
            }

            //Typing out the result of analysis
            String negative = isPrime ? "" : " not";
            System.out.println("isPrimary(): " + i + " is" + negative + " a prime number");

        }/* END OF isPrimary() DEBUGGING SECTION */


        {/* SECTION FOR DEBUGGING reverseArray(array) METHOD ALGORITHM */

            //Input parameters
            int[] arr = {-1, -3, 25, 100}; //{-1, -3, 4, 8, 5, 22, -5};

            //Building string of input array elements
            String in = "{" + String.valueOf(arr[0]);
            for (int k = 1; k < arr.length; k++) {
                in = in + ", " + String.valueOf(arr[k]);
            }
            in = in + "}";

            //Implementation of the reverseArray(array) algorithm
            int temp;
            int length = arr.length;

            for (int n = 0; n < (length - n); n++) {
                temp = arr[n];
                arr[n] = arr[length - n - 1];
                arr[length - n - 1] = temp;
            }

            //Building string of output array elements
            String out = "{" + String.valueOf(arr[0]);
            for (int k = 1; k < length; k++) {
                out = out + ", " + String.valueOf(arr[k]);
            }
            out = out + "}";

            //Typing out the result of analysis
            System.out.println("reverseArray(array): The array " + out + " is reverse to the given one: " + in);

        }/* END OF reverseArray(array) DEBUGGING SECTION */
    }
}
