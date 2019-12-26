public class ConditionalStatement {
    public static void main(String[] args) {
    
        int age = 18;
        char sex = 'F';
        float height = 1.70f;
        char firstLetterOfTheName = 'T';
        
        if(age > 20) {
            System.out.println("Your age is over 20.");
        }

        if(sex == 'M') {
            System.out.println("You are a man.");
        }

        if(sex != 'M') {
            System.out.println("You are not a man.");
        }

        if(height < 1.80) {
            System.out.println("Your height is less than 1.80.");
        } else {
            System.out.println("Your height is more than 1.80.");
        }

        if(firstLetterOfTheName == 'M') {
            System.out.println("Your first letter of the name is M.");
        } else if(firstLetterOfTheName == 'I') {
            System.out.println("Your first letter of the name is I.");
        } else {
            System.out.println("Your first letter of the name is undefined.");
        } 
    }
}
