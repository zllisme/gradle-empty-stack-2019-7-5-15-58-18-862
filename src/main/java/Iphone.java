import java.sql.SQLOutput;

public class Iphone extends Mobile{

    private int msglimit = 20;

    public Iphone(String name, String color, String brand) {
        super(name, color, brand);
    }
    @Override
    public void call(String inputMsg) {
        if (inputMsg.length() <= this.msglimit) {
            System.out.println("<iphone>Message : " + inputMsg);
        } else {
            System.out.println("<iphone> Message cannot be sent");
        }
    }

}
