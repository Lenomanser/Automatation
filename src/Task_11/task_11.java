package Task_11;
import java.io.File;

abstract class TextInput {
    public abstract boolean Validate(String stringBuilder);

}
class TextIntegerValidate {
    public static boolean Validate(String stringBuilder) {
        try {
            double base = Double.parseDouble(stringBuilder);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
class FloatTextInput extends TextIntegerValidate {
    public static boolean Validate(String stringBuilder) {
       try {
            if (TextIntegerValidate.Validate(stringBuilder)==true) {
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
        System.out.println(FloatTextInput.Validate("233.7"));

    }
}