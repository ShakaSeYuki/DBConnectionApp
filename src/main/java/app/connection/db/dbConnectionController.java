package app.connection.db;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class dbConnectionController {
 
    @Autowired
    private dbConnectionDao sampleDao;
     
    @RequestMapping(value = "/dbConnection",method = RequestMethod.GET)
    @Transactional
    public List<dbConnection> get() {
        return sampleDao.findAll();
    }
    
    @RequestMapping("/add")
	public @ResponseBody String addNewUser (
			@RequestParam Integer id,
			@RequestParam String name, 
			@RequestParam String note
			) {
		
    	dbConnection n = new dbConnection();
    	n.setId(id);
    	n.setName(name);
		n.setNote(note);
		sampleDao.save(n);
		return "saved";
	}
	
    @RequestMapping("/all")
	public String getAllUsers(Model model) {
		
		List users = (List) sampleDao.findAll();
		model.addAttribute("users", users);
		return "user";
	}
    
}