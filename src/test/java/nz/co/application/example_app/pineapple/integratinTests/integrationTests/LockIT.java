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

    We will use JUnit to to this.
     */
    // given
    LockInterface lockInterface = new Lock(5,10);
    //when
    LockSmith lockSmith = new LockSmith("John",5, 10);
    //then
    assertThat(lockInterface.openLock(lockSmith.getLockNumber(),lockSmith.getKey(lockSmith.getPin(),lockSmith.getLockNumber())));
  }
}
