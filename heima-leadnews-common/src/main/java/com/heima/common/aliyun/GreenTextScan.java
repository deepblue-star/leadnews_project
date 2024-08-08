package com.heima.common.aliyun;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@Component
public class GreenTextScan {

    private String accessKeyId;
    private String secret;

    public Map greeTextScan(String content) throws Exception {
        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("suggestion", "pass");
        return resultMap;
    }

}