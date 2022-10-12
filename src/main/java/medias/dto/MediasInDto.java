package medias.dto;

import medias.Media;

import java.util.*;

public class MediasInDto {
    public List<MediaInDto> results;

    public List<Media> toProduct() {
        List<Media> media = new ArrayList<>();
        int count =0;
        for (MediaInDto inDto : results) {
            if (count == 15) {
                break;
            }
            count += 1;
            media.add(inDto.toProduct());
        }
        return media;
    }
}