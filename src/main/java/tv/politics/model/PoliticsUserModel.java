package tv.politics.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "registrations")
public class PoliticsUserModel {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long id;
  private String firstname;
  private String lastname;
  private String email;

  public void set_id(Long ids) {

    id = ids;
  }

  public void set_firstname(String fname) {

    firstname = fname;

  }

  public void set_lastname(String lname) {

    lastname = lname;

  }

  public void set_email(String em) {

    email = em;
  }

  public Long get_id() {

    return id;
  }

  public String get_firstname() {

    return firstname;
  }

  public String get_lastname() {

    return lastname;
  }

  public String get_email() {

    return email;
  }

}
