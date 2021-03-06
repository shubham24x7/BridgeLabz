package com.mindtree.jira.arrayofojects;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
	String name;
	int marks;
	int rollnumber;
	public static int compare(String s1,String s2)
	{
		int len=0;
		if(s1.length()>s2.length())
		{
			len=s2.length();
		}
		else {
			len=s1.length();
		}
		for (int i = 0; i < len; i++) {
			while(i<len&&s1.charAt(i)-s2.charAt(i)==0)//go inside
			{
				i++;
			}
			if(s1.length()==i&&s2.length()==i)//both are equal
				return 0;
			if(s1.length()==i||s2.length()==i) {
				if(s1.length()==i) {
					return -1;//according to length return
				}
				else return 1;
			}
			return (s1.charAt(i)-s2.charAt(i));//return the value

		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of data to be entered");
		try {
			int d=sc.nextInt();
			Student data[]=new Student[d];
			for (int i = 0; i < d; i++) {
				data[i]=new Student();
				System.out.println("enter the name for "+i+" student");
				

				data[i].name=sc.next();
				/*char ch[]=data[i].name.toCharArray();
				for(int q=0;q<ch.length;q++)
				{
					if(ch[q]>=65&&ch[q]<=90&&ch[q]>=97&&ch[q]<=122);
					throw new NumberFormatException("name should be string");
				}
				if(data[i].name=="null")
					throw new NumberFormatException("name should be string");*/
				

				System.out.println("enter the marks for "+i+" student");
				//try {
					data[i].marks=sc.nextInt();
					/*if(data[i].marks<0)
						throw new IllegalArgumentException();
				}
				catch(IllegalArgumentException iae) {
					System.out.println("marks canot be negative");
				}*/


				System.out.println("enter the roll number for "+i+" student");
				data[i].rollnumber=sc.nextInt();
			}


			System.out.println("a.sort by marks: ");
			System.out.println("b.sort by roll number");
			System.out.println("c.sort by name");
			char ch=sc.next().charAt(0);

			switch (ch) {
			case 'a':
				for (int i = 0; i < data.length; i++) {
					for (int j = 0; j < data.length-i-1; j++) {
						if(data[j].marks>data[j+1].marks)
						{
							Student temp=data[j+1];
							data[j+1]=data[j];
							data[j]=temp;
						}

					}
				}
				System.out.println("sorted by marks");
				for (int i = 0; i < data.length; i++) {
					System.out.println(data[i].name+" "+data[i].rollnumber+" "+data[i].marks);
					System.out.println();
				}
				break;
			case 'b':
				for (int i = 0; i < data.length; i++) {
					for (int j = 0; j < data.length-i-1; j++) {
						if(data[j].rollnumber>data[j+1].rollnumber)
						{
							Student temp=data[j+1];
							data[j+1]=data[j];
							data[j]=temp;
						}

					}
				}
				System.out.println("sorted by rollnumber");
				for (int i = 0; i < data.length; i++) {
					System.out.println(data[i].name+" "+data[i].rollnumber+" "+data[i].marks);
					System.out.println();
				}
				break;
			case'c':
				for (int i = 0; i < data.length; i++) {
					for (int j = 0; j < data.length-i-1; j++)
						if(compare(data[j].name,data[j+1].name)>0)
						{
							Student temp=data[j];
							data[j]=data[j+1];
							data[j+1]=temp;
						}
				}
				System.out.println("sorted by name");
				for (int i = 0; i < data.length; i++) {
					System.out.println(data[i].name+" "+data[i].rollnumber+" "+data[i].marks);
					System.out.println();
				}
				break;
			default :System.out.println("invalid option");
			break;

			}
		}catch(InputMismatchException ime) {
			System.out.println("please enter a valid integer input");
		}
		catch(StringIndexOutOfBoundsException sie) {
			System.out.println("enter the size of string properly");
		}
		catch(NullPointerException npe)
		{
			System.out.println("please enter some value");
		}
		catch(NegativeArraySizeException nas)
		{
			System.out.println("enter a positive value");
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("plese enter a valid name");
		}
		finally {
			System.out.println("finally always executes");
		}
	}
}
