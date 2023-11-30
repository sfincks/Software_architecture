package Hw2.RewardApp.Fabric;

import Hw2.RewardApp.Interface.iGameItem;
import Hw2.RewardApp.Product.Gem;

public class GemGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Gem();
    }

}
