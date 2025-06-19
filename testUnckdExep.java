import java.util.*;

class testUnckdExep{
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        if (b<=0){
            throw new uncheckedExep("Cannot divide by 0");
        }
        else{
            System.out.println("Result : "+(a/b));
        }
    }
}

class uncheckedExep extends RuntimeException{
    public uncheckedExep(String message){
        super(message);
    }
}