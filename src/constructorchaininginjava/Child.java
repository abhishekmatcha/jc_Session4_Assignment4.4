package constructorchaininginjava;



	public class Child extends Parent {
		public Child() {
			this("Appu");
			System.out.println("Child  no-args constructor called");
		}

		public Child(String name) {
			super("Appu");
			System.out.println("Child constructor called by " + name);
		}

		public static void main(String args[]) {
			Child c = new Child();
		}
	}
	
