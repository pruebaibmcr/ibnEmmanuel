package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	public String home() {
		return "Hello IBM World, you have two Rest API available from the Public Internet, please copy the provided IP Address by Email  ( provided IP Address/ ) and This one provided IP Address/ibmhistoryceos where you will fing IBM Ceos";
	}


	@RequestMapping("/ibmhistoryceos")
	public String getIbmHistoryCeo() {
		return "{\"ceo\":\"Arvind Krishna (2020–)\", \"ceo\":\"Virginia M.Rometty (2012–2020)\"},\n" +
				"{\"ceo\":\"Samuel J. Palmisano (2002–2012)\", \"ceo\":\"Virginia M. Rometty (2012–2020)\"},\n" +
				"{\"ceo\":\"Louis V. Gerstner, Jr. (1993–2002)\", \"ceo\":\"John F. Akers (1985–1993)\"}";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
