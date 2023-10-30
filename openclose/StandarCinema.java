package openclose;

public class StandarCinema extends Cinema{
    public StandarCinema(double price){
        this.price = price;
        }
        @Override
        Double calculateAdminFee(){ 
            return this.price * 10/100;
        }
        
}
