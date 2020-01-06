package com.wanbang.youyibang.manager;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSException;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * Description:
 * User: shixiangweii
 * Date: 2018-12-09
 * Time: 16:49
 *
 * @author shixiangweii
 */
@Component("ossManager")
public class OssManager {
    private final String endpoint = "oss-cn-hangzhou.aliyuncs.com";
    private final String accessKeyId = "9GeNC4Al6fgPzM6X";
    private final String accessKeySecret = "MMEIrNh0xG2vOVKXILJKRUh9tDIv5J";
    private final String bucketName = "fyh2016cjcj";
    private final String objectKey = "fyh_img/";

    public void upload(MultipartFile file, String fileName) throws OSSException, ClientException, IOException {
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        ossClient.putObject(bucketName, objectKey + fileName, file.getInputStream());
        ossClient.shutdown();
    }

    public void upload(File file, String fileName) throws OSSException, ClientException, IOException {
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        ossClient.putObject(bucketName, objectKey + fileName, file);
        ossClient.shutdown();
    }

    public void upload(InputStream in, String fileName) throws OSSException, ClientException, IOException {
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        ossClient.putObject(bucketName, objectKey + fileName, in);
        ossClient.shutdown();
    }
}
