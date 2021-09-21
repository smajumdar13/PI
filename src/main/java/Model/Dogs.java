package Model;

import lombok.*;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Dogs {
    @Id
    private String dog;

    @ElementCollection
    @CollectionTable(name = "dog-breeds")
    private List<String> breed;


}
