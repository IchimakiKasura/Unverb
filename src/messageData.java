public final class messageData {
    public String message;
    public String value;
    public boolean skip = false;

    public messageData(String _message) {
        message = _message;
    }
    public messageData(String _message, boolean skip, String data) {
        message = _message + "\n" + data;
    }
}
