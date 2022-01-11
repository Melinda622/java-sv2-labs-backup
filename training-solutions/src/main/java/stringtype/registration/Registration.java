package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username:");

        String userName = scanner.nextLine();
        System.out.println("Please enter your password:");
        String password1 = scanner.nextLine();

        System.out.println("Please enter your password one more time:");
        String password2 = scanner.nextLine();

        System.out.println("Please enter your email address:");
        String email = scanner.nextLine();

        UserValidator user = new UserValidator();

        System.out.println(user.isValidUserName(userName) ? "Username ok." : "Username missing! Please enter a Username!");
        System.out.println(user.isValidPassword(password1, password2) ? "Password ok." : "Please enter a valid password (min 8 characters)!");
        System.out.println(user.isValidEmail(email) ? "Email address ok." : "Please enter a valid email address!");
    }
}
