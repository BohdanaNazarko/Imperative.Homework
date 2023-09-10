public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 2");
        int f = 5, g = 4;
        if (f == g) {
            System.out.println(f * g);
        } else {
            System.out.println(f + g);
        }

//Homework 3
        System.out.println("Homework 3");
        int W = 10, e = 998;
        while (W <= 37) {
            System.out.println(W);
            W += 3;
        }

        for (int H = 10; H <= 37; H = H + 3) {
            System.out.println(H);
        } //two options


        while (e > 900) {
            System.out.println(e);
            e -= 2;
        }

        int h = 0, k = 20;
        while (k > h) {
            System.out.println("1" + "," + "-1");
            h++;
            //other way how that can work
        }
        System.out.println("Homework 4");
        //Homework 4

        int T = 6;
        String action;
        if (T < 17) {
            action = "hit";
        } else if (T <= 21) {
            action = "stay";
        } else {
            action = "busy";
        }
        System.out.println(action);

        System.out.println("Homework 5");
        //Homework 5

        int F = 3, B = 5;
        if (F >= 100 && B <= 50) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        if (F >= 100 && B >= 100) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        System.out.println("Homework 6");
//Homework 6

        int price = 0;
        int w = 4;
        if (w <= 2)
            price = price;
        else if (w < 2 || w <= 5)
            price = (w - 2) * 2 + 2;
        else
            price = (w - 5) * 3 + 5;
        System.out.println(price);

        System.out.println("Homework 7");
//Homework 7

        int n = 55;
        boolean div = false;
        while ((n * n * n + 91) % 47 == 0) {
            div = true;
        }
        System.out.println(div);

//Homework 8
        System.out.println("Homework 8");
        int a = 6, b = -2;
        int out1 = 0;
        if (!(a < 0))
            out1 = (3) * a;
        int out2 = (b) * out1;
        System.out.println(out1);
        System.out.println(out2);

//Homework 9
        System.out.println("Homework 9");


    }
}