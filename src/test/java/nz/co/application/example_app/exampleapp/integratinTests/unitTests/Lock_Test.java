package nz.co.application.example_app.exampleapp.integratinTests.unitTests;

import nz.co.application.example_app.exampleapp.domain.lock.MyLockClassInterface;
import nz.co.application.example_app.exampleapp.domain.lock.MyLockClassInterfaceImpl;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;

public class Lock_Test {

  @Test
  public void newLockIsLocked(){

    //given //when
    MyLockClassInterface lock = new MyLockClassInterfaceImpl(10,10);
    //then
    assertThat(lock.isLocked(),is(equalTo(true)));
  }

  @Test
  public void keyDoesNotMatch(){
    //given //when
    MyLockClassInterface lock = new MyLockClassInterfaceImpl(10,10);
    //then
    assertThat(lock.openLock(5,10),is(equalTo(true)));
  }

  @Test
  public void keyMatches(){
    int key = 5;
    int lockNumber = 0005;

    MyLockClassInterface lock = new MyLockClassInterfaceImpl(5,0005);
    lock.openLock(5, 0005);
    assertThat(lock.isLocked(), is(equalTo(false)));
  }


}
