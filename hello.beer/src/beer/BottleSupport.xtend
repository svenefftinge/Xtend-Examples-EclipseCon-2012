package beer

class BottleSupport {
	
	def static bottles(int i) {
		switch i {
			case 0 : 'no more bottles'
			case 1 : 'one bottle'
			default : '''«i» bottles'''
		}.toString
	}
	
	def static Bottles(int i) {
		bottles(i).toFirstUpper
	}
}