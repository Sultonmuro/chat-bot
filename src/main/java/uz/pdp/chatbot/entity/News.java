package uz.pdp.chatbot.entity;

import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "news")
public class News {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  //любая информация или же (реклама)
  private String data;
  //фото к рекламе
  private byte photo;
  //ссылка к рекламе
  private String url;

}
