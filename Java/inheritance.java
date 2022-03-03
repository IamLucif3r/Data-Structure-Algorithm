import java.util.*;

class Product{
    int pid;
    String name;
    int price;

    Product(){
        System.out.println(">> Product Object Constructed");
        
    }
    void setProductDetails(int pid, String name, int price){
        this.pid = pid;
        this.name = name;
        this.price = price;
    }
    void showProductDetails(){
        System.out.println("----- Product ID: "+pid);
        System.out.println("> Product Name:\t"+name);
        System.out.println("> Product Price:\t"+price);

    }
}

class main{
    public static void main(String args[])
    {
        Product p = new Product();
        // Product is reference variable which holds the hashCode of the object in Hexadecimal Notation
        System.out.println("Product is:"+p);
        p.setProductDetails(101, "iPhoneX", 70000);
        p.setProductDetails(102, "OnePlus", 23213);
        p.showProductDetails();
    }    
}