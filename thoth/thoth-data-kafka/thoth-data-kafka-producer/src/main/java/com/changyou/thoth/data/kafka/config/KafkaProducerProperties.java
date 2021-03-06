package com.changyou.thoth.data.kafka.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by wujun on 2017/04/17.
 *
 * @author wujun
 * @since 2017/04/17
 */
@ConfigurationProperties(prefix = KafkaProducerProperties.KAFKA_PRODUCER_PREFIX)
public class KafkaProducerProperties {

    public static final String KAFKA_PRODUCER_PREFIX = "kafka";

    private String brokerAddress;

    public String getBrokerAddress() {
        return brokerAddress;
    }

    public void setBrokerAddress(String brokerAddress) {
        this.brokerAddress = brokerAddress;
    }
}
