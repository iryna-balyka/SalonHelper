package irina.salon.helper.controller;

import irina.salon.helper.models.ClientsRepository;
import irina.salon.helper.models.Clients;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SalonInfoControllerImpl implements SalonInfoController {
    private final ClientsRepository repository;

    @Override
    public Clients createClient(Clients request) {
        return repository.save(request);
    }

    @Override
    public String test() {
        return "Hello world!";
    }
}
