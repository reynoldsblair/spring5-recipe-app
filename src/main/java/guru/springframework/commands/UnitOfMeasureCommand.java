package guru.springframework.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by ed.blair on 5/15/2019.
 */
@Getter
@Setter
@NoArgsConstructor
public class UnitOfMeasureCommand {
    private Long id;
    private String description;
}
