package service;

import com.baidu.aip.face.AipFace;
import org.apache.log4j.Logger;
import org.json.JSONObject;

import java.util.HashMap;

public class Face {
    private static Logger logger = Logger.getLogger(Face.class);

    public String detect(AipFace client,String image,String imageType) {
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("face_field", "age");
        options.put("max_face_num", "2");
        options.put("face_type", "LIVE");

        // 人脸检测
        logger.info("调用人脸检测api");
        JSONObject res = client.detect(image, imageType, options);
        return res.toString(2);
    }

    public String search(AipFace client,String image,String imageType) {
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("quality_control", "NORMAL");
        options.put("liveness_control", "LOW");
        options.put("user_id", "233451");
        options.put("max_user_num", "3");
        String groupIdList = "3,2";

        // 人脸搜索
        logger.info("调用人脸搜索api");
        JSONObject res = client.search(image, imageType, groupIdList, options);
        return res.toString(2);

    }

}