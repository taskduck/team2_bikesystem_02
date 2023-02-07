package teambikesystem.domain;

import teambikesystem.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class BikeRegistrated extends AbstractEvent {

    private Integer bikeId;
    private String color;
    private String status;
    private String registeredDate;
}
