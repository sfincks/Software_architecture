package Hw2.RewardApp;

import Hw2.RewardApp.Fabric.*;

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
        generators.add(new SwordGenerator());
        generators.add(new SilverGenerator());
        generators.add(new GoodLegendaryCharacterGenerator());
        generators.add(new TrashLegendaryCharacterGenerator());

        Random random = ThreadLocalRandom.current();
        for (int i = 0; i < 20; i++) {
            int index = random.nextInt(generators.size());
            generators.get(index).openReward();
        }

    }
}
