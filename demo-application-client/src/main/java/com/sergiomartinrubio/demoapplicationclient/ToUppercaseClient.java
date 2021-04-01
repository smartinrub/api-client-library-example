package com.sergiomartinrubio.demoapplicationclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "toUppercase", url = "http://localhost:8080")
public interface ToUppercaseClient {

    @RequestMapping(method = RequestMethod.GET, value = "/uppercase/{word}")
    String toUppercase(@PathVariable("word") String word);
}
