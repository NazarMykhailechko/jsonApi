import com.google.gson.Gson;
import model.Example;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestGsonFile {

    public static void main(String[] args) throws FileNotFoundException {
        Example[] dto = new Gson().fromJson(new FileReader("src/pb.json"), Example[].class);

        for (Example d : dto) {
            System.out.println(d);
        }
    }



}
