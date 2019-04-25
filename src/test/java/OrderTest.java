import edu.iis.mto.time.Order;
import edu.iis.mto.time.OrderExpiredException;
import edu.iis.mto.time.TimeData;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderTest {

    @Test (expected = OrderExpiredException.class)
    public void confirmShouldThrowOrderExpiredException(){
        int time = -90001;
        Order order = new Order(time);
        order.submit();
        order.confirm();
    }

    @Test
    public void confirmShouldntThrowOrderExpiredException(){
        int time = 0;
        Order order = new Order(time);
        order.submit();
        order.confirm();
        Assert.assertEquals(Order.State.SUBMITTED, order.getOrderState());
    }

}
