package com.kotlinproject.start

import java.util.*
import kotlin.random.Random

fun main() {


    // ******* random
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
    val items = listOf(1, 2, 3, 4, 5)
    for(item in items) {
        print("${item} ");
    }

    items.forEach { item ->
        print("${item} ");
    }

    // for(int i=0; i< item.length; i++)
    for(i in 0..(items.size -1)) {
        print("${i} ");
    }





}

