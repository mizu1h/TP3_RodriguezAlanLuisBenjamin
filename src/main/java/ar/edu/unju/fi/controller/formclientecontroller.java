package ar.edu.unju.fi.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class formclientecontroller {
		@GetMapping("/form-cliente")
	public String getformcliente() {
		return "form-cliente";
}
}