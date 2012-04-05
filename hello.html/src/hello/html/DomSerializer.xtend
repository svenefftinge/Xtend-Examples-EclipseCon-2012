package hello.html

import hello.html.dom.A
import hello.html.dom.Contents
import hello.html.dom.Node

class DomSerializer {
	
	def serialize(Node n) {
		switch n {
			Contents : 
				n.text
				
			A : 
				'''<a href="«n.href»">«n.applyContents»</a>'''
				
			default : '''
				<«n.tagName»>
					«n.applyContents»
				</«n.tagName»>
			'''
		}
	}
	
	def private applyContents(Node n) {
		n.contents?.map([x | x.serialize])?.join
	}
}