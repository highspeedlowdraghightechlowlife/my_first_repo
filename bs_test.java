package aaa;

public class bs_test{

     public static void main(String []args){
        System.out.println("Hello, World!");
        int n = 10;
        int[] myNum = {80, 20, 30, 40, 1, 100, 70, 10, 30, 12}; 
        
        for (int i = 0; i < n-1; i++)
        {
            for (int j = 0; j < n-i-1; j++)
            {
                if (myNum[j] > myNum[j+1])
                {
                	int temp = myNum[j + 1];
                	myNum[j+1] = myNum[j];
                	myNum[j] = temp;
                }
            }
        }
        
        for (int i = 0; i < myNum.length; i++)
        {
        	System.out.println(myNum[i]);
        }
        
         
         
     }
}