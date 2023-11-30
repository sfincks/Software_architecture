package Hw2.RewardApp.Fabric;

import Hw2.RewardApp.Interface.iGameItem;
import Hw2.RewardApp.Product.Bow;

public class BowGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new Bow();
    }
}
