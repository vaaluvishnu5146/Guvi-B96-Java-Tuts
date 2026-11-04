package Cake;

public class ChocoTruffleCake extends Cake {
    @Override
    public void step1() {
        System.out.println("Make Choco Truffle batter ready");
    }

    @Override
    public void step2() {
        System.out.println("Bake the Choco Truffle batter in oven");
    }

    @Override
    public void step3() {
        System.out.println("Decorate the Choco Truffle cake");
    }

    @Override
    public void step4() {
        System.out.println("Cool the Choco Truffle cake and package");
    }

    public void step5() {
        System.out.println("Deliver the Choco Truffle cake");
    }
}
