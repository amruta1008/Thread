package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.calculate.CalculateScores;

public class Main {
public static void main(String[] args) throws InterruptedException
{
	Scanner sc = new Scanner(System.in);
	List<CalculateScores> list = new ArrayList<CalculateScores>();
	for(int i=0;i<3;i++)
	{
		System.out.println("Enter the match");
		String matchType = sc.next();
		System.out.println("enter the score string");
		String scores = sc.next();
		CalculateScores cs = new CalculateScores(matchType, scores);
		list.add(cs);
	}
	Thread t1 = new Thread(list.get(0));
	Thread t2 = new Thread(list.get(1));
	Thread t3 = new Thread(list.get(2));
	
	System.out.println("score summry");
	t1.start();
	t1.join();
	t2.start();
	t2.join();
	t3.start();
	
}
}

