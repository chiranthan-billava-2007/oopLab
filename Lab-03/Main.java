// import java.util.Scanner;


abstract class EnergySource{
   int sourceId;
   String sourceName;
   double energyGenerated;
   
   EnergySource( int sourceId, String sourceName, double energyGenerated ){
      this.sourceId = sourceId;
      this.sourceName = sourceName;
      this.energyGenerated = energyGenerated;
   
   }
   
   abstract double energyEfficiency();
   
   void displayDetails(){
      // System.out.println();
      System.out.println("Id: "+sourceId);
      System.out.println("Source Name: "+ sourceName);
      System.out.println("Energy Generated: "+energyGenerated+ " KWH");
      System.out.println("Energy Efficiency: "+energyEfficiency()+"%");
   
   }


   
}

class SolarEnergy extends EnergySource{
   SolarEnergy(int sourceId, String sourceName, double energyGenerated){
      super(sourceId, sourceName, energyGenerated);
   }
   @Override
   double energyEfficiency(){
      return (energyGenerated/5000)*100;
   
   }
}


class WindEnergy extends EnergySource{
   WindEnergy(int sourceId, String sourceName, double energyGenerated){
      super(sourceId, sourceName, energyGenerated);
   }
   @Override
   double energyEfficiency(){
      return (energyGenerated/8000)*100;
   
   }



}


public class Main{
   public static void main(String[] args){
      EnergySource source;
      
      source = new SolarEnergy(1, "Solar Panel", 4000);
      
      System.out.println("---Solar Energy---");
      source.displayDetails();
      
      System.out.println();
      
      source = new WindEnergy(2, "Wind Mill", 3000);
      
      System.out.println("---Wind Energy---");
      source.displayDetails();
      
   
   
   }

}