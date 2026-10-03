import java.util.Scanner;
 class  Hackathon3 {
static double TotalEnergy(double morningEnergy, double eveningEnergy) {
return morningEnergy + eveningEnergy;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter morning energy generated in kWh: ");
double morningEnergy = sc.nextDouble();
System.out.print("Enter evening energy generated in kWh: ");
double eveningEnergy = sc.nextDouble();
double totalEnergy = TotalEnergy(morningEnergy, eveningEnergy);
System.out.println("Total Energy Generated: " + totalEnergy + " kWh");
 sc.close();
}
}
