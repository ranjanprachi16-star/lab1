import java.util.Scanner;
public class week {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("enter the number");
num = sc.nextInt();
        String day;
switch(num)
{
    case 1:
day = "monday";
break;
    case 2:
day = "tuesday";
break;
    case 3:
day = "wednesday";
break;
    case 4:
day = "thrusday";
break;
    case 5:
day = "friday";
break;
    case 6:
day = "saturday";
break;
    case 7:
day = "sunday";
break;
    default:
day = "invalid";
break;
}
        System.out.println("the day is :" +day);
    }
    }