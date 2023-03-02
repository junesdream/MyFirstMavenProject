import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class LoopExerTest {

        @Test
        public void testFactorialOfZero() {

            assertEquals(1, LoopExer.calculateFactorial(0));
        }

        @Test
        public void testFactorialOf1() {
            int n = 0;

            int result = LoopExer.calculateFactorial(n);

            assertEquals(1, LoopExer.calculateFactorial(0));
        }

        @Test
        public void testFactorialOf2() {
            int n = 1;

            int actual = LoopExer.calculateFactorial(n);

            assertEquals(1, LoopExer.calculateFactorial(2));
        }

        @Test
        public void testFactorialOf3() {
            int n = 2;

            int actual = LoopExer.calculateFactorial(n);

            assertEquals(1, LoopExer.calculateFactorial(2));
        }

        @Test
        public void testFactorialOf4() {
            int n = 3;

            int actual = LoopExer.calculateFactorial(n);

            assertEquals(6, LoopExer.calculateFactorial(3));
        }

}
