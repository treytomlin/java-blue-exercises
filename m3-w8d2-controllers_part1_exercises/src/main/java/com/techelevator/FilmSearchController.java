package com.techelevator;

import com.techelevator.dao.FilmDao;
import com.techelevator.dao.model.Film;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * FilmSearchController
 */
@Controller
public class FilmSearchController {

    @Autowired
    FilmDao filmDao;
    
    @RequestMapping("/filmSearchForm")
    public String showFilmSearchForm() {
        return "filmSearchForm";
    }
    @RequestMapping("/searchFilms")
    public String searchFilms(HttpServletRequest request) {
    	String genre = request.getParameter("genre");
    	int minLength = Integer.parseInt(request.getParameter("minLength"));
    	int maxLength = Integer.parseInt(request.getParameter("maxLength"));
    	List<Film> films = filmDao.getFilmsBetween(genre, minLength, maxLength);
    	request.setAttribute("films", films);
        return "filmList";
    }
    
    
}