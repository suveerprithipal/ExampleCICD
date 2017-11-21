package nz.co.application.example_app.pineapple.integratinTests.unitTests;

import nz.co.application.example_app.pineapple.domain.lock.LockInterface;
import nz.co.application.example_app.pineapple.domain.lock.Lock;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LockTest {

  @Test
  public void newLockIsLocked(){

    // example of mocking for TDD - mock the class using mockito:
    LockInterface lock1 = mock(Lock.class);

    // This reads as:
    //given I have a Lock instance
    LockInterface lock;

    //when a new lock is created
    lock = new Lock(10,10);

    //then I expect the lock to be locked on creation
    assertThat(lock.isLocked(),is(equalTo(true)));

    // example of using hamcrest to mock the expected results
    /*
    In the case below, when is a mockito API, used to fudge the condition return.
     */
    when(lock1.isLocked()).thenReturn(true);
    /*
    When mocking, for TDD, always replace your mocks with actual implementation.
    This is critical to ensure you test the actual feature.
    Use interfaces to "implement" methods in classes that are required for your tdd.
     */
  }

  @Test
  public void keyDoesNotMatch(){
    //given //when
    LockInterface lock = new Lock(10,10);
    //then
    /*
    assertThat is a JUnit API.
    assertThat is a conditional matcher(expected vs actual)
     */
    assertThat(lock.openLock(5,10),is(equalTo(true)));
  }

  @Test
  public void keyMatches(){
    LockInterface lock = new Lock(10,5);
    lock.openLock(5, 5);

    assertThat(lock.isLocked(), is(equalTo(false)));
  }
}