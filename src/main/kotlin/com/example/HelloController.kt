package example.micronaut

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller
class HelloController {

    class Version(val appName: String, val version: String)

    @Get("/hello")
    fun index(): Version {
        return Version("demo-docker-cache", "1.0.0-beta")
    }


     
}