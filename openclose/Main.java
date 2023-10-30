package openclose;

public class Main {
    public static void main(String[] args){
        StandarCinema standarCinema = new StandarCinema(100); 
        Double adminFee = standarCinema.calculateAdminFee(); 
        System.out.println(adminFee);
        }
        
}
