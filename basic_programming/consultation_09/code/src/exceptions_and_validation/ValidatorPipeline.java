package exceptions_and_validation;

import java.util.ArrayList;
import java.util.List;

public class ValidatorPipeline implements Validator {

    private List<Validator> validators; // список всех валидаторов

    public ValidatorPipeline() {
        validators = new ArrayList<>();
    }

    @Override
    public void validate(String value) {
        for (Validator validator : validators) { // прогоняем строку по всем валидаторам
            validator.validate(value); // проверяем строку на конкретном валидаторе
        }
    }

    public void addValidator(Validator validator) {
        validators.add(validator);
    }
}
