package secouristedepoche.entity;
import javax.persistence.*;
import lombok.*;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity // Une entité JPA
public class Illustration {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;

    @Column(unique=true)
    @NonNull
    private String nomIllustration;
    
    @NonNull
    private String descriptionIllustration;

    //Trouver comment y mettre des images

    @ManyToMany (mappedBy = "images")
    private List<Chapitre> cours = new LinkedList<>();

    @ManyToMany (mappedBy = "dessins")
    private List<Fiche> guides = new LinkedList<>();
}