public class findmedian {

    public static void main(String[] args) {
	HeapMin hn = new HeapMin();
	HeapMax hx = new HeapMax();
	Scanner s = new Scanner();
	int N = new Integer(s.next());
	for (int i==0;i<N;i++) {
	    hn.add(new Integer(s.next()));
	}

         }

}

class HeapMax {

    private int[] arr = new int[100];
    public int num_elem = 0;


    public void add(int val) {

	num_elem++;

	arr[num_elem] = val;
	int entry = num_elem;
	int parent = -1;
	while (entry > 0) {
	    //System.out.println(entry);
	    parent = entry/2;
	    if (arr[parent] < arr[entry]) {
		int tmp = arr[parent];
		arr[parent] = arr[entry];
		arr[entry] = tmp;
		entry = parent;
	    }
	    else {
		break;
	    }
	}
	//num_elem++;

    }

    public int get_min() {
	if (num_elem==0) {
	    System.out.print("Error: no elem to get");
	    return -1;
	}
	int val = arr[1];
	arr[1] = arr[num_elem];
	int entry = 1;
	//Update heap after switching last element for root
	while (2*entry+1 <= num_elem) {
	    //System.out.println("get:"+entry);
	    if (arr[entry] > arr[2*entry] || arr[entry] > arr[2*entry+1]) {
		if (arr[2*entry] <= arr[2*entry+1]) {
		    int tmp = arr[entry];
		    arr[entry] = arr[2*entry+1];
		    arr[2*entry+1] = tmp;
		    entry = 2*entry+1;
		}
		if (arr[2*entry+1] < arr[2*entry]) {
                    int tmp = arr[entry];
                    arr[entry] = arr[2*entry];
                    arr[2*entry] = tmp;
                    entry = 2*entry;
		}
	    }
	    else {
		break;
	    }
	}
	if (2*entry < num_elem && arr[entry] < arr[2*entry]) {
	    int tmp = arr[entry];
	    arr[entry] = arr[2*entry];
	    arr[2*entry] = tmp;
	}
	num_elem--;
	return val;
    }

    public int peek() {
	return arr[num_elem];
    }
 
}

class HeapMin {

    private int[] arr = new int[100];
    public int num_elem = 0;


    public void add(int val) {

	num_elem++;

	arr[num_elem] = val;
	int entry = num_elem;
	int parent = -1;
	while (entry > 0) {
	    //System.out.println(entry);
	    parent = entry/2;
	    if (arr[parent] > arr[entry]) {
		int tmp = arr[parent];
		arr[parent] = arr[entry];
		arr[entry] = tmp;
		entry = parent;
	    }
	    else {
		break;
	    }
	}
	//num_elem++;

    }

    public int get_min() {
	if (num_elem==0) {
	    System.out.print("Error: no elem to get");
	    return -1;
	}
	int val = arr[1];
	arr[1] = arr[num_elem];
	int entry = 1;
	//Update heap after switching last element for root
	while (2*entry+1 <= num_elem) {
	    //System.out.println("get:"+entry);
	    if (arr[entry] > arr[2*entry] || arr[entry] > arr[2*entry+1]) {
		if (arr[2*entry] >= arr[2*entry+1]) {
		    int tmp = arr[entry];
		    arr[entry] = arr[2*entry+1];
		    arr[2*entry+1] = tmp;
		    entry = 2*entry+1;
		}
		if (arr[2*entry+1] > arr[2*entry]) {
                    int tmp = arr[entry];
                    arr[entry] = arr[2*entry];
                    arr[2*entry] = tmp;
                    entry = 2*entry;
		}
	    }
	    else {
		break;
	    }
	}
	if (2*entry < num_elem && arr[entry] > arr[2*entry]) {
	    int tmp = arr[entry];
	    arr[entry] = arr[2*entry];
	    arr[2*entry] = tmp;
	}
	num_elem--;
	return val;
    }
    public int peek() {
        return arr[num_elem];
    }

}
