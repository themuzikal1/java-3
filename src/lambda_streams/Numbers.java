//package lambda_streams;
//
//import javax.swing.*;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Stream;
//
//
//class Numbers {
//
//
//    public static void main(String[] args) {
//        List<Integer> nums = Arrays.asList(10, 100, 1000, 5, 50, 500, 3, 30, 300, 7, 70, 700, 1, 10, 100, 23, 250, 2500);
//
//        //Part I :complete the static class methods that have been set up in this Numbers class java file.  Use streams to compute the results wheever possible.
////        System.out.println(nums);
////        nums.forEach((n) -> {
////            System.out.println(n);
////        });
//
//        //Part II - refactor all of the class methods to accept lambda expressions. You can put the lambda functions directly inside the method calls,
//        // or defined them first, then pass them into the methods.
//        // give them the same names as the static methods, but add the word 'lambda' in front of every lambda function:
//        /* e.g.
//
//        added(() -> {});
//
//        OR
//
//        lambdaAdd = () -> {};
//        added(lambdaAdd);
//
//        isOdd(() -> {});
//
//        OR
//
//        lambdaOdd = () -> {};
//        isOdd(lambdaOdd);
//        etc...
//
//        */
//
//        static boolean lambdaOdd(int i){
//            //determine if the value at the index i is odd.  return true if yes, return false if  no.
//          nums.stream()
//                  .filter(e -> e % 2 != 0);
//
//
//        }
//        return false;
//
//
//
//    static boolean isEven(int i) {
//        //determine if the value at the index i is even.  return true if yes, return false if  no.
//            nums.stream()
//                    .filter(e -> e % 2 == 0);
//    }
//        return false;
//
//
//        static boolean isPrime ( int i){
//            //determine if the value at the index i is a prime number.  return true if yes, return false if no.
//            nums.stream()
//                    .filter(i -> 1 %2 != 0)
//            return false;
//        }
//
//        static int added () {
//            //add all the elements in the list.  return the sum.
//        Integer sum = nums.stream()
//                .reduce(0, Integer::sum);
//            return 0;
//        }
//
//        static int subtracted () {
//            //subtract all the elements in the list. return the remainder.
//        for(i=0; i<nums.size(); i++) {
//            if(i < nums.size() -1)
//                System.out.println(nums[i+1] - nums[i]);
//        }
//            return 0;
//        }
//
//        static int multipled () {
//            //multiply all the elements in the list. and return the product.
//        int mult=1;
//        for(int i = 0; i<nums.size(); i++)
//            mult = mult * nums[i];
//            return 0;
//        }
//
//        static int divided () {
//            //multiply all the elements in the list. and return the product.
//            int div=1;
//            for(int i = 0; i<nums.size(); i++)
//                div = div / nums[i];
//            return 0;
//        }
//
//        static int findMax () {
//            //return the maximum value in the list.
//        int max = nums[0];
//            for(int i = 0; i<nums.size(); i++)
//                if(nums[i] > max)
//                    max = nums[i];
//            return 0;
//        }
//
//        static int findMin () {
//            //return the minimum value in the list.
//            int min = nums[0];
//            for(int i = 0; i<nums.size(); i++)
//                if(nums[i] < min)
//                    min = nums[i];
//            return 0;
//        }
//
//        static int compare ( int i, int j){
//            //compare the values stored in the array at index position i and j.
//            //if the value at i is greater, return 1.  if the value at j is greater, return -1.  if the two values are equal, return 0.
//            for(int i=0; i <nums.size(); i++) {
//                for(int j = 0; j<nums.size(); j++) {
//                    if(nums[i] != nums[j+1]) {
//                        System.out.println("-1");
//                    }
//                }
//            }
//            return 0;
//        }
//
//        static int append ( int n){
//            //add a new value to the values list. return that value after adding it to the list.
//            nums.add(7500);
//            return 0;
//        }
//    }
//


