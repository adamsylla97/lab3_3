import edu.iis.mto.time.Order;
import edu.iis.mto.time.OrderExpiredException;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderTest {

    @Test (expected = OrderExpiredException.class)
    public void confirmShouldThrowOrderExpiredException(){
        Order order = new Order();
        order.submit();
        order.confirm();
    }

}
