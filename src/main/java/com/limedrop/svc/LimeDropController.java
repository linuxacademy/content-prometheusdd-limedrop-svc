package com.limedrop.svc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.prometheus.client.Counter;
import io.prometheus.client.Gauge;

@RestController
public class LimeDropController {

    static final Counter totalRequests = Counter.build()
      .name("total_requests").help("Total requests.").register();
    static final Gauge inprogressRequests = Gauge.build()
      .name("inprogress_requests").help("Inprogress requests.").register();

    @GetMapping(path="/limesAvailable", produces = "application/json")
    public String checkAvailability() {
        inprogressRequests.inc();
        totalRequests.inc();

        String response = "{\"warehouse_1\": \"58534\", \"warehouse_2\": \"72399\"}";

        inprogressRequests.dec();
        return response;
    }

}
