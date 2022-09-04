package abstractDataTypes;

public class ArrayBag implements Bag {
	private Object[] objects = new Object[1000];
	private int size, i;

	@Override
	public void add(Object object) {
		objects[size++] = object;
		System.out.println("추가된 object : " + object);
	}

	@Override
	public boolean contains(Object object) {
		for(int i = 0; i < size; i++)
			if(objects[i] == object) return true;
		return false;
	}

	@Override
	public Object getFirst() {
		i = 0;
		return objects[i++];
	}

	@Override
	public Object getNext() {
		return objects[i++];
	}

	@Override
	public boolean remove(Object object) {
		for(int i = 0; i < size; i++)
			if(objects[i] == object) {
				System.out.println("REMOVE METHOD 삭제 전 SIZE : " + size);
				System.out.println("제거하고자 하는 object : " + object);
				System.arraycopy(objects, i+1, objects, i, size-i-1);
				objects[--size] = null;
				System.out.println("REMOVE METHOD 삭제 후 SIZE : " + size);
				return true;
			}
		return false;
	}

	@Override
	public int size() {
		return size;
	}
}
