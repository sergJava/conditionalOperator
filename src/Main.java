public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int age = 17;
        if (age>=18){
            System.out.println("если возраст человека равен " +age +", то он совершеннолетний");
        } else {
            System.out.println("если возраст человека равен " +age +", то он не достиг " +
                    "совершеннолетия, надо подождать");
        }
        System.out.println("_______________________________________________________________________");

        System.out.println("Task 2");
        int temperature = 4;
        System.out.print("На улице " +temperature +" градусов,");
        if(temperature >=5){
            System.out.print(" можно идти без шапки.");
        } else {
            System.out.print(" нужно надеть шапку.");
        }
        System.out.println("_______________________________________________________________________");

        System.out.println("Task 3");

    }
}