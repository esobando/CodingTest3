package com.example.admin.codingtest3;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity
{
    public static void main(String[]args)
    {
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        arraylist.add(2);
        arraylist.add(8);
        arraylist.add(9);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.add(3);
        arraylist.add(2);
        arraylist.add(6);
        arraylist.add(6);
        arraylist.add(2);
        arraylist.add(4);
        arraylist.add(9);
        arraylist.add(8);


	   /*Unsorted List: ArrayList content before sorting*/
        System.out.println("Before Sorting:" + arraylist);
        Collections.sort(arraylist);
        System.out.println("ArrayList in Ascending order:" + arraylist);



        String str= new String("Overwatch");
        System.out.println(str.substring(0));
        System.out.println(str.substring(0, 4));
        System.out.println(str.substring(2, 5));
        System.out.println(str.substring(3, 7));
        System.out.println(str.substring(4, 9));


    }
    }

