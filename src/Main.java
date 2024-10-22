import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1;
        while(i<=100){
        System.out.println("Please Enter your website");
        String website = sc.nextLine();

            if (website.endsWith(".org")) {
                System.out.println("This is Organizations website");

            } else if (website.endsWith(".com")) {
                System.out.println("This is Commercial website");

            } else if (website.endsWith(".net")) {
                System.out.println("This is Network website");

            } else if (website.endsWith(".in")) {
                System.out.println("This is Indian Website");

            } else if (website.endsWith(".gov")) {
                System.out.println("This is Government website");

            } else if (website.endsWith(".edu")) {
                System.out.println("This is Education website");

            } else if (website.endsWith(".mil")) {
                System.out.println("This is Department of Defence website");

            } else {
                System.out.println("please Enter Valid websites");

            }
i++;
        }
    }
}