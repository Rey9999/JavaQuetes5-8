public abstract class Vehicle {

   private String Brand;
   private int kilometers;

   public Vehicle(String Brand, int kilometers){
       this.Brand = Brand;
       this.kilometers = kilometers;
   }

   public String getBrand(){
       return this.Brand;
   }
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public int getKilometers(){
       return this.kilometers;
   }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public String doStuff(){

        return null;
    };
}


