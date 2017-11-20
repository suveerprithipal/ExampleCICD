package nz.co.application.example_app.exampleapp.domain.lockSmith;

public class LockSmith {

  private String name;
  private int pin;
  private int lockNumber;

  public LockSmith(String name, Integer pin, Integer lockNumber){
    this.name = name;
    this.pin = pin;
    this.lockNumber = lockNumber;
  }
  public int getKey(int pin, int lockNumber){
    return ((pin*lockNumber) + lockNumber)+pin;
  }

  public int getPin() {
    return this.pin;
  }

  public int getLockNumber() {
    return lockNumber;
  }
}
