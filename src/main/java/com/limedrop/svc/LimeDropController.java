package com.limedrop.svc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimeDropController {

    @GetMapping(path="/limesAvailable", produces = "application/json")
    public String checkAvailability() {
        String response = "{\"warehouse_1\": \"58534\", \"warehouse_2\": \"72399\"}";
        return response;
    }

}
