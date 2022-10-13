package medias.dto;

import medias.Media;

import java.util.*;

public class MediasInDto {
    public List<MediaInDto> results;

    public List<Media> toProduct() {
        List<Media> media = new ArrayList<>();
        int count =0;
        for (MediaInDto inDto : results) {
            if (inDto.media_type.equals("tv") || inDto.media_type.equals("movie")){
                media.add(inDto.toProduct());
                count += 1;
                if (count == 15) {
                    break;
                }
            }

        }
        return media;
    }
}