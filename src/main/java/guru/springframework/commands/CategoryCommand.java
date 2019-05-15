package guru.springframework.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by ed.blair on 5/15/2019.
 */
@Setter
@Getter
@NoArgsConstructor
public class CategoryCommand {
    private Long id;
    private String description;
}
