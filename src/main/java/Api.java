import com.google.gson.Gson;
import dto.MediasDto;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Api {
    OkHttpClient client = new OkHttpClient();
    public MediasDto getApi(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();
        try (Response response = client.newCall(request).execute()){
            Gson gson = new Gson();
            MediasDto medias = gson.fromJson(response.body().string(), MediasDto.class);
            return medias;
        }

    }
}
