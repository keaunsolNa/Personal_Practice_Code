package list;

public class Polynomial {
	// Invariant : there are no null references; the terms are held in
	// the nodes of a circular linked list with a dummy header node;
	// the terms are sorted by decreasing order of their exp fields;
	private Node head = new Node(new Term(0.0, -1));
	
	public static final Polynomial ZERO = new Polynomial();
	
	public Polynomial() {
		head.next = head;
	}
	
	public Polynomial(double coef, int exp) {
		this(new Term(coef, exp));
	}
	
	public Polynomial(Term term) {
		if(term.equals(Term.ZERO)) head.next = head;
		else head.next = new Node(term, head);
	}
	
	public Polynomial(Polynomial poly) {		// copy constructor
		if(poly.equals(ZERO)) head.next = head;
		else {
			Node pp = head;
			for(Node p = poly.head.next; p!=poly.head; p = p.next)
				pp = pp.next = new Node(p.term);
			pp.next = head;
		}
	}
	
	public int degree() {
		return head.next.term.getExp();
	}
	
	public boolean equals(Object object) {
		if(!(object instanceof Polynomial)) return false;
		Polynomial polynomial = (Polynomial) object;
		Node p = polynomial.head.next, pp = head.next;
		while(p!=head)
			if(!(p.term.equals(pp.term))) return false;
		return true;
	}
	
	public Polynomial plus(Polynomial poly) {
		if(poly.equals(ZERO)) return this;
		Polynomial result = new Polynomial(this);
		for(Node p = poly.head.next; p!=poly.head; p= p.next) {
			result = result.plus(p.term);
			p = p.next;
		}
		return result;
	}
	
	public Polynomial plus (Term term) {
		if(term.equals(Term.ZERO)) return this;
		Polynomial result = new Polynomial(this);
		Node p = result.head;
		while(p.next.term.getExp() > term.getExp())
			p = p.next;
		if(p.next.term.getExp() == term.getExp())
			p.next.term = p.next.term.plus(term);
		else p.next = new Node(term, p.next);
		return result;
	}
	
	public Polynomial times(double factor) {
		if(factor == 0.0) return ZERO;
		Polynomial result = ZERO;
		for(Node p = head.next; p != head; p = p.next) 
			result = result.plus(p.term.times(factor));
		return result;
	}
	
	public Polynomial times(Term term) {
		if(term.equals(Term.ZERO)) return ZERO;
		Polynomial result = ZERO;
		for(Node p =  head.next; p != head; p = p.next)
			result = result.plus(p.term.times(term));
		return result;
	}
	
	public Polynomial times(Polynomial polynomial) {
		if(polynomial.equals(ZERO)) return ZERO;
		Polynomial result = ZERO;
		for(Node p = head.next; p != head; p = p.next) 
			result = result.plus(polynomial.times(p.term));
		return result;
	}
	
	public String toString() {
		if(degree() < 0) return "0";
		Node p = head.next;
		StringBuffer buf = new StringBuffer(p.term.toString());
		for(p = p.next; p != head; p = p.next)
			buf.append((p.term.getCoef()<0 ? "-":"+")+p.term.abs());
		return buf.toString();
	}
	
	public double valueAt(double x) {
		if(degree() < 0) return 0.0;
		double y = head.next.term.getCoef();
		int e = head.next.term.getExp();
		for(Node p = head.next.next; p!=head; p = p.next) {
			int ee = e;
			e = p.term.getExp();
			y = y*Math.pow(x,ee-e) + p.term.getCoef();
		}
		return y;
	}
	
	private static class Node{
		Term term;
		Node next;
		Node(Term term) { this.term = term;}
		Node(Term term, Node next){this(term); this.next = next;}
	}
}
