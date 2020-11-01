package com.css.linearsearch;

public class LinearSearch {
	
	   
		public static int linearSearch(int[] arr, int key){    
		        for(int t=0;t<arr.length;t++){    
		            if(arr[t] == key){    
		                return t;    
		            }    
		        }    
		        return -1;    
		    }    
		    public static void main(String a[]){    
		        int[] array1= {10,20,30,50,70,90};    
		        int key = 50;    
		        System.out.println(key+" is found at index: "+linearSearch(array1, key));    
		    }    
		
}
