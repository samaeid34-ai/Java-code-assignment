package day7;

public interface Product {
//    double price=10;
    String logo="logo";
    void setName(String name);
    void setColor(String color);
    void setPrice(double price);
    String getName();
    String getColor();
    double getPrice();
     default String getBarcode(){
         return "default Barcode" ;
     };
}
