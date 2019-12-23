package tv.politics.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tv.politics.model.PoliticsUserModel;
import tv.politics.service.PoliticsUserService;

@RestController
@RequestMapping("/api")
public class PoliticsUserController {

  PoliticsUserService politicsUserService;

  @Autowired(required = true)
  @Qualifier(value = "politicsUserService")
  public void setPersonService(PoliticsUserService ps) {
    this.politicsUserService = ps;
  }

  @RequestMapping(value = "/fetchdata", method = RequestMethod.GET,
      produces = MediaType.APPLICATION_JSON_VALUE)

  public ResponseEntity fetchDataFunction() {

    List<PoliticsUserModel> readAll = politicsUserService.readAll();

    return ResponseEntity.ok(readAll);

  }

  @RequestMapping(value = "/registration", method = RequestMethod.POST,
      produces = MediaType.APPLICATION_JSON_VALUE)

  public void registerPoliticsUser(@RequestParam String firstname, @RequestParam String lastname,
      @RequestParam String email) {

    PoliticsUserModel politicsUser = new PoliticsUserModel();

    politicsUser.set_firstname(firstname);
    politicsUser.set_lastname(lastname);
    politicsUser.set_email(email);

    politicsUserService.save(politicsUser);

  }

}
