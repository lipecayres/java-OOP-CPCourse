public class StomachTooFullException extends Exception {
  @Override
  public String getMessage() {
    return "Stomach full";
  }
}