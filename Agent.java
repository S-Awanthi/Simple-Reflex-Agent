
import java.util.Scanner;

public class Agent {
    public static void main(String[] args) {
          
          String location;    
          String status;
                    
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the location (A/B) : ");
          location = sc.nextLine();
          
          System.out.println("Enter the status (dirty/clean): ");
          status = sc.nextLine();
          
          Agent ag = new Agent();
          ag.ReflexVacuumAgent(location, status);
         
        }
    
    public void ReflexVacuumAgent(String location,String status){
    
        if(status.equals("dirty") && location.equals("A")){
            System.out.println("");
            System.out.println("Do Suck");
        }
        
        else if(status.equals("dirty") && location.equals("B")){
            System.out.println("");
            System.out.println("Do Suck");          
        }
        
        else if(status.equals("clean") && location.equals("A")){
            System.out.println("");
            System.out.println("Move Right");
        }
        
        else if(status.equals("clean") && location.equals("B")){
            System.out.println("");
            System.out.println("Move Left");
        }
        
        else{
            System.out.println("");
            System.out.println("No Option");
        }               
    }  
}
