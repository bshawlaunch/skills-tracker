package org.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller

public class SkillsController {
    @GetMapping("form")
    @ResponseBody
    public String form() {
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>" + "Skills Tracker" + "</h1>" +
                        "<h2>" + "We have a few skills we'd like to learn. Here is the list:" + "</h2>" +
                        "<p>Name</p>" +

                        "<input style='padding-bottom: 5px;' type = 'text' name = 'name' />" +
                        "<br>" +
                        "<form method = 'get' action = '/form'>" +
                        "<select options='Make Selection' id='languages'>" +
                        "<option value=''>--Please choose an option--</option>" +
                        "<option label='Java'>Java</option>" +
                        "<option label='Javascript'>Javascript</option>" +
                        "<option label='Python'>Python</option>" +
                        "</select>" +
                        "<br>" +
                        "<br>" +
                        "<select options='Make Selection' id='languages'>" +
                        "<option value=''>--Please choose an option--</option>" +
                        "<option label='Java'>Java</option>" +
                        "<option label='Javascript'>Javascript</option>" +
                        "<option label='Python'>Python</option>" +
                        "</select>" +
                        "<br>" +
                        "<br>" +
                        "<select options='Make Selection' id='languages'>" +
                        "<option value=''>--Please choose an option--</option>" +
                        "<option label='Java'>Java</option>" +
                        "<option label='Javascript'>Javascript</option>" +
                        "<option label='Python'>Python</option>" +
                        "</select>" +
                        "<br>" +
                        "<br>" +
                        "<input type = 'submit' value = 'Submit' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

}
