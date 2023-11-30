package Hw2.RewardApp.Fabric;

import Hw2.RewardApp.Interface.iGameItem;
import Hw2.RewardApp.Product.Gold;

public class GoldGenerator extends ItemGenerator {

    public iGameItem createItem() {
        return new Gold();
    }
    
}
