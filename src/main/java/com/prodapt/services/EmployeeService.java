package com.prodapt.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/employee")
public class EmployeeService {

    @RequestMapping(value = "/getEmployeeDetails", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String getEmployeeDetails(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession)
            throws JSONException {

        JSONObject js = new JSONObject();
        js.put("Name", "Madhusudhanachari");
        js.put("Calling Name", "Madhu");
        js.put("DOB", "09-11-1993");
        js.put("Position", "Sr. Software Engineer");
        js.put("IT Services", "Cloud Platform");

        return js.toString();
    }
}
