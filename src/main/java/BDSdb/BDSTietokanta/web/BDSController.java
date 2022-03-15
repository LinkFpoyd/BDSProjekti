package BDSdb.BDSTietokanta.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import BDSdb.BDSTietokanta.domain.Laite;
import BDSdb.BDSTietokanta.domain.LaiteRepo;
import BDSdb.BDSTietokanta.domain.Tyyppi;
import BDSdb.BDSTietokanta.domain.Merkki;

@Controller
public class BDSController {
	
	@Autowired
	private LaiteRepo laiterepo;
	
	@RequestMapping(value="/laitteet")
	public String laiteList(Model model) {
		model.addAttribute("laitteet", laiterepo.findAll());
		return "laitelista";
	}

}
