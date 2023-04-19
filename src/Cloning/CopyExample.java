package Cloning;

import MultithreadingExample.A;

import java.util.Arrays;

public class CopyExample {

    public static void main(String[] args) {


        String[] str=new String[]{"navi","batra"};


         String[] str2=str;

         str2[1]="headofficae";

        System.out.println(Arrays.toString(str2));

        System.out.println(Arrays.toString(str));

        String[] str3=(String[]) str.clone();


        str3[1]="ekta";

        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(str3));



    }
}
