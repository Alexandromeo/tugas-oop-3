package bebekAmira;

import bebekAmira.attack.*;
import bebekAmira.defense.*;
import bebekAmira.fly.*;
import bebekAmira.sound.*;

public class Duck {

  private BehaviourFly behaviourFly;
  private BehaviourSound behaviourSound;
  private BehaviourAttack behaviourAttack;
  private BehaviourDefense behaviourDefense;

  public Duck(BehaviourFly f, BehaviourSound s, BehaviourAttack a, BehaviourDefense d) {
    this.behaviourFly = f;
    this.behaviourSound = s;
    this.behaviourAttack = a;
    this.behaviourDefense = d;
  }
  
  public void setBehaviourFly(BehaviourFly f) 
  {
    this.behaviourFly = f;
  }

  public void setBehaviourSound(BehaviourSound s) 
  {
    this.behaviourSound = s;
  }

  public void setBehaviourAttack(BehaviourAttack a) 
  {
    this.behaviourAttack = a;
  }

  public void setBehaviourDefense(BehaviourDefense d) 
  {
    this.behaviourDefense = d;
  }

  public void fly() {
    behaviourFly.fly();
  }

  public void sound() {
    behaviourSound.sound();
  }

  public void attack() {
    behaviourAttack.attack();
  }

  public void defense() {
    behaviourDefense.defense();
  }
}