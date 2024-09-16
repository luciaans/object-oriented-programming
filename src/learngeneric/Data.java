package learngeneric;

public class Data<T> {
    private T data;
    Data(T data) {this.data = data;}
    T getData() {return data;}
}
