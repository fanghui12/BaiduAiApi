package service;

import com.baidu.aip.ocr.AipOcr;
import org.apache.log4j.Logger;
import org.json.JSONObject;

import java.util.HashMap;

public class Word {

    private static Logger logger = Logger.getLogger(Word.class);

    public String basicGeneral(AipOcr client, String image) {
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        //options.put("language_type", "CHN_ENG");
        options.put("detect_direction", "true");
        //options.put("detect_language", "true");
        options.put("probability", "true");



        // 参数为本地图片路径
        JSONObject res = client.basicAccurateGeneral(image, options);

//        // 参数为本地图片二进制数组
//        byte[] file = readImageFile(image);
//        res = client.basicGeneral(file, options);
//        System.out.println(res.toString(2));
//
//
//        // 通用文字识别, 图片参数为远程url图片
//        JSONObject res = client.basicGeneralUrl(url, options);
//        System.out.println(res.toString(2));

        return res.toString(2);
    }
}
