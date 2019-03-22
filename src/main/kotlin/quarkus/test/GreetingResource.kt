package quarkus.test

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/")
class GreetingResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    // uncomment the below line and comment line 14 to reproduce the error
//    fun hello() = Greeting("1234")
    fun hello() = "1234"
}