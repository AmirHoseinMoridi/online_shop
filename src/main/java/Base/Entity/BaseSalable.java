package Base.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseSalable extends BaseEntity<Long> {
    public static final String TABLE_NAME = "salable";
    public static final String NAME = "name";
    public static final String PRICE = "price";
    private String name;
    private double price;
}
