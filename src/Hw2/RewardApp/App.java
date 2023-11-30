package Hw2.RewardApp;

import Hw2.RewardApp.Fabric.BowGenerator;
import Hw2.RewardApp.Fabric.GemGenerator;
import Hw2.RewardApp.Fabric.GoldGenerator;
import Hw2.RewardApp.Fabric.ItemGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class App {
    public static void main(String[] args) throws Exception {

        List<ItemGenerator> generators = new ArrayList<>();

        generators.add(new GoldGenerator());
        generators.add(new GemGenerator());
        generators.add(new BowGenerator());

        Random random = ThreadLocalRandom.current();
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(3);
            generators.get(index).openReward();
        }

    }
}
