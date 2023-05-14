package Entity;

import Base.Entity.BaseUser;
import lombok.*;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Consumer extends BaseUser {
    public static final String DATE_OF_LOG_IN = "date_of_log_in";
    private Date DateOfLogIn;
}
