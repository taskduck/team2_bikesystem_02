package teambikesystem.domain;

import teambikesystem.domain.*;
import teambikesystem.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class BikeReturned extends AbstractEvent {

    private Long reserveNo;
}


