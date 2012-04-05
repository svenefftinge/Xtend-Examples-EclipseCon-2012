package hello.operators;

import java.text.NumberFormat;
import java.util.Locale;

@SuppressWarnings("all")
public class Distance {
  private int mm;
  
  public Distance(final int mm) {
    this.mm = mm;
  }
  
  public Distance operator_plus(final Distance other) {
    int _plus = (this.mm + other.mm);
    Distance _distance = new Distance(_plus);
    return _distance;
  }
  
  public Distance operator_minus(final Distance other) {
    int _minus = (this.mm - other.mm);
    Distance _distance = new Distance(_minus);
    return _distance;
  }
  
  public Distance operator_multiply(final int times) {
    int _multiply = (this.mm * times);
    Distance _distance = new Distance(_multiply);
    return _distance;
  }
  
  public String toString() {
    NumberFormat _numberInstance = NumberFormat.getNumberInstance(Locale.GERMAN);
    String _format = _numberInstance.format(this.mm);
    String _plus = (_format + "mm");
    return _plus;
  }
  
  public Distance operator_divide(final int times) {
    int _divide = (this.mm / times);
    Distance _distance = new Distance(_divide);
    return _distance;
  }
  
  public static Distance mm(final int millimeters) {
    Distance _distance = new Distance(millimeters);
    return _distance;
  }
  
  public static Distance cm(final int centimeters) {
    int _multiply = (centimeters * 10);
    Distance _mm = Distance.mm(_multiply);
    return _mm;
  }
  
  public static Distance m(final int meters) {
    int _multiply = (meters * 100);
    Distance _cm = Distance.cm(_multiply);
    return _cm;
  }
  
  public static Distance km(final int kilometers) {
    int _multiply = (kilometers * 1000);
    Distance _m = Distance.m(_multiply);
    return _m;
  }
  
  public boolean equals(final Object obj) {
    boolean _switchResult = false;
    boolean _matched = false;
    if (!_matched) {
      if (obj instanceof Distance) {
        final Distance _distance = (Distance)obj;
        _matched=true;
        boolean _equals = (this.mm == _distance.mm);
        _switchResult = _equals;
      }
    }
    if (!_matched) {
      boolean _equals = super.equals(obj);
      _switchResult = _equals;
    }
    return _switchResult;
  }
  
  public int hashCode() {
    return this.mm;
  }
}
