package ru.tele2.govorova.java.basic.homeworks.homework30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class Homework30Test {


    @Test
    void arrayAfterLastOne() {
        Assertions.assertArrayEquals(new int[]{2, 2}, Homework30.arrayAfterLastOne(new int[]{1, 2, 1, 2, 2}));
    }


    @Test
    public void testRuntimeExceptionArrayAfterLastOne() {
        Assertions.assertThrows(RuntimeException.class, () -> Homework30.arrayAfterLastOne(new int[]{2, 2, 2, 2}));
    }

    @ParameterizedTest
    @MethodSource("IsArrayOfOneTwoTrue")
    public void isArrayOfOneTwoTrue(int[] array) {

        Assertions.assertTrue(Homework30.isArrayOfOneTwo(array));
    }


    public Stream<Arguments> IsArrayOfOneTwoTrue() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new int[]{1, 2}));
        out.add(Arguments.arguments(new int[]{1, 2, 2, 1}));
        return out.stream();
    }

    @ParameterizedTest
    @MethodSource("IsArrayOfOneTwoFalse")
    public void isArrayOfOneTwoFalse(int[] array2) {

        Assertions.assertFalse(Homework30.isArrayOfOneTwo(array2));
    }


    public Stream<Arguments> IsArrayOfOneTwoFalse() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new int[]{1, 1}));
        out.add(Arguments.arguments(new int[]{1, 3}));
        return out.stream();
    }
}