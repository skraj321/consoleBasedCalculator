import java.util.Scanner;
class Calculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter your 1st value:");
        int num1=sc.nextInt();
        System.out.println("enter your 2nd value:");
        int num2=sc.nextInt();
        System.out.println("select your operator to perform operation");
        System.out.println("1:'+',2:'-',3:'*',4:'/',5:'%' ");
        int value=sc.nextInt();
        switch (value){
            case 1:
                double sum=num1+num2;
                System.out.println(sum);
                break;
            case 2:
                double sub=num1-num2;
                System.out.println(sub);
                break;
            case 3:
                double multi=num1*num2;
                System.out.println(multi);
                break;
            case 4:
                double division=num1/num2;
                System.out.println(division);
                break;
            case 5:
                double module=num1%num2;
                System.out.println(module);
                break;
            default:
            System.out.println("invalid input");

        }

    }
}