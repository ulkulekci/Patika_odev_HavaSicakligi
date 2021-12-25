import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("sicaklik degerini girin:");
            Scanner sc = new Scanner(System.in);
            int a=sc.nextInt();

            if (a<5)
                System.out.println("hava kayak yapmak icin cok uygun:");
            if(5 <=a&&a<15)
                System.out.println("bugun sinama icin cok uygun:");
            if(15 <=a&&a<25)
                System.out.println("hava piknik yapmak icin cok uygun:");
            if(25<a)
                System.out.println("hava  yuzmek icin cok uygun:");





    }
}
