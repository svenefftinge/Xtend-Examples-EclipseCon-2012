package hello.html

import hello.html.dom.Html
import hello.html.dom.Body
import hello.html.dom.P
import hello.html.dom.Node
import hello.html.dom.A
import hello.html.dom.H1
import hello.html.dom.H2
import hello.html.dom.Head
import hello.html.dom.Title
import hello.html.dom.Contents

class DomBuilder {
	
	def $(Node it, CharSequence contents) {
		addAndApply(it, new Contents) [
			text = contents
		]
	}
	
	def head(Html it, (Head)=>void init) {
		addAndApply(it, new Head, init)
	}
	def title(Head it, (Title)=>void init) {
		addAndApply(it, new Title, init)
	}
	
	def body(Html it, (Body)=>void init) {
		addAndApply(it, new Body, init)
	}
	
	def p(Node it, (P)=>void init) {
		addAndApply(it, new P, init)
	}
	
	def a(Node it, String href, (A)=>void init) {
		val a = new A
		a.href = href
		addAndApply(it, a, init)
	}
	def b(Node it, (A)=>void init) {
		addAndApply(it, new A, init)
	}
	
	def h1(Node it, (H1)=>void init) {
		addAndApply(it, new H1, init)
	}
	
	def h2(Node it, (H2)=>void init) {
		addAndApply(it, new H2, init)
	}
	
	def private <T extends Node> void addAndApply(Node parent, T t, (T)=>void init) {
		if (parent.contents == null)
			parent.contents = newArrayList
		parent.contents += t
		init.apply(t)
	}
}