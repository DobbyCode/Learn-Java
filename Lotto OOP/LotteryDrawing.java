
//Simulation of drawing

import java.util.ArrayList;
import java.util.Random;

public abstract class LotteryDrawing {
    
    
    public static void lotteryDraw(Lottery5 lottery5) {

        int randomNumber;
        int[] lotteryNumber = new int[5];
        ArrayList <Integer> numberField = new ArrayList<>();

        //Fill the lottery numberField ArrayList
        for (int i = 1; i <= lottery5.getSelectableNumbers(); i++) {
            numberField.add(i);
        }
    
        //Simulation of drawing a number
        for (int i = 0; i <= (lottery5.getNumberOfSelectableNumbers() - 1); i++) {
        Random random = new Random();
        randomNumber = random.nextInt(numberField.size());
        lotteryNumber[i] = numberField.get(randomNumber);
        numberField.remove(randomNumber);  //Removing the drawn number from the numberField
        }
        Lottery5.printLottery5(lotteryNumber);
    }
}