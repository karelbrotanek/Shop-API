import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.awt.*;

@Path("shop")
@Produces(MediaType.APPLICATION_JSON)
public class ShopResources {
    private MainShop mainShop = new MainShop();
    @GET
    public Response getProducts() {
        return Response.ok(mainShop).build();
    }
    @GET
    @Path("featured")
    public Response getFeatured() {
        return Response.ok(mainShop.getFeatured()).build();
    }
    @GET
    @Path("other")
    public Response getOther() {
        return Response.ok(mainShop.getOther()).build();
    }
}
