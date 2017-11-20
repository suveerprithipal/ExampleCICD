package nz.co.application.example_app.exampleapp.domain.lock;

public class MyLockClassInterfaceImpl implements MyLockClassInterface {

  private Boolean isLocked;
  private int key;
  private int lockNumber;


  public MyLockClassInterfaceImpl(int key, int lockNumber) {
    this.isLocked = true;
    this.key = key;
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
    if (this.lockNumber == lockNumber && lockKey == this.key) {
      isLocked = false;
      return isLocked();
    }
    return isLocked();
  }
}
