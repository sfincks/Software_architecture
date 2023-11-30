package Hw2.RewardApp.Product;

public class Gem extends ItemReward {

    @Override
    public void open() {
        System.out.println("["+ ANSI_PURPLE + "E"+ANSI_RESET+"]Gem!");
    }

}
