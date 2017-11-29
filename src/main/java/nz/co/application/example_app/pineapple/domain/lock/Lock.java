package nz.co.application.example_app.pineapple.domain.lock;

public class Lock implements LockInterface {

  // A simple Lock class that is set to locked on creation.
  private Boolean isLocked;
  private int lockSecret;
  private int lockNumber;

  // A Lock must also be created with a pin and lock number
  public Lock(int userPin, int lockNumber) {
    this.isLocked = true;
    this.lockSecret = userPin;
    this.lockNumber = lockNumber;
  }

  @Override
  public Boolean isLocked() {
    return this.isLocked;
  }

  /*
  Below is the business logic of our class.
  This is where the magic happens and will be the focus of our tests.
   */

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
