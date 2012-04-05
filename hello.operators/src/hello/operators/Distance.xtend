package hello.operators

import java.text.NumberFormat
import java.util.Locale

class Distance {
	int mm
	
	new(int mm) {
		this.mm = mm
	}
	
	def operator_plus(Distance other) {
		new Distance(this.mm + other.mm)
	}
	
	def operator_minus(Distance other) {
		new Distance(this.mm - other.mm)
	}

	def operator_multiply(int times) {
		new Distance(this.mm * times)
	}
	
	override toString() {
		NumberFormat::getNumberInstance(Locale::GERMAN).format(mm) + "mm"
	}
	
	def operator_divide(int times) {
		return new Distance(this.mm / times)
	}
	
	def static mm(int millimeters) {
		new Distance(millimeters)
	}
	
	def static cm(int centimeters) {
		mm(centimeters * 10)
	}
	
	def static m(int meters) {
		cm(meters * 100)
	}
	
	def static km(int kilometers) {
		m(kilometers * 1000)
	}
	
	override equals(Object obj) {
		switch obj {
			Distance : this.mm == obj.mm
			default : super.equals(obj) 
		}
	}
	
	override hashCode() {
		this.mm
	}
	
}
