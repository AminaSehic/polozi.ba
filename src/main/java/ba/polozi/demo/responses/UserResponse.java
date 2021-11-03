package ba.polozi.demo.responses;
import ba.polozi.demo.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String phoneNumber;

    public UserResponse(User user) {
        this.id = user.getId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.phoneNumber=user.getPhoneNumber();
        this.username=user.getUsername();
        this.email=user.getEmail();
    }
}