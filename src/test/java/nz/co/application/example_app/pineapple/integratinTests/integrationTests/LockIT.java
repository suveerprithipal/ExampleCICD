package nz.co.application.example_app.pineapple.integratinTests.integrationTests;

import nz.co.application.example_app.pineapple.domain.lock.LockInterface;
import nz.co.application.example_app.pineapple.domain.lock.LockInterfaceImpl;
import nz.co.application.example_app.pineapple.domain.lockSmith.LockSmith;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LockIT {


  @Test
  public void openLockIT(){
    // given
    LockInterface lockInterface = new LockInterfaceImpl(5,10);
    //when
    LockSmith lockSmith = new LockSmith("John",5, 10);
    //then
    assertThat(lockInterface.openLock(lockSmith.getLockNumber(),lockSmith.getKey(lockSmith.getPin(),lockSmith.getLockNumber())));
  }
}
