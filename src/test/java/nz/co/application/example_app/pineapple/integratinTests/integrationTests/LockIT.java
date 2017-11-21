package nz.co.application.example_app.pineapple.integratinTests.integrationTests;

import nz.co.application.example_app.pineapple.domain.lock.LockInterface;
import nz.co.application.example_app.pineapple.domain.lock.Lock;
import nz.co.application.example_app.pineapple.domain.lockSmith.LockSmith;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LockIT {
  @Test
  public void openLockIT(){

    /*
    An integration test is different from a unit test because there is a dependency on another class.
    We will use the processing and output of function A to test the business logic of function B.
    So we will use the locksmith class to unlock the lock class.

    We will use JUnit to to this.
    Tests were also written in TDD.
     */
    // given I have a lock
    LockInterface lockInterface = new Lock(5,10);
    //when a locksmith comes along with the following credentials
    LockSmith lockSmith = new LockSmith("John",5, 10);
    //then he can open the lock
    assertThat(lockInterface.openLock(lockSmith.getLockNumber(),lockSmith.getKey(lockSmith.getPin(),lockSmith.getLockNumber())));
  }
}
