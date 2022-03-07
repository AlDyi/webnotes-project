package notes;

public class Validation {
    public int validateLogIn(String password) {
        String specialChars = "~`[]#$%^&*()-_=+\\|[{]};:'\",<.>/?";
        char currentCharacter;
        int numberPresent = 1;
        int upperCasePresent = 2;
        int lowerCasePresent = 3;
        int specialCharacterPresent = 4;

        for (int i = 0; i < password.length(); i++) {
            currentCharacter = password.charAt(i);
            if (Character.isDigit(currentCharacter)) {
                numberPresent = 0;
            } else if (Character.isUpperCase(currentCharacter)) {
                upperCasePresent = 0;
            } else if (Character.isLowerCase(currentCharacter)) {
                lowerCasePresent = 0;
            } else if (specialChars.contains(String.valueOf(currentCharacter))) {
                specialCharacterPresent = 0;
            }
        }
        if (numberPresent != 0)
            return numberPresent;
        if (upperCasePresent != 0)
            return upperCasePresent;
        if (lowerCasePresent != 0)
            return lowerCasePresent;
        if (specialCharacterPresent != 0)
            return specialCharacterPresent;
        return 0;
    }
}
