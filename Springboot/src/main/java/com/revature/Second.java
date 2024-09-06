package com.revature;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/second")
public class Second {
    @GetMapping("/hi")
    public String firstPage() {
        return "second"; // This will resolve to WEB-INF/myviews/second.jsp
    }
}

