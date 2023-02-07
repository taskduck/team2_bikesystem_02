package teambikesystem.domain;

import teambikesystem.domain.*;
import teambikesystem.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Canceled extends AbstractEvent {

    private Long reserveNo;

    public Canceled(Reservation aggregate){
        super(aggregate);
    }
    public Canceled(){
        super();
    }
}
