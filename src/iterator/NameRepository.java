package iterator;

public class NameRepository implements Container {

	public String names[] = {
		"Ivan",
		"Peter",
		"Georgi"
	};
	
	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}
	
	private class NameIterator implements Iterator {

		private int index;
		private Object current;
		
		@Override
		public boolean hasNext() {
			if(this.index < names.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			
			if(this.hasNext()) {
				this.current = names[this.index];
				this.index++;
				return this.current;
			}

			return null;
		}
		
	}
	

}
