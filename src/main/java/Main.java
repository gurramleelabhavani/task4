import java.util.Scanner;
public class Main {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal");
        double principal=sc.nextDouble();
        System.out.println("Enter time");
        double time=sc.nextDouble();
        System.out.println("Enter rate_of_interest");
        double rate_of_interest=sc.nextDouble();
        System.out.println("Is automated ?");
        boolean automated=sc.nextBoolean();
        System.out.println("Enter material");
        String material=sc.next();
        System.out.println("Enter area");
        double area=sc.nextDouble();

        sim_in s =new sim_in(principal,time,rate_of_interest);
        double simple_interest=s.cal();
        System.out.println("Simple Interest : "+simple_interest);

        com_in c =new com_in(principal,time,rate_of_interest);
        double compound_interest=c.calc();
        System.out.println("Compound Interest : "+compound_interest);

        construction con =new construction(automated,material,area);
        double cost=con.construct();
        System.out.println("Total Cost : "+cost);
    }
}
