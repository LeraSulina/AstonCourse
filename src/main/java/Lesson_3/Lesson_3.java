package Lesson_3;

public class Lesson_3 {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung s25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, "true");
        productsArray[1] = new Product("Samsung Galaxy A56", "01.01.2025", "Samsung Corp.", "Korea", 48990, "true");
        productsArray[2] = new Product("Samsung Galaxy A16", "01.01.2024", "Samsung Corp.", "Korea", 21999, "true");
        productsArray[3] = new Product("Samsung Galaxy S24", "01.01.2024", "Samsung Corp.", "Korea", 69999, "true");
        productsArray[4] = new Product("Samsung Galaxy A06", "01.02.2024", "Samsung Corp.", "Korea", 11999, "true");
        productsArray[4].getInfo();


        Park.Attractions attractions1 = new Park("Gorkiy").new Attractions("Koleso", "11:00", 150);
        Park.Attractions attractions2 = new Park("Gorkiy").new Attractions("Karusel", "12:00", 150);
        Park.Attractions attractions3 = new Park("Kiskuy").new Attractions("Gorki", "13:00", 150);
        attractions3.getInfo();
    }
}

