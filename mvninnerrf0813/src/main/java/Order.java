import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/orders")
public class Order {
    @GET
    public String getOrders() {
        return "returning all orders";
    }
    //orderId is a date
    @GET
    @Path("{orderId}")
    public String getOrderById(
            @PathParam("orderId") String orderId) {
        return "return order with id " + orderId;
    }

    @GET
    @Path("/{orderId}/items")
    public String getOrderItemsById(@PathParam("orderId") String orderId) {
        return "returning all order items by order id: " + orderId;
    }

    @GET
    @Path("/{orderId}/items/{itemId}")
    public String getOrderItemByItemId(@PathParam("orderId") String orderId,
                                       @PathParam("itemId") String itemId) {
        return "returning order item by order id: " + orderId +
                " and item id: " + itemId;
    }
}
