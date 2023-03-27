import java.util.*;
class CPU{
    double price;
    CPU(double price){
        this.price=price;
        System.out.println("CPU Price: "+this.price+" INR");
        Processor i=new Processor(8,12,"Intel");
        i.displayProcessorDetail();
        Ram ddr=new Ram(16,4800,"Crucial");
        ddr.displayRAMDetails();
    }
    class Processor{
        double cores,cache;
        String manufacture;
        Processor(double cores,double cache,String manufacture){
            this.cores=cores;
            this.cache=cache;
            this.manufacture=manufacture;
        }
        double getCache(){
            return this.cache;
        }
        void displayProcessorDetail(){
            System.out.println("Processor:");
            System.out.println("Number of cores: "+this.cores);
            System.out.println("Cache memory   : "+getCache()+" MB");
            System.out.println("Manufacturer   : "+this.manufacture);
        }
    }
    protected class Ram{
        double memory,clockSpeed;
        String manufacture;
        Ram(double memory,double clockSpeed,String manufacture){
            this.memory=memory;
            this.clockSpeed=clockSpeed;
            this.manufacture=manufacture;
        }
        double getClockSpeed(){
            return this.clockSpeed;
        }
        void displayRAMDetails(){
            System.out.println("RAM:");
            System.out.println("Memory         : "+this.memory+" GB");
            System.out.println("clockspeed     : "+getClockSpeed()+" MHZ");
            System.out.println("Manufacturer   : "+this.manufacture);
        }
    }
    public static void main(String[] args) {
        CPU dell=new CPU(30999.99);
    }
}
