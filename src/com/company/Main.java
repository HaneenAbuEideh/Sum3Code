package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {
    public static  int sum3(List<Integer> arr,int n)
    {
        Collections.sort(arr);
        int cnt=0;
        for(int i=0;i<n-2;i++)
        {   int midp=i+1,lastp=n-1;
            while (midp<lastp){
                if(arr.get(i)+arr.get(midp)+arr.get(lastp)==0)
                { cnt++;midp++;lastp--;}
                else if(arr.get(i)+arr.get(midp)+arr.get(lastp)<0)
                    midp++;
                else
                    lastp--;}

        }
      System.out.print(cnt);
         System.out.print(cnt);
        return cnt;

    }

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
         System.out.print(sum3(arr, n));
        // Write your code here

        bufferedReader.close();
    }
}
