import java.util.*;

class testCustomExep{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int a=sc.nextInt();
        try{
            checkAge(a);
        }catch(checkedExep e){
            System.out.println(e.getMessage());
        }
    }

    static void checkAge(int i) throws checkedExep{
        if(i<18){
            throw new checkedExep("Still not old enough!");
        }
        System.out.print("\nGood to go");
    }
}

class checkedExep extends Exception{
    public checkedExep(String message){
        super(message);
    }
}