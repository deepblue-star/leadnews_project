package com.heima.common.aliyun;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@Component
public class GreenImageScan {

    private String accessKeyId;
    private String secret;
    private String scenes;

    public Map imageScan(List<byte[]> imageList) throws Exception {
        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("suggestion", "pass");
        return resultMap;
    }
}