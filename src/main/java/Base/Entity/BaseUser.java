package Base.Entity;

import Entity.Enumeration.UserType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseUser
        extends BaseEntity<Integer> {
    public static final String TABLE_NAME = "\"user\"";

    public static final String FIRST_NAME = "first_name";

    public static final String LAST_NAME = "last_name";

    public static final String USERNAME = "username";

    public static final String PASSWORD = "password";

    public static final String AGE = "age";

    public static final String USER_TYPE = "user_type";

    private String firsName;

    private String lastName;

    private String userName;

    private String password;

    private int age;

    UserType userType;

    @Override
    public String toString() {
        return "User{" +
                "firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", userType=" + userType +
                '}';
    }
}
