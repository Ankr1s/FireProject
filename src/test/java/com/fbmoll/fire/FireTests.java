package com.fbmoll.fire;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

@SpringBootTest
public class FireTests {

    @Test
    void TrySparkle(){
        ColorPallet colorPallet = new ColorPallet(256);
        colorPallet.generateColors();
        Flame flame = new Flame(400,300,colorPallet );
        flame.sparks();
        flame.completeArray();

    }

    @Test
    void  TryDrawingImg() throws IOException {
        ColorPallet colorPallet = new ColorPallet(256);
        colorPallet.generateColors();
        Flame flame = new Flame(400, 300, colorPallet);
        flame.sparks();
        flame.completeArray();
        Image img = flame.processImage();
        Assert.notNull(img, "failed to process image");
        ImageIO.write((RenderedImage) img, "jpg", new File("C://Users/Jhonny/Desktop/semeva/img.jpg"));

    }


}
