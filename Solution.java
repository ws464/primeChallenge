import java.util.Scanner;
public class Solution{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter an integer:");
        int num = myObj.nextInt();
        System.out.println(isPrime(num));
        myObj.close();
    }
    private static boolean isPrime(int num){
        if(num < 0){
            throw new IllegalArgumentException("Negative Number!");
        }
        int [] table = new int[num+1];
        int smallest = 2;
        while(true){
            for(int n = smallest; n<=num; n+=smallest){
                if(n == num){
                    return false;
                }
                table[n] = 1;
            }
            for(int i = smallest; i<=num; i++){
                if(table[i]==0){
                    if(i == num){
                        return true;
                    }
                    else{
                        smallest = i;
                        break;
                    }
                    
                }
            }
        }
    }
}