package org.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CourseController {
     
	@GetMapping("/getCourse")
	
	public String getCourse(Model model) {

        model.addAttribute("id1", 101);
        model.addAttribute("name1", "Ankita");
        model.addAttribute("skills1", "Java");
        model.addAttribute("amt_paid1", 5999);
        model.addAttribute("org_name1", "JSpiders");
        model.addAttribute("status1", "Completed");
        model.addAttribute("grade1", "A");

        model.addAttribute("id2", 102);
        model.addAttribute("name2", "Rahul");
        model.addAttribute("skills2", "Python");
        model.addAttribute("amt_paid2", 6999);
        model.addAttribute("org_name2", "PySpiders");
        model.addAttribute("status2", "Ongoing");
        model.addAttribute("grade2", "A+");

        model.addAttribute("id3", 103);
        model.addAttribute("name3", "Priya");
        model.addAttribute("skills3", "SQL");
        model.addAttribute("amt_paid3", 3999);
        model.addAttribute("org_name3", "QSpiders");
        model.addAttribute("status3", "Completed");
        model.addAttribute("grade3", "B");

        model.addAttribute("id4", 104);
        model.addAttribute("name4", "Kiran");
        model.addAttribute("skills4", "HTML, CSS");
        model.addAttribute("amt_paid4", 2999);
        model.addAttribute("org_name4", "WebTech");
        model.addAttribute("status4", "Ongoing");
        model.addAttribute("grade4", "A");

        model.addAttribute("id5", 105);
        model.addAttribute("name5", "Sneha");
        model.addAttribute("skills5", "JavaScript");
        model.addAttribute("amt_paid5", 4999);
        model.addAttribute("org_name5", "TechPro");
        model.addAttribute("status5", "Completed");
        model.addAttribute("grade5", "B+");

        model.addAttribute("id6", 106);
        model.addAttribute("name6", "Arjun");
        model.addAttribute("skills6", "Spring Boot");
        model.addAttribute("amt_paid6", 8999);
        model.addAttribute("org_name6", "JSpiders");
        model.addAttribute("status6", "Ongoing");
        model.addAttribute("grade6", "A+");

        model.addAttribute("id7", 107);
        model.addAttribute("name7", "Divya");
        model.addAttribute("skills7", "React");
        model.addAttribute("amt_paid7", 7999);
        model.addAttribute("org_name7", "CodeHub");
        model.addAttribute("status7", "Completed");
        model.addAttribute("grade7", "A");

        model.addAttribute("id8", 108);
        model.addAttribute("name8", "Vikram");
        model.addAttribute("skills8", "MySQL");
        model.addAttribute("amt_paid8", 3499);
        model.addAttribute("org_name8", "QSpiders");
        model.addAttribute("status8", "Ongoing");
        model.addAttribute("grade8", "B");

        model.addAttribute("id9", 109);
        model.addAttribute("name9", "Pooja");
        model.addAttribute("skills9", "Hibernate");
        model.addAttribute("amt_paid9", 5999);
        model.addAttribute("org_name9", "JSpiders");
        model.addAttribute("status9", "Completed");
        model.addAttribute("grade9", "A+");

        model.addAttribute("id10", 110);
        model.addAttribute("name10", "Rohit");
        model.addAttribute("skills10", "Full Stack");
        model.addAttribute("amt_paid10", 9999);
        model.addAttribute("org_name10", "TechPro");
        model.addAttribute("status10", "Ongoing");
        model.addAttribute("grade10", "A");

        return "course";
	}
}
