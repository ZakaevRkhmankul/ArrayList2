import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//    Озунуздун Exception классынызды тузунуз.
// Employee деген класс тузунуз (свойства: name, age, job).
// Age берип жатканда эгерде минус сан болсо, тузгон Exception классынызды ыргытыныз.
// ArrayList тузуп аны жумушчулар менен толтурунуз, бироосунун жашын минус сан менен
// бериниз, бир элементин null деп бериниз.
// Элементтеринин маалыматтарын консолго чыгарыныз.
// Жок индексине да кайрылып корунуз.
// Болушу мумкун болгон бардык каталарга оз озунчо catch блогун жазыныз.
// finally блогун кошунуз акырында “Бутту” деп программаны бутурунуз

        ArrayList<Employee>employees = new ArrayList<>(List.of(
                new Employee("Abu",18,"Bank"),
                new Employee("Elaman",21,"Teacher"),
                new Employee("Aitegin",-20,"School"),
                new Employee("Emir",17,"Biulder"),
                new Employee("Adilet",24,null)));

        for (Employee employee: employees){
            try {
                if (employee.getAge() < 0){
                    throw new MinusException("Error!");
                }else {
                    System.out.println(employee);
                }
            }catch (MinusException e){
                System.out.println("Error!");
            }
        }
    }
}