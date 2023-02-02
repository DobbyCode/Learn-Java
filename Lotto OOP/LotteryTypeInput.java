
public class LotteryTypeInput {

    private int lotteryType;


    public  void ChooseTypeOfLottery() {

    lotteryType = 5;

        if (lotteryType == 5) {
            LotteryDrawing lottery5Draw = new LotteryDrawing();
            lottery5Draw.lotteryDraw(5, 90);
        }
    }

}