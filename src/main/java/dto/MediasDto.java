package dto;

import javax.print.attribute.standard.Media;
import java.util.*;

public class MediasDto {
    public List<MediaDto> results;

    public List<dto.Media> toProduct() {
        List<dto.Media> media = new ArrayList<>();
        for (MediaDto inDto : results) {
            media.add(inDto.toProduct());
        }
        return media;
    }
}