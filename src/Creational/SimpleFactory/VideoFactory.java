package Creational.SimpleFactory;

/**
 * @author Maoxin
 * @ClassName VideoFactory
 * @date 4/10/2019
 */
public class VideoFactory {
    public Video getVideo(String type){
        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        }else if ("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }
        return null;
    }
}