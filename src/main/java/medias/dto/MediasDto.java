package medias.dto;

import medias.Media;

import java.util.*;

public class MediasDto {
    public List<MediaDto> results;

    public List<Media> toProduct() {
        List<Media> media = new ArrayList<>();
        for (MediaDto inDto : results) {
            media.add(inDto.toProduct());
        }
        return media;
    }
}