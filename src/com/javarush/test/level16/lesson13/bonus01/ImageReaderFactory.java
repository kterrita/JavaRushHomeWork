package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by илья on 16.11.2016.
 */
public class ImageReaderFactory
{
    public static ImageReader getReader(ImageTypes imageTypes) {
        ImageReader imageReader = null;

            if(imageTypes == ImageTypes.BMP){
                imageReader = new BmpReader();
            } else if (imageTypes == ImageTypes.PNG) {
                imageReader = new PngReader();
            } else if( imageTypes == ImageTypes.JPG) {
                imageReader = new JpgReader();
            } else {
                throw new IllegalArgumentException("Неизвестный тип картинки");
            }

        return imageReader;
    }
}
