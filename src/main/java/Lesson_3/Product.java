package Lesson_3;

import java.util.Date;

public class Product {
    private String name;
    private String prodactionDate;
    private String manufacture;
    private String country;
    private int price;
    private String status;


    Product(String name, String prodactionDate, String manufacture, String country, int price, String status) {
        this.name = name;
        this.prodactionDate = prodactionDate;
        this.manufacture = manufacture;
        this.country = country;
        this.price = price;
        this.status = status;
    }

    void getInfo (){
        System.out.println("Наименование продукта: " + name + "; "+ "Дата производства: " + prodactionDate +";");
        System.out.println("Производитель: " + manufacture+"; " + "Страна производства: " + country+"; "+"Цена: " + price +";");
        System.out.println("Статус бронирования: " + status);
        System.out.println();
    }

}






