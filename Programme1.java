package Practicetest;

import java.util.Scanner;


public class Programme1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i,temp1=0,temp2=0,temp3=0;
    Scanner input = new Scanner(System.in);
    System.out.println("enter the number of elements you want to store :  ");
    int n= input.nextInt();
    int age[]= new int[n];
    System.out.println("enter the elements accordingly");
    for(i=0;i<n;i++)
    {
    	age[i]=input.nextInt();
    }
    for(i=0;i<n;i++)
    {
    	if(age[i]<18)
    	{
    		temp1++;
    	}
    	else if(age[i]>=18 && age[i]<=54)
    	{
    		temp2++;
    	}
    	else
    	{
    		temp3++;
    	}
    	
    }
    
    System.out.println("children :" +temp1  + "\n" + "adult : "+temp2+"\n"+ "senior citizen : "+temp3);
    input.close();
    
    	}
    
 }


