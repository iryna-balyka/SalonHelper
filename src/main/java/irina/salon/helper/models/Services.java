package irina.salon.helper.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Services {
    @Id
    private int serviceId;
    private String serviceName;
    private float servicePrice;

}
