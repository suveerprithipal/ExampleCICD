package nz.co.application.example_app.pineapple.domain.lock;

public class LockInterfaceImpl implements LockInterface {

  private Boolean isLocked;
  private int lockKey;
  private int lockNumber;


  public LockInterfaceImpl(int userPin, int lockNumber) {
    this.isLocked = true;
    this.lockKey = userPin;
    this.lockNumber = lockNumber;
  }

  @Override
  public Boolean isLocked() {
    return this.isLocked;
  }

  @Override
  public void printState() {
    System.out.print(this.isLocked());
  }

  @Override
  public Boolean openLock(int lockNumber, int lockKey) {
    if (this.lockNumber == lockNumber && this.lockKey == (lockKey + lockNumber))
    {
      isLocked = false;
      return isLocked();
    }
    return isLocked();
  }
}
