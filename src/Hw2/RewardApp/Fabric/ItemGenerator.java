package Hw2.RewardApp.Fabric;

import Hw2.RewardApp.Interface.iGameItem;

public abstract class ItemGenerator {
    public abstract iGameItem createItem();

    public void openReward() {
        createItem().open();
    }
}
