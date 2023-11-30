package Hw2.RewardApp.Fabric;

import Hw2.RewardApp.Interface.iGameItem;
import Hw2.RewardApp.Product.GoodLegendaryCharacter;

public class GoodLegendaryCharacterGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new GoodLegendaryCharacter();
    }
}
