package lesson3;
//
//public class Lesson3 {
//
//public static int number = 5;
//
//public int nonStaticNum
//}

public class Lesson3 {

    public static int number = 5; //статическа переменна класса

    public int nonStaticNum;  //переменная экземплра
    void setNonStaticNum (int num) {
        nonStaticNum = num;
    }

    public void method() {
        int temp = 6; //локальная переменная
        temp = temp + 7;
    }
}
