package bajor.lukasz.basketpricer;

import java.math.BigDecimal;

/**
 * Created by lbajor on 2016-04-27.
 */
public class SimpleItemPricer implements ItemPricer {
    @Override
    public BigDecimal getPrice(Item item, long quantity) {
        if (quantity == 0) {
            return BigDecimal.ZERO;
        }

        return item.price;
    }
}
