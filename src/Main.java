public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }
    public static void task1(){
        System.out.println(" Задача 1 ");
        String firstName = "Ivan";
        String lastName = " Ivanov";
        String middleName = " Ivanovich";
        String fullName = firstName+middleName+ lastName;
        System.out.println(" ФИО сотрудника " + fullName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }
    public static void task2(){
        System.out.println(" Задача 2 ");
        String fullName = " Иванов Семён Семёнович ";
        fullName=fullName.replace("ё", "е");
        System.out.println(fullName);

    }
    }



