import java.util.*;
class Hackathon2 
 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" EnterEnergy");
        double energy = sc.nextDouble();
        if(energy >= 10){
            System.out.println("good energy is generated");
        }else{
            System.out.println("low energy is generated");
        }
    }
 }
