package Basics;

public class Home {

    int sum (int x, int y){

        int z = x + y;
        System.out.println("Sum Method: " + z);

        return z;

    }

    void sent(){

        int e = sum(12,13);
        int bonus = sum(23,34)+ 10;

        System.out.println("Sent Method: " + e);
        System.out.println("Bonus: " + bonus);
    }

    public static void main(String[] args) {

        Home h = new Home();
        h.sent();

    }


}
