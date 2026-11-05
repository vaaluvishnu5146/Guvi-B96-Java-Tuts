package Cake;

import Cake.interfaces.Baking;
import Cake.interfaces.Decoration;
import Cake.interfaces.Packing;

// Multiple level inheritance
public class HoneyCake implements Baking, Decoration, Packing {
    @Override
    public void prepareBatter() {

    }

    @Override
    public void bakeBatter() {

    }

    @Override
    public void freezeCake() {

    }

    @Override
    public void decorateCake() {

    }

    @Override
    public void packageCake() {

    }
}
