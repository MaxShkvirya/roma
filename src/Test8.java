/*Пояснение: Перед выполнением любых арифметических операций значения
 типа byte, short, char автоматически преобразовываются к типу int.
 Поэтому результат умножения также будет иметь тип int, а значит во время компиляции
 будет обнаружена ошибка несоответствия типов – переменной byte k нельзя присвоить значение типа int.
* */
public class Test8 {
    public static void main( String[] args ) {
        byte i = 2;
        byte j = 2;
     //   byte k = i * j;
      //  System.out.println(k);
    }
}
