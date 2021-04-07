package irina.salon.helper.controller;

import irina.salon.helper.models.ClientsRepository;
import irina.salon.helper.models.Clients;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@Slf4j
public class SalonInfoControllerImpl implements SalonInfoController {
    private final ClientsRepository repository;

    @Override
    public Clients createClient(Clients request) {
        return repository.save(request);
    }

    @Override

    public List<Clients> getByName(String name){
        return repository.findByName(name);
    }

    @Override

    public Optional<Clients> getById(int id){
        return repository.findById(id);
    }

    @Override
    public List<Clients> getAll(){return repository.findAll();}


    public List<Clients> getByBirthday (@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
//        log.info(date.toString());
//        return List.of(new Clients());
        return repository.findByBirthdate(date);
    }




}
