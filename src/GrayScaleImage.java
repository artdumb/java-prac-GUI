import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class GrayScaleImage extends JFrame {

    BufferedImage image;
    int width;
    int height;

    public GrayScaleImage(){
        try{
            File inputFile = new File("car2.png");
            image = ImageIO.read(inputFile);
            width = image.getWidth();
            height = image.getHeight();

            for (int r=0;r<height;r++){
                for (int c=0;c<height;c++){
                    Color color = new Color(image.getRGB(r,c));
                    int red = (int)(color.getRed());
                    int blue = (int)(color.getBlue());
                    int green = (int)(color.getGreen());
                    int avg = (red+green+blue)/3;
                    Color newColor = new Color(avg,avg,avg);
                    image.setRGB(c,r,newColor.getRGB());
                }
            }
            File output = new File("output.png");
            ImageIO.write(image,"png",output);
            add(new GreyScalePannel());
            pack();
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }catch (Exception e){
            System.out.println("이미지 읽기 실패");
        }
    }


    class GreyScalePannel extends JPanel{
        public void paintComponent(Graphics g){
            g.drawImage(image,0,0,null);
        }
        public Dimension getPreferredSiza(){
            if(image ==null) return new Dimension(100,100);
            else return new Dimension(width,height);
        }
    }

    public static void main(String[] args) throws Exception{
        new GrayScaleImage();
    }
}
