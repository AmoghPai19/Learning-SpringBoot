import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.learn_spring_framework.GamingConsole;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class  MarioGame implements GamingConsole {
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Go into the hole");
    }
    public void left(){
        System.out.println("Go back");
    }
    public void right(){
        System.out.println("Accelerate");

    }


}
