package com.jobsukraine;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {

   @RequestMapping(value = "", method = RequestMethod.GET)
   public String student(Map<String,Object> model) {
	   Student student = new Student();
	   model.put("SpringWeb", student);
      return "student";
   }
   
   @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
   public String addStudent(@ModelAttribute("SpringWeb") Student student,  BindingResult build) {
      
      return "result";
   }
}