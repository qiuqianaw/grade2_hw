package game;

/**
 * @author QiuQian
 */
public class Gold extends Treasure {

    public Gold(int quantity) {
        super(quantity);
    }

    @Override
    public void guard(Eudemon eudemon) {
        getEudemons().add(eudemon);
    }

    @Override
    public void unguard(Eudemon eudemon) {
        getEudemons().remove(eudemon);
    }

    @Override
    public void notifyEudemon(Character character) {
        for ( Eudemon eudemon : getEudemons() ) {
            eudemon.update(character);
        }
    }
}
