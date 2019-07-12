import com.google.gson.Gson;
import model.Example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class TestGson {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://api.privatbank.ua/p24api/pboffice?json&city=%D0%94%D0%BD%D0%B5%D0%BF%D1%80%D0%BE%D0%BF%D0%B5%D1%82%D1%80%D0%BE%D0%B2%D1%81%D0%BA&address=%D0%A2%D0%B8%D1%82%D0%BE%D0%B2%D0%B0");

        //InputStreamReader reader = new InputStreamReader(url.openStream());
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        Example[] dto = new Gson().fromJson(reader, Example[].class);

        for (Example example : dto) {
            System.out.println(example);
        }


    }

}
