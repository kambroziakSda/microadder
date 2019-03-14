package boundary;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by krzysztof on 13.03.19.
 */
@ApplicationPath("/")
public class MicroAdderApplication extends Application {

    @Produces(value = MediaType.APPLICATION_JSON)
    @Consumes(value = MediaType.APPLICATION_JSON)
    public Response addTo(List<Integer> integers) {
        List<Integer> collect = integers
                .stream()
                .map(i -> i + 10)
                .collect(Collectors.toList());
        return Response.ok(collect).build();

    }

}
