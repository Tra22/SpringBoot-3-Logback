package com.tra21.logback.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logs")
@Slf4j
public class LogController {
    @GetMapping("/info")
    public boolean logInfo(){
        log.info("log-info with this message: {}", "Information Message");
        return true;
    }
    @GetMapping("/warn")
    public boolean logWarn(){
        log.warn("log-warn with this message: {}", "Warn Message");
        return true;
    }
    @GetMapping("/error")
    public boolean logError(){
        log.error("log-error with this message: {}", "Error Message");
        return true;
    }
    @GetMapping("/debug")
    public boolean logDebug(){
        log.debug("log-debug with this message: {}", "Debug Message");
        return true;
    }
    @GetMapping("/trace")
    public boolean logTrace(){
        log.trace("log-trace with this message: {}", "Trace Message");
        return true;
    }
}
