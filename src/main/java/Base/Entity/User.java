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
public abstract class User
        extends Entity<Integer>{
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
