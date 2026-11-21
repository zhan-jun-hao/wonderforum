package org.zhant1x.wonderfourm.interfaces.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping
@RestController
public class TestController {

    @GetMapping
    public String test() {
        return "wonder to live";
    }
}
