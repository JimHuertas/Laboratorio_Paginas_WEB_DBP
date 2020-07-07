package com.makotojava.learn.springboot.web;

import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.makotojava.learn.odot.exception.ServiceException;
import com.makotojava.learn.odot.model.Category;
@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class CategoryRestService {
	@GetMapping("/FindAll")
	  public List<Category> findAll() {
	    return getCategoryService().findAll();
	    }

	@GetMapping(value = "/Add", method = RequestMethod.PUT)
	  public Category add(@RequestBody Category category) {
	    Category ret;
	    try {
	      ret = getCategoryService().add(category);
	    } catch (ServiceException e) {
	      throw new RuntimeException("Could not add Category: " + ReflectionToStringBuilder.toString(category), e);
	    }
	    return ret;
	  }


	@GetMapping(value = "/Delete", method = RequestMethod.DELETE)
	public String delete(@RequestBody Category category) {
	    String ret = "DELETE FAILED";
	    try {
	      getCategoryService().delete(category);
	      ret = "DELETE SUCCESSFUL";
	    } catch (ServiceException e) {
	      throw new RuntimeException("Could not delete Category: " + ReflectionToStringBuilder.toString(category), e);
	    }
	    return ret;
	  }
