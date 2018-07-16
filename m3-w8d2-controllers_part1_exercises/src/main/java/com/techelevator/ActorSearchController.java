package com.techelevator;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.techelevator.dao.ActorDao;
import com.techelevator.dao.model.Actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class ActorSearchController {

	@Autowired
	private ActorDao actorDao;
	
	@RequestMapping("/actorSearchForm")

	/* What request mapping do we want here */
	public String showSearchActorForm() {
		return "actorSearchForm";
	}

	@RequestMapping("/actorSearch")
	public String searchActors(HttpServletRequest request) {
		/* Call the model and pass values to the jsp */
		String name = request.getParameter("lastName"); // gets the parameter from request from url
		List<Actor> actors = actorDao.getMatchingActors(name); // cal's method from dao and searchs name from request and puts it in list
		request.setAttribute("actors",  actors); // sets the result in list to a variab;e to be used in the view(actorList.jsp)
		return "actorList";   // return the name of the jsp to display 
	}
}
