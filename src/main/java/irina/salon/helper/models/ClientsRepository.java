package irina.salon.helper.models;

import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.List;

public interface ClientsRepository extends JpaRepository<Clients, Integer> {

    List <Clients> findByName(String name);
//    List <Clients> findByID(int id);
//    List<Clients> findByBirthday(Date date);
}
