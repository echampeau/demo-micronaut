package com.example;

import io.micronaut.http.annotation.*;

@Controller("/lol")
public class LolController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Salut Gaël";
    }
}
