package medias.request;

import com.google.gson.Gson;
import medias.Media;
import medias.dto.MediasInDto;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.List;

public class Api {

    private final static String url = "https://api.themoviedb.org/3/search/multi?api_key=9c08262321f4e984577c6abaa528b6b7&query=";

    OkHttpClient client = new OkHttpClient();


    public List<Media> getApi(String nameSearch) throws IOException {
        Request request = new Request.Builder()
                .url(url + nameSearch)
                .build();
        try (Response response = client.newCall(request).execute()) {
            Gson gson = new Gson();
            MediasInDto medias = gson.fromJson(response.body().string(), MediasInDto.class);
            return medias.toProduct();
        }

    }
}