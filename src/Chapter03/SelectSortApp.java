package Chapter03;

 class SelectSortApp {

	public static void main(String[] args) {
		int maxsize = 100;
		ArraySel arr;
		arr =new ArraySel(maxsize);
		
		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);
		
		arr.display();
		arr.SelectionSort();
		System.out.println(" ");
		arr.display();
	}

}
