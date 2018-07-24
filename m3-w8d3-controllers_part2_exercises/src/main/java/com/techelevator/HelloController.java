package com.techelevator;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;

@Controller 
public class HelloController {
	@Autowired
	private ReviewDao reviewDao;

	@RequestMapping(path="/greeting", method = RequestMethod.GET)
	public String displayGreeting(ModelMap map) {
		map.addAttribute("reviews", reviewDao.getAllReviews());
		return "greeting";
	}
	
	@RequestMapping(path="/createReview", method = RequestMethod.GET)
	public String displayReviewForm() {
		return "createReview";
	}
	
	@RequestMapping(path= "/addReview", method= RequestMethod.POST)
	public String addReview(Review newReview) {
		newReview.setDateSubmitted(LocalDateTime.now());
		reviewDao.save(newReview);
		return "redirect:/greeting/";
	}
}
