package finalproj;

import org.testng.annotations.Test;

public class OrderTest extends finalproj {

    @Test
    public void testCreateAndModifyOrder() {
        CreateUser createUser = new CreateUser();
        String token = createUser.generateToken();

        CreateOrder createOrder = new CreateOrder();
        String orderId = createOrder.createOrder(token);

        UpdateOrder updateOrder = new UpdateOrder();
        updateOrder.updateOrder(orderId, token);

        GetUserOrder getUserOrder = new GetUserOrder();
        getUserOrder.getOrderDetails(orderId, token);
    }
}
