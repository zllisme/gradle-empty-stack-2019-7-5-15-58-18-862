public class IPhoneRebot {
    private Iphone iphone;

    public IPhoneRebot(Iphone iphone) {
        this.iphone = iphone;
    }

    public void makeCall(String inputMsg) {
        this.iphone.call(inputMsg);
    }
}
