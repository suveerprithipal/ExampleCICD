package nz.co.application.example_app.exampleapp.integratinTests.unitTests;

import nz.co.application.example_app.exampleapp.domain.lockSmith.LockSmith;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isA;

public class LockSmith_Test {

  @Test
  public void createNewLockSmith(){

    //given
    LockSmith lockSmith = new LockSmith("John Smith",0002,0010);
    //then
    assertThat(lockSmith.getPin(), isA(Integer.class));
    assertThat(lockSmith.getLockNumber(), isA(Integer.class));
  }

}
