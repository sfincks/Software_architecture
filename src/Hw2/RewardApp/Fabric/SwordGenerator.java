package Hw2.RewardApp.Fabric;

import Hw2.RewardApp.Interface.iGameItem;
import Hw2.RewardApp.Product.Sword;

public class SwordGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new Sword();
    }
}
