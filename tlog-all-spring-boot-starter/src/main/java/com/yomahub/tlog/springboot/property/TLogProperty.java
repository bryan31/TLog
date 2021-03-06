package com.yomahub.tlog.springboot.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
/**
 * tlog的springboot配置参数
 *
 * @author Bryan.Zhang
 * @since 1.1.0
 */
@ConfigurationProperties(prefix = "tlog", ignoreUnknownFields = true)
public class TLogProperty {

    private String pattern;

    private boolean enableInvokeTimePrint;

    private String idGenerator;

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public boolean enableInvokeTimePrint() {
        return enableInvokeTimePrint;
    }

    public boolean getEnableInvokeTimePrint() {
        return enableInvokeTimePrint;
    }

    public void setEnableInvokeTimePrint(boolean enableInvokeTimePrint) {
        this.enableInvokeTimePrint = enableInvokeTimePrint;
    }

    public String getIdGenerator() {
        return idGenerator;
    }

    public void setIdGenerator(String idGenerator) {
        this.idGenerator = idGenerator;
    }
}
