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
public class Shoes extends BaseSalable {
    public static final String SIZE = "size";
    private int size;
}
