package io.ipldashboard.mladen;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MladenC {
    @RequestMapping("")
    public String hello() {
        return "zdravo Mladene!!!   " + "\nhello";
    }
}
