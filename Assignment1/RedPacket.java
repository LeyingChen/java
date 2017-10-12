//program for redpacket

import java.util.Scanner;
import java.util.Random;

public class RedPacket{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please input the total amount of money:");
        double money = input.nextInt();

        System.out.println("Please input the amount of people:");
        int num = input.nextInt();

        int i;
        for (i=0; i<num-1; i++){
            Random random = new Random();
            double curmon = random.nextDouble();
            money -= curmon;
            System.out.printf("Money for %d is %.2f\n", i, curmon);
        }
        System.out.printf("Money for %d is %.2f\n", num, money);

        input.close();
    }
}
