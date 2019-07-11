import java.sql.SQLOutput;

public class Andriod extends Mobile {
    private int msglimit = 10;

    public Andriod(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void call(String inputMsg) {
        if (inputMsg.length() <= this.msglimit) {
            System.out.println("<Andriod> Message : " + inputMsg);
        } else {
            System.out.println("<Andriod> Message cannot be sent");
        }
    }
}
