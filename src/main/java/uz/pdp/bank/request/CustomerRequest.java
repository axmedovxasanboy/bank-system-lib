package uz.pdp.bank.request;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerRequest {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String secret;
    private String passport;
    private String picture;
}
