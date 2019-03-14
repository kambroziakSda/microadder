package boundary;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by krzysztof on 14.03.19.
 */
@Path("/add")
public class Add {

    @Produces(value = MediaType.APPLICATION_JSON)
    @Consumes(value = MediaType.APPLICATION_JSON)
    @POST
    public Response addTo(List<Integer> integers) {
        List<Integer> collect = integers.stream().map(i -> i + 10).collect(Collectors.toList());
        return Response.ok(collect).build();

    }

}
