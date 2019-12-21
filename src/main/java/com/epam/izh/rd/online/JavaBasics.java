package com.epam.izh.rd.online;

import com.epam.izh.rd.online.service.MathService;
import com.epam.izh.rd.online.service.SimpleMathService;

public class JavaBasics {
    public static void main(String[] args) {

        {/* SECTION FOR DEBUGGING MaxFrom(array) METHOD ALGORITHM */

            //Input parameters
            int[] val = {-1, -3, 477, 8, 55, 22, -5};

            //MaxFrom(array) algorithm implementation
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

        }/* END OF MaxFrom(array) DEBUGGING SECTION */


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
