package quarkus.test

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/")
class GreetingResource {
    @GET
    @Path("/hello")
    @Produces(MediaType.APPLICATION_JSON)
    fun hello() = Greeting("1234")
}