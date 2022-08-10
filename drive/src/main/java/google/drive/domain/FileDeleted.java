package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileDeleted extends AbstractEvent {

    private Long id;

    public FileDeleted(File aggregate) {
        super(aggregate);
    }

    public FileDeleted() {
        super();
    }
    // keep

}
