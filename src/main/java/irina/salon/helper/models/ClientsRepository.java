package irina.salon.helper.models;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientsRepository extends JpaRepository<Clients, Integer> {

    List <Clients> findByName(String name);
}
