public final class Immutablebox<T>{
  final T value;
     public Immutablebox(T value){
       this.value=value;
}
     public T getvalue(){
        return value;
     }
}