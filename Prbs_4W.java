package Four_W_Tech;

import java.util.Scanner;

public class Prbs_4W {
Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		Prbs_4W obj = new Prbs_4W();
//		obj.Palindrome();
//		obj.Binary_find();
//		obj.Swap_Array();
		obj.Add_Zero();
//		obj.Get_Distinct();
//		obj.Merge_Sort();
//		obj.String_Conains();
//		obj.Swap();
	}

	private void String_Conains() {
		String s="213497900568e";
		boolean check=true;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)<48 || s.charAt(i)>57)
				check=false;
		}
		if(check==true)
			System.out.println("True");
		else 
			System.out.println("False");
	}

	private void Merge_Sort() {
		int ls1[]= {1,3,3,5};
		int ls2[]= {2,4,6,6};
		int ls[]=new int[ls1.length+ls2.length];
		
		for(int i=0;i<ls.length;i++) {
			if(i<ls1.length)
				ls[i]=ls1[i];
			else
				ls[i]=ls2[i-ls1.length];
		}
		for(int i:ls)
			System.out.println(i);

		
	}

	private void Get_Distinct() {
       int ls1[]= {2,2,3,4,13,5,7};
       int freq[]=new int[ls1.length];
       
       for(int i=0;i<ls1.length;i++) {
    	 boolean check=true; 
    	 
    	 for(int i1=i-1;i1>=0;i1--) {
    		 if(ls1[i1]==ls1[i])
    			 check=false;
    	 }
    	 
    	   int count=1;
    	  if(check==true) {
    	   for(int j=i+1;j<ls1.length;j++) {
    		   if(ls1[i]==ls1[j])
    			   count++;
    	   }
    	   freq[i]=count;
    	  }
       }
       
       for(int i=0;i<freq.length;i++)
    	   if(freq[i]==1)
    		   System.out.print(ls1[i]+" ");
       
       
	}

	private void Add_Zero() {
//     int ls1[]= {1,2,3,4,5};
//     int ls2[]=new int[ls1.length*2];
	 String s0="12345";
     int j=0;
     String s="";
     for(int i=0;i<s0.length()*2;i++) {
    	 if(i%2==0)
    		 s+=s0.charAt(j++);
    		// ls2[i]=ls1[j++];
    	 else
    		 s+="0";
    		// ls2[i]=0;
     }
//     for(int i:ls2)
//    	 System.out.print(i+" ");
     System.out.println(s);
	}

	private void Swap_Array() {
     int ls1[]= {1,2,5};
     int ls2[]= {3,6,7};
     
     for(int i=0;i<ls1.length;i++) {
    	 int temp=ls1[i];
    	 ls1[i]=ls2[i];
    	 ls2[i]=temp;
     }
     
     System.out.print("List 1 :");
     for(int i:ls1)
    	 System.out.print(i+" ");
     System.out.println();
     System.out.print("List 2 :");
     for(int i:ls2)
    	 System.out.print(i+" ");
     
	}

	private void Binary_find() {
		System.out.print("Enter a code : ");
		int num=sc.nextInt();
		//num=10120;
		boolean check = true;
		int value =0;
		while(num>0) {
			value = num%10;
			num/=10;
			if(value>1)
				check=false;
		}
		if(check==true)
			System.out.println("Its binary Code");
		else 
			System.out.println("Its not a Binary Code");
	}

	private void Palindrome() {
//		System.out.print("Enter a String : ");
//		String s0=sc.nextLine();
//		//s0="ABCBA";
//		String s1="";
//		for(int i=s0.length()-1;i>=0;i--)
//			s1+=s0.charAt(i);
//		
//		if(s0.equals(s1))
//			System.out.println("Its palindrome");
//		else
//			System.out.println("Its not palindrome");
		
		String p="RADAR";
		   String p1="";
		   
		     for(int i=p.length()-1 ; i>=0 ; i--)
		     {
		       p1+=p.charAt(i);
		     }
		     
		     if(p.equals(p1))
		     {
		      System.out.println("It is a palindrome");
		     }
	}
	
	private void Swap()
	{
		int num = 1010;
	    Boolean flag = true;
	    int sum=0;
	     while(num>0)
	     {
	      sum=num%10;
	      num=num/10;
	      
	      if(sum>1)
	    	  flag=false;
	     }
	     if(flag==true)
	      System.out.println("Machine code");
	     else 
	      System.out.println("Not a Machine code");
		
		
		
		
//		String s = "010205601";
//	    Boolean flag = true;
//
//	    for(int i=0 ; i<s.length() ; i++)
//	    {
//	     if(s.charAt(i)>48)
//	       flag=false;
//	    }
//
//	    if(flag==true)
//	       System.out.println("Machine code");
//	    else
//	       System.out.println("Not a Machine code");
		
		
		
//		String s="2345fhzrt56";
//	    Boolean flag = true ;
//
//	    for(int i=0 ; i<s.length() ; i++)
//	    {  
//	     if(s.charAt(i)<47 || s.charAt(i)>58)
//	     {
//		   flag=false;
//	     }
//	     
//	    }
//	    
//	    if(flag==true)
//	       System.out.println("It contains only numbers");
//	    else
//	       System.out.println("It does not contains numbers only");
		
		
//		int a[]={1,2,3,4};
//	    int b[]={5,6,7,8};
//	    int temp =0;
//	    for(int i=0 ; i<a.length ; i++)
//	    {
//	      temp=a[i];
//	      a[i]=b[i];
//	      b[i]=temp;
//	    }
//	    
//	   for(int i=0 ; i<a.length ; i++) {
//	    System.out.println(a[i]);
//	    
//	   }
//	   for(int i=0 ; i<a.length ; i++) {
//		    System.out.println(b[i]);
//		    
//		   }
	   
	   
	   
//		int a[]= {1,2,3,4,5};
//		int temp=0;
//		temp=a[0];
//		a[0]=a[a.length-1];
//		a[a.length-1]=temp;
//		
//		for(int s: a)
//			System.out.println(s);
	}

}
