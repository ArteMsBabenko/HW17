package lesson17;

public class Main {
	
	public static void main(String[] args) {
		
		Integer[] array = {10,2,-7,7,129,-3,0,4,25};
		
		Collection cl = new Collection(array);
		
		System.out.println("We display the array from beginning to end, replacing odd elements with null:");
		Iterator iteratorForward = cl.createForwardIterator();
		
		while(iteratorForward.hasNext()) {
			Integer next = iteratorForward.next();
			
			if(next % 2 != 0) {
				System.out.println("null");
			}
			else {
				System.out.println("next");
			}
		}
		System.out.println();
		
		System.out.println("display the array one element from the end to the beginning:");
		Iterator iteratorAnonymous = cl.createAnonymousIterator();
		
		int i =1;
		while(iteratorAnonymous.hasNext()) {
			Integer next = iteratorAnonymous.next();
			
			if(i % 3==0) {
				if(next % 2 != 0) {
				System.out.println(next);
				}
			}
			i++;
		}
		
		System.out.println();
		
		System.out.println("Print every fifth even element minus 100 of the array from beginning to end:");
		Iterator iteratorLocal = cl.createLocalIterator();
		
		int j = 1;
		while(iteratorLocal.hasNext()) {
			Integer next = iteratorLocal.next();
			
			if(j % 5==0) {
				if(next % 2==0) {
					System.out.println(next - 100);
				}
			}
			j++;
		}
		
		System.out.println();
		
		System.out.println("Print to the screen every second even element of the array from beginning to end:");
		Iterator iteratorStatic = Collection.createStaticIterator();
		
		int k =1;
		
		while(iteratorStatic.hasNext()) {
			Integer next =iteratorStatic.next();
			
			if(k % 2==0) {
				if (next % 2 ==0) {
					System.out.println(next + 1);
				}
			}
			k++;
		}
	}

}
