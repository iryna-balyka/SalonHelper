package irina.salon.helper.controller;

import irina.salon.helper.models.Clients;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping(value = "/clients", produces = MediaType.APPLICATION_JSON_VALUE)
public interface SalonInfoController {

    @PostMapping(path = "/new")
    Clients createClient(@RequestBody Clients request);

    @GetMapping(path = "/get")
    List<Clients> getByName(String name);
}
