package co.pragra.learning.firstspringframework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@AllArgsConstructor
@Data
@ToString
public class Guest {
    private String firstName;
    private String lastName;
    private String email;
    //private List<String> phoneNumber;
    //private Map<String, String> address;
    //private Address address;
    private String phoneNumber;
    private String address;
    //After Method - This method is executed right after object/bean creation
    public void initializing(){
        System.out.println("Initializing..");
    }
    //Before method - This method is executed right before garbage collection/object deletion
    public void safeDelete(){
        System.out.println("Safely destroying");
    }
}
