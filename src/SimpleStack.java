
public class SimpleStack {

	public static String[] data;
	public static int length;
	
public SimpleStack() {
		data = new String[0];
		length = 0;
	}
	public boolean empty() {
		return (length == 0) ? true : false;
	}
	public String peek() {
			if (length == 0) {
				throw new IndexOutOfBoundsException("Index " + length + " out of bounds for length " + length);
			} else {
				return data[length - 1];
		}
	}
	public String pop() {
		String pop = data[length - 1];
			if (length == 0) {
				throw new IndexOutOfBoundsException();
			} else {
				data[length - 1] = null;
				length--;
				return pop;
		}
	}
	public void push(String str) {
		addSpace();
		length++;
		data[length - 1] = str;
	}
	public int search(String str) {
			for (int x = 0; x < length; x++) {
				if (data[x] == str) return length - x;
		}
			return -1;
	}
	public String toString() {
		String concat = "[";
			for (int x = 0; x < length - 1; x++) {
				concat += data[x] + ", ";
		}
			concat += (length != 0) ? data[length - 1] + "]" : "]" ;
			return concat;
	}
	public void addSpace() {
			if (data.length == length) {
				String[] temporary = new String[length + 10];
			for(int x = 0; x < length; x++) {
				temporary[x] = data[x];
			}
			data = temporary;
		}
	}
}
