package com.jeremymartin.api;

import com.jeremymartin.medias.Media;
import java.util.*;

public class MediasInDto {
    private List<MediaInDto> results;

    protected List<Media> toProduct() {
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