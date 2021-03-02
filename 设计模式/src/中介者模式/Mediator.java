package 中介者模式;

abstract class Mediator {
    public abstract void Send(String message,Colleague colleague);
}
