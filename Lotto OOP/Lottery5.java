
//5 numbers drawn out of 90

public class Lottery5 {

    private int selectableNumbers = 90;
    private int numberOfSelectableNumbers = 5;

    public int getSelectableNumbers() {
        return selectableNumbers;
    }
    public int getNumberOfSelectableNumbers() {
        return numberOfSelectableNumbers;
    }


    public static void printLottery5(int[] lotteryNumber) {
        System.out.println("Your Lottery 5 numbers are:");
        for (int i = 0; i < 5; i++) {
            System.out.print(lotteryNumber[i] + " ");
        }
    }
}