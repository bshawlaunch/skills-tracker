package org.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    // Display form with input fields
    @GetMapping("form")
    @ResponseBody
    public String form() {
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we'd like to learn. Here is the list:</h2>" +
                        "<form method='post' action='/hello'>" +  // Changed action to '/hello' and method to POST
                        "<label>Name: </label>" +
                        "<input type='text' name='name' />" +  // Added name attribute to input
                        "<br><br>" +
                        "<label>Favorite Language: </label>" +
                        "<select name='firstLanguage'>" +  // Added name attribute
                        "<option value='Java'>Java</option>" +
                        "<option value='Javascript'>Javascript</option>" +
                        "<option value='Python'>Python</option>" +
                        "</select>" +
                        "<br><br>" +
                        "<label>Second Favorite Language: </label>" +
                        "<select name='secondLanguage'>" +  // Added name attribute
                        "<option value='Java'>Java</option>" +
                        "<option value='Javascript'>Javascript</option>" +
                        "<option value='Python'>Python</option>" +
                        "</select>" +
                        "<br><br>" +
                        "<label>Third Favorite Language: </label>" +
                        "<select name='thirdLanguage'>" +  // Added name attribute
                        "<option value='Java'>Java</option>" +
                        "<option value='Javascript'>Javascript</option>" +
                        "<option value='Python'>Python</option>" +
                        "</select>" +
                        "<br><br>" +
                        "<input type='submit' value='Submit' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

    // Handle form submission via POST method
    @PostMapping("hello")  // Handle only POST requests for form submission
    @ResponseBody
    public String hello(
            @RequestParam String name,
            @RequestParam String firstLanguage,
            @RequestParam String secondLanguage,
            @RequestParam String thirdLanguage) {
        return "<html>" +
                "<body>" +
                "<h1>Hello, " + name + "!</h1>" +
                "<h2>Here are your favorite languages:</h2>" +
                "<ol>" +
                "<li>" + firstLanguage + "</li>" +
                "<li>" + secondLanguage + "</li>" +
                "<li>" + thirdLanguage + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    // Display a simple hello form
    @GetMapping("helloForm")
    @ResponseBody
    public String helloForm() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method='post' action='/hello'>" +
                        "<input type='text' name='name' placeholder='Enter your name' />" +
                        "<input type='submit' value='Submit' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }
}
