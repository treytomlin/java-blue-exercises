package com.techelevator;

import com.techelevator.dao.CustomerDao;
import com.techelevator.dao.model.Customer;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerSearchController {

    @Autowired
    private CustomerDao customerDao;
    
    @RequestMapping("/customerSearchForm")
    public String showCustomerSearchForm(HttpServletRequest request) {
    	return "customerSearchForm";
    }
    
    @RequestMapping("/searchCustomers")
    public String searchCustomers(HttpServletRequest request) {
    	String term = request.getParameter("searchTerm");
    	String sortBy = request.getParameter("sortBy");
    	
    	List<Customer> customers = customerDao.searchAndSortCustomers(term, sortBy);
    	request.setAttribute("customers", customers);
    	return "customerList";
    }
    

}