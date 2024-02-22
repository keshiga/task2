public class Main {

    public static boolean isValidEmailAddress(String email){
        if (email == null || email.isEmpty()) {
            System.out.println(email + "1");
            return false;
        }
            String regex = "[a-z0-9]";


                    //"[a:zA:Z0:9_+&*-]+(?:\\.[a:zA:Z0:9_+&*-])*@(a-zA-Z0-9-]+\\.)+[a:zA:Z]{2,7}$";
        System.out.println(email + "1");
        return email.matches(regex);
    }

    public static void main(String[] args) {
        String[] emails = {"test@example.com", "invalid.email", "another@example", "test123@gmail.com"};

        for (String email: emails){
            System.out.println(email+ " is valid: " + isValidEmailAddress(email));
        }
    }
}