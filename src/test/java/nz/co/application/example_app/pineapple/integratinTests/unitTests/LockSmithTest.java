package nz.co.application.example_app.pineapple.integratinTests.unitTests;

import nz.co.application.example_app.pineapple.domain.lockSmith.LockSmith;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isA;

public class LockSmithTest {

  @Test
  public void createNewLockSmith(){

    //given I have a new LockSmith
    // when lockSmith is created with the following details,
    LockSmith lockSmith = new LockSmith("John Smith",0002,0010);
    //then I ensure thee details exist in context
    assertThat(lockSmith.getName(),isA(String.class));
    assertThat(lockSmith.getPin(), isA(Integer.class));
    assertThat(lockSmith.getLockNumber(), isA(Integer.class));
  }

}
