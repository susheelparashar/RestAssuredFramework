package pojos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Airline {
    private String id;
    private String name;
    private String country;
    private String logo;
    private String slogan;
    private  String headQuaters;
    private String website;
    private String establishment;
}
