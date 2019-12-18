# Annotations

#### 1) [Аннотация принимающая параметры для метода](https://github.com/AlSidorenko/Annotations/tree/master/src/com/company/task_001)
Создать аннотацию , которая принимает параметры для метода . 
Написать код, который вызовет метод, помеченный этой аннотацией, и передаст параметры аннотации в
вызываемый метод.

@Test(a=2, b=5)
public void test(
int a, int b) {…}

#### 2) [Механизм сохраняющий текст в файл](https://github.com/AlSidorenko/Annotations/tree/master/src/com/company/task_002)
Написать класс TextContainer , который содержит в себе строку. С помощью механизма
аннотаций указать 1) в какой файл должен сохраниться текст 2) метод, который выполнит
сохранение. Написать класс Saver , который сохранит поле класса TextContainer в указанный
файл.
@SaveTo (path=“ file.txt”)
class Container {
    String text = “…”;
    @Saver
    public void save(..) {…}
  }

#### 3) [Серелизация и десерилизация полей класса](https://github.com/AlSidorenko/Annotations/tree/master/src/com/company/task_003)
Написать код, который сериализирует и десериализирует в/из файла все значения полей
класса, которые отмечены аннотацией @Save.