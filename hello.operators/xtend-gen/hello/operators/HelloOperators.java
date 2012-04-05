package hello.operators;

import hello.operators.Distance;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class HelloOperators {
  @Test
  public void testOperators() {
    Distance _cm = Distance.cm(23);
    Distance _mm = Distance.mm(10);
    Distance _cm_1 = Distance.cm(22);
    Distance _plus = _mm.operator_plus(_cm_1);
    Assert.assertEquals(_cm, _plus);
    Distance _km = Distance.km(3);
    Distance _km_1 = Distance.km(1);
    Distance _multiply = _km_1.operator_multiply(3);
    Assert.assertEquals(_km, _multiply);
    Distance _mm_1 = Distance.mm(1019997);
    Distance _km_2 = Distance.km(1);
    Distance _m = Distance.m(20);
    Distance _plus_1 = _km_2.operator_plus(_m);
    Distance _mm_2 = Distance.mm(3);
    Distance _minus = _plus_1.operator_minus(_mm_2);
    Assert.assertEquals(_mm_1, _minus);
  }
}
