package teambikesystem.domain;

import teambikesystem.domain.*;
import teambikesystem.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class PointReturned extends AbstractEvent {

    private Long userId;
    private Integer totalPoint;
}


