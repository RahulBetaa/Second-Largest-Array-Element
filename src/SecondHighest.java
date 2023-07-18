import java.util.Scanner;

public class SecondHighest {
	  
		public static int[] SecLargest(int[] a){  
		int temp;  
		for (int i = 0; i < a.length; i++) {  
		            for (int j = i + 1; j < a.length; j++){  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
			
		/*
		 * for(int i = 0 ; i<a.length;i++) { System.out.println(a[i]+" "); }
		 */
		       return a;  
		}  
		public static void main(String args[]){ 
			Scanner s = new Scanner(System.in);
			int a[]=new int[5];
			System.out.println("Welcome to java program");
			System.out.println("Enter the array element");
			
			for(int i = 0; i < a.length; i++) {
				a[i]=s.nextInt();
			}
		
			int arr[]=SecondHighest.SecLargest(a);
			
			System.out.println("Second largest Element is "+arr[arr.length-2]);
		
		 
		}
}  

