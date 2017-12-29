package org.waybe.demo.chucknorrisservice;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

@Controller
@RequestMapping("/")
public class ChuckNorrisController {

    private final AtomicInteger id = new AtomicInteger();

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody ChuckNorrisPhrase responsePhrase(){
        return new ChuckNorrisPhrase(id.incrementAndGet(),"There are no aliens in Area 51, only Chuck Norris' children..");
    }
}
