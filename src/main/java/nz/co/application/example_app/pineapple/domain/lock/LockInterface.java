package nz.co.application.example_app.pineapple.domain.lock;

public interface LockInterface {
  Boolean isLocked();
  Boolean openLock(int lockNumber, int lockKey);
}
