import com.baidu.aip.base64.mBase64;
import job.Facerecognition;
import job.Wordrecognition;
import org.apache.log4j.Logger;
import service.Face;

public class Application {

    private static Logger logger = Logger.getLogger(Face.class);
    public static void main(String[] args) {

//        //人脸识别=================================
//        //图片转base64
//        String path = "D:/IdeaProjects/java-sdk/src/main/java/images/test.jpg";
//        mBase64 mBase64 = new mBase64();
//        String strImg = mBase64.getImageStr(path);
//        //mBase64.generateImage(strImg, "F:/86619-107.jpg");
//        /* 图片类型 BASE64,URL,FACE_TOKEN */
//        String imageType = "BASE64";
//
//        Facerecognition face =new Facerecognition();
//        String ReqStr = face.FaceApi(strImg,imageType);
//        logger.info(ReqStr);

        // 文字识别==================================
        String path1 = "D:/IdeaProjects/java-sdk/src/main/java/images/word2.jpg";
        Wordrecognition wordrecognition = new Wordrecognition();
        String ReqStr1 = wordrecognition.WordApi(path1);
        logger.info(ReqStr1);

    }
}
