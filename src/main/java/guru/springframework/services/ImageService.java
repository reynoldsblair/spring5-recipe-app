package guru.springframework.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by ed.blair on 5/19/19.
 */
public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile file);
}
