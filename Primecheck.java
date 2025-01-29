import java.util.Scanner;

public class Primecheck{
    public static boolean isPrime(int number){
        if(number<=1){
            return false;
        }
        for(int i=2;i<number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        Scanner src=new Scanner(System.in);{
        System.out.println("Enter a number: ");
        int num=src.nextInt();
        boolean result=isPrime(num);
        if(result){
            System.out.println(num+"is a Prime number:");
        }else{
            System.out.println(num+"is not a Prime number:");
        }
        src.close();
      }
    }
}
