package game;

import java.util.ArrayList;
import java.util.List;

/**
 * @author QiuQian
 */
public class Scene {

    Cage cage = new Cage("凯奇");
    List<Tiger> tigers = new ArrayList<>();
    List<Lion> lions = new ArrayList<>();
    List<Gold> golds = new ArrayList<>();
    List<Diamond> diamonds = new ArrayList<>();

    private int TIGER_COUNT = 5;

    private int GOLD_COUNT = 500;

    private int LION_COUNT = 7;

    private int DIAMOND_COUNT = 100;

    public Scene() {
        for ( int i = 0; i < TIGER_COUNT; i++ ) {
            tigers.add(new Tiger("Tiger" + i));
        }

        for ( int i = 0; i < LION_COUNT; i++ ) {
            lions.add(new Lion("Lion" + i));
        }

        for ( int i = 0; i < GOLD_COUNT; i++ ) {
            Gold gold = new Gold(500);
            for ( Tiger tiger : tigers ) {
                gold.guard(tiger);
            }
            for ( Lion lion : lions ) {
                gold.guard(lion);
            }
            golds.add(gold);
        }

        for ( int i = 0; i < DIAMOND_COUNT; i++ ) {
            Diamond diamond = new Diamond(100);
            for ( Tiger tiger : tigers ) {
                diamond.guard(tiger);
            }
            for ( Lion lion : lions ) {
                diamond.guard(lion);
            }
            diamonds.add(diamond);
        }
    }


}
