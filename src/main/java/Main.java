import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main( String[] args ) throws AWTException, IOException {
        System.out.println("Кофе-машина");
        System.out.println("Введите сумму");
        //TODO: read from console
        Scanner myInput = new Scanner(System.in);
        int moneyAmount = myInput.nextInt();
        System.out.println("Вы внесли " + moneyAmount + " руб.");
        int[] drinkPrices = {165, 100, 70, 80};
        String[] drinkNames = {"капучино", "американо", "эспрессо", "латте"};
        boolean canBuySomething = false;
        for (int i = 0; i < drinkNames.length; i = i + 1) {
            if (moneyAmount >= drinkPrices[i]) {
                System.out.println("Вы можете купить " + drinkNames[i]);
                canBuySomething = true;
            }
        }
        if (!canBuySomething) {
            System.out.println("Недостаточно средств :( Изучайте Java и зарабатывайте много!))");
        }

        //TODO: 20210208_205111
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd_HHmmss");
        Date now = new Date();
        System.out.println(formatter.format(now));

        //TODO: get screenshot to BufferedImage
        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        ImageIO.write(image, "png", new File("C:\\Users\\Makso\\Desktop\\screenshot.png"));
        System.out.println(image.getWidth() + "x" + image.getHeight());
    }

    //TODO: #ilovejava
}


