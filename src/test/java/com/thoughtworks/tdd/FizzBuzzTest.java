package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {
    //1
    //2
    //Fizz
    //4
    //Buzz
    //Fizz
    //Whizz
    //8
    //Fizz
    //Buzz
    //11
    //Fizz
    //Fizz
    //Whizz
    //FizzBuzz
    //16
    //17
    //Fizz
    //19
    //Buzz
    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    public void NormalNumber_should_return_itself() {
        assertThat(fizzBuzz.beenCalled(1), is( "1"));
        assertThat(fizzBuzz.beenCalled(2), is( "2"));
        assertThat(fizzBuzz.beenCalled(4), is( "4"));
    }
    @Test
    public void mutiples_of_three_should_return_fizz() {
        assertThat(fizzBuzz.beenCalled(3), is( "Fizz"));
        assertThat(fizzBuzz.beenCalled(6), is( "Fizz"));
        assertThat(fizzBuzz.beenCalled(9), is( "Fizz"));
    }
    @Test
    public void mutiples_of_five_should_return_buzz() {
        assertThat(fizzBuzz.beenCalled(5), is( "Buzz"));
        assertThat(fizzBuzz.beenCalled(10), is( "Buzz"));
        assertThat(fizzBuzz.beenCalled(20), is( "Buzz"));
    }

    @Test
    public void mutiples_of_seven_should_return_whizz() {
        assertThat(fizzBuzz.beenCalled(7), is( "Whizz"));
        assertThat(fizzBuzz.beenCalled(14), is( "Whizz"));
        assertThat(fizzBuzz.beenCalled(28), is( "Whizz"));
    }
    @Test
    public void mutiples_of_three_and_five_should_return_fizzbuzz() {
        assertThat(fizzBuzz.beenCalled(15), is( "FizzBuzz"));
        assertThat(fizzBuzz.beenCalled(45), is( "FizzBuzz"));
    }
    @Test
    public void mutiples_of_three_and_seven_should_return_fizzwhizz() {
        assertThat(fizzBuzz.beenCalled(21), is( "FizzWhizz"));
        assertThat(fizzBuzz.beenCalled(42), is( "FizzWhizz"));
        assertThat(fizzBuzz.beenCalled(63), is( "FizzWhizz"));
    }
    @Test
    public void mutiples_of_five_and_seven_should_return_buzzwhizz() {
        assertThat(fizzBuzz.beenCalled(35), is( "BuzzWhizz"));
        assertThat(fizzBuzz.beenCalled(70), is( "BuzzWhizz"));
    }

    @Test
    public void mutiples_of_three_five_seven_should_return_fizzbuzzwhizz() {
        assertThat(fizzBuzz.beenCalled(105), is( "FizzBuzzWhizz"));
    }
}
