package com.antaladrien;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter width of the wall:");
        double num1 = myObj.nextDouble();
        System.out.println("Enter height of the wall:");
        double num2 = myObj.nextDouble();
        System.out.println("The area of the wall: ");
        System.out.println(num1 * num2);
        System.out.println("Enter area that can be covered with one bucket of paint:");
        double num3 = myObj.nextDouble();
        System.out.println("Enter extra bucket at home:");
        int num4 = myObj.nextInt();

        System.out.println("The number of buckets that you need to buy before going to work:");
        System.out.println(getBucketCount(num1, num2, num3, num4) + " buckets");

    }

    public static int getBucketCount(double width, double height,
                                     double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 ||
                extraBuckets < 0) {
            System.out.println("Invalid value");
            return -1;
        }
        double area = width * height;
        double count =  (area - (areaPerBucket * extraBuckets)) /
                areaPerBucket;
        return (int)(Math.ceil(count));
    }
}

