package at.htl;

import io.quarkus.logging.Log;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String hello(
            @FormParam("name") String name
    ) {
        Log.info(name);
        return String.format("Hello, %s!", name);
    }
}
