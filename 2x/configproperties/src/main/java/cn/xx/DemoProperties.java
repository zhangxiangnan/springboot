package cn.xx;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "cn.xx")
public class DemoProperties {

    private String name;

    private String address;

}
