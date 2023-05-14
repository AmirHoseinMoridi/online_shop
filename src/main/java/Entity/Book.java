package Entity;

import Base.Entity.BaseSalable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book extends BaseSalable {
    public static final String AUTHOR = "author";
    private String author;
}
