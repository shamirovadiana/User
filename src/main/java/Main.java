import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        boolean isRight = true;

        int step = 0;
        while (isRight) {
            switch (step) {
                case 0:
                    try {
                        System.out.println("Введите id пользователя :");
                        Integer id = Integer.parseInt(scanner.nextLine());
                        user.setId(id);
                        step++;
                        isRight = true;
                    } catch (Exception e) {
                        System.out.println("Вы ввели не число! Попробуйте снова!");
                    }
                    break;
                case 1:
                    System.out.println("Введите имя пользователя :");
                    String firstName = scanner.nextLine();
                    user.setFirstName(firstName);
                    step++;
                    isRight = true;
                    break;
                case 2:
                    System.out.println("Введите фамилию пользователя :");
                    String lastname = scanner.nextLine();
                    user.setLastName(lastname);
                    step++;
                    isRight = true;
                    break;
                case 3:
                    try {
                        System.out.println("Введите номер сотового телефона :");
                        Long phone = Long.parseLong(scanner.nextLine());
                        user.setPhone(phone);
                        step++;
                        isRight = true;
                    } catch (Exception e) {
                        System.out.println("Вы ввели не число! Попробуйте снова!");
                    }
                    break;
                case 4:
                    try {
                        System.out.println("Введите возраст пользователя :");
                        Integer age = Integer.parseInt(scanner.nextLine());
                        user.setAge(age);
                        step++;
                        isRight = true;
                    } catch (Exception e) {
                        System.out.println("Вы ввели не число! Попробуйте снова!");
                    }
                    break;
                case 5:
                    System.out.println("Введите адрес пользователя :");
                    String address = scanner.nextLine();
                    user.setAddress(address);
                    step++;
                    isRight = true;
                    break;
                case 6:
                    try {
                        System.out.println("Введите номер домашнего телефона пользователя :");
                        Long homePhone = Long.parseLong(scanner.nextLine());
                        user.setHomePhone(homePhone);
                        step++;
                        isRight = true;
                    } catch (Exception e) {
                        System.out.println("Вы ввели не число! Попробуйте снова!");
                    }
                    break;
                default :
                    isRight = false;
            }
        }

        System.out.println(user.toString());

    }



}
