package nz.co.application.example_app.exampleapp.integratinTests.integrationTests;

import nz.co.application.example_app.exampleapp.domain.lock.MyLockClassInterface;
import nz.co.application.example_app.exampleapp.domain.lock.MyLockClassInterfaceImpl;
import nz.co.application.example_app.exampleapp.domain.lockSmith.LockSmith;
import org.junit.Test;

public class LockIT {

  private MyLockClassInterface myLockClassInterface = new MyLockClassInterfaceImpl(5,10);
  private LockSmith lockSmith = new LockSmith("John",5, 10);

  @Test
  public void openLockIT(){
    myLockClassInterface.openLock(lockSmith.getLockNumber(),lockSmith.getPin());
  }

}
