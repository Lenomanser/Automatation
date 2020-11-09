package Task_11;
import java.io.File;

abstract class TextInput {
    public abstract boolean Validate(String stringBuilder);

}
class TextIntegerValidate {
    public  boolean Validate(String stringBuilder) {
        try {
            double base = Double.parseDouble(stringBuilder);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}

class FloatTextInput extends TextIntegerValidate {

    public  boolean Validate(String stringBuilder) {
       try {
            if (super.Validate(stringBuilder)==true) {
                int valid = Integer.parseInt(stringBuilder);
                return false;
            } else
                return false;

        } catch (NumberFormatException ex) {
            return true;

        }
    }
}
public class task_11 {
    public static void main(String[] args) {
        FloatTextInput validationСheck = new FloatTextInput();
        System.out.println(validationСheck.Validate("2355.7"));

    }
}