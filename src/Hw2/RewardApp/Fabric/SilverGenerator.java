package Hw2.RewardApp.Fabric;

import Hw2.RewardApp.Interface.iGameItem;
import Hw2.RewardApp.Product.Silver;

public class SilverGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new Silver();
    }
}
