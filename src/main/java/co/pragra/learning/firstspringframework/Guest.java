package co.pragra.learning.firstspringframework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
@ToString
public class Guest {
    private String firstName;
    private String lastName;
    private String email;
    private List<String> phoneNumber;
    private Map<String, String> address;

    public Guest(){

    }
}
