import java.util.Scanner;
class InvalidLoginException extends Exception {
    public InvalidLoginException(String message) {
        super(message);
    }
}
class UserLogin{
    private String storedUsername="anu";
    private String storedPassword="anu123";
    public void login(String username, String password) throws InvalidLoginException {
        if(!username.equals(storedUsername) || !password.equals("storedPassword")){
            throw new InvalidLoginException("Invalid login credentials");
        }else{
            System.out.println("Logged in successfully");
        }
    }
}
public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserLogin loginSystem = new UserLogin();

        System.out.println("Enter your username: ");
        String username = sc.nextLine();
        System.out.println("Enter your password: ");
        String password = sc.nextLine();
        try{
            loginSystem.login(username, password);
        }catch(InvalidLoginException e){
            System.out.println("Exception caught" + e.getMessage());
        }
    }
}