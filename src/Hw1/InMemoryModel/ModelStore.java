package Hw1.InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import Hw1.ModelEliments.Camera;
import Hw1.ModelEliments.Flash;
import Hw1.ModelEliments.PoligonModel;
import Hw1.ModelEliments.Scene;
import Hw1.ModelEliments.Texture;

public class ModelStore implements IModelChanger {
    public List<PoligonModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangeObserver[] changeObservers;

    public ModelStore(IModelChangeObserver[] changeObservers) throws Exception {
        this.changeObservers = changeObservers;

        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();

        List<Texture> textures = new ArrayList<>();
        this.models.add(new PoligonModel(textures));

        this.flashes.add(new Flash());
        this.cameras.add(new Camera());

        this.scenes.add(new Scene(0, models, flashes, cameras));


    }

    public Scene getScene(int id)
    {
        return this.scenes.get(id);
    }

    @Override
    public void notifyChange(IModelChanger sender) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'notifyChange'");
    }


}
