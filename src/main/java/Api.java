import com.google.gson.Gson;
import dto.Media;
import dto.MediasDto;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.List;

public class Api {
    OkHttpClient client = new OkHttpClient();
    public List<dto.Media> getApi(String nameSearch) throws IOException {
        Request request = new Request.Builder()
                .url("https://api.themoviedb.org/3/search/multi?api_key=9c08262321f4e984577c6abaa528b6b7&query="+nameSearch)
                .build();
        try (Response response = client.newCall(request).execute()){
            Gson gson = new Gson();
            MediasDto medias = gson.fromJson(response.body().string(), MediasDto.class);
            return medias.toProduct();
        }

    }
}
