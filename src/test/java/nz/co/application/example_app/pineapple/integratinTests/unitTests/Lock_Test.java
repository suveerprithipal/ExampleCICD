package nz.co.application.example_app.pineapple.integratinTests.unitTests;

import nz.co.application.example_app.pineapple.domain.lock.LockInterface;
import nz.co.application.example_app.pineapple.domain.lock.LockInterfaceImpl;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Lock_Test {

  @Test
  public void newLockIsLocked(){

    LockInterface lock1 = mock(LockInterfaceImpl.class);

    //given
    LockInterface lock;
    //when
    lock = new LockInterfaceImpl(10,10);
    //then


    when(lock1.isLocked()).thenReturn(true);



    assertThat(lock.isLocked(),is(equalTo(true)));
  }

  @Test
  public void keyDoesNotMatch(){
    //given //when
    LockInterface lock = new LockInterfaceImpl(10,10);
    //then
    assertThat(lock.openLock(5,10),is(equalTo(true)));
  }

  @Test
  public void keyMatches(){
    int key = 5;
    int lockNumber = 0005;

    LockInterface lock = new LockInterfaceImpl(5,0005);
    lock.openLock(5, 0005);
    assertThat(lock.isLocked(), is(equalTo(false)));
  }


}
