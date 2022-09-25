package uz.pdp.chatbot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "film")
public class Films {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;  //некоторые для людей с премиумом
    @Column(unique = true)
    private String typeOfFilm;

    private String url;

}

