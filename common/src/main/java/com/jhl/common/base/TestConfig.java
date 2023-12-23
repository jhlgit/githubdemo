package com.jhl.common.base;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestConfig {

    @Value("${test.ip:127.0.0.2}")
    private String testIp;
    @Value("${test.port:100}")
    private String testPort;

    public String getTestIp() {
        return testIp;
    }

    public void setTestIp(String testIp) {
        this.testIp = testIp;
    }

    public String getTestPort() {
        return testPort;
    }

    public void setTestPort(String testPort) {
        this.testPort = testPort;
    }
}
