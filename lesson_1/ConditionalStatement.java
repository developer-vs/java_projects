public class ConditionalStatement {
    public static void main(String[] args) {    
        int age = 18;         
        if(age > 20) {
            System.out.println("Your age is over 20.");
        }

        boolean isMale = true;
        if(isMale) {
            System.out.println("You are a man.");
        }

        if(!isMale) {
            System.out.println("You are not a man.");
        }

        float height = 1.70f;
        if(height < 1.80) {
            System.out.println("Your height is less than 1.80.");
        } else {
            System.out.println("Your height is more than 1.80.");
        }

        char firstLetterOfTheName = 'T';
        if(firstLetterOfTheName == 'M') {
            System.out.println("Your first letter of the name is M.");
        } else if(firstLetterOfTheName == 'I') {
            System.out.println("Your first letter of the name is I.");
        } else {
            System.out.println("Your first letter of the name is undefined.");
        } 
    }
}
