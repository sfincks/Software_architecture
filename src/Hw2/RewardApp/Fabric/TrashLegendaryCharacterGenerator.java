package Hw2.RewardApp.Fabric;

import Hw2.RewardApp.Interface.iGameItem;
import Hw2.RewardApp.Product.TrashLegendaryCharacter;

public class TrashLegendaryCharacterGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new TrashLegendaryCharacter();
    }
}
