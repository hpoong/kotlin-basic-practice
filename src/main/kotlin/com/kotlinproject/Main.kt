package com.kotlinproject.start

import java.util.*
import kotlin.math.max
import kotlin.math.min
import kotlin.random.Random

fun main() {

    // *************** Hello World
    println("Hello World")



    // *************** 변수
    var ch01_num: Int = 10              // 타입 선언
    var ch01_name: String = "준석"       // 타입 선언
    var ch01_point = 3.3                // 타입 선언 x
    ch01_num = 20



    // *************** 상수
    val ch02_num = 10;
//    ch02_num =20;       // error



    // *************** 형변환
    var ch03_num_i = 10
    var ch03_num_l = 20L

    ch03_num_l = ch03_num_i.toLong();      // int to long
    ch03_num_i = ch03_num_l.toInt();       // long to int
//    ch03_num_l = (Long) ch03_num_i;      // error

    val ch03_name = "20";
    ch03_num_i = ch03_name.toInt();



    // *************** String
    var ch04_name = "hello";
    println(ch04_name.toUpperCase())
    println(ch04_name.toLowerCase())
    println(ch04_name[0])
    println("제 이름은 ${ch04_name} 입니다.")
    println("제 이름은 ${ch04_name + 10} 입니다.")



    // *************** max, min
    var ch05_num1 = 10
    var ch05_num2 = 20
    print(max(ch05_num1, ch05_num2))
    print(min(ch05_num1, ch05_num2))


    // ******* random
    println("random ======================================")
    val randomNumber = Random.nextInt(0, 100); // 0 ~ 99
    println(randomNumber)

    val randomNumber1 = Random.nextDouble(0.0, 1.0)
    println(randomNumber1)


    // *******  키보드 입력
    val reader = Scanner(System.`in`)
//    var test1 = reader.nextInt()
//    var test2 = reader.next()
//
//    println(test1)
//    println(test2)



    // *******  조건문
    println("조건문 ======================================")
    var i = 6
    if(i > 10)
        println("10 보다 크다")
    else if(i > 5)
        println("5 보다 크다")
    else
        println("else")


    // if문 대신 when 사용
    when {
        i > 10 ->
            println("10 보다 크다")
        i > 5 ->
            println("5 보다 크다")
        else ->
            println("else")
    }

    var result1 = when {
        i > 10 ->
            "10 보다 크다"
        i > 5 ->
            "5 보다 크다"
        else ->
            "else"
    }


    var result2 = if(i > 10)
        "10 보다 크다"
    else if(i > 5)
        "5 보다 크다"
    else
        "else"

    println("result1 : ${result1}")
    println("result2 : ${result2}")



    // JAVA : boolean result = i > 10 ? true : false;
    var it = 5;
    val result55 = if(it > 10) true else false
    println(result55)



    // *******  반복문
    println("반복문 ======================================")
    val items = listOf(1, 2, 3, 4, 5)
    for(item in items) {
        print("${item} ");
    }

    items.forEach { item ->
        if(item == 1) println()     // 라인변경
        print("${item} ");
    }

    // JAVA : for(int i=0; i< item.length; i++)
    for(i in 0..(items.size -1)) {
        if(i == 0) println()        // 라인변경
        print("${items[i]} ");
    }



    // ******* 리스트
    println("\n리스트 ======================================")
    var list = listOf(1, 2, 3, 4, 5)            // listOf는 변경이 불가능한 리스트
    var list1 = mutableListOf(1, 2, 3, 4, 5)    // mutableListOf는 변경이 가능한 리스트

    list1.add(6)
    list1.remove(2)

    list1.forEachIndexed  { index, item ->
        if(index == 0) println()
        print("${item} ")
    }



    // ******* 배열
    println("\n배열 ======================================")
    var arry = arrayOf(1, 2, 3)
    arry[0] = 1;
    println(arry[0])


    // ******* Exception
    println("\nException ======================================")
    try {
        var valueException = items[4];
    } catch (e: Exception) {
        println( e.message)
    }


    // ******* Null Safety
    println("Null Safety ======================================")
    var name: String? = null
    name = "준석"
    name = null

    var name2: String = ""
//    name2 = name      // error

    if(name != null) name2 = name
//    name2 = name!!      // 강제적으로 null이 아니라고 선언

    name?.let {
        name2 = name;
    }
    println(name2)



    // ******* 함수
    println("함수 ======================================")
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun sum1(a: Int, b: Int) = a + b                    // 한줄로도 표현가능 return type 생략 가능
    fun sum1(a: Int, b: Int, c: Int = 0) = a + b + c    // default 값 선언 가능

    var sumreult = sum(10, 20);
    println(sumreult)

    var sumreult1 = sum1(10, 20, 30);
    println(sumreult1)

    var sumreult3 = sum1(b = 10, a = 20);   // parm 지정 가능


    // ******* Class
    println("Class ======================================")
    class Person(val name: String, var age: Int)        // 기본 생성자 설정
    val john = Person("Join", 20)
    println(john.name)
    println(john.age)
//    john.name = "Hp"    // val로 인하여 수정 불가
    john.age = 10


    data class Person1(private val name: String, var age: Int)      // data를 앞에 붙임.
    val jack = Person1("Jack", 20)
    val jack1 = Person1("Jack", 20)
//    jack.name         // private으로 접근 불가
    println(jack)       // data 선언으로 toString 정의가 됨
    println(jack1)
    println(jack == jack1)



    // ******* get set
    println("get set ======================================")
    data class Person2(private val name: String, var age: Int) {
        var hobby = "축구"
            private set     // 외부에서 변경 할수없게 처리
            get() = "취미 : $field"
        
        init {
            println("init")
        }
        
        fun some() {        // 외부에서 변경 할수있게 처리
            hobby = "농구"
        }


    }

    val jack2 = Person2("Jack", 30)
//    jack2.hobby = 1       // error
    jack2.some();
    println(jack2.hobby)



    // ******* 상속 extend
    println("상속 extend ======================================")


    // 추상 class 상속
    abstract class Animal {
        open fun move() {       // open : 오버라이드 허용 : 기본 허용이 안됨.
            println("이동")
        }
    }

    class Dog: Animal() {
        override fun move() {
            println("껑충")
        }
    }

    class Cat: Animal() {
        override fun move() {
            println("살금")
        }
    }
    var dog = Dog()
    dog.move()


    // class 상속
    open class Hieoro()     // open : 일반 class는 상속이 불가능. open을 통해 상속 가능

    class SuperMan: Hieoro()



    // ******* 타입 체크 is
    println("타입 체크 is ======================================")











    
    













    










}



abstract class Animal {
    open fun move() {       // open : 오버라이드 허용 : 기본 허용이 안됨.
        println("이동")
    }
}

interface Drawable {
    fun draw()
}

interface Drawable1 {
    fun drop()
}

class Cat: Animal(), Drawable, Drawable1 {

    init {
        // ******* interface
        println("interface ======================================")
    }

    override fun move() {
        println("살금")
    }

    override fun draw() {
        println("draw")
    }

    override fun drop() {
        println("drop")
    }
}



