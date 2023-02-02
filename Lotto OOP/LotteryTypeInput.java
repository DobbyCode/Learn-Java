import java.util.Scanner;

public abstract class LotteryTypeInput {

    public static void ChooseTypeOfLottery() {

        int lotteryType;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Please choose type of lottery!");
            lotteryType = scanner.nextInt() ;
        } while(lotteryType != 5);

        switch (lotteryType) {
            case 5:
                Lottery5 lottery5 = new Lottery5();
                LotteryDrawing.lotteryDraw(lottery5);
            case 6:
                break;    
            case 7:
                break;
        }
        scanner.close();
    }

}