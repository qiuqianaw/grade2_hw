package stock1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author QiuQian
 */
public abstract class Subject {

    protected List<Investor> investorList = new ArrayList<>();

    public void attach(Investor investor) {
        investorList.add(investor);
    }

    public void detach(Investor investor) {
        investorList.remove(investor);
    }

    public void notifyInvestor(double newPrice) {

    }
}
