import java.util.*;
 class Hackathon 
 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PanelID:");
        int PanelID = sc.nextInt();
        System.out.println("Enter Energy:");
        double Energy = sc.nextDouble();
        System.out.println("Enter SolarPanels:");
        int SolarPanels = sc.nextInt();
        System.out.println("Enter SystemStatus:");
        char SystemStatus = sc.next().charAt(0);
        System.out.println("PanelID:" +PanelID);
        System.out.println("Energy:" +Energy);
        System.out.println("SolarPanels:" +SolarPanels);
        System.out.println("SystemStatus:" +SystemStatus);
        sc.close();
    }
}
