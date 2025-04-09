package Lesson_3;

import java.util.Date;

public class Park {
    private static String name;
    private Attractions attractions;

    Park(String name) {
        this.name = name;
    }

    void getInfo() {
        System.out.println("Name: " + name);
    }

    class Attractions {
        private String nameAttraction;
        private String timeWork;
        private int price;

        Attractions(String nameAttraction, String timeWork, int price) {
            this.nameAttraction = nameAttraction;
            this.timeWork = timeWork;
            this.price = price;
        }

        void getInfo() {
            System.out.println("Name Attraction: " + nameAttraction+";");
            System.out.println("Time Work: "+ timeWork+", "+ "Price: "+price+";");
            System.out.println("Park: "+Park.name);
            System.out.println();
        }


    }

}

