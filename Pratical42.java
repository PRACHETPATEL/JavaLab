import java.util.*;
interface Property{
     public int computePrice();
}
class Bungalow implements Property{
    String name;
    int constructionArea,landArea;
    Bungalow(){
        Scanner in=new Scanner(System.in);
        System.out.println("Bungalow:");
        System.out.print("Enter construction area(in feet^2):");
        this.constructionArea=in.nextInt();
        System.out.print("Enter land area(in feet^2):");
        this.landArea=in.nextInt();
    }
    public int computePrice() {
        int price = 0;
        System.out.println("Construction Cost:"+(500*constructionArea)+" INR");
        System.out.println("Additional Cost  :"+(200*landArea)+" INR");
        System.out.println("Land Cost        :"+(400*(landArea+constructionArea))+" INR");
        price=(500*constructionArea)+(200*landArea)+(400*(landArea+constructionArea));
        return price;
    }
}
class Flat implements Property{
    String name;
    int constructionArea,additionalcost=2000000;
    Flat(){
        Scanner in=new Scanner(System.in);
        System.out.println("Flat:");
        System.out.print("Enter construction area(in feet^2):");
        this.constructionArea=in.nextInt();
    }
    public int computePrice(){
        int price = 0;
        System.out.println("Construction Cost: "+(500*constructionArea)+" INR");
        System.out.println("Additional Cost  :"+additionalcost+" INR");
        price=(500*constructionArea)+additionalcost;
        return price;
    }
}

public class Pratical42 {
    public static void main(String[] args) {
        Bungalow b=new Bungalow();
        System.out.println("Total computed Price: "+b.computePrice()+" INR");
        Flat f=new Flat();
        System.out.println("Total computed Price: "+f.computePrice()+" INR");
    }
}
