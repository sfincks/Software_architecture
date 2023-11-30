package Hw2.RewardApp;

import Hw2.RewardApp.Fabric.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class App {
    public static void main(String[] args) throws Exception {

        List<ItemGenerator> commonGenerator = new ArrayList<>();
        List<ItemGenerator> rareGenerator = new ArrayList<>();
        List<ItemGenerator> epicGenerator = new ArrayList<>();

        rareGenerator.add(new GoldGenerator());
        epicGenerator.add(new GemGenerator());
        commonGenerator.add(new BowGenerator());
        commonGenerator.add(new SwordGenerator());
        commonGenerator.add(new SilverGenerator());
        commonGenerator.add(new GoodLegendaryCharacterGenerator());
        commonGenerator.add(new TrashLegendaryCharacterGenerator());

        Random random = ThreadLocalRandom.current();
        int commonChances = commonGenerator.size() * 10;
        int rareChances = rareGenerator.size() * 3;
        int epicChances = epicGenerator.size();
        int chances = commonChances + rareChances + epicChances;
//        System.out.println(commonChances+" "+rareChances+" "+epicChances+" "+chances);
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(chances);
            if (index < commonChances) {
                commonGenerator.get(random.nextInt(commonGenerator.size())).openReward();
            } else if (commonChances < index && index < commonChances + rareChances) {
                rareGenerator.get(random.nextInt(rareGenerator.size())).openReward();
            } else {
                epicGenerator.get(random.nextInt(epicGenerator.size())).openReward();
            }
        }

    }
}
