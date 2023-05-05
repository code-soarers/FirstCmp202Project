import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Physics Energy Calculator");
        System.out.println("What would you like to calculate:");
        System.out.println("1. Potential Energy");
        System.out.println("2. Kinetic Energy");
        System.out.println("3. Heat Energy");
        System.out.println("4. Workdone");
        System.out.println("5. Nuclear Energy");
        System.out.println("6. ..........");

        //creating Scanner object
        Scanner input=new Scanner(System.in);

        //creating Energy object
        Energy energy=new Energy();

        System.out.println("Enter Response Here:");
        int userResponse=input.nextInt();

        if(userResponse==1){
            System.out.println("Enter Mass:");
            float mass=input.nextFloat();

            System.out.println("Enter Height:");
            float height=input.nextFloat();

            System.out.println("Potential Energy=" + energy.potentialEnergy(mass,height) + "J");

        }

        if(userResponse==2){
            System.out.println("Enter Mass:");
            float mass=input.nextFloat();

            System.out.println("Enter Velocity:");
            float velocity=input.nextFloat();

            System.out.println("Kinetic Energy=" + energy.kineticEnergy(mass,velocity) + "J");

        }

        if(userResponse==3){
            System.out.println("Enter Mass:");
            float mass=input.nextFloat();

            System.out.println("Enter Initial Temperature(Please make sure initial Temperature is lower than final Temperature):");
            float initialTemp=input.nextFloat();

            System.out.println("Enter Final Temperature:");
            float finalTemp=input.nextFloat();

            System.out.println("Heat Energy=" + energy.heatEnergy(mass,initialTemp,finalTemp) + "J");

        }
        
        if (userResponse == 4) {
                System.out.println("Enter Force:");
                float force = input.nextFloat();

                System.out.println("Enter Distance:");
                float distance = input.nextFloat();

                System.out.println("Workdone =" + energy.workDone(force, distance) + "J");
            }

            if (userResponse == 5) {
                System.out.println("Enter Mass:");
                Double mass = input.nextDouble();

                System.out.println("Enter Speed of Light:");
                Double speedOfLight = input.nextDouble();

                System.out.println("Nuclear Energy=" + energy.nuclearEnergy(mass, speedOfLight) + "J");
            }

            if (userResponse == 6) {
                System.out.println("Enter Mass:");
                float mass = input.nextFloat();

                System.out.println("Enter Gravitational Field:");
                float gravitationalField = input.nextFloat();

                System.out.println("Enter Height:");
                float height = input.nextFloat();

                System.out.println(
                        "Gravitational Energy=" + energy.gravitationalEnergy(mass, gravitationalField, height) + "J");
            }

        while (true){
            System.out.println("Would you like to perform another calculator(yes or no):");
            String userResponse2=input.nextLine();
            if(Objects.equals(userResponse2, "yes")){
                System.out.println("What would you like to calculate:");
                System.out.println("1. Potential Energy");
                System.out.println("2. Kinetic Energy");
                System.out.println("3. Heat Energy");
                System.out.println("4. Workdone");
                System.out.println("5. Nuclear Energy");
                System.out.println("6. Gravitational Energy");


                System.out.println("Enter Response Here:");
                int userResponse3=input.nextInt();

                if(userResponse3==1){
                    System.out.println("Enter Mass:");
                    float mass=input.nextFloat();

                    System.out.println("Enter Height:");
                    float height=input.nextFloat();

                    System.out.println("Potential Energy=" + energy.potentialEnergy(mass,height) + "J");

                }

                if(userResponse3==2){
                    System.out.println("Enter Mass:");
                    float mass=input.nextFloat();

                    System.out.println("Enter Velocity:");
                    float velocity=input.nextFloat();

                    System.out.println("Kinetic Energy=" + energy.kineticEnergy(mass,velocity) + "J");

                }

                if(userResponse3==3){
                    System.out.println("Enter Mass:");
                    float mass=input.nextFloat();

                    System.out.println("Enter Initial Temperature(Please make sure initial Temperature is lower than final Temperature):");
                    float initialTemp=input.nextFloat();

                    System.out.println("Enter Final Temperature:");
                    float finalTemp=input.nextFloat();

                    System.out.println("Heat Energy=" + energy.heatEnergy(mass,initialTemp,finalTemp) + "J");

                }
                
                if (userResponse == 4) {
                        System.out.println("Enter Force:");
                        float force = input.nextFloat();

                        System.out.println("Enter Distance:");
                        float distance = input.nextFloat();

                        System.out.println("Workdone =" + energy.workDone(force, distance) + "J");
                    }

                    if (userResponse == 5) {
                        System.out.println("Enter Mass:");
                        Double mass = input.nextDouble();

                        System.out.println("Enter Speed of Light:");
                        Double speedOfLight = input.nextDouble();

                        System.out.println("Nuclear Energy=" + energy.nuclearEnergy(mass, speedOfLight) + "J");
                    }

                    if (userResponse == 6) {
                        System.out.println("Enter Mass:");
                        float mass = input.nextFloat();

                        System.out.println("Enter Gravitational Field:);
                        float gravitationalField = input.nextFloat();

                        System.out.println("Enter Height:");
                        float height = input.nextFloat();

                        System.out.println("Gravitational Energy=" + energy.gravitationalEnergy(mass, gravitationalField, height) + "J");
                    }
            }

            else if(Objects.equals(userResponse2, "no")){
                System.out.println("Thank you for making use our calculator.");
                break;
            }
        }



    }
}
