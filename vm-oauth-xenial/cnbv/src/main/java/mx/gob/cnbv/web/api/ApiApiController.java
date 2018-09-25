package mx.gob.cnbv.web.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-13T06:32:49.552Z[Etc/UTC]")

@Controller
@RequestMapping("/v1")
public class ApiApiController implements ApiApi {

    private final ApiApiDelegate delegate;

    public ApiApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) ApiApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ApiApiDelegate() {});
    }

    @Override
    public ApiApiDelegate getDelegate() {
        return delegate;
    }

}
