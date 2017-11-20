package nz.co.application.example_app.exampleapp.domain.lock;

public interface MyLockClassInterface{
  Boolean isLocked();
  void printState();
  Boolean openLock(int lockNumber, int lockKey);
}
