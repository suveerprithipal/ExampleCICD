package nz.co.application.example_app.pineapple.domain.lock;

public class Lock implements LockInterface {

  private Boolean isLocked;
  private int lockSecret;
  private int lockNumber;


  public Lock(int userPin, int lockNumber) {
    this.isLocked = true;
    this.lockSecret = userPin;
    this.lockNumber = lockNumber;
  }

  @Override
  public Boolean isLocked() {
    return this.isLocked;
  }

  @Override
  public Boolean openLock(int lockNumber, int lockKey) {
    if (this.lockNumber == lockNumber && this.lockSecret == (lockKey + lockNumber))
    {
      isLocked = false;
      return isLocked();
    }
    return isLocked();
  }
}
